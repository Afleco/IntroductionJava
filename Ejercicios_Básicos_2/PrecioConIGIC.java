package Ejercicios_Básicos_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioConIGIC {

	public static void main(String[] args) {
		/*
		 * 2) Si el IGIC a aplicar a un producto es del 7% (constante), solicitar
		 * importe de un producto al usuario y calcular el importe total sumándole el
		 * IGIC.
		 */

		Scanner scanner1 = new Scanner(System.in);
		final double IGIC = 0.07;
		double imp = 0;

		do { /* Con el do-while nos garantizamos que el usuario no ponga valores negativos y
			 permitimos que el programa siga ejecutándose */
			try {
				System.out.println("Introduce el importe del producto sin impuestos");
				imp = scanner1.nextDouble();
			} catch (InputMismatchException ex) {
				System.out.println("Introduce sólo números.");
				scanner1.next();
			}
		} while (imp <= 0);

		double impT = (imp * IGIC) + imp;
		System.out.print("El importe total del producto incluyendo impuestos (IGIC) es de: " + impT);
		scanner1.close();

	}

}
