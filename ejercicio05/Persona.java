package ejercicio05;

public abstract class Persona {

	// Atributos de la clase Persona.
	protected String nombre;
	protected int edad;
	protected char sexo;

	// Constructor por defecto.
	public Persona() {
		nombre = "";
		edad = 0;
		sexo = 0;
	}

	// Constructor con todos los atributos.
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	// Metodo abstracto para el polimorfismo.
	public abstract boolean haFaltado();

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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
