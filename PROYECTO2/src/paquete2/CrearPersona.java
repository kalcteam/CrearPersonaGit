package paquete2;

public class CrearPersona {

	public static void main(String[] args) {
		
		Persona persona1= new Persona("Maria", 30);
		persona1.mostrarInformacion();
		Persona persona2=new Persona ("Juan", 27);
		persona2.mostrarInformacion();
		
		System.out.println("------------------------");
		System.out.println("Estudiantes:");
		System.out.println("............");
		
		Estudiante estudiante1 = new Estudiante("Paco",19,"A1B2C3");
		estudiante1.mostrarInformacion();
		Estudiante estudiante2 = new Estudiante("Pedro",20,"S2F6H7");
		estudiante2.mostrarInformacion();
	}

}
