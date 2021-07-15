package Ejercicio04;

public class Ejercicio04APP {

	public static void main(String[] args) {

		Raices raiz1 = new Raices(-1, 7, -10);
		Raices raiz2 = new Raices(-1, 0, -10);
		Raices raiz3 = new Raices(1, -2, 1);

		System.out.println("Pruebas 1r objeto.");
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		raiz1.calcular();
		System.out.println(raiz1.getDiscriminante());
		
		System.out.println("\n\nPruebas 2n objeto.");
		raiz2.obtenerRaices();
		raiz2.calcular();
		System.out.println(raiz2.getDiscriminante());
		
		System.out.println("\n\nPruebas 3r objeto.");
		raiz3.obtenerRaiz();
		//raiz3.obtenerRaices();

	}

}
