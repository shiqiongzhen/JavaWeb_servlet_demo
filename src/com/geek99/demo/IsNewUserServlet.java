package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/IsNewUserServlet")
public class IsNewUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用cookie检测出访者
        String result = null;
        boolean newUser = true;
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(int i=0;i<cookies.length; i++){
                Cookie c = cookies[i];
                if((c.getName().equals("repeatVisitor"))&&(c.getValue().equals("yes"))){
                    newUser = false;
                    break;
                }
            }
        }
        if(newUser){
            Cookie returnVisitorCookie = new Cookie("repeatVisitor","yes");
            returnVisitorCookie.setMaxAge(60*60*24*365);
            response.addCookie(returnVisitorCookie);
            result = "Welcome Aboard";
        }else{
            result = "Welcome back";
        }
        System.out.println(result);
    }
}
