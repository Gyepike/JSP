package com.anti.di;

public class Student {
	
	
	int id;
	GrammarCheat cheat ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set running");
		this.id = id;
	}

	public void setCheat(GrammarCheat cheat) {
		this.cheat = cheat;
	}

	protected void cheat() {
		cheat.grammarCheat();
	}

}
