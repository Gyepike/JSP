package com.anti.springtest.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component  // no qulified name and decpicitalised example: samsung object name !! see snapdragon  
public class SamSung {
   
	@Autowired
	@Qualifier("snappdragon")
	MobilProcessor cpu;

	public MobilProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobilProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
	
		 System.out.println("Octa Core, 4 GB RAM, 12 MPS Camera ");
		cpu.process();
	}
	
}
