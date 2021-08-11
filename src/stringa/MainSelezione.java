package stringa;

import java.util.Scanner;

public class MainSelezione {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa ");
		String s = input.nextLine();
		System.out.print("Inserisci una posizione ");
		int indice = input.nextInt();
		if(indice >= 0 && indice < s.length()) {
			char x = s.charAt(indice);
			System.out.println("Il carattere nella posizione " + indice + " della stringa " + s + " è " + x);
		} else {
			System.out.println("Non esiste alcun carattere in posizione " + indice);
		}
	}
}
