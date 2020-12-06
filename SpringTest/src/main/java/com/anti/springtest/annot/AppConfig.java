package com.anti.springtest.annot;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan  // basepackage provide package for scan
public class AppConfig {
	
	/*
	 * @Bean public SamSung getphone() {
	 * 
	 * return new SamSung(); }
	 * 
	 * 
	 * @Bean public MobilProcessor getCpu() { return new SnappDragon(); }
	 */
}
