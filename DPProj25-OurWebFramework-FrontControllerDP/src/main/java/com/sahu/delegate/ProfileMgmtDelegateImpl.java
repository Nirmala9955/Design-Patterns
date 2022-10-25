package com.sahu.delegate;

import com.sahu.bo.ProfileDetailsBO;
import com.sahu.dao.IProfileDAO;
import com.sahu.dao.ProfileDAOImpl;
import com.sahu.dto.ProfileDetailsDTO;

public class ProfileMgmtDelegateImpl implements IProfileMgmtDelegate {

	private IProfileDAO dao = null;
	
	public ProfileMgmtDelegateImpl() {
		dao = new ProfileDAOImpl();
	}
	
	@Override
	public ProfileDetailsDTO fetchProfileById(int id)  throws Exception{
		// use DAO
		ProfileDetailsBO bo = dao.getProfileById(id);
		//convert bo class object to DTO class object
		ProfileDetailsDTO dto = new ProfileDetailsDTO();
		dto.setProfileId(bo.getProfileId());
		dto.setProfileName(bo.getProfileName());
		dto.setProfileURL(bo.getProfileURL());
		dto.setDOB(bo.getDOB());
		dto.setDOJ(bo.getDOJ());
		
		return dto;
	}

}
