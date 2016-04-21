package hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CheeseRepository extends CrudRepository<Cheese, Integer> {

    @Override <S extends Cheese> S save(S entity);
    @Override Iterable<Cheese> findAll();

}