package Drugi;

public class Racunar {

	private int kolicinaRama;
	private int kapicitetHD;
	private double brzinaProcesora;
	private double dijagonalaMonitora;
	private double nabavnaCijena;

	public Racunar(int kolicinaRama, int kapicitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena) {
		super();
		this.kolicinaRama = kolicinaRama;
		this.kapicitetHD = kapicitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}

	public int getKolicinaRama() {
		return kolicinaRama;
	}

	public void setKolicinaRama(int kolicinaRama) {
		this.kolicinaRama = kolicinaRama;
	}

	public double getKapicitetHD() {
		return kapicitetHD;
	}

	public void setKapicitetHD(int kapicitetHD) {
		this.kapicitetHD = kapicitetHD;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}

	public void setDijagonalaMonitora(double dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}

	public double getNabavnaCijena() {
		return nabavnaCijena;
	}

	public void setNabavnaCijena(double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}

	public double izracunajCijenu() {

		setNabavnaCijena(getNabavnaCijena() * 1.1);

		return getNabavnaCijena();

	}
	
	

}
