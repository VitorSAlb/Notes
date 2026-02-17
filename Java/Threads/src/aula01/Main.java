package aula01;

public class Main {

    public static void main(String[] args) {

        // Thread Atual
        Thread t = Thread.currentThread();
        System.out.println("(MAIN) Estou rodando na Thread: " + t.getName());


        // Criando uma representação de Thread
        Thread t0 = new Thread(new MeuRunnable());
        // t0.run();   // Executa na thread atual

        // Executa numa nova thread, ou seja, quando start() é chamado ele solicita a JVM para criar uma nova Thread e
        // executar o método run() nessa nova Thread. O método run() é o que contém o código que será executado na nova Thread.
        //  Se você chamar run() diretamente, ele será executado na thread atual, não criando uma nova thread.

        // Runnable como lambda
        Thread t1 = new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println("(LAMBDA) Estou rodando na Thread: " + name);
        });

        // Não se pode iniciar uma Thread mais de uma vez, ela tem entendimento de qual estado ela está,
        // ou seja, se ela já foi iniciada, ela não pode ser iniciada novamente.
        // Se você tentar iniciar uma Thread que já foi iniciada, isso resultará em uma IllegalThreadStateException.
        // Portanto, é importante garantir que cada Thread seja iniciada apenas uma vez durante o seu ciclo de vida.

        // Várias Threads usando a mesma classe Runnable
        Thread t2 = new Thread(new MeuRunnable());

        t0.start();
        t1.start();
        t2.start();

    }
}