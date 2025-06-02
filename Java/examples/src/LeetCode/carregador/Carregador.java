package src.LeetCode.carregador;

import java.util.ArrayList;
import java.util.List;

public class Carregador {

    public static int getBattery(List<Integer> arr) {
        int battery = 50;

        for (int i = 0; i < arr.size(); i++) {
            battery += arr.get(i);

            if(battery > 100) battery = 100;
            if(battery < 0) battery = 0;
        }

        return battery;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(-20);
        arr.add(61);
        arr.add(-15);

        System.out.println(getBattery(arr));
    }


}
