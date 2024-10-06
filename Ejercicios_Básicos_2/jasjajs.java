package Ejercicios_Básicos_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class jasjajs {

	public static void main(String[] args) {
		/*
		 * 1) Solicitar dos números al usuario por pantalla, se solicita al usuario qué
		 * operación se quiere realizar con ellos (suma-1, resta-2, multiplicación-3 o
		 * división-4), y se muestra el resultado de la operación solicitada.
		 */

		Scanner Scanner1 = new Scanner(System.in);
		Double a = null, b = null;  
		while (a == null || b == null) {
			try { 
				System.out.println("Introduce el primer número.");
				a = Scanner1.nextDouble();
				System.out.println("Introduce el segundo número.");
				b = Scanner1.nextDouble();
			} catch (InputMismatchException error) {
				System.out.println("Sólo números, no otros caracteres.");
				Scanner1.next();
			}
		}
		
		System.out.println("Ahora elige la operación ha realizar: (1)suma, (2)resta, (3)multiplicación o (4)división.");
		int operacion = Scanner1.nextInt();
		Scanner1.close();
		double r;
		switch (operacion) {
		case 1:
			r = a + b;
			System.out.println("Has elegido SUMAR ambos números  y el resultado es: " + r);
			break;
		case 2:
			r = a - b;
			System.out.println("Has elegido RESTAR ambos números y el resultado es: " + r);
			break;
		case 3:
			r = a * b;
			System.out.println("Has elegido MULTIPLICAR ambos números y el resultado es: " + r);
			break;
		case 4:
			r = a / b;
			System.out.println("Has elegido DIVIDIR ambos números y el resultado es: " + r);
			break;
		default:
			System.out.println("El número marcado no corresponde con ninguna operación.");
		}
	}
}
