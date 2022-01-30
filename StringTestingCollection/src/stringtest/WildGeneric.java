package stringtest;

import java.util.ArrayList;
import java.util.List;

class Vehicle {

	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}

	private int VehicleId;

	public int getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}

	void info() {

		System.out.println("Info Vehicle Id is  " + getVehicleId());
	}
}

class Car extends Vehicle {

	private String CarModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	@Override
	public String toString() {

		return "Car [CarModel=" + CarModel + "]" + " Id: " + getVehicleId();
	}

	@Override
	void info() {

		System.out.println("Info Car  Id is  " + getVehicleId());
	}
}

class Bubu {

	int db;

	public Bubu(int db) {
		super();
		this.db = db;
	}

	@Override
	public String toString() {
		return "Bubu [db=" + db + "]";
	}

}

public class WildGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Object> list = new ArrayList<>();
		List<Vehicle> list = new ArrayList<>();

		list.add(new Vehicle(4));
		list.add(new Vehicle(1));
		list.add(new Vehicle(8));
		list.add(new Vehicle(9));
		list.add(new Vehicle(4));

		list.add(new Car(20, "Honda"));
		// list.add(new Bubu(20));

		// list.add("Alma");

		display(list);

	}

	private static void display(List<? extends Vehicle> list) {
		for (Vehicle element : list) {
			element.info();
		}
	}

}
