package src.activities.pilha;

public class TestPilha {

    public static void main(String[] args) {

        Pilha<Integer> p = new Pilha<>();

        System.out.println(p.isEmpty());
        System.out.println(p.getSize());

        p.push(1);

        System.out.println(p);

        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println(p);

        System.out.println(p.peek());
        System.out.println(p);
    }
}