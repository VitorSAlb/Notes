package src.algoritmos.Lista;

public class ListaEncadeada<T> {

    private No<T> start;
    private No<T> last;
    private int size = 0;

    private final int NOT_FOUNDED = -1;

    public void add(T element) {
        No<T> cel = new No<T>(element); // Cria um novo "celula"
        if(isEmpty()) this.start = cel; // Verifica se a lista esta vazia, caso esteja adiciona o primeiro elemento
        else this.last.setProximo(cel); // Caso a lista não esteja vazia adicionamos o elemento no proximo da lista
        this.last = cel; // Pegamos a celula e atualizamos o ultimo elemento
        this.size++; // Aumentamos o tanho da lista
    }

    public void addStart(T element) {

        if(isEmpty()) {
            No<T> newNo = new No<>(element);
            this.start = newNo;
            this.last = newNo;
        } else {
            this.start = new No<>(element, this.start);
        }
        this.size++;
    }

    public void add(int position, T element) {

        if (position < 0 || position > getSize()) throw new IllegalArgumentException("Invalid Position");

        if (position == 0){ // Add no primeiro elemento
            this.addStart(element);
        } else if (position == getSize()) { // Add no ultimo elemento
            add(element);
        } else { // Add no meio

            No<T> previous = getNo(position - 1);
            No<T> next = previous.getProximo();

            No<T> newNo = new No<>(element, next);
            previous.setProximo(newNo);
            this.size++;
        }

    }

    public T removeFirst() {

        if (isEmpty()) throw new RuntimeException("List is Empty");

        T removed = this.start.getElement();
        this.start = this.start.getProximo();
        this.size--;

        if (getSize() == 0) this.last = null;

        return removed;
    }

    private No<T> getNo(int position) {

        if(!(position >= 0 && position <= getSize())) throw new IllegalArgumentException("Position not exist");

        No<T> current = this.start;

        for (int i = 0; i < position; i++) {
            current = current.getProximo();
        }

        return current;
    }

    public T getElement(int position){
        return this.getNo(position).getElement();
    }

    public int getPosition(T element) {

        No<T> current = this.start;
        int position = 0;

        while (current != null) {
            if(current.getElement().equals(element)) return position;
            position++;
            current = current.getProximo();
        }

        return NOT_FOUNDED;
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
