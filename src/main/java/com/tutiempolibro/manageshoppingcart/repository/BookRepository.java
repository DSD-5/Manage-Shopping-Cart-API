package com.tutiempolibro.manageshoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.manageshoppingcart.model.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {

}
