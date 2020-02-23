package com.example.hobbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ControllerHobbit {

    public ControllerHobbit(RepositoryHobbit repositoryBezI) {
        this.repositoryBezI = repositoryBezI;
    }

    RepositoryHobbit repositoryBezI;


    @GetMapping("/hobbits")
    public Iterable<Hobbit> allHobbit(){
        return repositoryBezI.findAll();
    }
    @GetMapping("/hobbit/(Id")
    public Optional<Hobbit> oneHobbit(@PathVariable Long id) {
        return repositoryBezI.findById(id);
    }
}
