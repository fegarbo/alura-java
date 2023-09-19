package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
        ArrayList<Conta> listaContas = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(11, 22);
        listaContas.add(cc);

        Conta cc2 = new ContaCorrente(33, 44);
        listaContas.add(cc2);

        System.out.println("Tamanho: " + listaContas.size());

        Conta ref = listaContas.get(0);
        System.out.println(ref.getNumero());

        listaContas.remove(0);
        System.out.println("Tamanho: " + listaContas.size());

        Conta cc3 = new ContaCorrente(55, 66);
        listaContas.add(cc3);

        Conta cc4 = new ContaCorrente(77, 88);
        listaContas.add(cc4);

        for(int i = 0; i < listaContas.size(); i++) {
            Object oRef = listaContas.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Conta conta : listaContas) {
            System.out.println(conta);
        }

	}

}
