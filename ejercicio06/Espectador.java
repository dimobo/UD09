package ejercicio06;

public class Espectador {

	// Atributos del Espectador.
	String nombre;
	int edad; 
	double dinero;

	// Constructor por defecto.
	public Espectador() {
		nombre = "";
		edad = 0;
		dinero = 0;
	}

	// Constructor con todos los atributos de espectador.
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	// Zona de getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

}
