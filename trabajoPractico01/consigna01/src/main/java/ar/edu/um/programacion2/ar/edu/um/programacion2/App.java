package ar.edu.um.programacion2.ar.edu.um.programacion2;

import java.util.Scanner;

public class App 
{
    private static Scanner scan;

	public static void main( String[] args )
    {
    	scan = new Scanner(System.in);
        Persona p = new Persona();
        
        System.out.println("nombre/apellido/dni");
        String nombre = scan.nextLine();
        String apellido = scan.nextLine();
        long dni = scan.nextLong();
        
        p.input(dni, nombre, apellido);
        p.show();
    }
}
