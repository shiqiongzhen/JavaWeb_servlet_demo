package com.geek99.demo;


import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * 分类：
 * 1.用来监听整个web工程状态改变的ServletContextListen和ServletContextAttributeListener
 * 2.监听session范围状态改变的HttpSessionListener和HttpSessionAttributeListener
 * 3.监听request范围状态改变的HttpServletRequestListener和HttpServletRequestAttributeListener
 * 应用：
 * 1. 实例-用户在线计数：思路：先设置一个ServletContextListen全局监听计数；再设置一个HttpSessionListener对当前窗口监听计数，关闭窗口减1；
 */
//3.
public class MyListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent arg0){
        System.out.println("ServletRequestattributeAdded....................");
    }
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent arg0){
        System.out.println("ServletRequestattributeRemoved....................");
    }
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent arg0){
        System.out.println("ServletRequestattributeReplaced....................");
    }
}
//public class MyListener implements ServletRequestListener {
//    @Override
//    public void requestDestroyed(ServletRequestEvent arg0) {
//        System.out.println("requestDestroyed....................");
//    }
//
//    @Override
//    public void requestInitialized(ServletRequestEvent arg0) {
//        System.out.println("requestInitialized....................");
//    }
//}
//2
//public class MyListener implements HttpSessionAttributeListener {
//    @Override
//    public void attributeAdded(HttpSessionBindingEvent arg0){
//        System.out.println("attributeAdded....................");
//    }
//    @Override
//    public void attributeRemoved(HttpSessionBindingEvent arg0){
//        System.out.println("attributeRemoved....................");
//    }
//    @Override
//    public void attributeReplaced(HttpSessionBindingEvent arg0){
//        System.out.println("attributeReplaced....................");
//    }
//}
//public class MyListener implements HttpSessionListener{
//    @Override
//    public void sessionCreated(HttpSessionEvent arg0){
//        System.out.println("sessionCreated....................");
//    }
//    @Override
//    public void sessionDestroyed(HttpSessionEvent arg0){
//        System.out.println("sessionDestroyed....................");
//    }
//}

//1.
//public class MyListener implements ServletContextAttributeListener {
//    @Override
//    public void attributeAdded(ServletContextAttributeEvent arg0){
//        System.out.println("attributeAdded....................");
//    }
//    @Override
//    public void attributeRemoved(ServletContextAttributeEvent arg0){
//        System.out.println("attributeRemoved....................");
//    }
//    @Override
//    public void attributeReplaced(ServletContextAttributeEvent arg0){
//        System.out.println("attributeReplaced....................");
//    }
//}
//
//public class MyListener implements ServletContextListener {
//    @Override
//    public void contextDestroyed(ServletContextEvent arg0){
//        System.out.println("contextDestroyed....................");
//    }
//    @Override
//    public void contextInitialized(ServletContextEvent arg0){
//        System.out.println("contextInitialized....................");
//    }
//