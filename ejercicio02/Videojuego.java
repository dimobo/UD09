package ejercicio02;

public class Videojuego implements Entregable {

	// Atributos de la clase.
	private String titulo, genero, compañia;
	private int horasEstimadas;
	private boolean entregado;

	// Valores por defecto.
	private final String TITULODEF = "", GENERODEF = "", COMPAÑIADEF = "";
	private final int HORASDEF = 10;
	private final boolean ENTREGADODEF = false;

	// Constructor por defecto.
	public Videojuego() {
		titulo = TITULODEF;
		genero = GENERODEF;
		compañia = COMPAÑIADEF;
		horasEstimadas = HORASDEF;
		entregado = ENTREGADODEF;
	}

	// Constructor con solo titulo y horas.
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.genero = GENERODEF;
		this.compañia = COMPAÑIADEF;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADODEF;

	}

	// Constructor con todos los atributos menos entregado.
	public Videojuego(String titulo, String genero, String compañia, int horasEstimadas) {

		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADODEF;

	}

	// toString sobreescrito.
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "\nGenero: " + this.genero + "\nCompañia: " + this.compañia
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	// Aqui tenemos los metodos implementados de entregable.
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		Videojuego v = (Videojuego) a;
		return v.getHorasEstimadas();
	
	}

}
