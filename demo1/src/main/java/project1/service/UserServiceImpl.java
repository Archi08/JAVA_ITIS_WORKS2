package project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project1.User;
import project1.dao.UserDao;

/**
 * 16.09.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User registerUser(User user) {
        User saveUser = userDao.save(user);
        return saveUser;
    }
}
