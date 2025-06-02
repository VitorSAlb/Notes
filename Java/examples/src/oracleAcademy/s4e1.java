package src.oracleAcademy;

import java.util.Scanner;

public class s4e1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho do grupo: ");
        int arrangedGroupSize = input.nextInt();

        double[] people = new double[arrangedGroupSize];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Informe o valor de quanto a pessoa %d gastou:\n", i + 1);
            people[i] = input.nextDouble();
        }
        input.close();

        for (int i = 0; i < people.length; i++) {
            people[i] += people[i] * 0.05 + people[i] * 0.15;
            System.out.printf("Pessoa %02d: $%.2f\n", i + 1, people[i]);
        }
    }
}
