package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //页面跳转
        // 1. sendRedirect
        response.sendRedirect("https://www.baidu.com/");
        // 2. forward
            // 见LoginServlet: 点击login后跳转到LoginServlet，LoginServlet再跳转到其他页面（不包含LoginServlet内容）
        // 3. include
            // 见LoginServlet: 点击login后跳转到LoginServlet，LoginServlet再跳转到其他页面（包含LoginServlet内容）
    }
}
