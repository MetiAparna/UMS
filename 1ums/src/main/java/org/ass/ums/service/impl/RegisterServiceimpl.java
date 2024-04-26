package org.ass.ums.service.impl;

import java.util.List;

import org.ass.ums.entity.RegistorEntity;
import org.ass.ums.repository.RegisterRepository;
import org.ass.ums.service.RegistorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceimpl implements RegistorService
{
    @Autowired
    private RegisterRepository registorRepository;
	
    
	@Override
	public void processUserInfo(RegistorEntity registerEntity) {
		
		  registorRepository.saveUser(registerEntity);
		
	}

	@Override
	public List<RegistorEntity> getAllUser() {
		
		return registorRepository.findAllUsers();
		
	}

	
	

}
