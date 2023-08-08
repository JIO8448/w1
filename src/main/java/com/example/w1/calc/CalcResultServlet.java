package com.example.w1.calc;

import org.jetbrains.annotations.NotNull;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(name = "calcController", urlPatterns = "/calc/makeResult")
public class CalcResultServlet extends HttpServlet {

    @Override
    protected void doPost(@NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        System.out.printf("num1: %s",num1);
        System.out.printf("num2: %s",num2);

        /*int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;*/
        response.sendRedirect("/index");
    }
}
