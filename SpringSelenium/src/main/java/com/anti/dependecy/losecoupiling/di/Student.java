package com.anti.dependecy.losecoupiling.di;

public class Student {
	
     private Cheat cheat;
     private String name;
     private int id;
     
     
     public Student( String name, int id) {
		this.name = name;
		this.id = id;
	}

	
     public void cheat() {
		cheat.cheat();
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}


	@Override
	public String toString() {
		return "Student [cheat values = " + " name=" + name + ", id=" + id + "]";
	}

}
