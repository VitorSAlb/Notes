package src.algoritmos.Lista.UC;

public class MainTeste {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(lista.toString());

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);

        System.out.println(lista.toString());

        System.out.println(lista.remover(3));

        System.out.println(lista);

        System.out.println(lista.removerPrimeiro());

        System.out.println(lista);
    }
}
