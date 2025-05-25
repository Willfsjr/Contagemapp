
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
* Classe que representa a tabela FORM1_ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"FORM1_ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.form1_estoque")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class form1_estoque implements Serializable {
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
    @ManyToOne
    @JoinColumn(name="form1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Formulario1 form1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="estoque", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Estoque estoque;


    /**
    * Construtor
    * @generated
    */
    public form1_estoque(){
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
    public form1_estoque setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém form1
    * return form1
    * @generated
    */
    public Formulario1 getForm1() {
        return this.form1;
    }

    /**
    * Define form1
    * @param form1 form1
    * @generated
    */
    public form1_estoque setForm1(Formulario1 form1) {
        this.form1 = form1;
        return this;
    }
    /**
    * Obtém estoque
    * return estoque
    * @generated
    */
    public Estoque getEstoque() {
        return this.estoque;
    }

    /**
    * Define estoque
    * @param estoque estoque
    * @generated
    */
    public form1_estoque setEstoque(Estoque estoque) {
        this.estoque = estoque;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
form1_estoque object = (form1_estoque)obj;
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
