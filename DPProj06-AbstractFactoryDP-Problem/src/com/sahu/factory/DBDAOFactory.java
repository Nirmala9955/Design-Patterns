package com.sahu.factory;

import com.sahu.dao.DAO;
import com.sahu.dao.DBCourseDAO;
import com.sahu.dao.DBStudentDAO;

public class DBDAOFactory {

	public static DAO createDAO(InfoType infoType) {
		if (infoType==InfoType.STUDENT) 
			return new DBStudentDAO();
		else 
			return new DBCourseDAO();
	}
}
