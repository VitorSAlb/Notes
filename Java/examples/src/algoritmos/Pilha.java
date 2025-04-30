package src.algoritmos;

import java.util.ArrayList;

public class Pilha<T> {
    public static void main(String[] args) {
        Pilha<Object> p = new Pilha<>();

        System.out.println(p.isEmpty());
        p.push("1");
        p.push("2");
        p.push("3");
        Object objs = p.pop();
        System.out.println(objs);
        p.pop();
        System.out.println(p.isEmpty());
        p.pop();
        p.pop();



    }

    public ArrayList<T> pilha = new ArrayList<T>();
    public int indice;

    public Pilha(){
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public void push(T obj) {
        this.pilha.add(obj);
        System.out.println("push: " + obj);
    }

    public Object pop() {

        if(isEmpty()) {
            System.out.println("This stack is empty!");
            return null;
        }
        else {

            Object obj = this.pilha.removeLast();
            System.out.println("pop: " + obj);
            return obj;
        }
    }
}
