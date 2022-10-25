package com.sahu.test;

import com.sahu.dao.DAO;
import com.sahu.factory.DAOFactory;
import com.sahu.factory.DAOFactoryBuilder;
import com.sahu.factory.FactoryType;
import com.sahu.factory.InfoType;

public class GoodClientAppExcel {

	public static void main(String[] args) {
		DAOFactory daoFactory = DAOFactoryBuilder.buildDAOFactory(FactoryType.EXCEL);
		DAO studentDAO = daoFactory.createDAO(InfoType.STUDENT);
		DAO courseDAO = daoFactory.createDAO(InfoType.COURSE);
		studentDAO.insert();
		courseDAO.insert();
	}
	
}
