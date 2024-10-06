package Ejercicios_Básicos_2;

import java.util.Scanner;

public class Conversor_PesetasEuros {

	public static void main(String[] args) {
		/* 5) Realiza un conversor Pesetas <–> Euros (con dos opciones de menú). El valor de
		la conversión será una constante. La ejecución puede ser similar a ésta: */
		
		Scanner scanner1 = new Scanner (System.in);
		final double conversor = 166.386;
		double euros, ptas;
		
		System.out.println("Pulsa 1 para pasar Euros a Pesetas.");
		System.out.println("Pulsa 2 para pasar Pesetas a Euros.");
	
		int opcion = scanner1.nextInt();
		switch (opcion) {
		case 1:
			do {
			System.out.println("Introduzca la cantidad en Euros a convertir en Pesetas.");
			euros = scanner1.nextDouble();
				if (euros < 0) {
				System.out.println("Introduzca un valor válido.");
				}
			} while (euros < 0);
			ptas = euros * conversor;
			System.out.println(euros + " euros son " + ptas + " ptas.");
			break;
		case 2: 
			do {
			System.out.println("Introduzca la cantidad en Pesetas a convertir en Euros.");
			ptas = scanner1.nextDouble();
				if (ptas < 0) {
				System.out.println("Introduzca un valor válido.");
				}
			} while (ptas < 0);
			euros = ptas / conversor;
			System.out.println(ptas + " ptas son " + euros + " euros.");
			break;
		default:
			System.out.println("La opción elegida no corresponde con ninguna de las ofrecidas.");
			} 	
		scanner1.close();
	}

}
