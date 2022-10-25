package com.sahu.factory;

import com.sahu.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(InfoType infoType);
}
