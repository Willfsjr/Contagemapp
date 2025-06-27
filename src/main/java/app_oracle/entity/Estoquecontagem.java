
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela ESTOQUECONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ESTOQUECONTAGEM\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.Estoquecontagem")
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
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private String codiPsv;


    /**
    * @generated
    */
    @Column(name = "CODI_DPT", nullable = false, unique = false, insertable=true, updatable=true)
        
        private Integer codiDpt;


    /**
    * @generated
    */
    @Column(name = "CODI_EMP", nullable = false, unique = false, insertable=true, updatable=true)
        
        private Integer codiEmp;


    /**
    * @generated
    */
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private String descPsv;


    /**
    * @generated
    */
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double qteTotal;


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
    public String getCodiPsv() {
        return this.codiPsv;
    }

    /**
    * Define codiPsv
    * @param codiPsv codiPsv
    * @generated
    */
    public Estoquecontagem setCodiPsv(String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public Integer getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public Estoquecontagem setCodiDpt(Integer codiDpt) {
        this.codiDpt = codiDpt;
        return this;
    }
    /**
    * Obtém codiEmp
    * return codiEmp
    * @generated
    */
    public Integer getCodiEmp() {
        return this.codiEmp;
    }

    /**
    * Define codiEmp
    * @param codiEmp codiEmp
    * @generated
    */
    public Estoquecontagem setCodiEmp(Integer codiEmp) {
        this.codiEmp = codiEmp;
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
    public Estoquecontagem setDescPsv(String descPsv) {
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
    public Estoquecontagem setQteTotal(Double qteTotal) {
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
