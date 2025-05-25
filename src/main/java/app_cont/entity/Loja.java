
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
* Classe que representa a tabela LOJA
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"LOJA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Loja")
@CronappTable(role=CronappTableRole.CLASS)
public class Loja implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome da Loja")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="Codigo da Loja")
    @Column(name = "codLoj", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long codLoj;


    /**
    * Construtor
    * @generated
    */
    public Loja(){
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
    public Loja setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Loja setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém codLoj
    * return codLoj
    * @generated
    */
    public java.lang.Long getCodLoj() {
        return this.codLoj;
    }

    /**
    * Define codLoj
    * @param codLoj codLoj
    * @generated
    */
    public Loja setCodLoj(java.lang.Long codLoj) {
        this.codLoj = codLoj;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Loja object = (Loja)obj;
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
