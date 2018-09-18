package trabajoPractico02.consigna01;

public class Materia {
	
	private String codigoMateria;
	private String nombre;
	
	public Materia() {
		codigoMateria = "005";
		nombre = "calculo";		
	}
	
	public Materia(String codigoMateria, String nombre) {
		this.codigoMateria = codigoMateria;
		this.nombre = nombre;
	}
	
	
	public String getCodigoMateria() {
		return codigoMateria;
	}
	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "codigoMateria=" + codigoMateria + ", nombre=" + nombre;
	}
	
	
	
	
}
