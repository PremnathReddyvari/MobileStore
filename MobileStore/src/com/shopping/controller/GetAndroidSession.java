package com.shopping.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopping.beans.Android;

/**
 * Servlet implementation class GetAndroidSession
 */
@WebServlet("/GetAndroidSession")
public class GetAndroidSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAndroidSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		String productName=request.getParameter("productName");
		String productCompany=request.getParameter("productCompany");
		int productPrice=Integer.parseInt(request.getParameter("productPrice"));
		int referenceNumber=Integer.parseInt(request.getParameter("referenceNumber"));
	
		
		Android android = new Android();
		android.setProductName(productName);
		android.setProductCompany(productCompany);
		android.setProductPrice(productPrice);
		android.setReferenceNumber(referenceNumber);
		session.setAttribute("productName",productName );
		session.setAttribute("productCompany", productCompany);
		session.setAttribute("productPrice", productPrice);
		session.setAttribute("referenceNumber", referenceNumber);
		response.sendRedirect("NewFile.jsp");

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*RequestDispatcher rd=request.getRequestDispatcher("OrderDetails.jsp");
		rd.forward(request, response);*/
		
		doGet(request, response);

		
    	}
	

}
