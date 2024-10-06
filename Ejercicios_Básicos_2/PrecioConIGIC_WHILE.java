package Ejercicios_Básicos_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioConIGIC_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		final double IGIC = 0.07;
		double imp = 0;
		
		while (imp <= 0) {
		
			try {
				System.out.println("Introduce el importe del producto sin impuestos");
				imp = scanner1.nextDouble();
			} catch (InputMismatchException ex) {
				System.out.println("Introduce sólo números.");
				scanner1.next();
			}
		}
		
		double impT = (imp * IGIC) + imp;
		System.out.print("El importe total del producto incluyendo impuestos (IGIC) es de: " + impT);
		scanner1.close();

	}

}
