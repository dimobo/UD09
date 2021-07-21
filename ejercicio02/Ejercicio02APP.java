package ejercicio02;

public class Ejercicio02APP {

	public static void main(String[] args) {
		// Zona de variables necesarias
		int cnt = 0;
		Serie larga = new Serie();
		Videojuego largo = new Videojuego();

		// Creando objetos de tipo Serie.
		Serie arraySeries[] = new Serie[5];
		arraySeries[0] = new Serie();
		arraySeries[1] = new Serie("Fumetsu no anata e", "Drama");
		arraySeries[2] = new Serie("Fooly Cooly", "Comedia", "Hajime Ueda", 4);
		arraySeries[3] = new Serie("Neon Genesis Evangelion", "Suspense", "Hideaki Anno", 1);
		arraySeries[4] = new Serie("Ergo Proxy", "Suspense", "Dai Sato", 1);

		// Creando objetos de tipo videojuego.
		Videojuego arrayJocs[] = new Videojuego[5];
		arrayJocs[0] = new Videojuego();
		arrayJocs[1] = new Videojuego("Neverwinter Nights", 20);
		arrayJocs[2] = new Videojuego("Dragon Age Origins", "Rol", "BioWare", 60);
		arrayJocs[3] = new Videojuego("Pillars of Eternity", "Rol", "Obsidian Entretainment", 200);
		arrayJocs[4] = new Videojuego("Doom", "Hack and slash", "Bethesta", 15);

		// Entregando algunos videojuegos.
		arrayJocs[0].entregar();
		arrayJocs[3].entregar();
		arrayJocs[4].entregar();

		// Entregando algunas series.
		arraySeries[1].entregar();
		arraySeries[2].entregar();

		// Aqui estamos contando los videojuegos que hemos entregado y reseteando el
		// valor de entregado a false.
		for (int i = 0; i < arrayJocs.length; i++) {
			if (arrayJocs[i].isEntregado()) {
				cnt++;
				arrayJocs[i].devolver();
			}
		}
		// Mostramos por pantalla la cantidad de videojuegos que teniamos entregada.
		System.out.println("Hay " + cnt + " videojuegos entregados.");

		// Aqui estamos contando la cantidad de series que teniamos entregadas y
		// reseteando el valor de entregada a false;
		cnt = 0;
		for (int i = 0; i < arraySeries.length; i++) {
			if (arraySeries[i].isEntregado()) {
				cnt++;
				arraySeries[i].devolver();
			}
		}
		// Mostrando por pantalla la cantidad de series que teniamos entregada.
		System.out.println("Hay " + cnt + " series entregadas.");

		// Aqui estamos sacando la serie mas larga que tenemos creada.
		for (int i = 0; i < arraySeries.length; i++) {
			if (larga.getNumeroTemporadas() < arraySeries[i].compareTo(arraySeries[i])) {
				larga = arraySeries[i];
			}
		}
		// Mostrando por pantalla la serie que se ha elegido como la mas larga.
		System.out.println("\nLa serie mas larga es:\n" + larga.toString());

		// Estamos comprovando el videojueo mas largo que tenemos creado.
		for (int i = 0; i < arrayJocs.length; i++) {
			if (largo.getHorasEstimadas() < arrayJocs[i].compareTo(arrayJocs[i])) {
				largo = arrayJocs[i];
			}
		}
		// Sacando el resultado del videojuego mas largo que tenemos.
		System.out.println("\nEl videojuego mas largo es:\n" + largo.toString());

	}

}
