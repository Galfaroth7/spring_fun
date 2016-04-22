package com.pwpik.cheese;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CheeseRepository extends CrudRepository<Cheese, Integer> {

    <S extends Cheese> S save(S entity);
    Collection<Cheese> findAll();
    Cheese findByName(String name);
    Collection<Cheese> findByIdBetweenOrderByNameDesc(Integer from, Integer to);

}