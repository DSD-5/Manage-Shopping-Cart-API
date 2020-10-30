package com.tutiempolibro.manageshoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.manageshoppingcart.model.DetShoppingCartModel;

@Repository
public interface DetShoppingCartRepository extends JpaRepository<DetShoppingCartModel, Integer> {
    
  public List<DetShoppingCartModel> findByIdcarritoAndIdlibroAndTipo(Integer idcarrito, Integer idlibro, String tipo);
  
  public List<DetShoppingCartModel> findByIdcarrito(Integer idcarrito);
  
  public Long deleteByIdcarritoAndIdlibro(Integer idcarrito, Integer idlibro );
  
  
    
}
