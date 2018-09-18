package trabajoPractico02.consigna01;

public class Profesor {
	private int profesor_id;
	private String nombre;
	private String apellido;
	private CargoMateria[] cargomateria;
		
	
	public Profesor(int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria) {
		this.profesor_id = profesor_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargomateria = cargomateria;
	}
	
	
	public Profesor() {
		profesor_id = 2;
		nombre = "pepe";
		apellido = "hongo";
	}
	
	
	public int getProfesor_id() {
		return profesor_id;
	}
	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public CargoMateria[] getCargomateria() {
		return cargomateria;
	}
	public void setCargomateria(CargoMateria[] cargomateria) {
		this.cargomateria = cargomateria;
	}
	
	

}
