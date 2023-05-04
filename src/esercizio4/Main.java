package esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire un numero intero:");
		
		input=scanner.nextInt();
		
		for(int i=input;i>=0;i--) {
			System.out.println(i);
			
		}
		
		scanner.close();
		
	}

}
