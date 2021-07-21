package ejercicio04;

public class Raices {

	// Aquí tenemos los atributos de nuestro objeto.
	private double a, b, c;

	public Raices() {
		a = 0;
		b = 0;
		c = 0;
	}
	// Este es nuestro constructor.
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Este método cuando lo llamemos lo primero que hará es ver si nuestra array
	// tiene solución posible, en caso de que no la tenga lo dirá por pantalla, y si
	// tiene solución ejecutara otro método llamado leerArray.
	public void obtenerRaices() {

		if (tieneRaices() == true) {
			leerArray();
		} else {
			System.out.println("No tiene solución.");
		}

	}

	// Este método es como el anterior, pero solo va a seguir con la ejecución si la
	// ecuación tiene una única solución.
	public void obtenerRaiz() {

		if (tieneRaiz() == true) {
			leerArray();
		} else if (tieneRaices() == true) {
			System.out.println("La ecuación tiene más de una solución.");

		} else {
			System.out.println("No tiene solución.");
		}

	}

	// Este método la única función que tiene es calcular el discriminante que lo
	// obtendremos con la fórmula que contiene y lo retornara.
	public double getDiscriminante() {

		return (Math.pow(b, 2) - 4 * a * c);

	}

	// Los dos métodos siguientes son los responsables de comprobar si la ecuación
	// tiene uno o dos resultados.
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

	// Este método con la ayuda de los dos anteriores nos dirá si la ecuación del
	// objeto tiene una solución, dos o ninguna solución real (Discriminante) y
	// ejecuta el método leerArray.
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

	// Este método nos va a hacer las operaciones y las guardará en una array.
	private double[] mates() {

		double num[] = new double[2];

		num[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		num[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);

		return num;

	}

	// Este método simplemente va a leer la array tratando de forma especial si es
	// una ecuación de un solo resultado.
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
