/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.consigna01;

public class AppCliente {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Inicia el cliente");

        Producto pr1 = new Producto("Arroz",40);
        Producto pr2 = new Producto("Carne",120);
        Producto pr3 = new Producto("Gaseosa",60);


        //CLIENTES
        Cliente cli1 = new Cliente(1,"Pepe");

        cli1.add(pr1);
        cli1.add(pr2);
        cli1.add(pr3);

        Cliente cli2 = new Cliente(2,"Carlos");

        cli2.add(pr2);
        cli2.add(pr3);

        Cliente cli3 = new Cliente(3,"Jose");
        
        cli3.add(pr1);
        cli3.add(pr3);


        ColaCaja cola = new ColaCaja();
        ColaCaja cola2 = new ColaCaja();
        ColaCaja cola3 = new ColaCaja();

		
        cola.getClientes().add(cli1);
        cola2.getClientes().add(cli2);
        cola3.getClientes().add(cli3);
        
        cola.start();
        cola2.start();
        cola3.start();

    }
   
}