package com.yanhuo1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author 付秋垚
 */
@WebServlet("/dome1")
public class Dome1 implements Servlet {

    public void service(ServletRequest req, ServletResponse res) throws ServletException , IOException {
        System.out.println("hello world");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
    public void init(ServletConfig config) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

}
