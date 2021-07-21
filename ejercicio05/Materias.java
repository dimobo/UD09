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

	// Este metodo se asegura que hemos introducido una materia valida para un
	// profesor y en caso negarivo devuelve una cadena vacia.
	private static String comprobarMateria(ArrayList<String> materiaLista, String materia) {
		if (materiaLista.contains(materia)) {
			return materia;
		}
		return "";
	}

	public static String getListaMaterias(String materia) {
		return comprobarMateria(listaMateria(), materia);
	}

	public static void addListaMaterias(String nombre) {
		listaMateria().add(nombre);
	}

}
