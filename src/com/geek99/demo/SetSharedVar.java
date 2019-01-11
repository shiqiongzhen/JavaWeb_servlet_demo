package com.geek99.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SetSharedVar")
public class SetSharedVar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1.ServletContext
         * 2.HttpSession
         * 3.HttpServletRequest
         */
        ServletContext ctx = this.getServletContext();  //在任何时候都生效的变量
        ctx.setAttribute("ctx_name","ctx_value");

        HttpSession session = request.getSession(); //在当前不关闭浏览器生效的变量
        session.setAttribute("session_name","session_value");

        request.setAttribute("request_name","request_value");   //在当前请求生效的变量

        request.getRequestDispatcher("GetSharedRequest").forward(request,response);
    }
}
