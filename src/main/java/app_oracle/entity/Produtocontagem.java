
package app_oracle.entity;

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
* Classe que representa a tabela PRODUTOCONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODUTOCONTAGEM\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.Produtocontagem")
@CronappTable(role=CronappTableRole.CLASS)
public class Produtocontagem implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Codi Psv")
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private java.lang.String codiPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codi Bar")
    @Column(name = "CODI_BAR", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String codiBar;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Gpr")
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiGpr;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Sbg")
    @Column(name = "CODI_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiSbg;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Cust Tab")
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double custTab;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Gpr")
    @Column(name = "DESC_GPR", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String descGpr;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Psv")
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String descPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Sbg")
    @Column(name = "DESC_SBG", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String descSbg;


    /**
    * Construtor
    * @generated
    */
    public Produtocontagem(){
    }

    /**
    * Obtém codiPsv
    * return codiPsv
    * @generated
    */
    public java.lang.String getCodiPsv() {
        return this.codiPsv;
    }

    /**
    * Define codiPsv
    * @param codiPsv codiPsv
    * @generated
    */
    public Produtocontagem setCodiPsv(java.lang.String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém codiBar
    * return codiBar
    * @generated
    */
    public java.lang.String getCodiBar() {
        return this.codiBar;
    }

    /**
    * Define codiBar
    * @param codiBar codiBar
    * @generated
    */
    public Produtocontagem setCodiBar(java.lang.String codiBar) {
        this.codiBar = codiBar;
        return this;
    }
    /**
    * Obtém codiGpr
    * return codiGpr
    * @generated
    */
    public java.lang.Integer getCodiGpr() {
        return this.codiGpr;
    }

    /**
    * Define codiGpr
    * @param codiGpr codiGpr
    * @generated
    */
    public Produtocontagem setCodiGpr(java.lang.Integer codiGpr) {
        this.codiGpr = codiGpr;
        return this;
    }
    /**
    * Obtém codiSbg
    * return codiSbg
    * @generated
    */
    public java.lang.Integer getCodiSbg() {
        return this.codiSbg;
    }

    /**
    * Define codiSbg
    * @param codiSbg codiSbg
    * @generated
    */
    public Produtocontagem setCodiSbg(java.lang.Integer codiSbg) {
        this.codiSbg = codiSbg;
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
    public Produtocontagem setCustTab(java.lang.Double custTab) {
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
    public Produtocontagem setDescGpr(java.lang.String descGpr) {
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
    public Produtocontagem setDescPsv(java.lang.String descPsv) {
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
    public Produtocontagem setDescSbg(java.lang.String descSbg) {
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
Produtocontagem object = (Produtocontagem)obj;
        if (codiPsv != null ? !codiPsv.equals(object.codiPsv) : object.codiPsv != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((codiPsv == null) ? 0 : codiPsv.hashCode());
        return result;
    }

}
