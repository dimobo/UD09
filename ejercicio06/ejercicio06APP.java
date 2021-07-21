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
				"¿Que opcion desea realizar?\n1) Espectadores aleatoriamente.\n2) Espectadores uno a uno.\n3) Simulacion con dinero")) {
		// Este caso nos generara un numero aleatorio de espectadores para la sala.
		case 1:
			for (int i = 0; i < r1; i++) {
				r2 = r.nextInt((80 - 1) + 1) + 1;
				esp1[i] = new Espectador("Espectador" + 1, r2, 0.0);
			}
			System.out.println("Espectadores generados: " + r1);
			s1.sentarPersonaRandom(r1);
			s1.leerSala();
			break;

		//Con este caso sentaremos a los espectadores uno a uno en nuestra sala.
		case 2:
			r1 = 0;
			r2 = 0;
			boolean fi = false;
			while (fi == false) {
				switch (pedirNumero("1) Añadir espectador \n2) Listar sala \n3) Salir")) {
				case 1:
					s1.sentarPersona(r1, r2);
					r2++;
					if (r2 == 8 && r1 == 7) {
						System.out.println("No quedan espacios en la sala.");
						fi = true;
					}
					if (r2 == 8) {
						r1++;
						r2 = 0;
					}
					break;
				case 2:
					s1.leerSala();
					break;
				case 3:
					fi = true;
					break;
				default:
					System.out.println("Valor introducido no válido.");
					break;
				}
			}
			break;

		// TODO
		case 3:

			break;

		default:
			System.out.println("Valor introducido no válido.");
			break;
		}

	}

	// Este método pedirá un número al usuario y se asegurará que sea un número
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
						JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				}
			} else {
				return num;
			}
		}
	}

}
