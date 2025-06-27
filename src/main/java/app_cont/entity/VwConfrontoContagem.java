
package app_cont.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela vw_confronto_contagem
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"vw_confronto_contagem\"", schema="\"contdb_dev\"")
@XmlRootElement
@JsonFilter("app_cont.entity.VwConfrontoContagem")
public class VwConfrontoContagem implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "codi_psv", nullable = false, length=255, insertable=true, updatable=true)
        private String codiPsv;


    /**
    * @generated
    */
    @Column(name = "contagem_form1_id", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String contagemForm1Id;


    /**
    * @generated
    */
    @Column(name = "contagem_form2_id", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String contagemForm2Id;


    /**
    * @generated
    */
    @Column(name = "desc_psv", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String descPsv;


    /**
    * @generated
    */
    @Column(name = "quant_form1", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private Double quantForm1;


    /**
    * @generated
    */
    @Column(name = "quant_form2", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private Double quantForm2;


    /**
    * Construtor
    * @generated
    */
    public VwConfrontoContagem(){
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
    public VwConfrontoContagem setCodiPsv(String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém contagemForm1Id
    * return contagemForm1Id
    * @generated
    */
    public String getContagemForm1Id() {
        return this.contagemForm1Id;
    }

    /**
    * Define contagemForm1Id
    * @param contagemForm1Id contagemForm1Id
    * @generated
    */
    public VwConfrontoContagem setContagemForm1Id(String contagemForm1Id) {
        this.contagemForm1Id = contagemForm1Id;
        return this;
    }
    /**
    * Obtém contagemForm2Id
    * return contagemForm2Id
    * @generated
    */
    public String getContagemForm2Id() {
        return this.contagemForm2Id;
    }

    /**
    * Define contagemForm2Id
    * @param contagemForm2Id contagemForm2Id
    * @generated
    */
    public VwConfrontoContagem setContagemForm2Id(String contagemForm2Id) {
        this.contagemForm2Id = contagemForm2Id;
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
    public VwConfrontoContagem setDescPsv(String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém quantForm1
    * return quantForm1
    * @generated
    */
    public Double getQuantForm1() {
        return this.quantForm1;
    }

    /**
    * Define quantForm1
    * @param quantForm1 quantForm1
    * @generated
    */
    public VwConfrontoContagem setQuantForm1(Double quantForm1) {
        this.quantForm1 = quantForm1;
        return this;
    }
    /**
    * Obtém quantForm2
    * return quantForm2
    * @generated
    */
    public Double getQuantForm2() {
        return this.quantForm2;
    }

    /**
    * Define quantForm2
    * @param quantForm2 quantForm2
    * @generated
    */
    public VwConfrontoContagem setQuantForm2(Double quantForm2) {
        this.quantForm2 = quantForm2;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
VwConfrontoContagem object = (VwConfrontoContagem)obj;
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
