package src;

public class Aula32Array {

    public static void main(String[] args) {

        // Arrays
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{1,2,3,4,5};

        numbers[0] = 321;
        numbers[1] = 2;
        numbers[2] = 53;

//        for (int idade : numbers) {
//            System.out.println(idade);
//        }

        // Arrays Multidimencionais

        int[][] dias = new int[2][]; // Arrays de arrays

        dias[0] = new int[]{1, 2};
        dias[1] = new int[]{1, 2, 3, 4};

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Array: " + i);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("---------------------");

        for(int[] arrBase : dias) {
            for(int num : arrBase) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[3][];

        for (int[] arrayBase: arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }


    }


}
