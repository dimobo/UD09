package ejercicio01;

public class Ejercicio01APP {

	public static void main(String[] args) {

		// Crearemos un array que contendrá objetos de la clase Electrodomestico.
		Electrodomestico arrayElec[] = new Electrodomestico[6];

		// Generaremos los objetos para hacer las pruebas.
		// Este primer objeto sera con el contructor por defecto.
		arrayElec[0] = new Electrodomestico();
		// Este segundo objeto sera con el constructor para precio y perso.
		arrayElec[1] = new Electrodomestico(400, 15.4);
		// Los siguientes electrodomésticos son para el constructor con todos los
		// atributos y forzando errores.
		arrayElec[2] = new Electrodomestico(50.21, 6, "rojo", 'A');
		// En este falla el color.
		arrayElec[3] = new Electrodomestico(115, 11, "beige", 'C');
		// En este falla la letra.
		arrayElec[4] = new Electrodomestico(140, 9, "Gris", 'z');
		// En este fallan los dos.
		arrayElec[5] = new Electrodomestico(170, 8.6, "Naranja", 'G');

		for (int i = 0; i < arrayElec.length; i++) {

			System.out.println(arrayElec[i].toString());

		}

	}

}
