package com.sahu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahu.delegate.IUpStoxStockMgmtBusinessDelegate;
import com.sahu.delegate.UpStoxStockMgmtBusinessDelegateImpl;
import com.sahu.dto.StockDetailsDTO;
import com.sahu.exception.InternalProblemException;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	
	private IUpStoxStockMgmtBusinessDelegate delegate;
	
	@Override
	public void init() throws ServletException {
		delegate = new UpStoxStockMgmtBusinessDelegateImpl();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String stockName = request.getParameter("stockName");
		//use Business delegate
		try{
			StockDetailsDTO dto = delegate.fetchStockDetailsByName(stockName);
			//keep result in request scope
			request.setAttribute("result", dto);
			//forward to show_stock_details.jsp
			RequestDispatcher rd = request.getRequestDispatcher("/show_stock_details.jsp");
			rd.forward(request, response);
		}
		catch (InternalProblemException ipe) {
			ipe.printStackTrace();
			request.setAttribute("errMsg", ipe.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void destroy() {
		delegate = null;
	}
	
}
