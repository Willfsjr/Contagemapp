
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela DEPOSITO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"DEPOSITO\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.DEPOSITO")
public class DEPOSITO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "CODI_DPT", nullable = false, insertable=true, updatable=true)
        private Integer CODI_DPT;


    /**
    * @generated
    */
    @Column(name = "AFAT_DPT", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AFAT_DPT;


    /**
    * @generated
    */
    @Column(name = "CODIPESLANREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODIPESLANREG;


    /**
    * @generated
    */
    @Column(name = "CODIPESMANUTREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODIPESMANUTREG;


    /**
    * @generated
    */
    @Column(name = "CODI_PSV", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private String CODI_PSV;


    /**
    * @generated
    */
    @Column(name = "CODI_TRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_TRA;


    /**
    * @generated
    */
    @Column(name = "CUAE_DPT", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String CUAE_DPT;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @Column(name = "DESC_DPT", nullable = false, unique = false, length=65, insertable=true, updatable=true)
        
        private String DESC_DPT;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DINSERT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DINSERT;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DTIN_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DTIN_DPT;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DTSYNCAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DTSYNCAPI;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DUMANUT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DUMANUT;


    /**
    * @generated
    */
    @Column(name = "RETE_DPT", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double RETE_DPT;


    /**
    * @generated
    */
    @Column(name = "SITU_DPT", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String SITU_DPT;


    /**
    * @generated
    */
    @Column(name = "UUMANUT", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private String UUMANUT;


    /**
    * Construtor
    * @generated
    */
    public DEPOSITO(){
    }

    /**
    * Obtém CODI_DPT
    * return CODI_DPT
    * @generated
    */
    public Integer getCODI_DPT() {
        return this.CODI_DPT;
    }

    /**
    * Define CODI_DPT
    * @param CODI_DPT CODI_DPT
    * @generated
    */
    public DEPOSITO setCODI_DPT(Integer CODI_DPT) {
        this.CODI_DPT = CODI_DPT;
        return this;
    }
    /**
    * Obtém AFAT_DPT
    * return AFAT_DPT
    * @generated
    */
    public String getAFAT_DPT() {
        return this.AFAT_DPT;
    }

    /**
    * Define AFAT_DPT
    * @param AFAT_DPT AFAT_DPT
    * @generated
    */
    public DEPOSITO setAFAT_DPT(String AFAT_DPT) {
        this.AFAT_DPT = AFAT_DPT;
        return this;
    }
    /**
    * Obtém CODIPESLANREG
    * return CODIPESLANREG
    * @generated
    */
    public Integer getCODIPESLANREG() {
        return this.CODIPESLANREG;
    }

    /**
    * Define CODIPESLANREG
    * @param CODIPESLANREG CODIPESLANREG
    * @generated
    */
    public DEPOSITO setCODIPESLANREG(Integer CODIPESLANREG) {
        this.CODIPESLANREG = CODIPESLANREG;
        return this;
    }
    /**
    * Obtém CODIPESMANUTREG
    * return CODIPESMANUTREG
    * @generated
    */
    public Integer getCODIPESMANUTREG() {
        return this.CODIPESMANUTREG;
    }

    /**
    * Define CODIPESMANUTREG
    * @param CODIPESMANUTREG CODIPESMANUTREG
    * @generated
    */
    public DEPOSITO setCODIPESMANUTREG(Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CODI_PSV
    * return CODI_PSV
    * @generated
    */
    public String getCODI_PSV() {
        return this.CODI_PSV;
    }

    /**
    * Define CODI_PSV
    * @param CODI_PSV CODI_PSV
    * @generated
    */
    public DEPOSITO setCODI_PSV(String CODI_PSV) {
        this.CODI_PSV = CODI_PSV;
        return this;
    }
    /**
    * Obtém CODI_TRA
    * return CODI_TRA
    * @generated
    */
    public Integer getCODI_TRA() {
        return this.CODI_TRA;
    }

    /**
    * Define CODI_TRA
    * @param CODI_TRA CODI_TRA
    * @generated
    */
    public DEPOSITO setCODI_TRA(Integer CODI_TRA) {
        this.CODI_TRA = CODI_TRA;
        return this;
    }
    /**
    * Obtém CUAE_DPT
    * return CUAE_DPT
    * @generated
    */
    public String getCUAE_DPT() {
        return this.CUAE_DPT;
    }

    /**
    * Define CUAE_DPT
    * @param CUAE_DPT CUAE_DPT
    * @generated
    */
    public DEPOSITO setCUAE_DPT(String CUAE_DPT) {
        this.CUAE_DPT = CUAE_DPT;
        return this;
    }
    /**
    * Obtém DATAULTIMASINCRONIZACAOAPI
    * return DATAULTIMASINCRONIZACAOAPI
    * @generated
    */
    public java.util.Date getDATAULTIMASINCRONIZACAOAPI() {
        return this.DATAULTIMASINCRONIZACAOAPI;
    }

    /**
    * Define DATAULTIMASINCRONIZACAOAPI
    * @param DATAULTIMASINCRONIZACAOAPI DATAULTIMASINCRONIZACAOAPI
    * @generated
    */
    public DEPOSITO setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DESC_DPT
    * return DESC_DPT
    * @generated
    */
    public String getDESC_DPT() {
        return this.DESC_DPT;
    }

    /**
    * Define DESC_DPT
    * @param DESC_DPT DESC_DPT
    * @generated
    */
    public DEPOSITO setDESC_DPT(String DESC_DPT) {
        this.DESC_DPT = DESC_DPT;
        return this;
    }
    /**
    * Obtém DINSERT
    * return DINSERT
    * @generated
    */
    public java.util.Date getDINSERT() {
        return this.DINSERT;
    }

    /**
    * Define DINSERT
    * @param DINSERT DINSERT
    * @generated
    */
    public DEPOSITO setDINSERT(java.util.Date DINSERT) {
        this.DINSERT = DINSERT;
        return this;
    }
    /**
    * Obtém DTIN_DPT
    * return DTIN_DPT
    * @generated
    */
    public java.util.Date getDTIN_DPT() {
        return this.DTIN_DPT;
    }

    /**
    * Define DTIN_DPT
    * @param DTIN_DPT DTIN_DPT
    * @generated
    */
    public DEPOSITO setDTIN_DPT(java.util.Date DTIN_DPT) {
        this.DTIN_DPT = DTIN_DPT;
        return this;
    }
    /**
    * Obtém DTSYNCAPI
    * return DTSYNCAPI
    * @generated
    */
    public java.util.Date getDTSYNCAPI() {
        return this.DTSYNCAPI;
    }

    /**
    * Define DTSYNCAPI
    * @param DTSYNCAPI DTSYNCAPI
    * @generated
    */
    public DEPOSITO setDTSYNCAPI(java.util.Date DTSYNCAPI) {
        this.DTSYNCAPI = DTSYNCAPI;
        return this;
    }
    /**
    * Obtém DUMANUT
    * return DUMANUT
    * @generated
    */
    public java.util.Date getDUMANUT() {
        return this.DUMANUT;
    }

    /**
    * Define DUMANUT
    * @param DUMANUT DUMANUT
    * @generated
    */
    public DEPOSITO setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém RETE_DPT
    * return RETE_DPT
    * @generated
    */
    public Double getRETE_DPT() {
        return this.RETE_DPT;
    }

    /**
    * Define RETE_DPT
    * @param RETE_DPT RETE_DPT
    * @generated
    */
    public DEPOSITO setRETE_DPT(Double RETE_DPT) {
        this.RETE_DPT = RETE_DPT;
        return this;
    }
    /**
    * Obtém SITU_DPT
    * return SITU_DPT
    * @generated
    */
    public String getSITU_DPT() {
        return this.SITU_DPT;
    }

    /**
    * Define SITU_DPT
    * @param SITU_DPT SITU_DPT
    * @generated
    */
    public DEPOSITO setSITU_DPT(String SITU_DPT) {
        this.SITU_DPT = SITU_DPT;
        return this;
    }
    /**
    * Obtém UUMANUT
    * return UUMANUT
    * @generated
    */
    public String getUUMANUT() {
        return this.UUMANUT;
    }

    /**
    * Define UUMANUT
    * @param UUMANUT UUMANUT
    * @generated
    */
    public DEPOSITO setUUMANUT(String UUMANUT) {
        this.UUMANUT = UUMANUT;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DEPOSITO object = (DEPOSITO)obj;
        if (CODI_DPT != null ? !CODI_DPT.equals(object.CODI_DPT) : object.CODI_DPT != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_DPT == null) ? 0 : CODI_DPT.hashCode());
        return result;
    }

}
