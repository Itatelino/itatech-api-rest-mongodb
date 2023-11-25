package com.itatech.itatechapirest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.itatech.itatechapirest.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
