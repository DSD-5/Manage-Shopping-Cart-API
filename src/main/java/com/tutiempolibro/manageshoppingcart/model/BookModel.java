package com.tutiempolibro.manageshoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "libro")
@Data
public class BookModel  implements Serializable{
    

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Integer idlibro;

    private String nombre;

    private String descripcion;

    private Integer idcategoria;

    private Integer stockventa;

    private Integer stockalquiler;

    private String tipo;

    private Integer idautor;

    private String estado;

    private Double costoalquiler;

    private Double costoventa;
      
   
    /*
     * @OneToMany(fetch = FetchType.LAZY, mappedBy = "libro") private
     * List<DetShoppingCartModel> listadetalle;
     */
    

}
