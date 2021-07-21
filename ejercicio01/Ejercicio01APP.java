package ejercicio01;

public class Ejercicio01APP {

	public static void main(String[] args) {

		// Crearemos un array que contendrá objetos de la clase Electrodomestico.
		Television arrayElec[] = new Television[6];

		// Generaremos los objetos para hacer las pruebas.
		// Este primer objeto sera con el contructor por defecto.
		arrayElec[0] = new Television();
		// Este segundo objeto sera con el constructor para precio y perso.
		arrayElec[1] = new Television(400, 15.4);
		// Los siguientes electrodomésticos son para el constructor con todos los
		// atributos y forzando errores.
		arrayElec[2] = new Television(50.21, 30, "rojo", 'A', 25, true);
		// En este falla el color.
		arrayElec[3] = new Television(115, 90, "beige", 'C', 49, false);
		// En este falla la letra.
		arrayElec[4] = new Television(140, 9, "Gris", 'z', 30, false);
		// En este fallan los dos.
		arrayElec[5] = new Television(170, 50, "Naranja", 'G', 80, true);

		for (int i = 0; i < arrayElec.length; i++) {
			System.out.println("Electrodoméstico " + (i + 1));
			System.out.println(arrayElec[i].toString());

		}

	}

}
