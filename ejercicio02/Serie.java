package ejercicio02;

public class Serie implements Entregable {

	// Atributos de la clase.
	private String titulo, genero, creador;
	private int numeroTemporadas;
	private boolean entregado;

	// Valores por defecto.
	private final String TITULODEF = "", GENERODEF = "", CREADORDEF = "";
	private final int NUMEROTEMPORADASDEF = 3;
	private final boolean ENTREGADODEF = false;

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
	public Serie(String titulo, String genero, String creador, int numTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroTemporadas = numTemporadas;
		this.entregado = ENTREGADODEF;
	}

	// toString sobreescrito.
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "\nGenero: " + this.genero + "\nCreador: " + this.creador
				+ "\nNumero temporadas: " + this.numeroTemporadas + "\nEntregada: " + this.entregado;
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
		Serie s = (Serie) a;
		return s.getNumeroTemporadas();
		
	}

}
