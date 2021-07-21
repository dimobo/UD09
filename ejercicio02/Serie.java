package ejercicio02;

public class Serie {

	// Atributos de la clase.
	protected String titulo, genero, creador;
	protected int numeroTemporadas;
	protected boolean entregado;

	// Valores por defecto.
	protected final String TITULODEF = "", GENERODEF = "", CREADORDEF = "";
	protected final int NUMEROTEMPORADASDEF = 3;
	protected final boolean ENTREGADODEF = false;

	// Constructor default.
	public Serie() {
		titulo = TITULODEF;
		genero = GENERODEF;
		creador = CREADORDEF;
		numeroTemporadas = NUMEROTEMPORADASDEF;
		entregado = ENTREGADODEF;
	}

	// Constructor con titulo y creador.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.genero = GENERODEF;
		this.creador = creador;
		this.numeroTemporadas = NUMEROTEMPORADASDEF;
		this.entregado = ENTREGADODEF;
	}
	
	// Constructor de todos los atributos menos entregado.
	public Serie(String titulo, String creador, String genero, int numTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroTemporadas = numTemporadas;
		this.entregado = ENTREGADODEF;
	}

	// toString sobreescrito.
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "/nGenero: " + this.genero + "\nCreador: " + this.creador
				+ "Numero temporadas: " + this.numeroTemporadas + "\nEntregada: " + this.entregado;
	}

	// Zona de getters y setters (Todos menos entregado)
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	
}
