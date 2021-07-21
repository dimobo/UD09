package ejercicio05;

import java.util.Random;

public class Alumno extends Persona {

	// Atributo especifico de alumno
	double nota;

	// Constructor por defecto.
	public Alumno() {
		nombre = "";
		edad = 0;
		sexo = 0;
		nota = 0;
	}

	// Constructor con todos los parametros.
	public Alumno(String nombre, int edad, char sexo, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nota = nota;
	}

	@Override
	public boolean haFaltado() {
		Random r = new Random();
		int max = 100, min = 0;
		int result = r.nextInt((max - min) + 1) + min;

		if (result > 50) {
			return true;
		}
		return false;
	}

}
