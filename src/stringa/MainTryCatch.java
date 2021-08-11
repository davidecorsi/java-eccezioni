package stringa;

import java.util.Scanner;

public class MainTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa ");
		String s = input.nextLine();
		System.out.print("Inserisci una posizione ");
		int indice = input.nextInt();
		try {
			char x = s.charAt(indice);
			System.out.println("Il carattere nella posizione " + indice + " della stringa " + s + " è " + x);
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Non esiste alcun carattere in posizione " + indice + " " + e);
		}
	}
}
