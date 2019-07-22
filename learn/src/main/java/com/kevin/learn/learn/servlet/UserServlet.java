package com.kevin.learn.learn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-18 16:46
 */
@WebServlet(name = "userServlet", urlPatterns = "/v1/test/customs")
public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        //访问上面的地址就可以得到返回的以下内容
        resp.getWriter().println("custom sevlet");
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        this.doGet(req, resp);
    }
}
