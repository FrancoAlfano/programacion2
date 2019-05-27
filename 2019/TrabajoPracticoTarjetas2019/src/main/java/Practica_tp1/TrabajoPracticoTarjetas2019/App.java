package Practica_tp1.TrabajoPracticoTarjetas2019;

//import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        Almacen a = new Almacen();
        List<List<String>> sp;
        //String[] str;
        
        sp = a.LectorFiles("db.txt");
        //str = a.sorter(sp);
        
        a.procMasterCard();

    }
}