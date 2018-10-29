package com.shopping.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopping.beans.Order;
import com.shopping.service.OrderService;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Entering the servlet");
		HttpSession session = request.getSession(true);
		String name = request.getParameter("name");
		String email=request.getParameter("email");
		String productName = request.getParameter("productName");
		String productCompany = request.getParameter("productCompany");
		int productPrice = Integer.parseInt(request.getParameter("productPrice"));
		String address = request.getParameter("address");
		//System.out.println(name+email);
		int referenceNumber=(int)session.getAttribute("referenceNumber");
		
		Order order=new Order();
		order.setName(name);
		order.setEmail(email);
		order.setProductName(productName);
		order.setProductCompany(productCompany);
		order.setProductPrice(productPrice);
		order.setAddress(address);
		System.out.println("doPost");
		OrderService cs = new OrderService();
		boolean decission=false;
		
		

	
		try {
			 decission = cs.addPerson(order,referenceNumber);
			 if(decission==true){
			System.out.println("product decreased");
			System.out.println(order.getProductName());
		    cs.updateProducts(order.getProductName());
		   
		    response.sendRedirect("Confirmation.jsp");
			 }
			 
			 else{
				 
				 response.sendRedirect("product.jsp");
			 }
		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
