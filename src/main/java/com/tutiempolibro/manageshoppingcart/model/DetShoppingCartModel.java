package com.tutiempolibro.manageshoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name="det_carrito_tmp")
@IdClass(DetShoppingCartIdentity.class)
@Data
public class DetShoppingCartModel  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer idcarrito;
    
    @Id
    private Integer idlibro;
    
    private Integer cantidad;
    
    private String tipo;
    
    private Double subtotal;
    
    /*
     * @ManyToOne(fetch = FetchType.LAZY)
     * 
     * @JoinColumn(name = "idlibro", updatable = false, insertable = false) private
     * BookModel libro;
     */
    
}
