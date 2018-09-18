package Treci;

import java.util.Arrays;

public class Nizovi {

	public static void main(String[] args) {

		int[] niz1 = { 11, 2, 7, 4, 5, 6, 3, 8, 9 };
		
		isprintajNiz(niz1);
		Arrays.sort(niz1); // sortirali smo niz
		System.out.println("Sortiran niz:");
		isprintajNiz(niz1);

		min(niz1);
		max(niz1);
		suma(niz1);

	

	}

	static void min(int niz[]) {
		int min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min)
				min = niz[i];
		}
		System.out.println("Najmanji èlan niza je: " + min);
	}

	static void max(int niz[]) {
		int max = niz[0];
		for (int i = 1; i < niz.length; i++)
			if (niz[i] > max)
				max = niz[i];

		System.out.println("Najveci èlan niza je : " + max);
	}

	static void suma(int niz[]) {
		int suma = 0;
		for (int i = 1; i < niz.length; i++) {

			suma = suma + niz[i];

		}
		System.out.println("Suma svih èlanova niza je: " + suma);
	}

	public static void isprintajNiz(int niz[]) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}
		System.out.println();
	}

}
