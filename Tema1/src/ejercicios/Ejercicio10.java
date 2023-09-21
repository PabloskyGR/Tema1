package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		final int iva = 21;
		double precio, precioIva, precioF;
		
		// Le pedimos al usuario el precio
		System.out.println("Dime el precio de un producto: ");
		precio = sc.nextDouble();
		
		// Calculamos el precio con el IVA
		precioIva = (precio * iva) / 100;
		precioF = precioIva + precio;
		
		// Mostramos el precio con IVA
		System.out.println("El precio con iba sería de: " + precioF + "€");
		
		// Cerramos el scanner
		sc.close();

	}

}
