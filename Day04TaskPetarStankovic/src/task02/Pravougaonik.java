package task02;

public class Pravougaonik {

	private double a;
	private double b;

	public Pravougaonik() {

	}

	public Pravougaonik(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double obim() {
		return (2 * a) + (2 * b);
	}

	public double povrsina() {
		return a * b;
	}

	@Override
	public String toString() {
		return String.format("%-12s a = %5.2f b = %5.2f O = %5.2f P = %.2f", "Pravougaonik", a, b, obim(), povrsina());
	}
}