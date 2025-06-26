package src.dio.santander.javaBasics.exceptions.basicCrud.dao;

import src.dio.santander.javaBasics.exceptions.basicCrud.model.UserModel;
import src.dio.santander.javaBasics.exceptions.basicCrud.exceptions.UserNotFounded;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long  nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void deleted(final long id) {
        var toDeleted = findById(id);
        models.remove(toDeleted);
    }

    public UserModel findById(final long id) {
        return models.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFounded(String.format("No exist user with this id %s", id)));
    }

    public List<UserModel> findAll() {
        return models;
    }
}
