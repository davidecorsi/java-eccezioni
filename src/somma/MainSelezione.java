package somma;

import java.util.Scanner;

public class MainSelezione {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il dividendo ");
		int dividendo = input.nextInt();
		System.out.print("Inserisci il divisore ");
		int divisore = input.nextInt();
		if(divisore != 0) {
			int quoziente = dividendo / divisore;
			System.out.println("Il quoziente è " + quoziente);
		} else {
			System.out.println("Impossibile effettuare una divisione con divisore 0");
		}
		
	}
}
