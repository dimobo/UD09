package ejercicio06;

import java.util.Random;

public class Sala {

	public String[][] sentarPersona(String[][] asiento) {
		Random r = new Random();

		while (true) {
			int r1 = r.nextInt((8 - 0) + 1) + 0;
			int r2 = r.nextInt((9 - 0) + 1) + 0;

			if (asiento[r1][r2].equals("")) {
				asiento[r1][r2] = "~";
				return asiento;
			}

		}
	}

}
