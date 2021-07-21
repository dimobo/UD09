package ejercicio06;

public class Cine {

	// Atributos de la clase Cine.
	Pelicula peli;
	double precioEntrada;

	// Constructor por defecto.
	public Cine() {
		peli = new Pelicula();
		precioEntrada = 0;
	}

	// Constructor de todos los atributos.
	public Cine(Pelicula peli, double precioEntrada) {
		this.peli = peli;
		this.precioEntrada = precioEntrada;
	}

	// Zona de getters y setters.
	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

}
