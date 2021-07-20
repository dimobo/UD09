package ejercicio04;

public class Ejercicio04APP {

	public static void main(String[] args) {

		Raices raiz1 = new Raices(-1, 7, -10);
		Raices raiz2 = new Raices(-1, 0, -10);
		Raices raiz3 = new Raices(1, -2, 1);
		Raices raiz4 = new Raices();

		// La ecuación de este objeto tiene 2 soluciones.
		System.out.println("Pruebas 1r objeto.");
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		raiz1.calcular();
		System.out.println(raiz1.getDiscriminante());

		// La ecuación de este objeto no tiene soluciones.
		System.out.println("\n\nPruebas 2n objeto.");
		raiz2.obtenerRaices();
		raiz2.calcular();
		System.out.println(raiz2.getDiscriminante());

		// La ecuación de este objeto tiene una solución.
		System.out.println("\n\nPruebas 3r objeto.");
		raiz3.obtenerRaices();
		raiz3.obtenerRaiz();
		raiz3.calcular();
		System.out.println(raiz3.getDiscriminante());

		// Objeto con constructor vacío.
		System.out.println("\n\nPruebas 4r objeto.");
		raiz4.obtenerRaices();
		raiz4.obtenerRaiz();
		raiz4.calcular();
		System.out.println(raiz4.getDiscriminante());
	}
}
