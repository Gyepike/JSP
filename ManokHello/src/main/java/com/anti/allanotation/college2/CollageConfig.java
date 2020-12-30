package com.anti.allanotation.college2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.anti.allanotation.college2")  
// basepackage nem kotellezeö !!! only we use @Component anotataion

@Configuration
public class CollageConfig {
   /*
	@Bean
	public StudentCouncil presidentBean() {
		return new President();
	}
	
	@Bean
	public  VicePresident  vicepresidentBean() {
		return new VicePresident();
	}
	
	@Bean
	public  USCSecretary  ufc() {
		return new USCSecretary();
	}
	
	@Bean({"prisonSchool", "littleWitchSchool" })
	public HighSchool highSchoolBean()  {
		//HighSchool highschool = new HighSchool();	highSchool same is method name !
		// with name you can force id name
		System.out.println("highSchool method name is the id = highschool With Bean annotation");
		//return new HighSchool(presidentBean());
		HighSchool highSchool = new HighSchool(vicepresidentBean());
		highSchool.setStudentCouncil(presidentBean());
		highSchool.setSecretary(ufc());
		
		return highSchool;
	}
	*/
	
}
