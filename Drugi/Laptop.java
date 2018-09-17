package Drugi;

public class Laptop extends Racunar {

	private double trajanjeBaterije;

	public Laptop(int kolicinaRama, int kapicitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena, double trajanjeBaterije) {
		super(kolicinaRama, kapicitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}

	public double getTrajanjeBaterije() {
		return trajanjeBaterije;
	}

	public void setTrajanjeBaterije(double trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}

	@Override
	public double izracunajCijenu() {

		setNabavnaCijena(getNabavnaCijena() * 1.15);

		return getNabavnaCijena();

	}

}
