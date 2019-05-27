package Practica_tp1.TrabajoPracticoTarjetas2019;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Almacen implements IProcesador{
	
	private String[] store;
	private List<List<String>> sp;
	
	
	
	public Almacen(String[] store, List<List<String>> sp) {
		this.store = store;
		this.sp = sp;
	}

	public List<List<String>> getsp() {
		return sp;
	}

	public void setsp(List<List<String>> sp) {
		this.sp = sp;
	}


	public String[] getStore() {
		return store;
	}

	public void setStore(String[] store) {
		this.store = store;
	}

	public Almacen() {
	}

	public List<List<String>> LectorFiles(String file) throws Exception {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		store = new String [500];
		sp = new ArrayList<List<String>>();
		
		String i;

		while ((i = br.readLine()) != null) {
			String[] values = i.split("-");
	        sp.add(Arrays.asList(values));

		}
		
		br.close();
		fr.close();
		
		return sp;
	}

	public void procMasterCard() {
		
		String[] arr = new String[sp.size()];
		long tar = 0;
		int ver = 0;
		String nombre;
		
		//System.out.println(sp);
		
		arr = sorter(sp);
		
		tar = Long.parseLong(arr[1]);
		nombre = arr[0];
		ver = Integer.parseInt(arr[2]);
		
		System.out.println(nombre);
		System.out.println(tar);
		System.out.println(ver);
	}

	public void procVisa() {
		
	}
	
	public String[] sorter(List<List<String>> list) {
		List<String> lis = new ArrayList<>();
		
		
	   List<String> b;
       b = new ArrayList<String>();

        
       for (int i = 0; i < list.size(); i++) {
        	b = sp.get(i);
        	System.out.println(b);
		}
        
		
		lis = list.get(0);
		
		String[] fin;
		
		fin = new String[lis.size()];
		
		fin = lis.toArray(new String[0]);
	
		return fin;
	}
}