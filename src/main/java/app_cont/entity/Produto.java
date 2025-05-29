
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
@IdClass(ProdutoPK.class)
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
    @JoinColumn(name="contagem", nullable = false, referencedColumnName = "loja", insertable=true, updatable=true)
        private Contagem contagem;


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
    * Construtor
    * @generated
    */
    public Produto(){
    }

    /**
    * Obtém contagem
    * return contagem
    * @generated
    */
    public Contagem getContagem() {
        return this.contagem;
    }

    /**
    * Define contagem
    * @param contagem contagem
    * @generated
    */
    public Produto setContagem(Contagem contagem) {
        this.contagem = contagem;
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
    public Produto setCodiPsv(java.lang.String codiPsv) {
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
    public Produto setDescPsv(java.lang.String descPsv) {
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
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Produto object = (Produto)obj;
        if (contagem != null ? !contagem.equals(object.contagem) : object.contagem != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((contagem == null) ? 0 : contagem.hashCode());
        return result;
    }

}
