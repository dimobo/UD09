package ejercicio02;

public class Videojuego {

	// Atributos de la clase.
	private String titulo, genero, compa�ia;
	private int horasEstimadas;
	private boolean entregado;

	// Valores por defecto.
	private final String TITULODEF = "", GENERODEF = "", COMPA�IADEF = "";
	private final int HORASDEF = 10;
	private final boolean ENTREGADODEF = false;

	// Constructor por defecto.
	public Videojuego() {
		titulo = TITULODEF;
		genero = GENERODEF;
		compa�ia = COMPA�IADEF;
		horasEstimadas = HORASDEF;
		entregado = ENTREGADODEF;
	}

	// Constructor con solo titulo y horas.
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.genero = GENERODEF;
		this.compa�ia = COMPA�IADEF;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADODEF;

	}

	// Constructor con todos los atributos menos entregado.
	public Videojuego(String titulo, String genero, String compa�ia, int horasEstimadas) {

		this.titulo = titulo;
		this.genero = genero;
		this.compa�ia = compa�ia;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADODEF;

	}

	// toString sobreescrito.
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "\nGenero: " + this.genero + "\nCompa�ia: " + this.compa�ia
				+ "\nHoras estimadas: " + this.horasEstimadas + "\nEntregado: " + this.entregado;
	}

	// Zona getters y setters (Todos menos entregado)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

}
