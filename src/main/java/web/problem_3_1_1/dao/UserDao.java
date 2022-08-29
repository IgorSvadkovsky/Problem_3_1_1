package web.problem_3_1_1.dao;

import web.problem_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    User getUser(long id);
    void deleteUser(long id);
    void saveOrUpdateUser(User user);
    List<User> getAllUsers();
}
