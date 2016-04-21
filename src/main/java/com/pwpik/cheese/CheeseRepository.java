package com.pwpik.cheese;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CheeseRepository extends CrudRepository<Cheese, Integer> {

    @Override <S extends Cheese> S save(S entity);
    Collection<Cheese> findAll();

}