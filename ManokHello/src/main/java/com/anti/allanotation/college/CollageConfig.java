package com.anti.allanotation.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.anti.allanotation.college, s")  
// basepackage nem kotellezeö !!! only we use @Component anotataion
@Configuration
public class CollageConfig {
   
	@Bean("prisonschool")
	public HighSchool highSchool()  {
		//HighSchool highschool = new HighSchool();	highSchool same is method name !
		// with name you can force id name
		System.out.println("highSchool method name is the id  highSchool ");
		return new HighSchool();
	}
}
