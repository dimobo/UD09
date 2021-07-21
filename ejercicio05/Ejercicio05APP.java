package ejercicio05;

public class Ejercicio05APP {

	public static void main(String[] args) {
		Aula au = new Aula(201, 15, "matemáticas");
		int chicos = 0, chicas = 0;

		if (au.darClase()) {

			System.out.println("Si se puede dar clase.");

			for (int i = 0; i < au.alumnos.length; i++) {
				if (au.alumnos[i].getSexo() == 'H' && au.alumnos[i].getNota() >= 5) {
					chicos++;
				}
			}

			for (int i = 0; i < au.alumnos.length; i++) {
				if (au.alumnos[i].getSexo() == 'D' && au.alumnos[i].getNota() >= 5) {
					chicas++;
				}
			}

			System.out.println("Han aprovado " + chicos + " y " + chicas + " chicas");

		} else {
			System.out.println("No se puede dar clase.");
		}

	}

}
