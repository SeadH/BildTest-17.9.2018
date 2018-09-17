package Treci;

public class Nizovi {

	public static void main(String[] args) {
	
		int[] niz1 = {1,2,3,4,5,6,7,8,9};
		
	min(niz1);
	max(niz1);
	
	//Sume nisam stigao

	}
	
	static void min(int niz[]){
		int min = niz[0];
		for (int i = 1; i<niz.length; i++)
			if(min>niz[i])
				min=niz[i];
						
						System.out.println("Najmanji èlan niza je : "+min);
	}
	
	static void max(int niz[]){
		int max = niz[0];
		for (int i = 1; i<niz.length; i++)
			if(max<niz[i])
				max=niz[i];
						
						System.out.println("Najveci èlan niza je : "+max);
	}
}
