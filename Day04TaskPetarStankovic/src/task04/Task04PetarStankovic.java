package task04;

/*
 * Napisati metodu koja prikazuje frekvenciju pojavljivanja svakog znaka u stringu
 */

public class Task04PetarStankovic {

	public static void main(String[] args) {

		String s = "Mnogo je hladno sta je ovo";
		String s2 = "Danas je lep dan";
		frekvencijaKaraktera(s);
		frekvencijaKaraktera(s2);
	}

	static void frekvencijaKaraktera(String s) {
		int[] frekvencija = new int[s.length()];
		char[] nizKaraktera = s.toUpperCase().toCharArray();

		for (int i = 0; i < s.length(); i++) {
			frekvencija[i] = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (nizKaraktera[i] == nizKaraktera[j]) {
					frekvencija[i]++;
					nizKaraktera[j] = '0';
				}
			}
		}

		System.out.println("\nFrekvencija karaktera u datom Stringu: ");
		for (int i = 0; i < frekvencija.length; i++) {
			if (nizKaraktera[i] != ' ' && nizKaraktera[i] != '0')
				System.out.print(nizKaraktera[i] + ":" + frekvencija[i] + " | ");
		}
	}

}
