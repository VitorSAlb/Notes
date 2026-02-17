package aula01;

import java.lang.Runnable;

public class MeuRunnable implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("(RUNNABLE) Estou rodando na Thread: " + name);
    }
}
