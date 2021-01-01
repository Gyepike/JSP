package com.anti.allanotation.college2;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.anti.allanotation.college2")  
@PropertySource("prison-school.properties")
@Configuration
public class CollageConfig {
 	
}
