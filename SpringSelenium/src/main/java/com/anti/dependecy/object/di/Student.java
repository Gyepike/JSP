package com.anti.dependecy.object.di;

public class Student {
	
	
	 private int id;
	 
     private Mathcheat mathCheat;
     
     public void cheat() {
		mathCheat.mathCheat();
	}

	public void setMathCheat(Mathcheat mathCheat) {
		this.mathCheat = mathCheat;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", mathCheat=" + mathCheat + "]";
	}

	
}
