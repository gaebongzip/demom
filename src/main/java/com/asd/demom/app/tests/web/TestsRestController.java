package com.asd.demom.app.tests.web;

import com.asd.demom.app.tests.entity.Tests;
import com.asd.demom.app.tests.service.TestsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestsRestController {

    private final TestsService service;

    @GetMapping(value="tests")
    public List<Tests> list(){
        return service.findAll();
    }

    @GetMapping(value = "tests/{id}")
    public Tests select(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PostMapping(value="tests")
    public Tests save(@RequestBody Tests tests){
        tests = service.save(tests);
        return tests;
    }

    @PutMapping(value="posts/{id}")
    public Tests update(Tests tests){
        tests = service.update(tests);
        return tests;
    }

    @DeleteMapping(value="posts/{id}")
    public String delete(@PathVariable("id") Long id){
        service.delete(id);
        return "삭제완료";
    }




}
