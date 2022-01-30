package com.anti.withhoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.anti.withhoutxml" )
public class CollageConfig {

	
	//@Bean(name= {"getMyFileSystemBean","MyFileSystemBean"}) for more options 
	@Bean
	public Collage Munyi()  // beanid method name !! Munyi
	{
		
		Collage collagee = new Collage();
		
		return collagee;
		
		
	}
	
	
}
