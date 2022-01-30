package com.anti.dependecy.di.autowiring;

public class Heart {

	private String nameofAnimal;
	private int numberHeart;

	public void pump() {
		System.out.println("Heart is pumping, no issues");
		System.out.println("Alive");
		System.out.println(this.toString());

	}

	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNumberHeart() {
		return numberHeart;
	}

	public void setNumberHeart(int numberHeart) {
		this.numberHeart = numberHeart;
	}

	@Override
	public String toString() {
		return "Heart [nameofAnimal=" + nameofAnimal + ", numberHeart=" + numberHeart + "]";
	}

}
