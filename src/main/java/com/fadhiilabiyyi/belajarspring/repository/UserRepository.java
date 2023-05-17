package com.fadhiilabiyyi.belajarspring.repository;

import com.fadhiilabiyyi.belajarspring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
    User findUserById(long id);
}
