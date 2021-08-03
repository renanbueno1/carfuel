package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;


public class CarTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How efficient is your car: ");
		double efficiency = sc.nextDouble();
		Car mycar = new Car(efficiency);//isso é uma variável local
		
		System.out.print("Liters of fuel to be added: ");
		double gas = sc.nextDouble();
		mycar.addGas(gas);
		System.out.print("Kilometers to be covered: ");
		double km = sc.nextDouble();
		mycar.drive(km);
		double gasLeft = mycar.getGas();
		if (gasLeft > 0) {
			System.out.printf("Litros restante: %.2f ", gasLeft);
			
		} else {
			System.out.println("You ran out of fuel!!!");
		}
		
		
		sc.close();
		
	}

}