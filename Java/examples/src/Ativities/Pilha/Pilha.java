package src.Ativities.Pilha;

public class Pilha<T> {

    private No<T> first;
    private int size;

    public Pilha() {
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(T element) {
        No<T> newNo = new No<>(element);

        if(isEmpty()) {
            first = newNo;
            size++;
        } else {
            No<T> lastNo = null;
            for(No<T> current = first; current != null; ) {
                lastNo = current;
                current = current.getNext();
            }

            lastNo.setNext(newNo);
            size++;
        }
    }

    public T peek() {

        if (isEmpty()) throw new RuntimeException("Stack is empty!");

        T element = first.getValue();
        first = first.getNext();
        size--;
        return element;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
