package com.sahu.bo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProfileDetailsBO {
	private int profileId;
	private String profileName;
	private String profileURL;
	private LocalDateTime DOB, DOJ;
}
