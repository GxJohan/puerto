package com.chancay.puerto.repository;

import com.chancay.puerto.model.Container;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Integer> {
    
    
}
