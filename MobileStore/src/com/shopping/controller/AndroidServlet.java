package com.shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.beans.Products;
import com.shopping.service.ProductService;

/**
 * Servlet implementation class AndroidServlet
 */
@WebServlet("/AndroidServlet")
public class AndroidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AndroidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside android servlet");
		
		ProductService fobj=new ProductService();
		int id =Integer.parseInt(request.getParameter("osId"));
		System.out.println(id);
		try {
			List<Products> data=fobj.getAllAndroidProducts(id);
			for(Products s: data){
				System.out.println("<h3>"+ s.getProductName()+" "+s.getReferenceNumber() +"</h3> ");
			}
			
			request.setAttribute("list", data);
			RequestDispatcher rd=request.getRequestDispatcher("FetchAndroid.jsp");
			rd.forward(request, response);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
