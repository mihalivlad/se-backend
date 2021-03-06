package com.project.socializingApp.repository;

import com.project.socializingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    User findFirstByUserName(String userName);
    void delete(User user);
}
