package src.algoritmos.Lista.UC;

public class ListaEncadeada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho = 0;

    public ListaEncadeada() {
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void inserir(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (estaVazio()) this.primeiroNo = novoNo;
        else ultimoNo.setNextNo(novoNo);
        this.ultimoNo = novoNo;
        tamanho++;
    }

    public T remover(T element){

        if(estaVazio()) throw new RuntimeException("Lista Vazia");

        if(primeiroNo.getValor().equals(element)) {
            return removerPrimeiro();
        }

        for (No<T> current = primeiroNo; current != null; ) {

            if (current.getNextNo().getValor().equals(element)) {
                No<T> removedNo = current.getNextNo();
                No<T> nextNo = removedNo.getNextNo();

                current.setNextNo(nextNo);
                tamanho--;
                return removedNo.getValor();
            }

            current = current.getNextNo();
        }

        return null;
    }

    public T removerPrimeiro() {
        T valor = primeiroNo.getValor();
        this.primeiroNo = this.primeiroNo.getNextNo();
        tamanho--;
        return valor;
    }

    public T removerUltimo() {
        T valor = ultimoNo.getValor();
        No<T> penultimo = null;

        for (int i = 0; i < getTamanho() - 1; i++) {
           // current = current.getProximo();
        }

        tamanho--;
        return valor;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        if(estaVazio()) return "[]";

        StringBuilder sb = new StringBuilder();

        No<T> current = this.primeiroNo;

        sb.append("[");
        for (int i = 0; i < getTamanho() - 1; i++) {
            sb.append(current.getValor()).append(", ");
            current = current.getNextNo();
        }
        sb.append(current.getValor()).append("]");

        return sb.toString();
    }
}
