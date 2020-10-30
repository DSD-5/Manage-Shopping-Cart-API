package com.tutiempolibro.manageshoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.manageshoppingcart.model.ShoppingCartModel;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCartModel , Integer> {

}
