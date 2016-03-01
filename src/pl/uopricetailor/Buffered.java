package pl.uopricetailor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*
		System.out.print("Enter your name: ");

		String name = reader.readLine();
		System.out.println("Your name is: " + name);
		*/
		String tmpField = reader.readLine();
		boolean testVar = true;

		do {
			if (tmpField.equals("4")) {
				System.out.println("Zamykam program");
				break;
			}

			switch (tmpField) {
			case "1":
				System.out.println("1 zaglebienie");
				tmpField = reader.readLine();
				do {
					switch (tmpField) {
					case "1":
						System.out.println("2 zaglebienie");
						tmpField = reader.readLine();
						break;
					}
				} while (testVar == true);
				break;
			}
		} while(true);
	}
}

