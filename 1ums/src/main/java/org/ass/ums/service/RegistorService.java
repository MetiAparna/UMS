package org.ass.ums.service;

import java.util.List;

import org.ass.ums.entity.RegistorEntity;

public interface RegistorService {
	
	public  void processUserInfo(RegistorEntity registerEntity);
	
	
	public List<RegistorEntity> getAllUser();

}
