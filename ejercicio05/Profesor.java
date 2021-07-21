package ejercicio05;

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
		this.materia = Materias.getListaMaterias(materia);
	}

	

	// Sobreescritura del metodo para comprovar si el profesor ha faltado a clase o
	// no.
	public boolean haFaltado() {
		Random r = new Random();
		int max = 100, min = 0;
		int result = r.nextInt((max - min) + 1) + min;
		if (result <= 20) {
			return true;
		}
		return false;
	}
	
	// Zona de getters y setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	

}
