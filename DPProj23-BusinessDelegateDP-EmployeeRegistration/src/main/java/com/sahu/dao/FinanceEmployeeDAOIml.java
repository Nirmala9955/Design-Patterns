package com.sahu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sahu.bo.EmployeeBO;
import com.sahu.bo.FinanceEmployeeBO;

public class FinanceEmployeeDAOIml implements IEmployeeDAO {

	private static final String INSERT_FINANCE_EMP="INSERT INTO BUSINESS_DELEGATE_FINANCE_EMP VALUES(BD_ENO_SEQ.NEXTVAL,?,?,?)";
	  
	@Override
	public int insert(EmployeeBO bo, Connection con) throws SQLException {
		int result=0;
		PreparedStatement ps=null;
		try {
			//get PreparedStatement object having pre-compiled SQL query
			ps=con.prepareStatement(INSERT_FINANCE_EMP);
			//set values to Query parameters
			ps.setString(1, bo.getEname());
			ps.setDouble(2,((FinanceEmployeeBO)bo).getSalary());
			ps.setString(3,bo.getAddress());
			// execute the Query
			result=ps.executeUpdate();
		}
		catch(SQLException se) {
			result=0;
			throw se;
		}
		catch(Exception e) {
			result=0;
			throw e;
		}
		return result;
	}

}
