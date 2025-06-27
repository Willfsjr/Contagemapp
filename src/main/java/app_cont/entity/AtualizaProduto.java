
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;




/**
* Classe que representa a tabela ATUALIZA_PRODUTO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ATUALIZA_PRODUTO\"")
@XmlRootElement
@JsonFilter("app_cont.entity.AtualizaProduto")
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "CODI_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String codiPsv;


    /**
    * @generated
    */
    @Column(name = "DESC_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descPsv;


    /**
    * @generated
    */
    @Column(name = "CODI_BAR", nullable = true, unique = false, insertable=true, updatable=true)
        
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
    @Column(name = "CUST_TAB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double custTab;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contAtuProd;


    /**
    * @generated
    */
    @Column(name = "DESC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descGpr;


    /**
    * @generated
    */
    @Column(name = "DESC_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descSbg;


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
    public String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public AtualizaProduto setId(String id) {
        this.id = id;
        return this;
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
    public AtualizaProduto setCodiPsv(String codiPsv) {
        this.codiPsv = codiPsv;
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
    public AtualizaProduto setDescPsv(String descPsv) {
        this.descPsv = descPsv;
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
    public AtualizaProduto setCodiBar(String codiBar) {
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
    public AtualizaProduto setCodiGpr(Integer codiGpr) {
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
    public AtualizaProduto setCodiSbg(Integer codiSbg) {
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
    public AtualizaProduto setCustTab(Double custTab) {
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
    public AtualizaProduto setDescGpr(String descGpr) {
        this.descGpr = descGpr;
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
    public AtualizaProduto setDescSbg(String descSbg) {
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
