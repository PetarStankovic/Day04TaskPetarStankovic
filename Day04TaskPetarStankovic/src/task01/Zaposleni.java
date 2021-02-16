package task01;

public class Zaposleni {

	private String ime;
	private double plata;
	private Sef sef;

	public Zaposleni(String ime, int plata) {
		this.ime = ime;
		this.plata = plata;
		this.sef = new Sef(null);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public Sef getSef() {
		return sef;
	}

	public void setSef(Sef sef) {
		this.sef = sef;
	}

	@Override
	public String toString() {
		return "Zaposleni " + "Ime: " + ime + " Plata: " + plata + " Sef: " + sef.getPseudonim();
	}

}
