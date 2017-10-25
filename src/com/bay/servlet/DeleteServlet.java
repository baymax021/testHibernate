package com.bay.servlet;

import com.bay.model.NewsUser;
import com.bay.service.NewsUserService;
import com.bay.service.NewsUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private NewsUserService newsUserService;

    @Override
    public void init() throws ServletException {
        super.init();
        newsUserService = new NewsUserServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Integer id = new Integer(request.getParameter("id"));
        NewsUser newsUser = newsUserService.queryNewsUserById(id);

        newsUserService.deleteNewsUser(newsUser);


        List<NewsUser> list = newsUserService.newsUserList();
        request.setAttribute("list",list);
        request.getRequestDispatcher("success.jsp").forward(request,response);
    }
}
