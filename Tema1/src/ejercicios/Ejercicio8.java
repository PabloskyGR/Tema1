package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		String nomb;
		int edad;
		
		// Le pedimos al usuario su nombre y edad
		System.out.println("Dime tu nombre y tu edad: ");
		nomb = sc.nextLine();
		edad = sc.nextInt();
		
		// Mostramos los datos
		System.out.println("Hola " + nomb + " tienes " + edad + "  años ¡qué mayor eres!");
		
		// Cerramos el scanner
		sc.close();
		

	}

}
