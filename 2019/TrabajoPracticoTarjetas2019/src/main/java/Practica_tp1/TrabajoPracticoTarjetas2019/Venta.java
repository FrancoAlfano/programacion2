package Practica_tp1.TrabajoPracticoTarjetas2019;

import java.math.BigDecimal;

public class Venta {
	private String nombreCliente;
	private String descripcion;
	private BigDecimal monto;
	private TarjetaCredito tarjeta;
	
	public Venta() {
	}
	public Venta(String nombreCliente, String descripcion, BigDecimal monto, TarjetaCredito tarjeta) {
		this.nombreCliente = nombreCliente;
		this.descripcion = descripcion;
		this.monto = monto;
		this.tarjeta = tarjeta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	
	

}
