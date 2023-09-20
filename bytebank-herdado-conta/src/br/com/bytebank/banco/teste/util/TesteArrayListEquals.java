package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        Conta cc2 = new ContaCorrente(11, 22);

        boolean contasIguais = cc1.equals(cc2);
        System.out.println("� igual? " + contasIguais);
        
        lista.add(cc1);
        lista.add(cc2);
        
        boolean existe = lista.contains(cc2);
        
        System.out.println("J� existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }

	}

}
