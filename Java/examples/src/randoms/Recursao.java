package src.randoms;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursao {

    public static void main(String[] args) {
        System.out.println(soma());

        ArrayList<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            number.add(i);
        }


        System.out.println(contList(number));
        System.out.println(maxList(number));
    }

    public static int soma(int... numeros) {

        if (numeros.length == 0) {
            return 0;
        }

        int number = numeros[0];

        // Copio a array (escolho a array que vai ser copiada, daonde irei copiar a array, aonde eu finalizo a array)
        int[] arrNumbers = Arrays.copyOfRange(numeros,1, numeros.length);

        return number + soma(arrNumbers);
    }

    public static int contList(ArrayList<Integer> arr){
        if (arr.isEmpty()) return 0;
        ArrayList<Integer> newArr = new ArrayList<>(arr.subList(1, arr.size()));
        return 1 + contList(newArr);
    }

    public static int maxList(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int number = arr.getFirst();
        ArrayList<Integer> newArr = new ArrayList<>(arr.subList(1, arr.size()));
        return Math.max(number, maxList(newArr));
    };
}
