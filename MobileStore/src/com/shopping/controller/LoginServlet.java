package com.shopping.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopping.beans.Admin;
import com.shopping.beans.User;
import com.shopping.service.AdminAccess;
import com.shopping.service.CustomerService;
import com.sun.istack.internal.logging.Logger;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
		String rolename = request.getParameter("roleName");
		System.out.println(rolename);
		System.out.println(email);
		AdminAccess adminAccess = new AdminAccess();

		HttpSession session = request.getSession();

		if (rolename.equals("user")) {
			CustomerService cs = new CustomerService();
			User user = new User();
			try {
				user = cs.getUserByEmail(email);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			boolean flag = false;
			try {

				flag = cs.verifyUser(email, password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (flag) {
				HttpSession hs = request.getSession();
				hs.setAttribute("email", email);
				session.setAttribute("user", user);
				response.sendRedirect("product.jsp");
			} else {
				response.sendRedirect("Failure.jsp");
			}
		} else{ 
			
			
			Admin a = null;
		System.out.println("in side admin");
			try {
				a = adminAccess.getAdminDetails(email);
				System.out.println(a.getEmail() + " " + a.getPassword());

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (email.equals(a.getEmail()) && password.equals(a.getPassword())) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Menu.jsp");
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Failure.jsp");
				requestDispatcher.forward(request, response);
			}
		}

		doGet(request, response);

	}
}
