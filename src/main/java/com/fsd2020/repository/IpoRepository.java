package com.fsd2020.repository;

import com.fsd2020.data.entity.IPOEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IpoRepository extends CrudRepository<IPOEntity, Long> {
    List<IPOEntity> findByLastName(String lastName);
    IPOEntity findById(long id);
    Iterable<IPOEntity> findAll();
    IPOEntity save(IPOEntity ipoEntity);
}
