package ejercicio03;

public class Libro {

	// Atribuos de la clase libro.
	protected String isbn, titulo, autor;
	protected int numPaginas;

	// Constructor por defecto
	public Libro() {
		isbn = "";
		titulo = "";
		autor = "";
		numPaginas = 0;
	}

	// Constructor con todos los parametros.
	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	// Sobreescritura del metodo toString dandole un formato preestablecido
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPaginas
				+ " paginas";
	}

	// Zona de getters y setters.
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

}
