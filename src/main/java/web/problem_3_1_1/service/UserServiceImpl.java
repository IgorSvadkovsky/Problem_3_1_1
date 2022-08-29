package web.problem_3_1_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.problem_3_1_1.dao.UserDao;
import web.problem_3_1_1.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        User user = getUser(id);
        if (user != null) {
            userDao.deleteUser(id);
        }
    }

    @Override
    @Transactional
    public void saveOrUpdateUser(User user) {
        userDao.saveOrUpdateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
