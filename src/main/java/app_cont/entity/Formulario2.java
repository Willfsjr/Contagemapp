
package app_cont.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela FORMULARIO2
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"FORMULARIO2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Formulario2")
@CronappTable(role=CronappTableRole.CLASS)
public class Formulario2 implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Produto")
    @Column(name = "prod", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String prod;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Quantidade")
    @Column(name = "quant", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double quant;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Contagem")
    @Column(name = "cont", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cont;


    /**
    * Construtor
    * @generated
    */
    public Formulario2(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Formulario2 setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém prod
    * return prod
    * @generated
    */
    public java.lang.String getProd() {
        return this.prod;
    }

    /**
    * Define prod
    * @param prod prod
    * @generated
    */
    public Formulario2 setProd(java.lang.String prod) {
        this.prod = prod;
        return this;
    }
    /**
    * Obtém quant
    * return quant
    * @generated
    */
    public java.lang.Double getQuant() {
        return this.quant;
    }

    /**
    * Define quant
    * @param quant quant
    * @generated
    */
    public Formulario2 setQuant(java.lang.Double quant) {
        this.quant = quant;
        return this;
    }
    /**
    * Obtém cont
    * return cont
    * @generated
    */
    public java.lang.String getCont() {
        return this.cont;
    }

    /**
    * Define cont
    * @param cont cont
    * @generated
    */
    public Formulario2 setCont(java.lang.String cont) {
        this.cont = cont;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Formulario2 object = (Formulario2)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
