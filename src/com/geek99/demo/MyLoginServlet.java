package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * MVC+DAO
         * M - DAO
         * V - LOGIN.HTML WELCOME.jsp
         * C - servlet
         */
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        System.out.println(username+":"+password);
        UserDao dao = new UserDaoImpl();
//        System.out.println("dao"+dao);
        User u = dao.login(username,password);
//        System.out.println("u"+u);
        if(u!=null){
            HttpSession session = request.getSession();
            session.setAttribute("UserSession", u);
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }else{
            System.out.println("username or password erro, please relog");
        }
    }
}
