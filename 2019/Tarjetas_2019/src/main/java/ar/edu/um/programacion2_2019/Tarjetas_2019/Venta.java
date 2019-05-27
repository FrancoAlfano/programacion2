package ar.edu.um.programacion2_2019.Tarjetas_2019;

import java.math.BigDecimal;
import java.util.Random;

public class Venta implements IProcesador{
	
	private int cod_verificacion;
	private String descripcion;
	private BigDecimal monto_venta;
	private TarjetaCredito tarjeta;
	private Random r = new Random();
	
	public Venta() {
	}
	
	public Venta(char nombre_cliente, int num_tarjeta, int cod_verificacion, int tipo_tarjeta, String descripcion,
			BigDecimal monto_venta, TarjetaCredito tarjeta) {
		this.cod_verificacion = cod_verificacion;
		this.descripcion = descripcion;
		this.monto_venta = monto_venta;
		this.tarjeta = tarjeta;
	}

	public int getCod_verificacion() {
		return cod_verificacion;
	}
	public void setCod_verificacion(int cod_verificacion) {
		this.cod_verificacion = cod_verificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMonto_venta() {
		return monto_venta;
	}
	public void setMonto_venta(BigDecimal monto_venta) {
		this.monto_venta = monto_venta;
	}

	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int procMasterCard() {
		
		System.out.println("Verificando Master Card: ");		
		float chance = r.nextFloat();
		
		if (chance <= 0.10f) {
			System.out.println("Error en Verificacion");
			return -1;
		}else if (r.nextFloat() <= 0.10f) {
			System.out.println("Autorizando Master Card: ");
			System.out.println("Error en la Autorizacion");
			return -1;
			
		}else {
			System.out.println("Procesando Master Card: ");
			System.out.println("Procesamiento completo y exitoso");
			return 0;
		}
	}


	public int procVisa() {
		System.out.println("Verificando Visa: ");		
		float chance = r.nextFloat();
		
		if (chance <= 0.10f) {
			System.out.println("Error en Verificacion");
			return -1;
		}else if (r.nextFloat() <= 0.10f) {
			System.out.println("Autorizando Visa: ");
			System.out.println("Error en la Autorizacion");
			return -1;
			
		}else {
			System.out.println("Procesando Visa: ");
			System.out.println("Procesamiento completo y exitoso");
			return 0;
		}
	}	

}
