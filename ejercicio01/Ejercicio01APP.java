package ejercicio01;

public class Ejercicio01APP {

	public static void main(String[] args) {

		// Crearemos un array que contendrá objetos de la clase Electrodomestico.
		Electrodomestico arrayElec[] = new Electrodomestico[10];

		// Generaremos los objetos para hacer las pruebas.
		arrayElec[0] = new Lavadora();
		arrayElec[1] = new Television(400, 15.4);
		arrayElec[2] = new Television(50.21, 30, "rojo", 'A', 25, true);
		arrayElec[3] = new Lavadora(115, 90, 5, "beige", 'C');
		arrayElec[4] = new Lavadora(140, 9, 25, "Gris", 'z');
		arrayElec[5] = new Television(170, 50, "Naranja", 'G', 80, true);
		arrayElec[6] = new Television(170, 50, "Naranja", 'B', 80, true);
		arrayElec[7] = new Lavadora(170, 50, 15, "Naranja", 'B');
		arrayElec[8] = new Lavadora(170, 50, 40, "Naranja", 'E');
		arrayElec[9] = new Television(170, 50, "Naranja", 'C', 80, true);

		//
		double televisionFinal = 0, televisionAcutal = 0, lavadoraFinal = 0, lavadoraActual = 0;

		for (int i = 0; i < arrayElec.length; i++) {
			if (arrayElec[i] instanceof Television) {
				televisionAcutal = arrayElec[i].precioFinal(arrayElec[i].getPrecioBase(),
						arrayElec[i].getConsumoEnergetico(), arrayElec[i].getPeso());
				televisionFinal += televisionAcutal;
				System.out.println("En la posicion " + i + " tenemos un televisor.\nPrecio Del televisor: "
						+ televisionAcutal + "\n");
			}
		}

		System.out.println("El precio final de las Televisiones es: " + televisionFinal + "\n\n\n");

		for (int i = 0; i < arrayElec.length; i++) {
			if (arrayElec[i] instanceof Lavadora) {
				lavadoraActual = arrayElec[i].precioFinal(arrayElec[i].getPrecioBase(),
						arrayElec[i].getConsumoEnergetico(), arrayElec[i].getPeso());
				lavadoraFinal += lavadoraActual;
				System.out.println("En la posicion " + i + " tenemos una lavadora.\nPrecio De la lavadora: "
						+ lavadoraActual + "\n");
			}
		}

		System.out.println("El precio final de las Lavadoras es: " + lavadoraFinal);

	}

}
