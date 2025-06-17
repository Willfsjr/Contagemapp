
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
* Classe que representa a tabela ATUALIZA_ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ATUALIZA_ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.AtualizaEstoque")
@CronappTable(role=CronappTableRole.CLASS)
public class AtualizaEstoque implements Serializable {
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codi Psv")
    @Column(name = "CODI_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codiPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Psv")
    @Column(name = "DESC_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descPsv;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Dpt")
    @Column(name = "CODI_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiDpt;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Emp")
    @Column(name = "CODI_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiEmp;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Qte Total")
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double qteTotal;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contEst;


    /**
    * Construtor
    * @generated
    */
    public AtualizaEstoque(){
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
    public AtualizaEstoque setId(java.lang.String id) {
        this.id = id;
        return this;
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
    public AtualizaEstoque setCodiPsv(java.lang.String codiPsv) {
        this.codiPsv = codiPsv;
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
    public AtualizaEstoque setDescPsv(java.lang.String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public java.lang.Integer getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public AtualizaEstoque setCodiDpt(java.lang.Integer codiDpt) {
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
    public AtualizaEstoque setCodiEmp(java.lang.Integer codiEmp) {
        this.codiEmp = codiEmp;
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
    public AtualizaEstoque setQteTotal(java.lang.Double qteTotal) {
        this.qteTotal = qteTotal;
        return this;
    }
    /**
    * Obtém contEst
    * return contEst
    * @generated
    */
    public Contagem getContEst() {
        return this.contEst;
    }

    /**
    * Define contEst
    * @param contEst contEst
    * @generated
    */
    public AtualizaEstoque setContEst(Contagem contEst) {
        this.contEst = contEst;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AtualizaEstoque object = (AtualizaEstoque)obj;
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
