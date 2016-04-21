package com.pwpik.cheese;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CheeseService {

    private final CheeseRepository repository;

    @Autowired
    CheeseService(CheeseRepository repository) {
        this.repository = repository;
    }

    public Collection<Cheese> getAllHiddenCheeses() {
        return repository.findAll();
    }

}
