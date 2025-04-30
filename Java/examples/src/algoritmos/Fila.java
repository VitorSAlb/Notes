package src.algoritmos;

import java.util.Arrays;

public class Fila {
    public static void main(String[] args) {

        Fila f = new Fila(5);


        System.out.println(f.isEmpty());
        System.out.println(f.isFull());
        f.push("a");
        f.push("b");
        f.push("c");
        f.push("d");
        f.push("e");
        System.out.println(f.isFull());
        System.out.println(f);
        System.out.println(f.pop());
        System.out.println(f);
        f.push("8");
        f.pop();
        System.out.println(f);
        System.out.println(f.pop());
        System.out.println(f.pop());

//        Queue<String> filaLinked = new LinkedList<>();
//
//        filaLinked.add("a");
//        filaLinked.add("b");
//        filaLinked.add("c");
//        filaLinked.add("d");
//
//        System.out.println(filaLinked.poll());
//
//        filaLinked.forEach(System.out::println);
//        System.out.println(filaLinked);
    }

    public Object[] objects;
    public int fistPosition;
    public int lastPosition;
    public int total;

    public Fila(int t) {
        this.objects = new Object[t];
        this.fistPosition = 0;
        this.lastPosition = 0;
        this.total = 0;
    }

    public void push(Object element) {
        if(isFull()) throw new RuntimeException("Fila is Full");
        objects[lastPosition] = element;
        lastPosition = (lastPosition + 1) % objects.length;
        total++;
    }

    public Object pop() {
        if(isEmpty()) throw new RuntimeException("Fila is Empty");
        Object obj = objects[fistPosition];
        objects[fistPosition] = null;
        fistPosition = (fistPosition + 1) % objects.length;
        total--;
        return obj;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == objects.length;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "objects=" + Arrays.toString(objects) +
                ", fistPosition=" + fistPosition +
                ", lastPosition=" + lastPosition +
                ", total=" + total +
                '}';
    }
}
