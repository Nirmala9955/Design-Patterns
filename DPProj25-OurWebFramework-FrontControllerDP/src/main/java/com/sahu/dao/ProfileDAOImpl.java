package com.sahu.dao;

import java.time.LocalDateTime;

import com.sahu.bo.ProfileDetailsBO;

public class ProfileDAOImpl implements IProfileDAO {

	@Override
	public ProfileDetailsBO getProfileById(int id)  throws Exception {
		ProfileDetailsBO bo = new ProfileDetailsBO();
		//actually we should collect from DB s/w to put into BO class object
		if (id==1001) {
			bo.setProfileId(id);
			bo.setProfileName("Rajesh");
			bo.setProfileURL("https://fb.com/profiles/rajesh");
			bo.setDOB(LocalDateTime.of(1990,12,23,12,56));
			bo.setDOJ(LocalDateTime.of(2010,12,23,12,56));
		}
		else if (id==1002) {
			bo.setProfileId(id);
			bo.setProfileName("Anil");
			bo.setProfileURL("https://fb.com/profiles/anil");
			bo.setDOB(LocalDateTime.of(1980,12,23,12,56));
			bo.setDOJ(LocalDateTime.of(2011,12,23,12,56));
		}
		else
			throw new IllegalArgumentException("Invalid id - "+id);
		
		return bo;
	}

}
