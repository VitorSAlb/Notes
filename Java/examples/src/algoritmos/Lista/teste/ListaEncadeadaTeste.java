package src.algoritmos.Lista.teste;

import src.algoritmos.Lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {

//        addNoInicio();

//        addNoMeio();

        removeFirst();
    }

    public static void addNoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.addStart(3);
        lista.addStart(2);
        lista.addStart(1);

        System.out.println(lista);
    }

    public static void addNoMeio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        lista.add(2, 5);

        System.out.println(lista);
    }

    public static void removeFirst() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println(lista);
        System.out.println(lista.removeFirst());
        System.out.println(lista);
        System.out.println(lista.removeFirst());
        System.out.println(lista);
        System.out.println(lista.removeFirst());
        System.out.println(lista);
        System.out.println(lista.removeFirst());
        System.out.println(lista);

    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println("Size = " +lista.getSize());
        System.out.println(lista);

        lista.clear();
        System.out.println(lista);

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println(lista.getPosition(1));
        System.out.println(lista.getElement(2));
    }
}
