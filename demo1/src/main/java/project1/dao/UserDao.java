package project1.dao;

import org.springframework.data.repository.CrudRepository;
import project1.User;

/**
 * 16.09.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */
public interface UserDao extends CrudRepository<User, Integer> {
}
