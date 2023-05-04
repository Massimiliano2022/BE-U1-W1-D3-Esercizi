package esercizio1;

public class Main {

	public static void main(String[] args) {

		String check = "prova";

		System.out.println(checkStr(check));

		int checkAnno = 1700;
		
		System.out.println(checkAnnoBisestile(checkAnno));

	}

	public static boolean checkStr(String str) {

		int stringaLength = str.length();

		if (stringaLength % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkAnnoBisestile(int anno) {

		if (anno % 400 == 0 && anno %100 == 0 && anno % 4 == 0) {

			return true;

		} else {

			return false;
		}
	}

}
