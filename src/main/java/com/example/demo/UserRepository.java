package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUserName(String username);
    User findByEmail(String email);
    Long countByEmail(String email);
    long countByUserName(String userName);
}
