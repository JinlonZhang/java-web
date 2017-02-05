package org.example.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by qsym on 2017/2/4.
 */
public interface register extends MongoRepository<registerModel, String> {
}
