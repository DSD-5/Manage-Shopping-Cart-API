package com.tutiempolibro.manageshoppingcart.model;

import java.io.Serializable;

public class DetShoppingCartIdentity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer idcarrito;

    private Integer idlibro;
    
    public DetShoppingCartIdentity() {
	
    }
    
    
    public DetShoppingCartIdentity(Integer idcarrito, Integer idlibro) {
	super();
	this.idcarrito = idcarrito;
	this.idcarrito = idlibro;
    }


    public Integer getIdcarrito() {
        return idcarrito;
    }


    public void setIdcarrito(Integer idcarrito) {
        this.idcarrito = idcarrito;
    }


    public Integer getIdlibro() {
        return idlibro;
    }


    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    

}
