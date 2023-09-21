package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		String nombre, direccion;
		int num;
		
		// Le pedimos al usuario los datos
		System.out.println("Dime tu nombre, luego tu dirección y por último tu número de telefono: ");
		nombre = sc.nextLine();
		direccion = sc.nextLine();
		num = sc.nextInt();
		
		// Mostramos los datos
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + num);
		
		// Cerramos el scanner
		sc.close();
	}

}
