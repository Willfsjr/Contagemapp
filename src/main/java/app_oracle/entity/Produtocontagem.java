
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela PRODUTOCONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODUTOCONTAGEM\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.Produtocontagem")
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
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private String codiPsv;


    /**
    * @generated
    */
    @Column(name = "CODI_BAR", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private String codiBar;


    /**
    * @generated
    */
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiGpr;


    /**
    * @generated
    */
    @Column(name = "CODI_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiSbg;


    /**
    * @generated
    */
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double custTab;


    /**
    * @generated
    */
    @Column(name = "DESC_GPR", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String descGpr;


    /**
    * @generated
    */
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private String descPsv;


    /**
    * @generated
    */
    @Column(name = "DESC_SBG", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private String descSbg;


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
    public String getCodiPsv() {
        return this.codiPsv;
    }

    /**
    * Define codiPsv
    * @param codiPsv codiPsv
    * @generated
    */
    public Produtocontagem setCodiPsv(String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém codiBar
    * return codiBar
    * @generated
    */
    public String getCodiBar() {
        return this.codiBar;
    }

    /**
    * Define codiBar
    * @param codiBar codiBar
    * @generated
    */
    public Produtocontagem setCodiBar(String codiBar) {
        this.codiBar = codiBar;
        return this;
    }
    /**
    * Obtém codiGpr
    * return codiGpr
    * @generated
    */
    public Integer getCodiGpr() {
        return this.codiGpr;
    }

    /**
    * Define codiGpr
    * @param codiGpr codiGpr
    * @generated
    */
    public Produtocontagem setCodiGpr(Integer codiGpr) {
        this.codiGpr = codiGpr;
        return this;
    }
    /**
    * Obtém codiSbg
    * return codiSbg
    * @generated
    */
    public Integer getCodiSbg() {
        return this.codiSbg;
    }

    /**
    * Define codiSbg
    * @param codiSbg codiSbg
    * @generated
    */
    public Produtocontagem setCodiSbg(Integer codiSbg) {
        this.codiSbg = codiSbg;
        return this;
    }
    /**
    * Obtém custTab
    * return custTab
    * @generated
    */
    public Double getCustTab() {
        return this.custTab;
    }

    /**
    * Define custTab
    * @param custTab custTab
    * @generated
    */
    public Produtocontagem setCustTab(Double custTab) {
        this.custTab = custTab;
        return this;
    }
    /**
    * Obtém descGpr
    * return descGpr
    * @generated
    */
    public String getDescGpr() {
        return this.descGpr;
    }

    /**
    * Define descGpr
    * @param descGpr descGpr
    * @generated
    */
    public Produtocontagem setDescGpr(String descGpr) {
        this.descGpr = descGpr;
        return this;
    }
    /**
    * Obtém descPsv
    * return descPsv
    * @generated
    */
    public String getDescPsv() {
        return this.descPsv;
    }

    /**
    * Define descPsv
    * @param descPsv descPsv
    * @generated
    */
    public Produtocontagem setDescPsv(String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém descSbg
    * return descSbg
    * @generated
    */
    public String getDescSbg() {
        return this.descSbg;
    }

    /**
    * Define descSbg
    * @param descSbg descSbg
    * @generated
    */
    public Produtocontagem setDescSbg(String descSbg) {
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
