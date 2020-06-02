package com.repository;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<com.dto.User> findById(Long id);

    List<com.dto.User> findAll();
}