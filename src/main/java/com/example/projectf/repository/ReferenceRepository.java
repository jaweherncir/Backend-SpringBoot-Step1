package com.example.projectf.repository;

import com.example.projectf.model.Reference;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
public interface ReferenceRepository extends MongoRepository<Reference,String> {
}
