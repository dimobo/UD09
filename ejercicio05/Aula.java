package ejercicio05;

public class Aula {

	// Atributos de la clase Aula.
	int codigo, maxEstudiantes;
	String materia;
	Profesor maestro;
	Alumno[] alumnos;

	// Constructor por defecto.
	public Aula() {
		codigo = 0;
		maxEstudiantes = 0;
		materia = "";
		maestro = new Profesor();
		alumnos = new Alumno[0];
	}

	// Constructor con todos los parametros.
	public Aula(int codigo, int maxEstudiantes, String materia) {
		this.codigo = codigo;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = Materias.getListaMaterias(materia);

		// Esto lo voy a hacer hard code para no liar mas el codigo.
		maestro = new Profesor("Jordi", 40, 'H', "matemáticas");
		alumnos = crearAlumnos(10);

	}

	// Aqui generaremos los alumnos.
	private Alumno[] crearAlumnos(int num) {

		Alumno[] alum = new Alumno[num];
		alum[0] = new Alumno("Pere", 11, 'H', 6);
		alum[1] = new Alumno("Maite", 12, 'D', 8);
		alum[2] = new Alumno("Danna", 11, 'D', 5);
		alum[3] = new Alumno("Gisel", 11, 'D', 4);
		alum[4] = new Alumno("Jose", 12, 'H', 3);
		alum[5] = new Alumno("Roger", 12, 'H', 6);
		alum[6] = new Alumno("Cristian", 11, 'H', 7);
		alum[7] = new Alumno("Alex", 11, 'H', 10);
		alum[8] = new Alumno("Geremy", 12, 'H', 9);
		alum[9] = new Alumno("Aida", 11, 'D', 10);

		return alum;
	}

	// Este metodo comprobara si se puede dar calse.
	public boolean darClase() {
		int asistencia = 0;

		// Con este for pasaremos la asistencia.
		for (int i = 0; i < this.alumnos.length; i++) {
			if (!this.alumnos[i].haFaltado()) {
				asistencia++;
			}
		}

		// Con este if miraremos si tenemos mas de la mitad de alumnos asistiendo, que
		// el profesor no haya faltado y que el aula se corresponda a la materia del
		// profesor.
		if (asistencia > (this.alumnos.length / 2) && maestro.haFaltado() == false
				&& maestro.getMateria().equals(this.materia)) {
			return true;
		}
		return false;
	}

	// Zona de getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor getMaestro() {
		return maestro;
	}

	public void setMaestro(Profesor maestro) {
		this.maestro = maestro;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

}
