package src.LeetCode;

import java.util.Objects;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        while(in.hasNext()) {
            count++;
            String s1 = in.nextLine();
            System.out.println(count + " " + s1);

            if (Objects.equals(s1, "exit")) break;
        }
    }
}
