package task01;

public class Sef {

	private String pseudonim;
	private String odeljenje;
	private int starost;

	public Sef(String pseudonim) {
		this.pseudonim = pseudonim;
	}

	public void povecajPlatu(Zaposleni zaposleni, double plata) {
		if (zaposleni.getSef().getPseudonim().equals(this.pseudonim) && zaposleni.getSef().getPseudonim() != null
				&& plata > 0) {
			zaposleni.setPlata(zaposleni.getPlata() + plata);

		}
	}

	public String getPseudonim() {
		return pseudonim;
	}

	@Override
	public String toString() {
		return "Sef  Pseudonim: " + pseudonim + " Odeljenje: " + odeljenje + " Starost: " + starost;
	}

}
