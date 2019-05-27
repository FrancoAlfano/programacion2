package Java;

public class Persona {
	
	protected long dni;
	protected String apellido;
	protected String nombre;
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
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
		setNombre(nombre);
		setDni(dni);
		
	}
	
	public void show() {
		getApellido();
		getDni();
		getNombre();
		System.out.println("DNI: " +dni+ "\nNOMBRE: "+nombre+"\nAPELLIDO: "+apellido);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
