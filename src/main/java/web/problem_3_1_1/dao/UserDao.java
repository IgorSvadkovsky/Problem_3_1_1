package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    User getUser(long id);
    void deleteUser(long id);
    void saveOrUpdateUser(User user);
    List<User> getAllUsers();
}
