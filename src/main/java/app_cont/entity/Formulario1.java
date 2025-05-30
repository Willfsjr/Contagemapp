
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
* Classe que representa a tabela FORMULARIO1
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"FORMULARIO1\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Formulario1")
@CronappTable(role=CronappTableRole.CLASS)
public class Formulario1 implements Serializable {
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
    @CronappColumn(attributeType="DOUBLE", label="Quantidade")
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double quantidade;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data")
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_contagem", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Contagem contagem;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Produto produto;


    /**
    * Construtor
    * @generated
    */
    public Formulario1(){
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
    public Formulario1 setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    public java.lang.Double getQuantidade() {
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public Formulario1 setQuantidade(java.lang.Double quantidade) {
        this.quantidade = quantidade;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Formulario1 setData(java.util.Date data) {
        this.data = data;
        return this;
    }
    /**
    * Obtém contagem
    * return contagem
    * @generated
    */
    public Contagem getContagem() {
        return this.contagem;
    }

    /**
    * Define contagem
    * @param contagem contagem
    * @generated
    */
    public Formulario1 setContagem(Contagem contagem) {
        this.contagem = contagem;
        return this;
    }
    /**
    * Obtém produto
    * return produto
    * @generated
    */
    public Produto getProduto() {
        return this.produto;
    }

    /**
    * Define produto
    * @param produto produto
    * @generated
    */
    public Formulario1 setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Formulario1 object = (Formulario1)obj;
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
