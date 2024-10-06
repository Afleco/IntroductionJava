package Ejercicios_Básicos_2;

import java.util.Scanner;

public class MedidasACentimetros {

	public static void main(String[] args) {
		/* 4) Diseña un programa que solicite al usuario tres medidas, la primera 
		 medida en milímetros, la segunda medida en centímetros y la última medida en metros, 
		 y muestre la suma de las tres longitudes introducidas en centímetros. */
		
		Scanner Scanner1 = new Scanner(System.in);
		double mmTocm, cmTocm, mTocm;
		
		do {
		System.out.println("Introduce la primera medida en milímetros.");
		mmTocm = Scanner1.nextDouble();
		} while (mmTocm < 0);
		
		do {
		System.out.println("Introduce la segunda medida en centímetros.");
		cmTocm = Scanner1.nextDouble();
		} while (cmTocm < 0);
		
		do {					// Con cada do-while filtramos en cada una de las medidas que el usuario no ponga valores negativos
		System.out.println("Introduce la tercera medida en metros.");
		mTocm = Scanner1.nextDouble();
		} while (mTocm < 0);
		
		double cm1 = mmTocm / 10;
		double cm2 = cmTocm;
		double cm3 = mTocm * 100;
		double total = cm1 + cm2 + cm3;
		
		System.out.println("El total de todas las medidas es de " + total + " cm.");
		Scanner1.close();
	}

}
