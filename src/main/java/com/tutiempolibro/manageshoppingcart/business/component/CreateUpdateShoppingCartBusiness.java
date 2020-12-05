package com.tutiempolibro.manageshoppingcart.business.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.manageshoppingcart.entity.ShoppingType;
import com.tutiempolibro.manageshoppingcart.model.PersonaModel;
import com.tutiempolibro.manageshoppingcart.model.BookModel;
import com.tutiempolibro.manageshoppingcart.model.DetShoppingCartModel;
import com.tutiempolibro.manageshoppingcart.model.ShoppingCartModel;
import com.tutiempolibro.manageshoppingcart.repository.AutorRepository;
import com.tutiempolibro.manageshoppingcart.repository.BookRepository;
import com.tutiempolibro.manageshoppingcart.repository.DetShoppingCartRepository;
import com.tutiempolibro.manageshoppingcart.repository.ShoppingCartRepository;

@Service
public class CreateUpdateShoppingCartBusiness {

	@Autowired
	private ShoppingCartRepository shoppingCartRepo;

	@Autowired
	private DetShoppingCartRepository detShoppingCartRepo;

	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private AutorRepository autorRepo;

	public List<ShoppingType> createOrUpdateShoppingCart(Integer clientId, Integer bookId, Integer quantity,
			String type) {

		List<ShoppingCartModel> listShoppingCart = shoppingCartRepo.findByIdclienteAndEstado(clientId, "P");
		ShoppingCartModel shopping = new ShoppingCartModel();

		if (listShoppingCart != null && listShoppingCart.size() > 0) {
			shopping = listShoppingCart.get(0);

		} else {
			saveShoppingCart(clientId, shopping);
		}

		List<DetShoppingCartModel> listDet = detShoppingCartRepo.findByIdcarrito(shopping.getIdcarrito());
		saveDetShoppingCart(bookId, quantity, type, shopping, listDet);

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
				s.setPrice(det.getTipo().equals("A") ? book.getCostoalquiler().toString()
						: book.getCostoventa().toString());
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

	private void saveDetShoppingCart(Integer bookId, Integer quality, String type, ShoppingCartModel shopping,
			List<DetShoppingCartModel> listadet) {
		Boolean entro = false;
		if (listadet != null && listadet.size() > 0) {

			for (DetShoppingCartModel det : listadet) {

				if (det.getIdlibro().intValue() == bookId.intValue()) {
					System.out.println(det.getIdlibro() + " = " + bookId.intValue());
					DetShoppingCartModel detShopCartModel = new DetShoppingCartModel();
					detShopCartModel.setIdcarrito(shopping.getIdcarrito());
					detShopCartModel.setIdlibro(bookId);
					detShopCartModel.setTipo(type);
					detShopCartModel.setCantidad(quality);

					Optional<BookModel> bOptional = bookRepo.findById(det.getIdlibro());
					BookModel book = bOptional.get();

					detShopCartModel.setSubtotal(type.equals("A") ? book.getCostoalquiler() : book.getCostoventa());
					detShoppingCartRepo.save(detShopCartModel);

					det.setTipo(type);
					det.setCantidad(quality);
					det.setSubtotal(detShopCartModel.getSubtotal());
					entro = true;
				}

			}
		}

		if (!entro) {
			DetShoppingCartModel detShopCartModel = new DetShoppingCartModel();
			detShopCartModel.setIdcarrito(shopping.getIdcarrito());
			detShopCartModel.setIdlibro(bookId);
			detShopCartModel.setTipo(type);
			detShopCartModel.setCantidad(quality);

			Optional<BookModel> bOptional = bookRepo.findById(bookId);
			BookModel book = bOptional.get();

			detShopCartModel.setSubtotal(type.equals("A") ? book.getCostoalquiler() : book.getCostoventa());
			detShoppingCartRepo.save(detShopCartModel);
			listadet.add(detShopCartModel);
		}

	}

	private void saveShoppingCart(Integer clientId, ShoppingCartModel shopping) {

		shopping.setIdcliente(clientId);
		shopping.setEstado("P");
		shopping.setFecha(new Date());
		shopping = shoppingCartRepo.save(shopping);

	}
}
