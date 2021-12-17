package com.company.controller;

import com.company.comm.Const;
import com.company.dao.pojo.User;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IUserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String code = request.getParameter("code");
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        request.removeAttribute(KAPTCHA_SESSION_KEY);

        if (token != null && token.equalsIgnoreCase(code)){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            IUserService iUserService;
            iUserService = (IUserService) ServiceFactory.getInstance(Const.USER);
            User user = iUserService.login(username, password);
            if (user != null){
                System.out.println("登录成功");
                response.sendRedirect(request.getContextPath()+"/");
            }else {
                System.out.println("登录失败");
                response.sendRedirect(request.getContextPath()+"/??");
            }
        }else {
            response.sendRedirect("index.jsp");
            System.out.println("验证码错误");
        }

    }
}
