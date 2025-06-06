
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
* Classe que representa a tabela PRODUTO2
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODUTO2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Produto2")
@CronappTable(role=CronappTableRole.CLASS)
public class Produto2 implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Codi Prod 2")
    @Column(name = "CODI_PROD2", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String codiProd2;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Prod 2")
    @Column(name = "DESC_PROD2", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String descProd2;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Codi Bar 2")
    @Column(name = "CODI_BAR2", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String codiBar2;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Cust Tab 2")
    @Column(name = "CUST_TAB2", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private java.lang.Double custTab2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_GRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Grupo gprProd2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_SUBGRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private SubGrupo sbgProd2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contProd2;


    /**
    * Construtor
    * @generated
    */
    public Produto2(){
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
    public Produto2 setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiProd2
    * return codiProd2
    * @generated
    */
    public java.lang.String getCodiProd2() {
        return this.codiProd2;
    }

    /**
    * Define codiProd2
    * @param codiProd2 codiProd2
    * @generated
    */
    public Produto2 setCodiProd2(java.lang.String codiProd2) {
        this.codiProd2 = codiProd2;
        return this;
    }
    /**
    * Obtém descProd2
    * return descProd2
    * @generated
    */
    public java.lang.String getDescProd2() {
        return this.descProd2;
    }

    /**
    * Define descProd2
    * @param descProd2 descProd2
    * @generated
    */
    public Produto2 setDescProd2(java.lang.String descProd2) {
        this.descProd2 = descProd2;
        return this;
    }
    /**
    * Obtém codiBar2
    * return codiBar2
    * @generated
    */
    public java.lang.String getCodiBar2() {
        return this.codiBar2;
    }

    /**
    * Define codiBar2
    * @param codiBar2 codiBar2
    * @generated
    */
    public Produto2 setCodiBar2(java.lang.String codiBar2) {
        this.codiBar2 = codiBar2;
        return this;
    }
    /**
    * Obtém custTab2
    * return custTab2
    * @generated
    */
    public java.lang.Double getCustTab2() {
        return this.custTab2;
    }

    /**
    * Define custTab2
    * @param custTab2 custTab2
    * @generated
    */
    public Produto2 setCustTab2(java.lang.Double custTab2) {
        this.custTab2 = custTab2;
        return this;
    }
    /**
    * Obtém gprProd2
    * return gprProd2
    * @generated
    */
    public Grupo getGprProd2() {
        return this.gprProd2;
    }

    /**
    * Define gprProd2
    * @param gprProd2 gprProd2
    * @generated
    */
    public Produto2 setGprProd2(Grupo gprProd2) {
        this.gprProd2 = gprProd2;
        return this;
    }
    /**
    * Obtém sbgProd2
    * return sbgProd2
    * @generated
    */
    public SubGrupo getSbgProd2() {
        return this.sbgProd2;
    }

    /**
    * Define sbgProd2
    * @param sbgProd2 sbgProd2
    * @generated
    */
    public Produto2 setSbgProd2(SubGrupo sbgProd2) {
        this.sbgProd2 = sbgProd2;
        return this;
    }
    /**
    * Obtém contProd2
    * return contProd2
    * @generated
    */
    public Contagem getContProd2() {
        return this.contProd2;
    }

    /**
    * Define contProd2
    * @param contProd2 contProd2
    * @generated
    */
    public Produto2 setContProd2(Contagem contProd2) {
        this.contProd2 = contProd2;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Produto2 object = (Produto2)obj;
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
