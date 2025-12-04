package com.sample.sample;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
    
@Repository
public interface FormRepository extends MongoRepository<FormDataModel, String>{
    
}
