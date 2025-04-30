package src.DevDojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Vitor";
        String address = "Rua das palmeiras";
        double salary = 2000;
        LocalDate date = LocalDate.parse("2004-07-02");

        System.out.println("Eu "
                + nome + ", morando no endereço "
                + address + ", confirmo que recebi o salário de "
                + salary + ", na data "
                + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
