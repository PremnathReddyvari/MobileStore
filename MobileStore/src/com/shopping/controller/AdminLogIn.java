package com.shopping.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.beans.Admin;
import com.shopping.service.AdminAccess;

/**
 * Servlet implementation class AdminLogIn
 */
@WebServlet("/AdminLogIn")
public class AdminLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		AdminAccess adminAccess = new AdminAccess();
		Admin a = null;
		
		try {
			a = adminAccess.getAdminDetails(email);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (email.equals(a.getEmail()) && password.equals(a.getPassword())) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Menu.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("failure.jsp");
			requestDispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
