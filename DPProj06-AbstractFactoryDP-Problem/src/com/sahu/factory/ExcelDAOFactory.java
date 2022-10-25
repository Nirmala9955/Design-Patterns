package com.sahu.factory;

import com.sahu.dao.DAO;
import com.sahu.dao.ExcelCourseDAO;
import com.sahu.dao.ExcelStudentDAO;

public class ExcelDAOFactory {

	public static DAO createDAO(InfoType infoType) {
		if (infoType==InfoType.STUDENT) 
			return new ExcelStudentDAO();
		else 
			return new ExcelCourseDAO();
	}
}
