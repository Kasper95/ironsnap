package com.theironyard.service;

import com.theironyard.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}


