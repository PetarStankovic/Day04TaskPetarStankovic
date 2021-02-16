package task03;

public class Pravougaonik {

	protected double a;
	protected double b;

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
		return String.format("%-12s a = %.2f, b = %.2f O = %.2f P = %.2f", "Pravougaonik", a, b, obim(), povrsina());
	}

	public String getDimension() {
		return String.format("%6.2f x %6.2f", a, b);
	}
}