
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
    @ManyToOne
    @JoinColumn(name="loja_id", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "CONTAGEM_LOJA_ID_LOJA_ID", foreignKeyDefinition = "FOREIGN KEY (loja_id) REFERENCES LOJA (id) ON DELETE CASCADE"))
        
        private Loja loja;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Encerrado")
    @Column(name = "encerrado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean encerrado;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data")
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


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
    public Loja getLoja() {
        return this.loja;
    }

    /**
    * Define loja
    * @param loja loja
    * @generated
    */
    public Contagem setLoja(Loja loja) {
        this.loja = loja;
        return this;
    }
    /**
    * Obtém encerrado
    * return encerrado
    * @generated
    */
    public java.lang.Boolean getEncerrado() {
        return this.encerrado;
    }

    /**
    * Define encerrado
    * @param encerrado encerrado
    * @generated
    */
    public Contagem setEncerrado(java.lang.Boolean encerrado) {
        this.encerrado = encerrado;
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
    public Contagem setData(java.util.Date data) {
        this.data = data;
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
