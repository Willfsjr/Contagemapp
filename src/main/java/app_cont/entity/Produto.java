
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
* Classe que representa a tabela PRODUTO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Produto")
@CronappTable(role=CronappTableRole.CLASS)
public class Produto implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Codigo")
    @Column(name = "codPsv", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codigo de Barra")
    @Column(name = "codBar", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codBar;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="Codigo do Grupo")
    @Column(name = "codGpr", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long codGpr;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="Codido do Sub-Grupo")
    @Column(name = "codSbg", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long codSbg;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Custo da Tabela de Preço")
    @Column(name = "custTab", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double custTab;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descrição do Grupo")
    @Column(name = "descGpr", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descGpr;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Psv")
    @Column(name = "descPsv", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descrição do Sub-Grupo")
    @Column(name = "descSbg", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descSbg;


    /**
    * Construtor
    * @generated
    */
    public Produto(){
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
    public Produto setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codPsv
    * return codPsv
    * @generated
    */
    public java.lang.String getCodPsv() {
        return this.codPsv;
    }

    /**
    * Define codPsv
    * @param codPsv codPsv
    * @generated
    */
    public Produto setCodPsv(java.lang.String codPsv) {
        this.codPsv = codPsv;
        return this;
    }
    /**
    * Obtém codBar
    * return codBar
    * @generated
    */
    public java.lang.String getCodBar() {
        return this.codBar;
    }

    /**
    * Define codBar
    * @param codBar codBar
    * @generated
    */
    public Produto setCodBar(java.lang.String codBar) {
        this.codBar = codBar;
        return this;
    }
    /**
    * Obtém codGpr
    * return codGpr
    * @generated
    */
    public java.lang.Long getCodGpr() {
        return this.codGpr;
    }

    /**
    * Define codGpr
    * @param codGpr codGpr
    * @generated
    */
    public Produto setCodGpr(java.lang.Long codGpr) {
        this.codGpr = codGpr;
        return this;
    }
    /**
    * Obtém codSbg
    * return codSbg
    * @generated
    */
    public java.lang.Long getCodSbg() {
        return this.codSbg;
    }

    /**
    * Define codSbg
    * @param codSbg codSbg
    * @generated
    */
    public Produto setCodSbg(java.lang.Long codSbg) {
        this.codSbg = codSbg;
        return this;
    }
    /**
    * Obtém custTab
    * return custTab
    * @generated
    */
    public java.lang.Double getCustTab() {
        return this.custTab;
    }

    /**
    * Define custTab
    * @param custTab custTab
    * @generated
    */
    public Produto setCustTab(java.lang.Double custTab) {
        this.custTab = custTab;
        return this;
    }
    /**
    * Obtém descGpr
    * return descGpr
    * @generated
    */
    public java.lang.String getDescGpr() {
        return this.descGpr;
    }

    /**
    * Define descGpr
    * @param descGpr descGpr
    * @generated
    */
    public Produto setDescGpr(java.lang.String descGpr) {
        this.descGpr = descGpr;
        return this;
    }
    /**
    * Obtém descPsv
    * return descPsv
    * @generated
    */
    public java.lang.String getDescPsv() {
        return this.descPsv;
    }

    /**
    * Define descPsv
    * @param descPsv descPsv
    * @generated
    */
    public Produto setDescPsv(java.lang.String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém descSbg
    * return descSbg
    * @generated
    */
    public java.lang.String getDescSbg() {
        return this.descSbg;
    }

    /**
    * Define descSbg
    * @param descSbg descSbg
    * @generated
    */
    public Produto setDescSbg(java.lang.String descSbg) {
        this.descSbg = descSbg;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Produto object = (Produto)obj;
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
