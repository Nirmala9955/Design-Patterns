package com.sahu.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.sahu.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int insert(EmployeeBO bo, Connection con) throws SQLException;
}
