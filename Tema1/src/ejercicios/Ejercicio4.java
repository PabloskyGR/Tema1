package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		double nota1;
		double nota2;
		double media;
		
		// Le pedimos al usuario las dos notas
		System.out.println("Dime 2 notas para hacer la media aritmética: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		// Hacemos la media de las notas
		media = (nota1 + nota2)/2;
		
		// Mostramos la nota media
		System.out.println("La nota media es de: " + media);
		
		// Cerramos el scanner 
		sc.close();
	}

}
