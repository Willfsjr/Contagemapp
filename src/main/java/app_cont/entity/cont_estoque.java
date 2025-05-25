
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
* Classe que representa a tabela CONT_ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CONT_ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.cont_estoque")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class cont_estoque implements Serializable {
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
    @JoinColumn(name="cont", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Contagem cont;


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
    public cont_estoque(){
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
    public cont_estoque setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cont
    * return cont
    * @generated
    */
    public Contagem getCont() {
        return this.cont;
    }

    /**
    * Define cont
    * @param cont cont
    * @generated
    */
    public cont_estoque setCont(Contagem cont) {
        this.cont = cont;
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
    public cont_estoque setEstoque(Estoque estoque) {
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
cont_estoque object = (cont_estoque)obj;
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
