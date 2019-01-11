package com.geek99.demo;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    /**
     * 应用：
     * 1.session管理
     * 2.权限验证
     * 3.日志记录
     * 4.字符编码转换
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
