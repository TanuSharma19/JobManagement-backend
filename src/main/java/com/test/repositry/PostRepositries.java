package com.test.repositry;

import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.model.Post;

public interface PostRepositries extends MongoRepository<Post, String>{

}
