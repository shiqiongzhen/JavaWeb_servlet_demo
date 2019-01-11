package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestListener")
public class TestListener extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //3.
        request.setAttribute("request_name","request_value");
        request.setAttribute("request_name","request_value2");
        request.removeAttribute("request_name");
    //2.
//        HttpSession session = request.getSession(); //创建session
////        session.invalidate(); //销毁session
//        session.setAttribute("s_name","s_value");
//        //replace
//        session.setAttribute("s_name","s_value2");
//        session.removeAttribute("s_name");
    //1.
//        ServletContext ctx = this.getServletContext();
//        ctx.setAttribute("ctx_name","ctx_value");
//        //replace
//        ctx.setAttribute("ctx_name","ctx_value2");
//        ctx.removeAttribute("ctx_name");

    }
}
