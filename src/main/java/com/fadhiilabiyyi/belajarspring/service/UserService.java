package com.fadhiilabiyyi.belajarspring.service;

import com.fadhiilabiyyi.belajarspring.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User createUser(String name, String username, String email, String password);

    User updateUser(String oldUsername, String name, String username, String email, String password);
    void deleteUser(long id);
}
