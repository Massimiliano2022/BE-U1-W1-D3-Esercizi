package esercizio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Inserire una stringa:");
			input=scanner.nextLine();
			
			for(int i=0; i<input.length();i++) {
				
				System.out.print(input.charAt(i)+",");
			}
			System.out.print("\n");
			
		}while(!input.equals(":q"));
		
		scanner.close();
		
	}

}
