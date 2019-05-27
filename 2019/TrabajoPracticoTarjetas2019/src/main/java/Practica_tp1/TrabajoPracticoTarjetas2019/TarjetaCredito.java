package Practica_tp1.TrabajoPracticoTarjetas2019;

public class TarjetaCredito{
	private int numeroTar;
	private int codVerificacion;
	private int tipoTar;
	
	
	public TarjetaCredito() {
	}
	public TarjetaCredito(int numeroTar, int codVerificacion, int tipoTar) {
		this.numeroTar = numeroTar;
		this.codVerificacion = codVerificacion;
		this.tipoTar = tipoTar;
	}
	public int getNumeroTar() {
		return numeroTar;
	}
	public void setNumeroTar(int numeroTar) {
		this.numeroTar = numeroTar;
	}
	public int getCodVerificacion() {
		return codVerificacion;
	}
	public void setCodVerificacion(int codVerificacion) {
		this.codVerificacion = codVerificacion;
	}
	public int getTipoTar() {
		return tipoTar;
	}
	public void setTipoTar(int tipoTar) {
		this.tipoTar = tipoTar;
	}
		

}
