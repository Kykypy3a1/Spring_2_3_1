package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> showAll();
    public void save(User user);
    public void update (int id, User updatedUser);
    public void delete(int id);
    public User show(int id);
}
