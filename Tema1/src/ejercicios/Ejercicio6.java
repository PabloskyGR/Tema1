package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		double num1, num2, sum, rest, mult, div;
		
		// Le pedimos al usuario dos números
		System.out.println("Dime dos números: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		// Calculamos la suma, la resta, la multiplicación y la división de los dos números
		sum = num1 + num2;
		rest = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		// Mostramos todos los resultados
		System.out.println("El resultados serian los siguientes: ");
		System.out.println("Suma: " + sum);
		System.out.println("Resta: " + rest);
		System.out.println("Multiplicación: " + mult);
		System.out.println("División: " + div);
		
		
		// Cerramos el scanner
		sc.close();

	}

}
