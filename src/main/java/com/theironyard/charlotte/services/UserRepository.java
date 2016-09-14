package com.theironyard.charlotte.services;

import com.theironyard.charlotte.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}