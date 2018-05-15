/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consigna02;


public class Consigna02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        
        f1.input(02,8,95);
        
        System.out.println(f1.show());
        
        System.out.println(f1.toString());
    }
        
}
