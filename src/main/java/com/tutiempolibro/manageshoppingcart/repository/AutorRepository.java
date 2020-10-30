package com.tutiempolibro.manageshoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.manageshoppingcart.model.PersonaModel;

@Repository
public interface AutorRepository extends JpaRepository<PersonaModel, Integer>{

}
