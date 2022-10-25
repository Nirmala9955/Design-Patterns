package com.sahu.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahu.delegate.IProfileMgmtDelegate;
import com.sahu.delegate.ProfileMgmtDelegateImpl;
import com.sahu.dto.ProfileDetailsDTO;

public class ProfileCommand implements ICommand {
	
	private IProfileMgmtDelegate delegate;
	
	public ProfileCommand() {
		delegate = new ProfileMgmtDelegateImpl();
	}
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//use delegate
		ProfileDetailsDTO dto = delegate.fetchProfileById(Integer.parseInt(req.getParameter("id")));
		//keep result in request scope
		req.setAttribute("profileDTO", dto);
		//return logical view name
		return "show_profile";
	}

}
