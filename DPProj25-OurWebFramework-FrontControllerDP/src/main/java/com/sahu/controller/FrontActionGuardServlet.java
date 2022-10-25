package com.sahu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahu.command.ICommand;
import com.sahu.dispatcher.Dispatcher;
import com.sahu.helper.CommandMapper;

@WebServlet("*.do")
public class FrontActionGuardServlet extends HttpServlet {
	   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//read incoming request uri
			String reqUri = request.getServletPath(); //gives only last part of incoming request url
			//get command class from CommandMapper
			ICommand command =  CommandMapper.mapRequestToCommand(reqUri, request);
			//invoke standard method on command class object
			String lvn = command.execute(request, response);
			//use dispatcher to get physical view name and forward the controller to physical view
			Dispatcher.dispatchToView(request, response, lvn);
		}
		catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
