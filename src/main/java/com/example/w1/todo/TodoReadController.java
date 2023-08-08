package com.example.w1.todo;

import com.example.w1.todo.dto.TodoDTO;
import com.example.w1.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(name = "todoReadController",urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("/todo/read");
        //localhost:8090/todo/read?tno=9
        Long tno = Long.parseLong(request.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.get(tno);
        request.setAttribute("dto",dto);
        request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
