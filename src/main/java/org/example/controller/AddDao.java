package org.example.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by qsym on 2017/1/20.
 */
public interface AddDao extends MongoRepository<AddHospital, String>{
}
