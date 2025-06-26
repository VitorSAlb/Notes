package src.dio.santander.javaBasics.exceptions.basicCrud;

import src.dio.santander.javaBasics.exceptions.basicCrud.dao.UserDAO;
import src.dio.santander.javaBasics.exceptions.basicCrud.exceptions.UserNotFounded;
import src.dio.santander.javaBasics.exceptions.basicCrud.model.MenuOption;
import src.dio.santander.javaBasics.exceptions.basicCrud.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Bem vindo ao cadastro");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por id");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");
            int userInput = sc.nextInt();

            var selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("User salvo %s\n", user);
                }
                case UPDATE -> {
                    var user = dao.update(requestToUpdate());
                    System.out.printf("User updated %s\n", user);
                }
                case DELETE -> {
                    dao.deleted(requestId());
                    System.out.println("User deletado\n");
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("User  com id %s\n", id);
                        System.out.println(user);
                    } catch (UserNotFounded ex) {

                    } catch (Exception ex) {

                    }
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.print("Users cadastrados:\n");
                    if (users.isEmpty()) System.out.println("Não tem usuários cadastrados");
                    users.forEach(System.out::println);
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário");
        var name = sc.next();
        System.out.println("Informe o email do usuário");
        var email = sc.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy)");
        var birthdayString = sc.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = OffsetDateTime.parse(birthdayString, formatter);
        return new UserModel(0L, name, email, birthday);
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o identificador do usuário");
        var id = sc.nextLong();
        System.out.println("Informe o nome do usuário");
        var name = sc.next();
        System.out.println("Informe o email do usuário");
        var email = sc.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy)");
        var birthdayString = sc.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = OffsetDateTime.parse(birthdayString, formatter);
        return new UserModel(id, name, email, birthday);
    }

    private static Long requestId() {
        System.out.println("Informe o identificador do usuário");
        return sc.nextLong();
    }
}
