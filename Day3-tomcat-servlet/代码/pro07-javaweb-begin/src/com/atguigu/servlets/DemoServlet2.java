package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet2 extends HttpServlet {
    private String message;
    @Override
    public void init() throws ServletException {
        message = "Hello World!";

}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        System.out.println("demo222");
        System.out.println(req.getAttribute("das"));
        System.out.println(req.getSession().getAttribute("kk"));
        System.out.println(getServletConfig().getServletContext().getAttribute("kq"));
        System.out.println(getServletConfig().getServletContext().getAttribute("kqq"));
    }
}
