package trabajoPractico01.consigna03;

import java.util.Scanner;

public class App 
{
    private static Scanner s;

	public static void main( String[] args )
    {
        System.out.println( "nombre/apellido/dni/fecha de naciemiento (dd/mm/aaaa)" );
        s = new Scanner(System.in);
        
        String nombre = s.nextLine();
        String apellido = s.nextLine();
        long dni = s.nextLong();
        int dia = s.nextInt();
        int mes = s.nextInt();
        int anho = s.nextInt();
        
        PersonaConNacimiento pn = new PersonaConNacimiento();
        
        pn.input(nombre, apellido, dni, dia,mes,anho);
        
        pn.show();
        
        
        
    }
}
