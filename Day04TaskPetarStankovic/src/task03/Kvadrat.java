package task03;

public class Kvadrat extends Pravougaonik {

	public Kvadrat(double a) {
		super(a, a);
	}

	@Override
	public String toString() {
		return String.format("%-12s a = %.2f O = %.2f P = %.2f", "Kvadrat", a, obim(), povrsina());
	}
}