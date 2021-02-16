package task02;

import java.util.Scanner;

/*
 * Kreirati klasu kvadrat
 *  atribut duzina stranice
 *  neparametrizovan i parametrizovan konstruktor
 *  metodu izracunaj povrsinu
 *  metodu izracunaj obim
 *  metodu prikazi (prikazuju se sledeci podaci: "kvadrat", duzina stranice. obim i povrsina
 *  
 *  
 * Kreirati klasu pravougaonik. Klasa pravougaonik sadrzi:
 *  atribut duzine stranice a i b
 *  neparametrizovan i parametrizovan konstruktor
 *  metodu izracunaj povrsinu
 *  metodu izracunaj obim
 *  metodu prikazi ("pravougaonik", duzina stranica, obim i povrsina)
 *   
 *   
 * Kreirati 2 kvadrata i 3 pravougaonika i ubaciti u niz
 *  u glavnom programu napraviti korisnicki meni:
 *  
 *  1.prikazi sve oblike
 *    oblik, dimenzije, obim, povrsina  
 *  2. prikazi sve kvadrate
 *  3. prikazi pravougaonike
 *  0. kraj programa
 */

public class Task02PetarStankovic {

	public static void main(String[] args) {

		Kvadrat k1 = new Kvadrat(10);
		Kvadrat k2 = new Kvadrat(5);
		Pravougaonik p1 = new Pravougaonik(5, 10);
		Pravougaonik p2 = new Pravougaonik(10, 20);
		Pravougaonik p3 = new Pravougaonik(3, 4);

		Object[] nizObjekata = { k1, p2, p1, k2, p3 };

		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Ukucajte: \n1 za prikaz svih oblika \n2 za prikaz svih kvadrata \n3 za prikaz svih pravougaonika \n0 za izlaz iz programa \n->");
		int komanda = sc.nextInt();

		while (komanda != 1 && komanda != 2 && komanda != 3 && komanda != 0) {
			System.out.println("Pogresna komanda! Pokusajte ponovo\n->");
			komanda = sc.nextInt();
		}

		switch (komanda) {
		case 1:
			for (int i = 0; i < nizObjekata.length; i++) {
				System.out.println(nizObjekata[i]);
			}
			break;
		case 2:
			for (int i = 0; i < nizObjekata.length; i++) {
				if (nizObjekata[i] instanceof Kvadrat) {
					System.out.println(nizObjekata[i]);
				}
			}
			break;
		case 3:
			for (int i = 0; i < nizObjekata.length; i++) {
				if (nizObjekata[i] instanceof Pravougaonik) {
					System.out.println(nizObjekata[i]);
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
