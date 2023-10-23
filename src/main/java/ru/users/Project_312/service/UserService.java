package ru.users.Project_312.service;


import ru.users.Project_312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    Object showOne(int id);
    void deleteUser(int id);
    void updateUser(User user);
}
