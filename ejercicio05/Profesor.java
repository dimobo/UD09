package ejercicio05;

import java.util.ArrayList;
import java.util.Random;

public class Profesor extends Persona {

	// Atributo propio de profesor
	String materia;

	// Constructor por defecto.
	public Profesor() {
		super();
		materia = "";
	}

	// Constructor con todos los parametros.
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(Materias.getListaMaterias(), materia);
	}

	// Este metodo se asegura que hemos introducido una materia valida para un
	// profesor y en caso negarivo devuelve una cadena vacia.
	private String comprobarMateria(ArrayList<String> materiaLista, String materia) {
		if (materiaLista.contains(materia)) {
			return materia;
		}
		return "";
	}

	// Sobreescritura del metodo para comprovar si el profesor ha faltado a clase o
	// no.
	public boolean haFaltado() {
		Random r = new Random();
		int max = 20, min = 0;
		int result = r.nextInt((max - min) + 1) + min;

		if (result <= 20) {
			return true;
		}
		return false;
	}

}
