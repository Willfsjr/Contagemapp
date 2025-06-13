
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
    @CronappColumn(attributeType="STRING", label="Codi Psv")
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private java.lang.String codiPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="Codi Dpt")
    @Column(name = "CODI_DPT", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long codiDpt;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Emp")
    @Column(name = "CODI_EMP", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiEmp;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Psv")
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String descPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Qte Total")
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double qteTotal;


    /**
    * Construtor
    * @generated
    */
    public Estoquecontagem(){
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
    public Estoquecontagem setCodiPsv(java.lang.String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public java.lang.Long getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public Estoquecontagem setCodiDpt(java.lang.Long codiDpt) {
        this.codiDpt = codiDpt;
        return this;
    }
    /**
    * Obtém codiEmp
    * return codiEmp
    * @generated
    */
    public java.lang.Integer getCodiEmp() {
        return this.codiEmp;
    }

    /**
    * Define codiEmp
    * @param codiEmp codiEmp
    * @generated
    */
    public Estoquecontagem setCodiEmp(java.lang.Integer codiEmp) {
        this.codiEmp = codiEmp;
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
    public Estoquecontagem setDescPsv(java.lang.String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém qteTotal
    * return qteTotal
    * @generated
    */
    public java.lang.Double getQteTotal() {
        return this.qteTotal;
    }

    /**
    * Define qteTotal
    * @param qteTotal qteTotal
    * @generated
    */
    public Estoquecontagem setQteTotal(java.lang.Double qteTotal) {
        this.qteTotal = qteTotal;
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
