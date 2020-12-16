package com.anti.di;

public class Student {
	
	
	private int id;
	private GrammarCheat cheat ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(GrammarCheat cheat) {
		this.cheat = cheat;
	}

	protected void cheat() {
		cheat.grammarCheat();
	}

}
