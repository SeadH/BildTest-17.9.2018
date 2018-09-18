package Cetvrti;

import java.util.Scanner;

public class Predzadnja {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		String recenica;

		System.out.println("Unesite recenicu: ");
		recenica = unos.nextLine();

		String[] rijeci = recenica.split("[ ]+");

		System.out.println("Predzadnja rijeè u reèenici je: " + rijeci[rijeci.length - 2]); // predzadnja
																							// rijec
		System.out.println("Broj rijeci: " + rijeci.length); // broj rijeci u
																// recnici

		unos.close();
	}

}
