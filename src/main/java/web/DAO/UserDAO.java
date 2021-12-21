package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    User getUser(Long id);
    void addUser(User user, String[] roles);
    void removeUser(Long id);
    void updateUser(User user, String[] roles);
    List<User> getAllUsers();
    User loadUserByUsername(String s);
}
