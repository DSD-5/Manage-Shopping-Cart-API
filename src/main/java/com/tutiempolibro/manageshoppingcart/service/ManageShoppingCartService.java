package com.tutiempolibro.manageshoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.manageshoppingcart.business.ShoppingCartBusiness;
import com.tutiempolibro.manageshoppingcart.entity.ShoppingType;

@Service
public class ManageShoppingCartService implements IManageShoppingCartService {

    @Autowired
    private ShoppingCartBusiness shoppingCartBusiness;

    @Override
    public List<ShoppingType> createOrUpdateShoppingCart(Integer clientId, Integer bookId, Integer quantity, String type) {

	return shoppingCartBusiness.createOrUpdateShoppingCart(clientId, bookId, quantity, type);
    }

    public List<ShoppingType> deleteShoppingCart(Integer shoppingiId, Integer bookId) {

	return shoppingCartBusiness.deleteShoppingCart(shoppingiId , bookId);
    }

}
