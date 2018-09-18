package trabajoPractico02.consigna01;

public class Cargo {
	
	private String nombre;
	private double basico;
	
	public Cargo() {
		nombre = "titular";
		basico = 01;
	}
		
	public Cargo(String nombre, double basico) {
		nombre = this.nombre;
		basico = this.basico;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBasico() {
		return basico;
	}
	public void setBasico(double basico) {
		this.basico = basico;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", basico=" + basico;
	}
	
	

}