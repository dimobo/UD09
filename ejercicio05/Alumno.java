package ejercicio05;

import java.util.Random;

public class Alumno extends Persona {

	// Atributo especifico de alumno
	double nota;

	// Constructor por defecto.
	public Alumno() {
		super();
		nota = 0;
	}

	// Constructor con todos los parametros.
	public Alumno(String nombre, int edad, char sexo, double nota) {
		super(nombre, edad, sexo);
		this.nota = comprobarNota(nota);
	}

	// Este metodo comprobara que no se introduzca una nota a un alumno fuera de los
	// parametros aceptados.
	private double comprobarNota(double nota) {
		if (nota < 0 || nota > 10) {
			return 0;
		}
		return nota;
	}

	// Sobreescritura del metodo para comprovar si el alumno ha faltado a clase o
	// no.
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

	// Zona de getters y setters.
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
