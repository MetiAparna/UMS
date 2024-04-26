package org.ass.ums.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration//manage the object creation and ioc
@ComponentScan("org.ass.ums")
public class AppConfiguration 
{
	

}
