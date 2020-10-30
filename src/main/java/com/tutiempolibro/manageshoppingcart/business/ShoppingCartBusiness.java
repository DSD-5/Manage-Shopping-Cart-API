package com.tutiempolibro.manageshoppingcart.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.manageshoppingcart.business.component.CreateUpdateShoppingCartBusiness;
import com.tutiempolibro.manageshoppingcart.business.component.DeleteShoppingCartBusiness;
import com.tutiempolibro.manageshoppingcart.entity.ShoppingType;

@Service
public class ShoppingCartBusiness {

    @Autowired
    private CreateUpdateShoppingCartBusiness createUpdateShoppingCartBusiness;

    @Autowired
    private DeleteShoppingCartBusiness deleteShoppingCartBusiness;

    public List<ShoppingType> createOrUpdateShoppingCart(Integer clientId, Integer bookId, Integer quantity, String type) {

	return createUpdateShoppingCartBusiness.createOrUpdateShoppingCart(clientId, bookId, quantity, type);

    }

    public List<ShoppingType> deleteShoppingCart(Integer shoppingiId, Integer bookId) {

	return deleteShoppingCartBusiness.deleteShoppingCart(shoppingiId, bookId);
    }

}
