package com.anti.di;

public class GrammarCheat {
	
	int score;
	String cheattext;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCheattxt() {
		return  cheattext;
	}
	public void setCheattxt(String cheattxt) {
		this. cheattext = cheattxt;
	}
	public GrammarCheat(int score) {
		System.out.println("GrammarCheat constructor called only once for three object !!!");
		this.score = score;
	}
	protected void grammarCheat() {
		System.out.println(toString());
		System.out.println("Grammar cheat start..");
	}
	
	@Override
	public String toString() {
		return "GrammarCheat [score=" + score + ", cheattext=" +  cheattext + "]";
	}
}
