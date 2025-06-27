
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela GRUPO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"GRUPO\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Grupo")
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiGpr;


    /**
    * @generated
    */
    @Column(name = "DESC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descGpr;


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
    public String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Grupo setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiGpr
    * return codiGpr
    * @generated
    */
    public Integer getCodiGpr() {
        return this.codiGpr;
    }

    /**
    * Define codiGpr
    * @param codiGpr codiGpr
    * @generated
    */
    public Grupo setCodiGpr(Integer codiGpr) {
        this.codiGpr = codiGpr;
        return this;
    }
    /**
    * Obtém descGpr
    * return descGpr
    * @generated
    */
    public String getDescGpr() {
        return this.descGpr;
    }

    /**
    * Define descGpr
    * @param descGpr descGpr
    * @generated
    */
    public Grupo setDescGpr(String descGpr) {
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
