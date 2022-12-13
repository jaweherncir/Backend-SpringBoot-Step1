package com.example.projectf.rest;

import com.example.projectf.model.Reference;
import com.example.projectf.repository.ReferenceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@CrossOrigin (origins = "https://localhost:8080" )
@RestController
@RequestMapping("/api")
public class ReferenceController {
    private static Logger logger =  LoggerFactory.getLogger(ReferenceController.class);

    @Resource
    private ReferenceRepository referenceRepository;

    @PostMapping(path = "/references")
    public ResponseEntity<Reference> createReference(@RequestBody Reference reference) throws ResourceNotFoundException{
     Reference newreference = referenceRepository.save(reference);
     logger.info("create Reference with ID :{}",newreference.getId());
     return new ResponseEntity<>(newreference, HttpStatus.CREATED);

    }
}
