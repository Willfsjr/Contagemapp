
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
* Classe que representa a tabela CONFRONTO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CONFRONTO\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Confronto")
public class Confronto implements Serializable {
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
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double qteTotal;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contConf;


    /**
    * @generated
    */
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiGpr;


    /**
    * @generated
    */
    @Column(name = "DESC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descGpr;


    /**
    * @generated
    */
    @Column(name = "CODI_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiSbg;


    /**
    * @generated
    */
    @Column(name = "DESC_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descSgb;


    /**
    * @generated
    */
    @Column(name = "QUANT_CONF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double quantConf;


    /**
    * @generated
    */
    @Column(name = "CUST_TAB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double custTab;


    /**
    * Construtor
    * @generated
    */
    public Confronto(){
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
    public Confronto setId(String id) {
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
    public Confronto setCodiPsv(String codiPsv) {
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
    public Confronto setDescPsv(String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém qteTotal
    * return qteTotal
    * @generated
    */
    public Double getQteTotal() {
        return this.qteTotal;
    }

    /**
    * Define qteTotal
    * @param qteTotal qteTotal
    * @generated
    */
    public Confronto setQteTotal(Double qteTotal) {
        this.qteTotal = qteTotal;
        return this;
    }
    /**
    * Obtém contConf
    * return contConf
    * @generated
    */
    public Contagem getContConf() {
        return this.contConf;
    }

    /**
    * Define contConf
    * @param contConf contConf
    * @generated
    */
    public Confronto setContConf(Contagem contConf) {
        this.contConf = contConf;
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
    public Confronto setCodiGpr(Integer codiGpr) {
        this.codiGpr = codiGpr;
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
    public Confronto setDescGpr(String descGpr) {
        this.descGpr = descGpr;
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
    public Confronto setCodiSbg(Integer codiSbg) {
        this.codiSbg = codiSbg;
        return this;
    }
    /**
    * Obtém descSgb
    * return descSgb
    * @generated
    */
    public String getDescSgb() {
        return this.descSgb;
    }

    /**
    * Define descSgb
    * @param descSgb descSgb
    * @generated
    */
    public Confronto setDescSgb(String descSgb) {
        this.descSgb = descSgb;
        return this;
    }
    /**
    * Obtém quantConf
    * return quantConf
    * @generated
    */
    public Double getQuantConf() {
        return this.quantConf;
    }

    /**
    * Define quantConf
    * @param quantConf quantConf
    * @generated
    */
    public Confronto setQuantConf(Double quantConf) {
        this.quantConf = quantConf;
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
    public Confronto setCustTab(Double custTab) {
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
Confronto object = (Confronto)obj;
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
