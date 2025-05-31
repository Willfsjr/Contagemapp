
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
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String id;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data")
    @Column(name = "data", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Encerrado")
    @Column(name = "encerrado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean encerrado;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_loja", nullable = true, referencedColumnName = "loja_id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_CONTAGEM_fk_loja", foreignKeyDefinition = "FOREIGN KEY (fk_loja) REFERENCES LOJA (loja_id)"))
        
        private Loja loja;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;


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
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Contagem setName(java.lang.String name) {
        this.name = name;
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
