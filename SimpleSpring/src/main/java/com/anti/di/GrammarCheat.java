package com.anti.di;

public class GrammarCheat {
	@Override
	public String toString() {
		return "GrammarCheat [score=" + score + "]";
	}
	int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public GrammarCheat(int score) {
		this.score = score;
	}
	protected void grammarCheat() {
		System.out.println(toString());
		System.out.println("Grammar cheat start..");
	}
	public GrammarCheat() {
		}
}
