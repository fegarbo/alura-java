package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		Integer idadeRef = 29; //autoboxinng
        int primitivo = new Integer(21); //unboxing	}
     
        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef);
        lista.add(primitivo);
        
        int i1 = lista.get(0);
        Integer i2 = lista.get(1);
        
        System.out.println(i1);
        System.out.println(i2);
	}

}
