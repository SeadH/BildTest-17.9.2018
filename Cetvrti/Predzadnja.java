package Cetvrti;

import java.util.Scanner;

public class Predzadnja {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		String recenica;
		
		System.out.println("Unesite recenicu: ");
		recenica = unos.nextLine();
	
		
		String linija=" ", rijec, predzadnja;
		while((recenica = unos.nextLine()) != null) {
			rijec = "";
			predzadnja = "";
			int brojacSpaceova = 0;
			for (int i = linija.length()-1; i >= 0; i--) {
				if(recenica.charAt(i) == ' ') {
					brojacSpaceova++;
					if(brojacSpaceova >= 2)
						break;
					rijec = "";
				}
				else
					rijec += recenica.charAt(i);
			}
			for (int i = rijec.length()-1; i >= 0; i--) {
				predzadnja += rijec.charAt(i);
			}
			System.out.println(predzadnja);
		}
		
		unos.close();
	}

}
