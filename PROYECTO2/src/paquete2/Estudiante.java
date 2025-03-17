package paquete2;

public class Estudiante extends Persona{

	private String matricula;
	
	public Estudiante(String nombre, int edad, String matricula) {
		super(nombre, edad);
		this.matricula=matricula;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: "+super.getNombre());
		System.out.println("Edad: "+super.getEdad());
		System.out.println("Matricula: "+matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
