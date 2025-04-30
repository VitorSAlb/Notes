package src.algoritmos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hash {

    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();

        products.put("Apple", 0.67);
        products.put("Milk", 1.49);

        System.out.println(products.get("Apple"));

        HashSet<String> votaram = new HashSet<>();

        votaram.add("Vitor");
        votaram.add("Clara");
        votaram.add("Carlos");
        votaram.add("Geo");

        if (votaram.contains("Lis")) System.out.println("Lis já votou!");
        else votaram.add("Lis");

        if (votaram.contains("Vitor")) System.out.println("Vitor já votou!");
        else votaram.add("Vitor");

        votaram.forEach(System.out::println);

    }
}
