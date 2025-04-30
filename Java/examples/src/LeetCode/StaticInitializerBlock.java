package src.LeetCode;

import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        int h = in.nextInt();
        int result = b * h;

        if (b <= 0 || h <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
        else System.out.println(result);
    }
}
