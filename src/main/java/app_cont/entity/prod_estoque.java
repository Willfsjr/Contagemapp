
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
* Classe que representa a tabela PROD_ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PROD_ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.prod_estoque")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class prod_estoque implements Serializable {
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
    @JoinColumn(name="prod", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Produto prod;


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
    public prod_estoque(){
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
    public prod_estoque setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém prod
    * return prod
    * @generated
    */
    public Produto getProd() {
        return this.prod;
    }

    /**
    * Define prod
    * @param prod prod
    * @generated
    */
    public prod_estoque setProd(Produto prod) {
        this.prod = prod;
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
    public prod_estoque setEstoque(Estoque estoque) {
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
prod_estoque object = (prod_estoque)obj;
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
