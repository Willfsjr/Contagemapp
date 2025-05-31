
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
@CronappTable(role=CronappTableRole.AUTO)
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
    @CronappColumn(attributeType="STRING", label="CODI  PSV")
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private java.lang.String coDI_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  BAR")
    @Column(name = "CODI_BAR", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String coDI_BAR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CUST  TAB")
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double cuST_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DESC  PSV")
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String deSC_PSV;


    /**
    * Construtor
    * @generated
    */
    public Produtocontagem(){
    }

    /**
    * Obtém coDI_PSV
    * return coDI_PSV
    * @generated
    */
    public java.lang.String getCoDI_PSV() {
        return this.coDI_PSV;
    }

    /**
    * Define coDI_PSV
    * @param coDI_PSV coDI_PSV
    * @generated
    */
    public Produtocontagem setCoDI_PSV(java.lang.String coDI_PSV) {
        this.coDI_PSV = coDI_PSV;
        return this;
    }
    /**
    * Obtém coDI_BAR
    * return coDI_BAR
    * @generated
    */
    public java.lang.String getCoDI_BAR() {
        return this.coDI_BAR;
    }

    /**
    * Define coDI_BAR
    * @param coDI_BAR coDI_BAR
    * @generated
    */
    public Produtocontagem setCoDI_BAR(java.lang.String coDI_BAR) {
        this.coDI_BAR = coDI_BAR;
        return this;
    }
    /**
    * Obtém cuST_TAB
    * return cuST_TAB
    * @generated
    */
    public java.lang.Double getCuST_TAB() {
        return this.cuST_TAB;
    }

    /**
    * Define cuST_TAB
    * @param cuST_TAB cuST_TAB
    * @generated
    */
    public Produtocontagem setCuST_TAB(java.lang.Double cuST_TAB) {
        this.cuST_TAB = cuST_TAB;
        return this;
    }
    /**
    * Obtém deSC_PSV
    * return deSC_PSV
    * @generated
    */
    public java.lang.String getDeSC_PSV() {
        return this.deSC_PSV;
    }

    /**
    * Define deSC_PSV
    * @param deSC_PSV deSC_PSV
    * @generated
    */
    public Produtocontagem setDeSC_PSV(java.lang.String deSC_PSV) {
        this.deSC_PSV = deSC_PSV;
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
        if (coDI_PSV != null ? !coDI_PSV.equals(object.coDI_PSV) : object.coDI_PSV != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coDI_PSV == null) ? 0 : coDI_PSV.hashCode());
        return result;
    }

}
