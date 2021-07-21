package ejercicio06;

import java.util.Random;
import javax.swing.JOptionPane;

public class ejercicio06APP {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {

		Sala s1 = new Sala();

		// Con este random haremos la simulacion de sentar a mcuha gente de forma
		// aleatoria.
		Random r = new Random();
		int r1 = r.nextInt((40 - 10) + 1) + 10, r2;
		Espectador[] esp1 = new Espectador[r1];

		switch (pedirNumero(
				"�Que opcion desea realizar?\n1) Espectadores aleatoriamente.\n2) Espectadores uno a uno.\n3) Simulacion con dinero")) {
		case 1:
			for (int i = 0; i < r1; i++) {
				r2 = r.nextInt((80 - 1) + 1) + 1;
				esp1[i] = new Espectador("Espectador" + 1, r2, 0.0);
			}
			System.out.println("Espectadores generados: " + r1);
			s1.sentarPersonaRandom(r1);
			s1.leerSala();

			break;

		case 2:

			break;

		case 3:

			break;

		default:
			System.out.println("Valor introducido no v�lido.");
			break;
		}

	}

	// Este m�todo pedir� un n�mero al usuario y se asegurar� que sea un n�mero
	// entero positivo.
	public static int pedirNumero(String text) {

		int num = 0;

		while (true) {
			String dato = JOptionPane.showInputDialog(text);

			if (!dato.equals(null)) {
				try {
					num = Integer.parseInt(dato);
					if (num > 0) {
						return num;
					} else {
						JOptionPane.showMessageDialog(null, "Valor introducido no v�lido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no v�lido.");
				}
			} else {
				return num;
			}
		}
	}

}
