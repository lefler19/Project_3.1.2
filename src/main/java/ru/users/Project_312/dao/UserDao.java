package ru.users.Project_312.dao;


import ru.users.Project_312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User showOne(int id);
    void deleteUser(int id);
    void updateUser(User user);

}
