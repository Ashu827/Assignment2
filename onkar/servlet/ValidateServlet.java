package com.onkar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onkar.dao.InvalidUserException;
import com.onkar.dao.UserDAO;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName, password;
		PrintWriter out = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType = "Invalid";

		try {
			userType = getUserType(userName, password);
		} catch (InvalidUserException e) {
			out.print("<h1>Invalid User</h1>");
		}

		RequestDispatcher requestDispatcher = null;

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");

		} else if (userType.equals("User")) {
			out.print("<h1>Welcome User  " + userName + "</h1>");
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			out.print("<h1>Invalid User</h1>");
		}

		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private String getUserType(String userName, String password) {
		UserDAO dao = new UserDAO();
		return dao.getUserType(userName, password);
	}

}
