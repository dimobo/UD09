package ejercicio01;

public class Lavadora extends Electrodomestico {

	// Atributo personal de lavadora.
	private double carga;

	// Valor por defecto de carga.
	private final double CARGADEF = 5;

	// Constructor por defecto.
	public Lavadora() {
		super();
		carga = CARGADEF;
	}

	// Constructor para precio y peso.
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		carga = CARGADEF;

	}

	// Constructor con todos los parametros.
	public Lavadora(double precioBase, double peso, double carga, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
		this.precioTotal = precioFinal(precioBase, this.consumoEnergetico, peso);
	}

	// Aqui implementamos el precio final del padre añadiendo una modificacion por
	// si la carga de la lavadora supera los 30kg
	@Override
	protected double precioFinal(double base, char consumo, double peso) {
		if (this.carga > 30) {
			return super.precioFinal(base, consumo, peso) + 50;
		}
		return super.precioFinal(base, consumo, peso);
	}

	// Sobre escritura del método toString del padre para añadir la carga de la
	// lavadora.
	@Override
	public String toString() {
		return super.toString() + "\nCarga de la lavadora: " + this.carga + "\n\n";
	}

	// Zona de getters
	public double getCarga() {
		return carga;
	}

}
