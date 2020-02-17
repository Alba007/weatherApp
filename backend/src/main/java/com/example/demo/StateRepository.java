package com.example.demo;

import com.example.demo.StateModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends MongoRepository<com.example.demo.StateModel,String> {

}
