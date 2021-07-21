package ejercicio01;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Electrodomestico {

	// Atributos del objeto, los hemos creado protected por que se han de poder
	// heredar.
	protected double precioBase, precioTotal, peso;
	protected String color;
	protected char consumoEnergetico;

	// En esta zona estamos indicando los valores por defectos.
	protected final char CONSUMODEF = 'F';
	protected final String COLORDEF = "blanco";
	protected final double PRECIODEF = 100.0, PESODEF = 5.0;

	// Constructor en blanco con todo por defecto.
	public Electrodomestico() {

		peso = PESODEF;
		color = COLORDEF;
		consumoEnergetico = CONSUMODEF;
		precioBase = PRECIODEF;

	}

	// Constructor para precio y peso los demas atributos por defecto.
	public Electrodomestico(double precioBase, double peso) {

		this.peso = peso;
		this.color = COLORDEF;
		this.consumoEnergetico = CONSUMODEF;
		this.precioBase = precioBase;

	}

	// Contructor para todos los atributos.
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

		this.peso = peso;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.color = comprobarColor(color);
		this.precioBase = precioBase;

	}

	// Este atributo nos devuelve un Hashtable con lo que ser�n los par�metros
	// aceptados para el consumo de los electrodom�sticos.
	protected Hashtable<Character, Double> consumoList() {
		Hashtable<Character, Double> consumoList = new Hashtable<>();

		consumoList.put('A', 100.00);
		consumoList.put('B', 80.00);
		consumoList.put('C', 60.00);
		consumoList.put('D', 50.00);
		consumoList.put('E', 30.00);
		consumoList.put('F', 10.00);

		return consumoList;
	}

	// Este atributo nos devuelve un Hashtable con los pesos de los
	// electrodom�sticos y el plus a sumar.
	protected Hashtable<Integer, Double> tama�oList() {
		Hashtable<Integer, Double> tama�oList = new Hashtable<>();

		tama�oList.put(19, 10.00);
		tama�oList.put(49, 50.00);
		tama�oList.put(79, 80.00);
		tama�oList.put(80, 100.00);

		return tama�oList;
	}

	// Este atributo nos devuelve una lista con lo que ser�n los par�metros
	// aceptados para el color de los electrodom�sticos.
	protected ArrayList<String> colorList() {
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("blanco");
		colorList.add("negro");
		colorList.add("rojo");
		colorList.add("azul");
		colorList.add("gris");

		return colorList;
	}

	// Este m�todo comprobar� la letra introducida para el coche.
	protected char comprobarConsumoEnergetico(char letra) {

		Enumeration<Character> e = consumoList().keys();
		while (e.hasMoreElements()) {
			if (e.nextElement().equals(letra)) {
				return letra;
			}
		}
		return CONSUMODEF;
	}

	// Este m�todo comprobar� que se introduzca un color v�lido de la lista de
	// colores, sin importar que este en mayusculas o minusculas.
	protected String comprobarColor(String color) {
		if (colorList().contains(color.toLowerCase())) {
			return color;
		} else {
			return COLORDEF;
		}

	}

	// Este m�todo calculara el precio final del electrodom�stico.
	protected double precioFinal(double base, char consumo, double peso) {
		Enumeration<Character> e1 = consumoList().keys();
		char al1 = 0;

		while (e1.hasMoreElements()) {
			al1 = e1.nextElement();
			if (al1 == consumo) {
				if (peso <= 19) {
					base = base + consumoList().get(al1) + 10;
				} else if (peso <= 49) {
					base = base + consumoList().get(al1) + 50;
				} else if (peso <= 79) {
					base = base + consumoList().get(al1) + 80;
				} else if (peso >= 80) {
					base = base + consumoList().get(al1) + 100;
				}

			}
		}

		return base;

	}

	@Override
	public String toString() {

		String objeto = "Precio base del Electrodom�stico: " + this.precioBase + "\nPrecio Final del Electrodom�stico "
				+ precioFinal(this.precioBase, this.consumoEnergetico, this.peso) + "\nPeso del Electrodom�stico: "
				+ this.peso + "\nColor del Electrodom�stico: " + this.color + "\nConsumo energetico:  "
				+ this.consumoEnergetico;

		return objeto;

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
