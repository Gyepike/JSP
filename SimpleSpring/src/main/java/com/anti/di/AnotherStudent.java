package com.anti.di;

public class AnotherStudent {

	private GrammarCheat anothercheat;


	public void setAnothercheat(GrammarCheat anothercheat) {
		this.anothercheat = anothercheat;
	}


	protected void cheat() {
		anothercheat.grammarCheat();
	}
}
