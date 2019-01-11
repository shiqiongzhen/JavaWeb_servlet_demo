package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//@WebServlet(name = "ResponseHeaderServlet")
@WebServlet("/ResponseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //输出excel表
//        response.setContentType("application/vnd.ms-excel");
//        PrintWriter out = response.getWriter();
//        out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
//        out.println("Apples\t78\t87\t92\t29\t=SUM(B2:E2)");
//        out.println("Oranges\t77\t86\t93\t30\t=SUM(B3:E3)");
        //输出图片
//        response.setContentType("image/jpg");
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("girl.jpg");
//        int len = in.available();
//        byte[] buffer=new byte[len];
//        in.read(buffer);
//        OutputStream out = response.getOutputStream();
//        out.write(buffer);
//        out.flush();
//        out.close();
        //定时刷新页面
        response.setHeader("refresh","1"); //每隔1s刷新一次
        response.setContentType("text/html;charset=gbk");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<HTML>");
        out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("当前页面刷新时间为：");
        out.println(new Date());
        out.println("</BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}
