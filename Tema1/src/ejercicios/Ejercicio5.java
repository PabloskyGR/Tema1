package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		double rad;
		double longitud;
		double area;
		
		
		// Le pedimos al usuario el radio de la circunferencia
		System.out.println("Dime el radio de la circunferencia: ");
		rad = sc.nextDouble();
		
		// Calculamos la longitud y el área de la circunferencia
		longitud = (2 * Math.PI) * rad;
		area = Math.PI * (rad * rad);
		
		// Mostramos la longitud y el área
		System.out.println("La longitud de la circunferencia es de: " + longitud);
		System.out.println("El área de la circunferencia es de: " + area);
		
		// Cerramos el scanner
		sc.close();

	}

}
