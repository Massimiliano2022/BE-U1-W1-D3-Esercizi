package esercizio2;

public class Main {

	public static void main(String[] args) {
		
		int numero = 5;
		
		stampaNumero(numero);

	}

	public static void stampaNumero(int numero) {
		
		switch (numero) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("Il numero non è compreso tra 0 e 3.");
			break;
		}
		
	}

}
