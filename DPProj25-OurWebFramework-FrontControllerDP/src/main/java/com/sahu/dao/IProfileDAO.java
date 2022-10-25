package com.sahu.dao;

import com.sahu.bo.ProfileDetailsBO;

public interface IProfileDAO {
	public ProfileDetailsBO getProfileById(int id) throws Exception;
}
