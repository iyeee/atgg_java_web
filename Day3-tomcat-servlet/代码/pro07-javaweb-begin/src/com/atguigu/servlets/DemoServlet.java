package com.atguigu.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("k111","k222");
        System.out.println(session.getId());
        System.out.println(session.getMaxInactiveInterval());
        System.out.println(session.getCreationTime());
        System.out.println(session.getAttribute("k111"));
        req.setAttribute("das","asdasdsa");

        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext1 = getServletContext();
        servletContext1.setAttribute("kq","ttttt");
        servletContext.setAttribute("kqq","ssssss");
        System.out.println(servletContext1==servletContext);
        System.out.println(req.getAttribute("das"));
        req.getSession().setAttribute("kk","sda");
        resp.sendRedirect("demo2");
//        req.getRequestDispatcher("demo2").forward(req,resp);
    }
}
