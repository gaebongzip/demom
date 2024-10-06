package com.asd.demom.app.tests.service;

import com.asd.demom.app.tests.entity.Tests;
import com.asd.demom.app.tests.repository.TestsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestsService {

    private final TestsRepository repository;


    public List<Tests> findAll(){
        return repository.findAll();
    }

    public Tests save(Tests tests){
        repository.save(tests);
        return tests;
    }

    public Tests findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Tests update(Tests tests){
        tests = repository.findById(tests.getId()).orElse(null);
        if(tests == null){
            //throw new IllegalAccessException("");
            return null;
        }
        repository.save(tests);
        return tests;
    }

    public void delete(Long id){
        repository.deleteById(id);
    }



}
