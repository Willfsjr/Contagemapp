
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
* Classe que representa a tabela ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Estoque")
@CronappTable(role=CronappTableRole.CLASS)
public class Estoque implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Codi Dpt")
    @Column(name = "codiDpt", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codiDpt;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Qte Total")
    @Column(name = "qteTotal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String qteTotal;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_formulario1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Formulario1 formulario1;


    /**
    * Construtor
    * @generated
    */
    public Estoque(){
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
    public Estoque setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public java.lang.String getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public Estoque setCodiDpt(java.lang.String codiDpt) {
        this.codiDpt = codiDpt;
        return this;
    }
    /**
    * Obtém qteTotal
    * return qteTotal
    * @generated
    */
    public java.lang.String getQteTotal() {
        return this.qteTotal;
    }

    /**
    * Define qteTotal
    * @param qteTotal qteTotal
    * @generated
    */
    public Estoque setQteTotal(java.lang.String qteTotal) {
        this.qteTotal = qteTotal;
        return this;
    }
    /**
    * Obtém formulario1
    * return formulario1
    * @generated
    */
    public Formulario1 getFormulario1() {
        return this.formulario1;
    }

    /**
    * Define formulario1
    * @param formulario1 formulario1
    * @generated
    */
    public Estoque setFormulario1(Formulario1 formulario1) {
        this.formulario1 = formulario1;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Estoque object = (Estoque)obj;
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
