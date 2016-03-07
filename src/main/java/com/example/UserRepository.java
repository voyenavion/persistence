package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by shaungould on 3/7/16.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
