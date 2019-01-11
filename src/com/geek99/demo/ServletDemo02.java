package com.geek99.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//注解  /ServletDemo02 表示当前Servlet的访问路径
@WebServlet("/ServletDemo02")
public class ServletDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("hello world!");
//		Enumeration<String> enum1=request.getHeaderNames();
//		while (enum1.hasMoreElements()){
//			String name=enum1.nextElement();
//			String value=request.getHeader(name);
//			System.out.println(name+":"+value);
//		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
/**
 * 7.7 HttpServletResponse与HttpServletRequest
 * web服务器接收到客户端的http请求，会针对每一次请求，分别创建一个用于代表请求的request对象和代表响应的response对象。
 * request和response对象既然代表请求和响应，那我们要获取客户机提交过来的数据，只需要找request对象就行了。要想客户机输出数据，只需要找response对象就行了。
	 * 7.7.1 HttpServletResponse
	 * HttpServletResponse对象封装了服务器的响应。这个对象中封装了向客户端发送数据、发送响应头，发送响应状态码的方法。
	 * void setStatus(int sc)
	 * setHeader(java.lang.String name, java.lang.String value)
	 * getWriter()
	 * getOutputStream()
	 *
	 * 7.7.2 HttpServletRequest
	 * HttpServletRequest对象代表客户端的请求，当客户端通过Http协议访问服务器时，Http请求头中的所有信息都封装在这个对象中，开发人员通过这个对象的方法，可以获得客户这些信息。
 */
