
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
* Classe que representa a tabela DEPOSITO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"DEPOSITO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Deposito")
@CronappTable(role=CronappTableRole.CLASS)
public class Deposito implements Serializable {
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Dpt")
    @Column(name = "DESC_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descDpt;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Dpt")
    @Column(name = "CODI_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiDpt;


    /**
    * Construtor
    * @generated
    */
    public Deposito(){
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
    public Deposito setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descDpt
    * return descDpt
    * @generated
    */
    public java.lang.String getDescDpt() {
        return this.descDpt;
    }

    /**
    * Define descDpt
    * @param descDpt descDpt
    * @generated
    */
    public Deposito setDescDpt(java.lang.String descDpt) {
        this.descDpt = descDpt;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public java.lang.Integer getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public Deposito setCodiDpt(java.lang.Integer codiDpt) {
        this.codiDpt = codiDpt;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Deposito object = (Deposito)obj;
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
