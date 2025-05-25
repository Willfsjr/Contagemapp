
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
* Classe que representa a tabela CONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CONTAGEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Contagem")
@CronappTable(role=CronappTableRole.CLASS)
public class Contagem implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Loja")
    @Column(name = "loja", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String loja;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BYTE_ARRAY", label="Ativa")
    @Column(name = "ativa", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] ativa;


    /**
    * Construtor
    * @generated
    */
    public Contagem(){
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
    public Contagem setId(java.lang.String id) {
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
    public Contagem setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém loja
    * return loja
    * @generated
    */
    public java.lang.String getLoja() {
        return this.loja;
    }

    /**
    * Define loja
    * @param loja loja
    * @generated
    */
    public Contagem setLoja(java.lang.String loja) {
        this.loja = loja;
        return this;
    }
    /**
    * Obtém ativa
    * return ativa
    * @generated
    */
    public byte[] getAtiva() {
        return this.ativa;
    }

    /**
    * Define ativa
    * @param ativa ativa
    * @generated
    */
    public Contagem setAtiva(byte[] ativa) {
        this.ativa = ativa;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Contagem object = (Contagem)obj;
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
