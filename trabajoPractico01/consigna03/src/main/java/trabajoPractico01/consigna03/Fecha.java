package trabajoPractico01.consigna03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
	protected int dia;
	protected int mes;
	protected int anho;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anho) {
		dia = this.dia;
		mes = this.mes;
		anho = this.anho;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	public void input(int dia, int mes, int anho) {
		setDia(dia);
		setAnho(anho);
		setMes(mes);
	}

	public int comparar(String date1, String date2) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = sdf.parse(date1);
        Date d2 = sdf.parse(date2);
		
        System.out.println("Fecha1 : " + sdf.format(d1));
        System.out.println("Fecha2 : " + sdf.format(d2));

        if (d1.compareTo(d2) > 0) {
            System.out.println(sdf.format(d1)+" es despues de "+sdf.format(d2));
            return 1;
        } else if (d1.compareTo(d2) < 0) {
            System.out.println(sdf.format(d1)+" es antes de "+sdf.format(d2));
            return -1;
        } else if (d1.compareTo(d2) == 0) {
            System.out.println(sdf.format(d1)+" es el mismo dia que "+sdf.format(d2));
            return 0;
        } else {
            System.out.println("nope");
        }
        
        return 0;
	}
	
	public void desplazar(String fecha, int dias) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date f1 = sdf.parse(fecha);
		
		c.setTime(f1);	     
		c.add(Calendar.DATE, dias);
		
        System.out.println("Fecha agregada: " + sdf.format(c.getTime()));
		
		
	}
	
	
}

