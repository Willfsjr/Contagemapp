
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
* Classe que representa a tabela ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Estoque")
@CronappTable(role=CronappTableRole.CLASS)
public class Estoque implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Codigo do Produto")
    @Column(name = "codPsv", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="Codigo do Deposito")
    @Column(name = "codiDpt", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long codiDpt;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codigo da Empresa")
    @Column(name = "codiEmp", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiEmp;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descrição do Produto")
    @Column(name = "descPsv", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Quantidade")
    @Column(name = "qteTotal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double qteTotal;


    /**
    * Construtor
    * @generated
    */
    public Estoque(){
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
    public Estoque setId(java.lang.String id) {
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
    public Estoque setCodPsv(java.lang.String codPsv) {
        this.codPsv = codPsv;
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
    public Estoque setCodiDpt(java.lang.Long codiDpt) {
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
    public Estoque setCodiEmp(java.lang.Integer codiEmp) {
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
    public Estoque setDescPsv(java.lang.String descPsv) {
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
    public Estoque setQteTotal(java.lang.Double qteTotal) {
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
Estoque object = (Estoque)obj;
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
