package com.sahu.factory;

public class DAOFactoryBuilder {

	public static DAOFactory buildDAOFactory(FactoryType  factoryType) {
		if (factoryType==FactoryType.DB) 
			return new DBDAOFactory();
		else
			return new ExcelDAOFactory();
	}
	
}
