package ejercicio06;

public class Pelicula {

	// Atributos de la clase pelicula.
	private String titulo, director;
	private int duracion, edadMinima;

	// Constructor por defecto.
	public Pelicula() {
		titulo = "";
		duracion = 0;
		edadMinima = 0;
		director = "";
	}

	// Constrcutor con todos los atributos.
	public Pelicula(String titulo, String director, int duracion, int edadMinima) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	// Zona de getters y setters.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

}
