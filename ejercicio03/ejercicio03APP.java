package ejercicio03;

public class ejercicio03APP {

	public static void main(String[] args) {

		Libro uno = new Libro("8-750-987", "La brujula dorada", "Philip Pullman", 360),
				dos = new Libro("9-784-587", "La Morada", "R.A Salvatore", 400);

		System.out.println(uno.toString());
		System.out.println(dos.toString());

		if (uno.getNumPaginas() > dos.getNumPaginas()) {
			System.out.println(uno.getTitulo() + " tiene mas paginas.");
		} else {
			System.out.println(dos.getTitulo() + " tiene mas paginas.");
		}
	}

}
