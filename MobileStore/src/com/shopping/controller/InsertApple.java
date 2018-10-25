package com.shopping.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.shopping.beans.Apple;
import com.shopping.service.ProductService;


/**
 * Servlet implementation class InsertBookServlet
 */
@WebServlet("/InsertApple")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class InsertApple extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "uploadDir";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertApple() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String rootContext = request.getServletContext().getRealPath("/");*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		PrintWriter out=response.getWriter();
		String productName=request.getParameter("productName");
		String productCompany=request.getParameter("productCompany");
		int productPrice=Integer.parseInt(request.getParameter("productPrice"));
		int referenceNumber=Integer.parseInt(request.getParameter("referenceNumber"));
		
		Apple apple=new Apple();
		apple.setProductName(productName);
		apple.setProductCompany(productCompany);
		apple.setProductPrice(productPrice);
		apple.setReferenceNumber(referenceNumber);
		ProductService p=new ProductService();
		try {
			p.insertApple(apple);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Inserted Successfully "+apple.getReferenceNumber());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			String description = request.getParameter("description");
			System.out.println("Description: " + description);

			// Gets absolute path to root directory of web app.
			String appPath = request.getServletContext().getRealPath("");
			appPath = appPath.replace('\\', '/');

			// The directory to save uploaded file
			String fullSavePath = null;
			if (appPath.endsWith("/")) {
				fullSavePath = appPath +"images/"+ SAVE_DIRECTORY;
			} else {
				fullSavePath = appPath + "/images/" + SAVE_DIRECTORY;
			}

			// Creates the save directory if it does not exists
			File fileSaveDir = new File(fullSavePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}

			// Part list (multi files).
			for (Part part : request.getParts()) {
				String fileName = apple.getReferenceNumber()+".png";
				if (fileName != null && fileName.length() > 0) {
					String filePath = fullSavePath + File.separator + fileName;
					System.out.println("Write attachment to file: " + filePath);
					// Write to file
					part.write(filePath);
				}
			}
			// Upload successfully!.
			//response.sendRedirect("AppleServlet");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "Error: " + e.getMessage());
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/.jsp");
			dispatcher.forward(request, response);
			doGet(request, response);
		}
		
		System.out.println("Inserted Successfully");
		RequestDispatcher rd=request.getRequestDispatcher("AppleServlet");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

