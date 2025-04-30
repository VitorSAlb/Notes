package src.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public static void main(String[] args) {

        List<Integer> number = List.of(123, 34, 1, 1, 1, 42, 23);

        System.out.println(qsort(number));

    }

    public static List<Integer> qsort(List<Integer> arr) {
        if(arr.size() < 2) return arr;

        int meio = arr.size()/2;
        int pivot = arr.get(arr.size()/2);

        List<Integer> menores = new ArrayList<>();
        List<Integer> maiores = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (i == meio) continue;
            else if (arr.get(i) <= pivot) menores.add(arr.get(i));
            else maiores.add(arr.get(i));
        }

        List<Integer> sortedList = new ArrayList<>(qsort(menores));
        sortedList.add(pivot);
        sortedList.addAll(qsort(maiores));

        return sortedList;
    }

}
