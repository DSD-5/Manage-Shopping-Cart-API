package com.tutiempolibro.manageshoppingcart.service;

import java.util.List;

import com.tutiempolibro.manageshoppingcart.entity.ShoppingType;

public interface IManageShoppingCartService {
    
    public List<ShoppingType> createOrUpdateShoppingCart(Integer clientId, Integer bookId, Integer quantity, String type); 
    
    public List<ShoppingType> deleteShoppingCart(Integer shoppingiId , Integer bookId);
    
}
