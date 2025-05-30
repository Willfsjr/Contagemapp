
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
* Classe que representa a tabela ESTOQUECONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ESTOQUECONTAGEM\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.Estoquecontagem")
@CronappTable(role=CronappTableRole.AUTO)
public class Estoquecontagem implements Serializable {
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
    @CronappColumn(attributeType="LONG", label="CODI  DPT")
    @Column(name = "CODI_DPT", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long coDI_DPT;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  EMP")
    @Column(name = "CODI_EMP", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coDI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DESC  PSV")
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String deSC_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="QTE  TOTAL")
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double qtE_TOTAL;


    /**
    * Construtor
    * @generated
    */
    public Estoquecontagem(){
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
    public Estoquecontagem setCoDI_PSV(java.lang.String coDI_PSV) {
        this.coDI_PSV = coDI_PSV;
        return this;
    }
    /**
    * Obtém coDI_DPT
    * return coDI_DPT
    * @generated
    */
    public java.lang.Long getCoDI_DPT() {
        return this.coDI_DPT;
    }

    /**
    * Define coDI_DPT
    * @param coDI_DPT coDI_DPT
    * @generated
    */
    public Estoquecontagem setCoDI_DPT(java.lang.Long coDI_DPT) {
        this.coDI_DPT = coDI_DPT;
        return this;
    }
    /**
    * Obtém coDI_EMP
    * return coDI_EMP
    * @generated
    */
    public java.lang.Integer getCoDI_EMP() {
        return this.coDI_EMP;
    }

    /**
    * Define coDI_EMP
    * @param coDI_EMP coDI_EMP
    * @generated
    */
    public Estoquecontagem setCoDI_EMP(java.lang.Integer coDI_EMP) {
        this.coDI_EMP = coDI_EMP;
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
    public Estoquecontagem setDeSC_PSV(java.lang.String deSC_PSV) {
        this.deSC_PSV = deSC_PSV;
        return this;
    }
    /**
    * Obtém qtE_TOTAL
    * return qtE_TOTAL
    * @generated
    */
    public java.lang.Double getQtE_TOTAL() {
        return this.qtE_TOTAL;
    }

    /**
    * Define qtE_TOTAL
    * @param qtE_TOTAL qtE_TOTAL
    * @generated
    */
    public Estoquecontagem setQtE_TOTAL(java.lang.Double qtE_TOTAL) {
        this.qtE_TOTAL = qtE_TOTAL;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Estoquecontagem object = (Estoquecontagem)obj;
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
