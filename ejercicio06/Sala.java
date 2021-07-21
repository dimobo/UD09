package ejercicio06;

import java.util.ArrayList;
import java.util.Random;

public class Sala {

	// Atributo de sala
	private String[][] asiento = new String[8][9];

	// Constructor de clase
	public Sala() {
		asiento = iniciarSala();
	}

	// Iniciar sala
	public String[][] iniciarSala() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				asiento[i][j] = "X";
			}
		}

		return asiento;

	}

	// Metodo para sentar a una persona.
	public String[][] sentarPersona(int r1, int r2) {

		if (asiento[r1][r2].equals("X")) {
			asiento[r1][r2] = "~";
		}
		return asiento;
	}

	// Metodo para sentar a una persona aleatoriamente.
	public String[][] sentarPersonaRandom(int espectadores) {
		Random r = new Random();

		for (int i = 0; i < espectadores;) {
			int r1 = r.nextInt((7 - 0) + 1) + 0;
			int r2 = r.nextInt((8 - 0) + 1) + 0;
			if (asiento[r1][r2].equals("X")) {
				asiento[r1][r2] = "~";
				i++;
			}
		}
		return asiento;
	}

	// Leer sala.
	public void leerSala() {
		System.out.print("\n\n\n");
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j <= 8; j++) {

				System.out.print(Integer.toString(i + 1) + listaLetras().get(j) + asiento[i][j] + " ");

			}
			System.out.print("\n");
		}
	}

	// Lista de la sala
	private ArrayList<Character> listaLetras() {
		ArrayList<Character> lista = new ArrayList<Character>();
		lista.add('A');
		lista.add('B');
		lista.add('C');
		lista.add('D');
		lista.add('E');
		lista.add('F');
		lista.add('G');
		lista.add('H');
		lista.add('I');
		return lista;
	}

}
