package Ejercicio04;

public class Raices {

	private double a, b, c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void obtenerRaices() {

		if (tieneRaices() == true) {
			leerArray();
		} else {
			System.out.println("No tiene solución.");
		}

	}

	public void obtenerRaiz() {

		if (tieneRaiz() == true) {
			leerArray();
		} else if (tieneRaices() == true) {
			System.out.println("La ecuación tiene más de una solución.");

		} else {
			System.out.println("No tiene solución.");
		}

	}

	public double getDiscriminante() {

		return (Math.pow(b, 2) - 4 * a * c);

	}

	public boolean tieneRaices() {

		if (getDiscriminante() >= 0) {
			return true;
		}
		return false;
	}

	public boolean tieneRaiz() {

		if (getDiscriminante() == 0) {
			return true;
		}
		return false;

	}

	public void calcular() {

		if (tieneRaiz() == true) {
			System.out.println("La ecuación tiene una solución.");
			leerArray();
		} else if (tieneRaices() == true) {
			System.out.println("La ecuación tiene dos soluciones.");
			leerArray();
		} else {
			System.out.println("La ecuación no tiene solución.");
			leerArray();

		}

	}

	private double[] mates() {

		double num[] = new double[2];

		num[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		num[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);

		return num;

	}

	private void leerArray() {

		double calc[] = mates();

		if (tieneRaiz() == true) {
			System.out.println((1) + " resultado: " + calc[0]);
		} else {
			for (int i = 0; i < calc.length; i++) {
				System.out.println((i + 1) + " resultado: " + calc[i]);
			}

		}

	}

	// Zona de getters y setters.
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
