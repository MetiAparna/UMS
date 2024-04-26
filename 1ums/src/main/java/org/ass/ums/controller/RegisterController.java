package org.ass.ums.controller;

import org.ass.ums.entity.RegistorEntity;
import org.ass.ums.service.impl.RegisterServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component(Genaric type)
@Controller//give exatly which layer is calling/create obj in that class
public class RegisterController {
	@Autowired//inject the reference
	private RegisterServiceimpl registerServiceimpl;
	
	
	@RequestMapping(value="/saveUserDetails")
	public ModelAndView saveUserDetails(RegistorEntity registerEntity) {
		
		System.out.println(registerEntity);
		registerServiceimpl.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");//output is page formatee(viwe)
	}
	
	

	

}
