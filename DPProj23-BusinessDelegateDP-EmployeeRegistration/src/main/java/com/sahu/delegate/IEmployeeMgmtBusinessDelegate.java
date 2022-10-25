package com.sahu.delegate;

import com.sahu.exception.InternalProblemException;
import com.sahu.vo.EmployeeVO;

public interface IEmployeeMgmtBusinessDelegate {
	public String registerEmployee(EmployeeVO vo) throws InternalProblemException;
}
