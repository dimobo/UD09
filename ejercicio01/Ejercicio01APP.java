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

		// Esto llama al metodo toString, lo he usado para hacer pruebas.
//		for (int i = 0; i < arrayElec.length; i++) {
//			System.out.println("Electrodoméstico " + (i + 1));
//			System.out.println(arrayElec[i].toString());
//
//		}

		for (int i = 0; i < arrayElec.length; i++) {
			
			arrayElec[i].precioFinal(arrayElec[i].getPrecioBase(), arrayElec[i].getConsumoEnergetico(), arrayElec[i].getPeso());

		}

	}

}
