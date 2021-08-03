package entities;

public class Car {
	
	private double gas;
	private double efficiency;
	//It adds fuel into the car
	public void addGas(double amount) {
		gas += amount;
	}
	//It drives for a distance, consuming ful
	public void drive (double distance) {
		gas -= distance/efficiency;
	}
	//It found out the amount of fuel left on the tank
	public double getGas() {
		return gas;
	}
	public Car(double anEfficiency) {
		efficiency = anEfficiency;
	}
	
}
