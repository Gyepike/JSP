package com.anti.JSPAdvenced.dao;

import com.anti.JSPAdvenced.web.Alien;

public class AlienDao {
    public Alien getAlien(int aid)
    {
    	Alien a = new Alien();
    	
    	a.setAid(101);
    	a.setAname("navin");
    	a.setTech("JAVA");
    	
    	
    	return a;
    	
    }
    
    
}
