package src.dio.santander.javaBasics.exceptions;

import java.io.FileNotFoundException;

public class EntendendoExceptions {

    public static void main(String[] args) {
        test();
        System.out.println("terminou");
    }

    private static void test() {
                        new Throwable(); // pai de exceptions e errors

                new EntendendoExceptions(); new Error(); // errors

        new RuntimeException(); /*Unchecked*/ new FileNotFoundException(); //checked


    }
}
