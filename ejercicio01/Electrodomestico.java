package ejercicio01;

import java.util.ArrayList;

public class Electrodomestico {

	// Atributos del objeto, los hemos creado protected por que se han de poder
	// heredar.
	protected double precioBase, peso;
	protected String color;
	protected char consumoEnergetico;

	// En esta zona estamos indicando los valores por defectos.
	protected final char CONSUMODEF = 'F';
	protected final String COLORDEF = "blanco";
	protected final double PRECIODEF = 100.0, PESODEF = 5.0;

	// Constructor en blanco con todo por defecto.
	public Electrodomestico() {

		precioBase = PRECIODEF;
		peso = PESODEF;
		color = COLORDEF;
		consumoEnergetico = CONSUMODEF;

	}

	// Constructor para precio y peso los demas atributos por defecto.
	public Electrodomestico(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLORDEF;
		this.consumoEnergetico = CONSUMODEF;

	}

	// Contructor para todos los atributos.
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

		this.precioBase = precioBase;
		this.peso = peso;

		if (colorList().contains(color.toLowerCase())) {
			this.color = color;
		} else {
			this.color = COLORDEF;
		}

		if (consumoList().contains(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMODEF;
		}
	}

	@Override
	public String toString() {

		String objeto = "Precio del Electrodoméstico: " + this.precioBase + " Peso del Electrodoméstico: " + this.peso
				+ " Color del Electrodoméstico: " + this.color + " Consumo energetico:  " + this.consumoEnergetico;

		return objeto;

	}

	// Este atributo nos devuelve una lista con lo que serán los parámetros
	// aceptados para el consumo de los electrodomésticos.
	protected ArrayList<Character> consumoList() {
		ArrayList<Character> consumoList = new ArrayList<Character>();

		consumoList.add('A');
		consumoList.add('B');
		consumoList.add('C');
		consumoList.add('D');
		consumoList.add('E');
		consumoList.add('F');

		return consumoList;
	}

	// Este atributo nos devuelve una lista con lo que serán los parámetros
	// aceptados para el color de los electrodomésticos.
	protected ArrayList<String> colorList() {
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("blanco");
		colorList.add("negro");
		colorList.add("rojo");
		colorList.add("azul");
		colorList.add("gris");

		return colorList;
	}

	// Zona de gets y sets.
	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

}
