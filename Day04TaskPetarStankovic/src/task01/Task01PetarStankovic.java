package task01;

/*
 * Kreirati klasu zaposleni sa atributima 
 * -ime
 * -plata
 * -sef (klase Sef)
 *
 * -Klasa ima konstruktor koji ima dva argumenta kojima se postavljaju 
 *  vrednosti za ime i platu
 * 
 * -Metodu postaviPlatu
 * -Metodu postaviSefa
 * -Metodu prikazi, kojima se prikazuju podaci o osobi, ime, plata i pseudonim sefa
 * 
 *  
 * Kreirati klasu sef sa atributima
 * -pseudonim
 * -odeljenje
 * -starost
 * 
 * -Klasa ima konstruktor sa jednim argumentom kojim se postavlja pseudonim
 * 
 * -Metodu povecajPlatu koja promeni platu zaposlenog ali samo ako je on sef zaposlenom
 *  i ako je plata pozitivan broj
 * -Metodu prikazi koja prikazuje podatke o sefu
 * 
 * 
 * 
 * Napisati glavni program:
 *  u glavnom programu kreirati tri zaposlena i 2 sefa sa razlicitim pseudonimom
 *  platu svima postaviti na 521.
 *  dodeliti 1. zaposlenom 1. sefa i drugom zaposlenom 2. sefa
 *  prikazati podatke o svim zaposlenima
 *  
 *  1. sef pokusava svim zaposlenima da promeni platu za 100
 *  prikazati podatke o svim zaposlenima
 *  
 *  2. sef pokusava da poveca platu svom zaposlenom za 100.
 *  prikazati/ispisati podatke o tom zaposlenom
 * 
 * Direktno smanjiti platu svim zaposlenima za 100
 * ispisati podatke o svim zaposlenima
 * 
 */

public class Task01PetarStankovic {

	public static void main(String[] args) {
		Zaposleni zaposleni1 = new Zaposleni("zaposleni 1", 521);
		Zaposleni zaposleni2 = new Zaposleni("zaposleni 2", 521);
		Zaposleni zaposleni3 = new Zaposleni("zaposleni 3", 521);

		Sef sef1 = new Sef("sef2");
		Sef sef2 = new Sef("sef2");

		zaposleni1.setSef(sef1);
		zaposleni2.setSef(sef2);

		System.out.println("Zaposlenih pre menjanja plate: ");
		System.out.println(zaposleni1);
		System.out.println(zaposleni2);
		System.out.println(zaposleni3);
		System.out.println();

		sef1.povecajPlatu(zaposleni1, 100);
		sef1.povecajPlatu(zaposleni2, 100);
		sef1.povecajPlatu(zaposleni3, 100);

		System.out.println("Zaposleni nakon sto je Sef 1 promenio plate: ");
		System.out.println(zaposleni1);
		System.out.println(zaposleni2);
		System.out.println(zaposleni3);
		System.out.println();

		sef2.povecajPlatu(zaposleni1, 100);
		sef2.povecajPlatu(zaposleni2, 100);
		sef2.povecajPlatu(zaposleni3, 100);

		System.out.println("Zaposleni nakon sto je Sef 2 promenio plate: ");
		System.out.println(zaposleni1);
		System.out.println(zaposleni2);
		System.out.println(zaposleni3);
		System.out.println();

	}

}
