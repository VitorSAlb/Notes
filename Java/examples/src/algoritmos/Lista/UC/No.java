package src.algoritmos.Lista.UC;

public class No<T> {

    private T valor;
    private No<T> NextNo;

    public No() {
    }

    public No(T valor) {
        this.valor = valor;
    }

    public No(T valor, No<T> nextNo) {
        this.valor = valor;
        NextNo = nextNo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getNextNo() {
        return NextNo;
    }

    public void setNextNo(No<T> nextNo) {
        NextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor = " + valor +
                ", NextNo = " + NextNo +
                '}';
    }
}
