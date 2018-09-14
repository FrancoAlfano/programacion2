package trabajoPractico01.consigna02;

import java.text.ParseException;
import java.util.Scanner;

public class App 
{
    private static Scanner s;

	public static void main( String[] args ) throws ParseException
    {
		Fecha f = new Fecha();
    	s = new Scanner(System.in);
    	
        System.out.println( "ingrese primer fecha - dd - mm - aaaa: \n" );
        s = new Scanner(System.in);
        int dia = s.nextInt();
        int mes = s.nextInt();
        int anho = s.nextInt();
        
        f.input(dia, mes, anho);
               
        String d1 = Integer.toString(f.getDia());
		String m1 = Integer.toString(f.getMes());
		String a1 = Integer.toString(f.getAnho());
		
		String date1 = a1+"-"+m1+"-"+d1;

		
		System.out.println( "\ningrese segunda fecha:\ndd: \nmm: \naaaa: \n" );
        int dia2 = s.nextInt();
        int mes2 = s.nextInt();
        int anho2 = s.nextInt();
        
        f.input(dia2, mes2, anho2);
        
        String d2 = Integer.toString(f.getDia());
		String m2 = Integer.toString(f.getMes());
		String a2 = Integer.toString(f.getAnho());
		
		String date2 = a2+"-"+m2+"-"+d2;

		
        System.out.println(f.comparar(date1, date2));
        
        System.out.println("\nCuantos dias quiere agreagar a fecha1?\n");
        int agregarDias = s.nextInt();
        f.desplazar(date1, agregarDias);
  
        
    }
}
