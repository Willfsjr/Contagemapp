
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela DEPOSITO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"DEPOSITO\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Deposito")
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "DESC_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descDpt;


    /**
    * @generated
    */
    @Column(name = "CODI_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiDpt;


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
    public String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Deposito setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descDpt
    * return descDpt
    * @generated
    */
    public String getDescDpt() {
        return this.descDpt;
    }

    /**
    * Define descDpt
    * @param descDpt descDpt
    * @generated
    */
    public Deposito setDescDpt(String descDpt) {
        this.descDpt = descDpt;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public Integer getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public Deposito setCodiDpt(Integer codiDpt) {
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
