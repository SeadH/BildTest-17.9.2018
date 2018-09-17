package Drugi;

public class Test {

	public static void main(String[] args) {
		
		Racunar racunar = new Racunar(4,320,4.2,16.9,500.0);
		Laptop laptop = new Laptop(2,250,3.2,12.5,300.0,14.5);
		
		System.out.println("\tRacunar\nKolcina RAM-a: "+racunar.getKolicinaRama()+"GB"+"\nKapacitetHD: "+racunar.getKapicitetHD()+"GB"+"\nBrzina Procesora: "+racunar.getBrzinaProcesora()+"GHz"+"\nDijagonala Monitora: "+racunar.getDijagonalaMonitora()+"Inch");
		
		racunar.izracunajCijenu();
		System.out.println("Cijena racunara: "+racunar.getNabavnaCijena()+" KM");
		
		System.out.println("==============================================\n\tLAPTOP");
		
		System.out.println("Kolcina RAM-a: "+laptop.getKolicinaRama()+"GB"+"\nKapacitetHD: "+laptop.getKapicitetHD()+"GB"+"\nBrzina Procesora: "+laptop.getBrzinaProcesora()+"GHz"+"\nDijagonala Monitora: "+laptop.getDijagonalaMonitora()+"Inch"+"\nTrajanje Baterije: "+laptop.getTrajanjeBaterije()+"h");
		laptop.izracunajCijenu();
		System.out.println("Cijena laptopa: "+laptop.getNabavnaCijena()+" KM");
	}

}
