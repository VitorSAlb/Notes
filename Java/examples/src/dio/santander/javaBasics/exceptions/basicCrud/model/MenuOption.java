package src.dio.santander.javaBasics.exceptions.basicCrud.model;

import src.dio.santander.javaBasics.exceptions.basicCrud.dao.UserDAO;

import java.util.function.Consumer;

public enum MenuOption {
    SAVE,
    UPDATE,
    DELETE,
    FIND_BY_ID,
    FIND_ALL,
    EXIT;
}
