package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;


public class CarTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual � a efici�ncia do seu carro: ");
		double efficiency = sc.nextDouble();
		Car mycar = new Car(efficiency);//isso � uma vari�vel local
		
		System.out.print("Litros de combust�vel a ser adicionado: ");
		double gas = sc.nextDouble();
		mycar.addgas(gas);
		System.out.print("Quilometros a ser percorrido: ");
		double km = sc.nextDouble();
		mycar.drive(km);
		System.out.print("Litros restante: " + mycar.getgas());
		
		sc.close();
		
	}

}