package ar.edu.um.programacion2_2019.Tarjetas_2019;

import java.io.FileInputStream;
import java.io.IOException;

public class Almacen{
	
	FileInputStream in = null;
	//FileOutputStream out = null;
	private Venta ventas[];
	private TarjetaCredito tarjeta;
     
	public Almacen() {
		this.ventas = new Venta[20];
		this.tarjeta = new TarjetaCredito();
	}

	public void openFiles(String name_in) throws IOException {
		
		in = new FileInputStream(name_in);

	}
	
	public void copyFile() throws IOException {
		int c;
        while ((c = in.read()) != -1) {
           //out.write(c);
        }
		
	}
	
	public void closeFile() throws IOException {
		if (in != null) {
            in.close();
         }/*
         if (out != null) {
            out.close();
         }*/
		
	}
	
	
}
