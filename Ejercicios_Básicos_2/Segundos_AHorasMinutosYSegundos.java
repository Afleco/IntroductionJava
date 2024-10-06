package Ejercicios_Básicos_2;

import java.util.Scanner;

public class Segundos_AHorasMinutosYSegundos {

	public static void main(String[] args) {
		/*
		 * 3) Realiza un Programa que pida al usuario un número de segundos, y nos
		 * devuelva su valor en horas, minutos y segundos.
		 */

		Scanner Scanner1 = new Scanner(System.in);
		int segUser;

		do {
			System.out.println("Introduce el número de segundos a convertir.");
			segUser = Scanner1.nextInt();

		} while (segUser < 0);

		int segFinal = segUser % 60;
		int minInicial = segUser / 60;
		int minFinal = minInicial % 60;
		int horas = minInicial / 60;

		Scanner1.close();
		System.out.println(horas + " horas, " + minFinal + " minutos, " + segFinal + " segundos.");

	}
}
