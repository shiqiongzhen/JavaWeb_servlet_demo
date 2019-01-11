package com.geek99.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/GetSharedRequest")
public class GetSharedRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext ctx = this.getServletContext();
        HttpSession session = request.getSession();

        String ctx_value = (String) ctx.getAttribute("ctx_name");
        String session_value = (String) session.getAttribute("session_name");
        String request_value = (String) request.getAttribute("request_name");

        System.out.println("ctx:"+ctx_value);
        System.out.println("session:"+session_value);
        System.out.println("request:"+request_value);

    }
}
