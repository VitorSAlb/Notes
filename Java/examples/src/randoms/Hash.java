package src.randoms;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class Hash {

    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();

        products.put("Apple", 0.67);
        products.put("Milk", 1.49);

        System.out.println(products.get("Apple"));

    }
}
