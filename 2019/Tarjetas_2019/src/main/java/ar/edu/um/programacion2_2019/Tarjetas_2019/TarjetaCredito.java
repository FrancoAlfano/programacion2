package ar.edu.um.programacion2_2019.Tarjetas_2019;


public class TarjetaCredito {
	
	private String nombre_cliente;
	private int num_tarjeta;
	private int tipo_tarjeta;
	
	public TarjetaCredito() {
	}
	public TarjetaCredito(String nombre_cliente, int num_tarjeta, int tipo_tarjeta) {
		this.nombre_cliente = nombre_cliente;
		this.num_tarjeta = num_tarjeta;
		this.tipo_tarjeta = tipo_tarjeta;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public int getNum_tarjeta() {
		return num_tarjeta;
	}
	public void setNum_tarjeta(int num_tarjeta) {
		this.num_tarjeta = num_tarjeta;
	}
	public int getTipo_tarjeta() {
		return tipo_tarjeta;
	}
	public void setTipo_tarjeta(int tipo_tarjeta) {
		this.tipo_tarjeta = tipo_tarjeta;
	}

	
	
	
}
