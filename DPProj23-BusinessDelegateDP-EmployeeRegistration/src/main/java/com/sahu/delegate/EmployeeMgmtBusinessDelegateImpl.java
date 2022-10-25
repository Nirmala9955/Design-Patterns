package com.sahu.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.sahu.bo.FinanceEmployeeBO;
import com.sahu.bo.HREmployeeBO;
import com.sahu.dao.FinanceEmployeeDAOIml;
import com.sahu.dao.HREmployeeDAOIml;
import com.sahu.dao.IEmployeeDAO;
import com.sahu.exception.InternalProblemException;
import com.sahu.factory.ConnectionFactory;
import com.sahu.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegateImpl implements IEmployeeMgmtBusinessDelegate {

	private IEmployeeDAO hrDAO, financeDAO;
	
	public EmployeeMgmtBusinessDelegateImpl() {
		hrDAO = new HREmployeeDAOIml();
		financeDAO = new FinanceEmployeeDAOIml();
	}
	
	@Override
	public String registerEmployee(EmployeeVO vo) throws InternalProblemException {
		//convert EmployeeVO class object into HREmployeeBo, FinanceEmployeeBO class object
		HREmployeeBO hrEmpBO = new HREmployeeBO();
		hrEmpBO.setEname(vo.getEname());
		hrEmpBO.setAddress(vo.getAddress());
		
		FinanceEmployeeBO financeEmpBO = new FinanceEmployeeBO();
		financeEmpBO.setEname(vo.getEname());
		financeEmpBO.setAddress(vo.getAddress());
		financeEmpBO.setSalary(Double.parseDouble(vo.getSalary()));
		
		boolean flag = false;
		Connection con = null;
		String resultMsg = null;
		try {
			//get pooled JDBC connection object
			 con = ConnectionFactory.getPooledConnection();
			//begin Tx Mgmt
			 con.setAutoCommit(false);
			//invoke the methods both DAO class
			int result1 = financeDAO.insert(financeEmpBO, con);
			int result2 = hrDAO.insert(hrEmpBO, con);
			
			if (result1==1 && result2==1)
				flag = true;
			else
				flag = false;
			
		}catch (SQLException se) {
			flag = false;
			if (se.getErrorCode()==1)
				throw new InternalProblemException("Duplicate employee number is not allowed");
			else if(se.getErrorCode()==1400) 
				throw new InternalProblemException("Null employee number is not allowed");				
			else if(se.getErrorCode()==12899) 
				throw new InternalProblemException("Can't insert more than colume size data");
			else
				throw new InternalProblemException("Some DB problem occured");
		} catch (NamingException e) {
			flag = false;
			throw new InternalProblemException("Datasource related Jndi problem");
		} catch (Exception e) {
			flag = false;
			throw new InternalProblemException("Unknown problem has raised");			
		}
		finally {
			//perform Transaction Management
			try {
				if (flag) {
					con.commit();
					resultMsg = "Employee Registration successful";
				}
				else {
					con.rollback();
					resultMsg = "Employee Registration failed";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//close connection (returning JDBC connection object back to JDBC connection pool)
			try {
				ConnectionFactory.closeConnection(con);
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return resultMsg;
	}

}
