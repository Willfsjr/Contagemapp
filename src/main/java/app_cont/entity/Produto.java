
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
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
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
    @Column(name = "ID", nullable = false, length=0, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codi Prod")
    @Column(name = "CODI_PROD", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String codiProd;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Prod")
    @Column(name = "DESC_PROD", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String descProd;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codi Bar")
    @Column(name = "CODI_BAR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String codiBar;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Cust Tab")
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private java.lang.Double custTab;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_SUBGRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private SubGrupo sbgProd;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contProd;


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
    * Obtém codiProd
    * return codiProd
    * @generated
    */
    public java.lang.String getCodiProd() {
        return this.codiProd;
    }

    /**
    * Define codiProd
    * @param codiProd codiProd
    * @generated
    */
    public Produto setCodiProd(java.lang.String codiProd) {
        this.codiProd = codiProd;
        return this;
    }
    /**
    * Obtém descProd
    * return descProd
    * @generated
    */
    public java.lang.String getDescProd() {
        return this.descProd;
    }

    /**
    * Define descProd
    * @param descProd descProd
    * @generated
    */
    public Produto setDescProd(java.lang.String descProd) {
        this.descProd = descProd;
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
    public Produto setCodiBar(java.lang.String codiBar) {
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
    public Produto setCustTab(java.lang.Double custTab) {
        this.custTab = custTab;
        return this;
    }
    /**
    * Obtém sbgProd
    * return sbgProd
    * @generated
    */
    public SubGrupo getSbgProd() {
        return this.sbgProd;
    }

    /**
    * Define sbgProd
    * @param sbgProd sbgProd
    * @generated
    */
    public Produto setSbgProd(SubGrupo sbgProd) {
        this.sbgProd = sbgProd;
        return this;
    }
    /**
    * Obtém contProd
    * return contProd
    * @generated
    */
    public Contagem getContProd() {
        return this.contProd;
    }

    /**
    * Define contProd
    * @param contProd contProd
    * @generated
    */
    public Produto setContProd(Contagem contProd) {
        this.contProd = contProd;
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
