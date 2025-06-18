
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
    @Column(name = "ID", nullable = false, length=0, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Loja")
    @Column(name = "DESC_LOJA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String descLoja;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Loja")
    @Column(name = "CODI_LOJA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiLoja;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Cnpj", mask="99.999.999/9999-99;0")
    @Column(name = "CNPJ", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cnpj;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Logradouro")
    @Column(name = "ENDERECO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String logradouro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Cidade")
    @Column(name = "CIDADE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cidade;


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
    * Obtém descLoja
    * return descLoja
    * @generated
    */
    public java.lang.String getDescLoja() {
        return this.descLoja;
    }

    /**
    * Define descLoja
    * @param descLoja descLoja
    * @generated
    */
    public Loja setDescLoja(java.lang.String descLoja) {
        this.descLoja = descLoja;
        return this;
    }
    /**
    * Obtém codiLoja
    * return codiLoja
    * @generated
    */
    public java.lang.Integer getCodiLoja() {
        return this.codiLoja;
    }

    /**
    * Define codiLoja
    * @param codiLoja codiLoja
    * @generated
    */
    public Loja setCodiLoja(java.lang.Integer codiLoja) {
        this.codiLoja = codiLoja;
        return this;
    }
    /**
    * Obtém cnpj
    * return cnpj
    * @generated
    */
    public java.lang.String getCnpj() {
        return this.cnpj;
    }

    /**
    * Define cnpj
    * @param cnpj cnpj
    * @generated
    */
    public Loja setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    /**
    * Obtém logradouro
    * return logradouro
    * @generated
    */
    public java.lang.String getLogradouro() {
        return this.logradouro;
    }

    /**
    * Define logradouro
    * @param logradouro logradouro
    * @generated
    */
    public Loja setLogradouro(java.lang.String logradouro) {
        this.logradouro = logradouro;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    public java.lang.String getCidade() {
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Loja setCidade(java.lang.String cidade) {
        this.cidade = cidade;
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
