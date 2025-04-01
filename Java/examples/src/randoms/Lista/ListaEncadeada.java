package src.randoms.Lista;

public class ListaEncadeada<T> {

    private No<T> start;
    private No<T> last;
    private int size = 0;

    public void add(T element) {
        No<T> cel = new No<T>(element); // Cria um novo "celula"
        if(isEmpty()) this.start = cel; // Verifica se a lista esta vazia, caso esteja adiciona o primeiro elemento
        else this.last.setProximo(cel); // Caso a lista não esteja vazia adicionamos o elemento no proximo da lista
        this.last = cel; // Pegamos a celula e atualizamos o ultimo elemento
        this.size++; // Aumentamos o tanho da lista
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public void clear() {
        for (No<T> current = this.start; current != null;) {
            No<T> next = current.getProximo();
            current.setElement(null);
            current.setProximo(null);
            current = next;
        }

        this.start = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder();

        No<T> current = this.start;

        sb.append("[");
        for (int i = 0; i < getSize() - 1; i++) {
            sb.append(current.getElement()).append(", ");
            current = current.getProximo();
        }
        sb.append(current.getElement()).append("]");

//        MANEIRA "ANTIGA"
//        sb.append("[").append(current.getElement());
//        while (current.getProximo() != null) {
//            current = current.getProximo();
//            sb.append(", ").append(current.getElement());
//        }
//        sb.append("]");

        return sb.toString();
    }
}
