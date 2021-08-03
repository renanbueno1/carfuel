package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;


public class CarTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual é a eficiência do seu carro: ");
		double efficiency = sc.nextDouble();
		Car mycar = new Car(efficiency);//isso é uma variável local
		
		System.out.print("Litros de combustível a ser adicionado: ");
		double gas = sc.nextDouble();
		mycar.addgas(gas);
		System.out.print("Quilometros a ser percorrido: ");
		double km = sc.nextDouble();
		mycar.drive(km);
		System.out.print("Litros restante: " + mycar.getgas());
		
		sc.close();
		
	}

}