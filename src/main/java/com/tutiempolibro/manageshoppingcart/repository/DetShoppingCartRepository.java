package com.tutiempolibro.manageshoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.manageshoppingcart.model.DetShoppingCartModel;

@Repository
public interface DetShoppingCartRepository extends JpaRepository<DetShoppingCartModel, Integer> {

}
