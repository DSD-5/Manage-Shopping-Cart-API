package com.tutiempolibro.manageshoppingcart.business.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.manageshoppingcart.entity.ShoppingType;
import com.tutiempolibro.manageshoppingcart.model.BookModel;
import com.tutiempolibro.manageshoppingcart.model.DetShoppingCartModel;
import com.tutiempolibro.manageshoppingcart.model.PersonaModel;
import com.tutiempolibro.manageshoppingcart.repository.AutorRepository;
import com.tutiempolibro.manageshoppingcart.repository.BookRepository;
import com.tutiempolibro.manageshoppingcart.repository.DetShoppingCartRepository;

@Service
@Transactional
public class DeleteShoppingCartBusiness {

    @Autowired
    private DetShoppingCartRepository detShoppingCartRepo;

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private AutorRepository autorRepo;

    public List<ShoppingType> deleteShoppingCart(Integer shoppingiId, Integer bookId) {
	
	detShoppingCartRepo.deleteByIdcarritoAndIdlibro(shoppingiId, bookId);

	List<DetShoppingCartModel> listDet = detShoppingCartRepo.findByIdcarrito(shoppingiId);

	return buildResponseListItemsShoppingCart(listDet);
    }

    private List<ShoppingType> buildResponseListItemsShoppingCart(List<DetShoppingCartModel> listDet) {

	List<ShoppingType> response = new ArrayList<ShoppingType>();
	listDet.stream().forEach(det -> {

	    Optional<BookModel> bOptional = bookRepo.findById(det.getIdlibro());
	    ShoppingType s = new ShoppingType();

	    if (bOptional.isPresent()) {
		BookModel book = bOptional.get();
		Optional<PersonaModel> aOptional = autorRepo.findById(book.getIdautor());
		PersonaModel autor = aOptional.get();
		s.setAutor(autor.getNombres() + " " + autor.getApemat() + " " + autor.getApemat());
		s.setDescription(book.getDescripcion());
		s.setPrice(det.getTipo().equals("A") ? book.getCostoalquiler().toString() : book.getCostoventa().toString());
		s.setType(det.getTipo());
		s.setQuantity(det.getCantidad());
		s.setShoppingid(det.getIdcarrito().toString());
		s.setStock("");
		s.setSubtotal((det.getCantidad() * Double.valueOf(s.getPrice())) + "");
		s.setUrlimage("por definir");
		s.setTitle(book.getNombre());
		s.setBookid(book.getIdlibro().toString());
	    }
	    response.add(s);

	});

	return response;
    }

}
