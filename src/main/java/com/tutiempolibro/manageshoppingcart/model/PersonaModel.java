package com.tutiempolibro.manageshoppingcart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="persona")
@Data
public class PersonaModel implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer idpersona;
    private String  nombres;
    private String apepat;
    private String apemat;
    
    
}
