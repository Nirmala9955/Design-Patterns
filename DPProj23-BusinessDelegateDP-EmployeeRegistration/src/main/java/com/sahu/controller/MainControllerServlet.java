package com.sahu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahu.delegate.EmployeeMgmtBusinessDelegateImpl;
import com.sahu.delegate.IEmployeeMgmtBusinessDelegate;
import com.sahu.exception.InternalProblemException;
import com.sahu.vo.EmployeeVO;


@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {

	private IEmployeeMgmtBusinessDelegate delegate;
	
	@Override
	public void init() throws ServletException {
		delegate = new EmployeeMgmtBusinessDelegateImpl();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data and store into EmployeeVO class object
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(request.getParameter("ename"));
		vo.setDesg(request.getParameter("desg"));
		vo.setAddress(request.getParameter("eaddress"));
		vo.setSalary(request.getParameter("salary"));
		
		//invoke business method of Business delegate
		try {
			String resultMsg = delegate.registerEmployee(vo);
			//keep result in request scope
			request.setAttribute("resultMsg", resultMsg);
			//forward request to show_result.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("/show_result.jsp");
			dispatcher.forward(request, response);
		} catch (InternalProblemException ipe) {
			request.setAttribute("errMsg", ipe.getMessage());
			//forward request to error.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
			dispatcher.forward(request, response);
		}
		catch (Exception e) {
			request.setAttribute("errMsg", e.getMessage());
			//forward request to error.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
			dispatcher.forward(request, response);
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		delegate = null;
	}

}
