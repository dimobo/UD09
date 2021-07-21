package ejercicio01;

public class Ejercicio01APP {

	public static void main(String[] args) {

		// Crearemos un array que contendrá objetos de la clase Electrodomestico.
		Lavadora arrayElec[] = new Lavadora[6];

		// Generaremos los objetos para hacer las pruebas.
		// Este primer objeto sera con el contructor por defecto.
		arrayElec[0] = new Lavadora();
		// Este segundo objeto sera con el constructor para precio y perso.
		arrayElec[1] = new Lavadora(400, 15.4);
		// Los siguientes electrodomésticos son para el constructor con todos los
		// atributos y forzando errores.
		arrayElec[2] = new Lavadora(50.21, 10, 30, "rojo", 'A');
		// En este falla el color.
		arrayElec[3] = new Lavadora(115, 50, 90, "beige", 'C');
		// En este falla la letra.
		arrayElec[4] = new Lavadora(140, 30, 9, "Gris", 'z');
		// En este fallan los dos.
		arrayElec[5] = new Lavadora(170, 31, 50, "Naranja", 'G');

		for (int i = 0; i < arrayElec.length; i++) {
			System.out.println("Electrodoméstico " + (i+1));
			System.out.println(arrayElec[i].toString());

		}

	}

}
