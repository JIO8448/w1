package com.example.w1.todo;

import com.example.w1.todo.dto.TodoDTO;
import com.example.w1.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController",urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("/todo/list");

        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();

        request.setAttribute("list",dtoList);

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request,response);
    }

}
