package aula02;

public class Synchronized_1 {

    static int i = 0;

    public static void main(String[] args) {

        // Utilizar o synchronized tem uma desvantagem que é a perda de desempenho,
        // pois ele impede que múltiplas Threads acessem o recurso compartilhado ao mesmo tempo,
        // que pode levar a um aumento no tempo de execução, especialmente se o recurso for altamente contendido.
        // Ou seja, eu perco toda a vantagem de ter múltiplas Threads.

        MeuRunnable runnable = new MeuRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Ao ter o mesmo recurso compartilhado entre várias Threads, é necessário garantir que o
        // acesso a esse recurso seja controlado para evitar condições de corrida, onde múltiplas Threads
        // tentam acessar e modificar o recurso ao mesmo tempo, levando a resultados imprevisíveis.
    }

    public static void imprime() {
        synchronized (Synchronized_1.class) {
            String name = Thread.currentThread().getName();
            i++;
            System.out.println(name + " : " + i);
        }
    }

    public static class MeuRunnable implements Runnable {

//        static Object lock1 = new Object();
//        static Object lock2 = new Object();

        @Override
        // public synchronized void run() {
        // Synchronized é uma palavra-chave que pode ser usada para controlar
        // o acesso a um recurso compartilhado entre várias Threads.
        // Apenas uma Thread pode executar o bloco por vez. (é retirado o paralelismo)

        public void run() {

            // imprime();

            // Dessa forma temos um caso mais proximo do que acontece na prática, pois isolamos o caso onde acontece a concorrência
            // e o processamento pesado, ou seja, o processamento pesado não é bloqueado pelo synchronized, apenas a parte crítica.
            int j;
            synchronized (this) {
                i++;
                j = i * 2;
            }

            double JElevadoA100 = Math.pow(j, 100);
            double sqrt = Math.sqrt(JElevadoA100);
            System.out.println("Resultado: " + sqrt);

//            synchronized (this) {
//                // O bloco synchronized garante que apenas uma Thread possa acessar o código
//                // dentro dele por vez, usando o objeto 'this' como monitor.
//
//                String name = Thread.currentThread().getName();
//                i++;
//                System.out.println(name + " : " + i);
//            }
//            synchronized (lock1) {
//                // Quando tenho dois blocos synchronized, o monitor é liberado após a execução do primeiro bloco,
//                // permitindo que outras Threads acessem o segundo bloco.
//
//                String name = Thread.currentThread().getName();
//                i++;
//                System.out.println(name + " : " + i);
//            }
//            synchronized (lock2) {
//                // Quando tenho dois blocos synchronized, o monitor é liberado após a execução do primeiro bloco,
//                // permitindo que outras Threads acessem o segundo bloco.
//
//                String name = Thread.currentThread().getName();
//                i++;
//                System.out.println(name + " : " + i);
            }

        }
}
