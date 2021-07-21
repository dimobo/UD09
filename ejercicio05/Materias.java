package ejercicio05;

import java.util.ArrayList;

public class Materias {

	// He creado esta clase por que como tenemos professores y aulas que los dos
	// necesitan el listado de materias de esta fomra lo tengo comun sin tener que
	// duplicar codigo.

	// Este metodo contiene una lista de las materias validas.
	private static ArrayList<String> listaMateria() {
		ArrayList<String> materia = new ArrayList<String>();
		materia.add("matemáticas");
		materia.add("filosofía");
		materia.add("física");
		return materia;
	}

	public static ArrayList<String> getListaMaterias() {
		return listaMateria();
	}

	public static void addListaMaterias(String nombre) {
		listaMateria().add(nombre);
	}

}
