package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int ptas, euro;
		
		// Le pedimos al usuario un número de pesetas
		System.out.println("Dime un número de pesetas: ");
		ptas = sc.nextInt();
		
		// Hacemos las conversión
		euro = ptas * 166;
		
		// Mostramos la cpnversión en euros
		System.out.println("Las " + ptas +" Pesetas en Euros seria --> " + euro + "€");
		
		// Cerramos el scanner
		sc.close();
	}

}
