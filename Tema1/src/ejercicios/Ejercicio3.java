package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int añoAct;
		int añoNac;
		int edad;
		
		// Le pedimos al usuario el año actual y el año en el que nacio
		System.out.println("Dime en que año estamos y dime en que año naciste: ");
		añoAct = sc.nextInt();
		añoNac = sc.nextInt();
		
		// Calculamos su edad
		edad = añoAct - añoNac;
		
		// Mostramos su edad
		System.out.println("Tienes " + edad + " años.");
		
		// Cerramos el scanner
		sc.close();

	}

}
