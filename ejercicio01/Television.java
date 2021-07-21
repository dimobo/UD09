package ejercicio01;

public class Television extends Electrodomestico {

	// Atributos de la clase
	private double pulgadas;
	private boolean tdt;

	// Valores por defecto
	private final double PULGADASDEF = 20;
	private final boolean TDTDEF = false;

	// Constructor por defecto.
	public Television() {
		super();
		pulgadas = PULGADASDEF;
		tdt = TDTDEF;
	}

	// Constructor para precio y peso.
	public Television(double precio, double peso) {
		super(precio, peso);
		this.pulgadas = PULGADASDEF;
		this.tdt = TDTDEF;
		this.precioTotal = precioFinal(precioBase, this.consumoEnergetico, peso);
	}

	// Constructor con todos los parametros.
	public Television(double precioBase, double peso, String color, char consumoEnergetico, double pulgadas,
			boolean tdt) {
		super(precioBase, peso, color, consumoEnergetico);
		this.pulgadas = pulgadas;
		this.tdt = tdt;
		this.precioTotal = precioFinal(precioBase, this.consumoEnergetico, peso);
	}

	// Sobreescribiremos el m�todo precioFinal del padre para a�adir las
	// modificaciones a realizar en televisi�n.
	@Override
	protected double precioFinal(double base, char consumo, double peso) {
		// Aqu� estamos creando una variable que ejecutara el precioFinal del padre y la
		// guardara para luego realizar las operaciones posteriores necesarias.
		double total = super.precioFinal(base, consumo, peso);

		// Este if nos mira si las pulgadas del televisor son superiores a 40 y en caso
		// de que sea as� se le a�ade un 30% al precio total, a�ado el % de precio ahora
		// por que en el enunciado esta antes que el plus de tdt
		if (this.pulgadas > 40) {
			total = total + (total * 0.3);
		}

		// Este if mira si tdt es true y en caso de que sea as� se le a�adir�n 50 euros
		// al precio total.
		if (this.tdt == true) {
			total = total + 50;
		}

		return total;
	}

	// M�todo tostring sobreescrito para a�adir los atributos espec�ficos de
	// televisor.
	@Override
	public String toString() {
		return super.toString() + "\nPulgadas del televisor: " + this.pulgadas + "\nTDT incluido: " + this.tdt + "\n\n";
	}

	// Zona de getters.
	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isTdt() {
		return tdt;
	}

}
