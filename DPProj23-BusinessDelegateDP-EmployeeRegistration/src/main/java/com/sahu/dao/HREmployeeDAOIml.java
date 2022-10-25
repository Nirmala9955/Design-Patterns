package com.sahu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sahu.bo.EmployeeBO;
import com.sahu.bo.HREmployeeBO;

public class HREmployeeDAOIml implements IEmployeeDAO {

	private static final String INSERT_HR_EMP = "INSERT INTO BUSINESS_DELEGATE_HR_EMP VALUES (BD_ENO_SEQ.CURRVAL,?,?,?)";
	
	@Override
	public int insert(EmployeeBO bo, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ps  = null;
		try {
			//get PreparedStatement object having pre-compiled SQL query
			ps = con.prepareStatement(INSERT_HR_EMP);
			//set values to query parameters
			ps.setString(1, bo.getEname());
			ps.setString(2, ((HREmployeeBO)bo).getDesg());
			ps.setString(3, bo.getAddress());
			//execute the query
			result = ps.executeUpdate();
		}
		catch (SQLException se) {
			result = 0;
			throw se;
		}
		catch (Exception e) {
			result = 0;
			throw e;
		}
		return result;
	}

}
