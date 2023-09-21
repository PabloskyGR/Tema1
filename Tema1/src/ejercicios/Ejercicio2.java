package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable edad
		int edad;
		
		// Le pedimos al usuario su edad
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		// Le sumamos 1 a la edad introducida
		edad = edad + 1;
		
		// Le sumamos un año a la edad introducida
		System.out.println("Tu edad el año que viene es: " + edad);
		
		// Cerramos el scanner
		sc.close();
		
		

	}

}
