package com.anti.dependecy.object.di;

public class AnotherStudent {

	private int id;

	private Mathcheat cheat;
	
	
	protected void startCheating() {
		cheat.mathCheat();

	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCheat(Mathcheat cheat) {
		this.cheat = cheat;
	}


	@Override
	public String toString() {
		return "AnotherStudent [id=" + id + ", cheat=" + cheat + "]";
	}

}
