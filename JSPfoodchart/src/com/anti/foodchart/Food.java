package com.anti.foodchart;

//POJO all varible must private in POJA 

public class Food {

	int id;
	String item;
	double price;
	
	public int getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", item=" + item + ", price=" + price + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(double d) {
		this.price = d;
	}

}
