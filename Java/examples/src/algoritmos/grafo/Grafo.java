package src.algoritmos.grafo;

public class Grafo {

    public static void main(String[] args) {

        int[][] grafo = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        };

        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                if(grafo[i][j] == 1) System.out.println("Grafo: " + i + " c " + j);
            }
        }
    }
}
