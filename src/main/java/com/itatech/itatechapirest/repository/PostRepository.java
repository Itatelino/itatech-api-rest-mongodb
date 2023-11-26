package com.itatech.itatechapirest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.itatech.itatechapirest.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
