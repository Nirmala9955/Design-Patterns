package com.sahu.test;

import com.sahu.dao.DAO;
import com.sahu.factory.DBDAOFactory;
import com.sahu.factory.ExcelDAOFactory;
import com.sahu.factory.InfoType;

public class BadClientApp {

	public static void main(String[] args) {
		DAO studentDAO = DBDAOFactory.createDAO(InfoType.STUDENT);
		DAO courseDAO = ExcelDAOFactory.createDAO(InfoType.COURSE);
		studentDAO.insert();
		courseDAO.insert();
	}
	
}
