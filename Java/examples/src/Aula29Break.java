package src;

import java.util.Scanner;

public class Aula29Break {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            if(i == 25) break;
        }


    }
}
