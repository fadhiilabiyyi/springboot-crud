package com.fadhiilabiyyi.belajarspring.service.impl;

import com.fadhiilabiyyi.belajarspring.domain.User;
import com.fadhiilabiyyi.belajarspring.repository.UserRepository;
import com.fadhiilabiyyi.belajarspring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(String name, String username, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(String oldUsername, String name, String username, String email, String password) {
        User user = userRepository.findUserByUsername(oldUsername);
        user.setName(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        userRepository.findUserById(id);
    }
}
