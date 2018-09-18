package trabajoPractico02.consigna01;

public class CargoMateria {
	private Materia materia;
	private Cargo cargo;
	
	public CargoMateria() {
		
	}	
	
	public CargoMateria(Materia materia, Cargo cargo) {
		this.materia = materia;
		this.cargo = cargo;
		}
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "materia=" + materia + ", cargo=" + cargo;
	}
	
	
	
	
	
	 
}
