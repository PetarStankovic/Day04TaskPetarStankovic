package task03;

import java.util.Scanner;

/*
 * Cini mi se da je bilo preurediti tako da bude nasledjivanja, da kvadrat extenduje pravougaonik
 */
public class Task03PetarStankovic {

	public static void main(String[] args) {

		// oblici
		Kvadrat k1 = new Kvadrat(10);
		Kvadrat k2 = new Kvadrat(5);
		Pravougaonik p1 = new Pravougaonik(5, 10);
		Pravougaonik p2 = new Pravougaonik(10, 20);
		Pravougaonik p3 = new Pravougaonik(3, 4);

		Pravougaonik[] nizOblika = { k1, p2, p1, k2, p3 };

		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Ukucajte: \n1 za prikaz svih oblika \n2 za prikaz svih kvadrata \n3 za prikaz svih pravougaonika \n0 za izlaz iz programa \n->");
		int komanda = sc.nextInt();

		// dok god korisnik nije uneo dobru komandu program nudi da ponovi
		while (komanda != 1 && komanda != 2 && komanda != 3 && komanda != 0) {
			System.out.println("Pogresna komanda! Pokusajte ponovo\n->");
			komanda = sc.nextInt();
		}

		// rezultat u zavisnosti od unete komande
		switch (komanda) {
		case 1:
			for (int i = 0; i < nizOblika.length; i++) {
				System.out.println(nizOblika[i]);
			}
			break;
		case 2:
			for (int i = 0; i < nizOblika.length; i++) {
				if (nizOblika[i] instanceof Kvadrat) {
					System.out.println(nizOblika[i]);
				}
			}
			break;
		case 3:
			for (int i = 0; i < nizOblika.length; i++) {
				if (!(nizOblika[i] instanceof Kvadrat)) {
					System.out.println(nizOblika[i]);
				}
			}
			break;
		case 0:
			System.out.println("Pozdrav!");
			System.exit(0);
		}
		sc.close();
	}

}
