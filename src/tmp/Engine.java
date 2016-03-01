package tmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine {

	Ork material = new Ork();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String tmpField;
	int tmpField2;

	private void tailor(Tailoring tailoring, String text) {
		tailoring.craftLight(text);
	}

	public static void showMenu1() {
		System.out.println("Menu wyceny przedmiotow:");
		System.out.println("1 - Zbroje skorzane");
		System.out.println("2 - Zbroje nabijane");
		System.out.println("3 - Zbroje kosciane");
		System.out.println("4 - Zamykam program");
	}

	public void startEngine() throws IOException {

		showMenu1();
		String tmpField = reader.readLine();
		String text = null;

		do {
			if (tmpField.equals("4")) {
				System.out.println("Zamykam program");
				break;
			}

			Tailoring tailoring = null;

			switch (tmpField) {
			case "1":
				//material = new Ork();
				break;
			case "2":
				break;
			case "3":
				break;
			}

			tailor(tailoring, text);

		} while (true);
	}
}
