
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
* Classe que representa a tabela ATUALIZA_PRODUTO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ATUALIZA_PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.AtualizaProduto")
@CronappTable(role=CronappTableRole.CLASS)
public class AtualizaProduto implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Codi Bar")
    @Column(name = "CODI_BAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String codiBar;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Cust Tab")
    @Column(name = "CUST_TAB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double custTab;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contAtuProd;


    /**
    * Construtor
    * @generated
    */
    public AtualizaProduto(){
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
    public AtualizaProduto setId(java.lang.String id) {
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
    public AtualizaProduto setCodiPsv(java.lang.String codiPsv) {
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
    public AtualizaProduto setDescPsv(java.lang.String descPsv) {
        this.descPsv = descPsv;
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
    public AtualizaProduto setCodiBar(java.lang.String codiBar) {
        this.codiBar = codiBar;
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
    public AtualizaProduto setCustTab(java.lang.Double custTab) {
        this.custTab = custTab;
        return this;
    }
    /**
    * Obtém contAtuProd
    * return contAtuProd
    * @generated
    */
    public Contagem getContAtuProd() {
        return this.contAtuProd;
    }

    /**
    * Define contAtuProd
    * @param contAtuProd contAtuProd
    * @generated
    */
    public AtualizaProduto setContAtuProd(Contagem contAtuProd) {
        this.contAtuProd = contAtuProd;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AtualizaProduto object = (AtualizaProduto)obj;
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
