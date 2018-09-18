package Peti;

import java.util.ArrayList;
import java.util.Scanner;

public class Kraj {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		ArrayList<String> recenice = new ArrayList<>();
		String s = "";

		System.out.println("Unesite tekst($ za prekid unosa): ");

		while (s.equals("$") == false) {
			s = unos.nextLine();
			if (s.equals("$"))
				continue;
			recenice.add(s);

		}

		for (String st : recenice) {
			System.out.print(st + " ");
		}

		unos.close();
	}
}
