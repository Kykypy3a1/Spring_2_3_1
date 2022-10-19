package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAll();

    void save(User user);

    void update(User updatedUser);

    void delete(int id);

    User show(int id);
}
