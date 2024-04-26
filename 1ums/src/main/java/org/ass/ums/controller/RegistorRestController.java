package org.ass.ums.controller;

import java.util.List;

import org.ass.ums.entity.RegistorEntity;
import org.ass.ums.service.impl.RegisterServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody//to convert java obj to response body
@RestController
public class RegistorRestController {
	
	@Autowired
	private RegisterServiceimpl registerServiceimpl;
	
	//@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
	@GetMapping(value="/getAllUser")
	public @ResponseBody  List<RegistorEntity> getAllUser()
	{
		 return registerServiceimpl.getAllUser();
		
	}
	
	
	//@RequestMapping(value="/saveRegisterDetails",method=RequestMethod.POST)
	@PostMapping(value="/saveRegisterDetails")
	public void saveUserDetails(@RequestBody RegistorEntity registerEntity)
	{
		registerServiceimpl.processUserInfo(registerEntity);
		
		
	}

}

//http://localhost:8080/1ums.getAllUser
//request typw: get//output json formattee
//payload:
//response:[
//{
//	 altkey:120,
//	 firstName="abc";
//	 contactNumber:909090;
//	 
//}
//	 {
//	 altkey:120,
//	 firstName="abc";
//	 contactNumber:909090;
//	 
//}
//
//