package trabajoPractico01.consigna03;

public class Persona {
	
	protected long dni;
	protected String apellido;
	protected String nombre;
	
	public Persona () {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(long dni, String nombre, String apellido) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void input(long dni, String nombre, String apellido) {
		setApellido(apellido);
		setDni(dni);
		setNombre(nombre);
	}
	
	public void show() {
		System.out.println("Apellido: " +getApellido() + "\nnombre: " +getNombre() + "\ndni: "+getDni());
	}

	
	
	
}
