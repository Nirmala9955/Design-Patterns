package com.sahu.delegate;

import com.sahu.dto.ProfileDetailsDTO;

public interface IProfileMgmtDelegate {
	public ProfileDetailsDTO fetchProfileById(int id)  throws Exception;
}
