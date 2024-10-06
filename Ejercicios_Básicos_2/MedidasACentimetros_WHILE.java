package Ejercicios_Básicos_2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MedidasACentimetros_WHILE {

	public static void main(String[] args) {
		/* 4) Diseña un programa que solicite al usuario tres medidas, la primera 
		 medida en milímetros, la segunda medida en centímetros y la última medida en metros, 
		 y muestre la suma de las tres longitudes introducidas en centímetros. */ // Lo haremos con WHILE en vez de DO-WHILE y con Try-Catch
		
		Scanner tec = new Scanner(System.in);
		double mmTocm = -1;
		double cm = -1;
		double mTocm = -1;
		
		while (mmTocm < 0) {
			try {
			System.out.println("Introduce la primera medida en milímetros.");
			mmTocm = tec.nextDouble();
				if (mmTocm < 0) {
					System.out.println("Error. Sólo números positivos.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Error. Introduce sólo números que sean positivos. ");
				tec.next(); 
			}
		}
		
		while (cm < 0) {
			try {
			System.out.println("Introduce la segunda medida en centímetros.");
			cm = tec.nextDouble();
				if (cm < 0) {
					System.out.println("Error. Sólo números positivos.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Error. Introduce sólo números que sean positivos. ");
				tec.next(); 
			}
		}
		
		while (mTocm < 0) {
			try {
			System.out.println("Introduce la tecera medida en metros.");
			mTocm = tec.nextDouble();
				if (mTocm < 0) {
					System.out.println("Error. Sólo números positivos.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Error. Introduce sólo números que sean positivos. ");
				tec.next(); 
			}
		}
		
		
		double cm2 = mmTocm / 10;
		double cm3 = mTocm * 100;
		
		double total = cm + cm2 + cm3;
		
		System.out.println("El total de todas las medidas es de " + total + " cm.");
		tec.close();
		
		
		
		
		
	}

}
