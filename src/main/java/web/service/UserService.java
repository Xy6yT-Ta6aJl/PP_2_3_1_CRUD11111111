package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    void addUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);
}
