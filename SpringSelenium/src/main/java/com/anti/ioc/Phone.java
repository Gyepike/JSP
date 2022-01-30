package com.anti.ioc;

public class Phone implements Sim {
	
	public Sim sim;

	public Phone(Sim sim) {
		this.sim = sim;
	}

	public void calling() {
	   sim.calling();
		
	}

	public void data() {
	 sim.data();
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	

}
