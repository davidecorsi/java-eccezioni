package somma;

import java.util.Scanner;

public class MainTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il dividendo ");
		int dividendo = input.nextInt();
		System.out.print("Inserisci il divisore ");
		int divisore = input.nextInt();
		try {
			int quoziente = dividendo / divisore;
			System.out.println("Il quoziente è " + quoziente);
		} catch(ArithmeticException e) {
			System.out.println("Impossibile effettuare una divisione per 0 " + e);
		}
	}
}
