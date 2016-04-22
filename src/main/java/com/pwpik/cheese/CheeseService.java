package com.pwpik.cheese;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@Service
public class CheeseService {

    private final CheeseRepository repository;

    @Autowired
    CheeseService(CheeseRepository repository) {
        this.repository = repository;
    }

    public Collection<Cheese> getAllHiddenCheeses() {
        return Collections.singletonList(new Cheese("Gorgonzola"));
        // return repository.findAll();
    }

}
