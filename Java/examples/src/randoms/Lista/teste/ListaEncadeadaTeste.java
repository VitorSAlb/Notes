package src.randoms.Lista.teste;

import src.randoms.Lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println("Size = " +lista.getSize());
        System.out.println(lista);

        lista.clear();
        System.out.println(lista);
    }
}
