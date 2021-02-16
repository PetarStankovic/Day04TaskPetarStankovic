package task02;

public class Kvadrat {

	private double a;

	public Kvadrat() {

	}

	public Kvadrat(double a) {
		this.a = a;
	}

	public double obim() {
		return 4 * a;
	}

	public double povrsina() {
		return a * a;
	}

	@Override
	public String toString() {
		return String.format("%-12s a = %5.2f O = %.2f P = %.2f", "Kvadrat", a, obim(), povrsina());
	}
}