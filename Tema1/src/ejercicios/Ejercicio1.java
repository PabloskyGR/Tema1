package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable número
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		// Mostramos por pantalla el número que ha puesto el usuario
		System.out.println("El número escrito es: " + num);
		
		// Cerramos el scanner
		sc.close();

	}

}
