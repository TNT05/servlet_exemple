package com.servlet_exemple;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException{

    System.out.println("in service method");

  }

}
