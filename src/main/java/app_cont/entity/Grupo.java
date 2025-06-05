
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
* Classe que representa a tabela GRUPO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"GRUPO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Grupo")
@CronappTable(role=CronappTableRole.CLASS)
public class Grupo implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Codi Gpr")
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiGpr;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Gpr")
    @Column(name = "DESC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descGpr;


    /**
    * Construtor
    * @generated
    */
    public Grupo(){
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
    public Grupo setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiGpr
    * return codiGpr
    * @generated
    */
    public java.lang.Integer getCodiGpr() {
        return this.codiGpr;
    }

    /**
    * Define codiGpr
    * @param codiGpr codiGpr
    * @generated
    */
    public Grupo setCodiGpr(java.lang.Integer codiGpr) {
        this.codiGpr = codiGpr;
        return this;
    }
    /**
    * Obtém descGpr
    * return descGpr
    * @generated
    */
    public java.lang.String getDescGpr() {
        return this.descGpr;
    }

    /**
    * Define descGpr
    * @param descGpr descGpr
    * @generated
    */
    public Grupo setDescGpr(java.lang.String descGpr) {
        this.descGpr = descGpr;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Grupo object = (Grupo)obj;
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
