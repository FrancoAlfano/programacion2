package trabajoPractico01.consigna03;

public class PersonaConNacimiento extends Persona{
	
	protected Fecha nacimiento = new Fecha();
	
	public PersonaConNacimiento() {
	}

	public String getNacimiento() {	
		String d1 = Integer.toString(nacimiento.getDia());
		String m1 = Integer.toString(nacimiento.getMes());
		String a1 = Integer.toString(nacimiento.getAnho());

		String date1 = a1+"-"+m1+"-"+d1;
		return date1;
	}

	public void setNacimiento(int dia, int mes, int anho) {
		nacimiento.input(dia, mes, anho);
	}
	
	public void input(String nombre, String apellido, long dni, int dia, int mes, int anho) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setNacimiento(dia,mes,anho);
		
	}
	
	public void show() {
		System.out.println("nombre: "+getNombre());
		System.out.println("\napellido: "+getApellido());
		System.out.println("\ndni: "+getDni());
		System.out.println("\nnacimiento: "+getNacimiento());
	}

}
