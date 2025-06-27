
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela GRUPO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"GRUPO\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.GRUPO")
public class GRUPO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "CODI_GPR", nullable = false, insertable=true, updatable=true)
        private Integer CODI_GPR;


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
    @Column(name = "CTAB_GPR", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double CTAB_GPR;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @Column(name = "DESC_GPR", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String DESC_GPR;


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
    @Column(name = "FTAB_GPR", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double FTAB_GPR;


    /**
    * @generated
    */
    @Column(name = "IVCD_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IVCD_GPR;


    /**
    * @generated
    */
    @Column(name = "IVD2_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IVD2_GPR;


    /**
    * @generated
    */
    @Column(name = "PVPC_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PVPC_GPR;


    /**
    * @generated
    */
    @Column(name = "QADC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer QADC_GPR;


    /**
    * @generated
    */
    @Column(name = "SITU_GPR", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String SITU_GPR;


    /**
    * @generated
    */
    @Column(name = "UADC_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UADC_GPR;


    /**
    * @generated
    */
    @Column(name = "UCVT_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UCVT_GPR;


    /**
    * Construtor
    * @generated
    */
    public GRUPO(){
    }

    /**
    * Obtém CODI_GPR
    * return CODI_GPR
    * @generated
    */
    public Integer getCODI_GPR() {
        return this.CODI_GPR;
    }

    /**
    * Define CODI_GPR
    * @param CODI_GPR CODI_GPR
    * @generated
    */
    public GRUPO setCODI_GPR(Integer CODI_GPR) {
        this.CODI_GPR = CODI_GPR;
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
    public GRUPO setCODIPESLANREG(Integer CODIPESLANREG) {
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
    public GRUPO setCODIPESMANUTREG(Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CTAB_GPR
    * return CTAB_GPR
    * @generated
    */
    public Double getCTAB_GPR() {
        return this.CTAB_GPR;
    }

    /**
    * Define CTAB_GPR
    * @param CTAB_GPR CTAB_GPR
    * @generated
    */
    public GRUPO setCTAB_GPR(Double CTAB_GPR) {
        this.CTAB_GPR = CTAB_GPR;
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
    public GRUPO setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DESC_GPR
    * return DESC_GPR
    * @generated
    */
    public String getDESC_GPR() {
        return this.DESC_GPR;
    }

    /**
    * Define DESC_GPR
    * @param DESC_GPR DESC_GPR
    * @generated
    */
    public GRUPO setDESC_GPR(String DESC_GPR) {
        this.DESC_GPR = DESC_GPR;
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
    public GRUPO setDINSERT(java.util.Date DINSERT) {
        this.DINSERT = DINSERT;
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
    public GRUPO setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public GRUPO setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém FTAB_GPR
    * return FTAB_GPR
    * @generated
    */
    public Double getFTAB_GPR() {
        return this.FTAB_GPR;
    }

    /**
    * Define FTAB_GPR
    * @param FTAB_GPR FTAB_GPR
    * @generated
    */
    public GRUPO setFTAB_GPR(Double FTAB_GPR) {
        this.FTAB_GPR = FTAB_GPR;
        return this;
    }
    /**
    * Obtém IVCD_GPR
    * return IVCD_GPR
    * @generated
    */
    public String getIVCD_GPR() {
        return this.IVCD_GPR;
    }

    /**
    * Define IVCD_GPR
    * @param IVCD_GPR IVCD_GPR
    * @generated
    */
    public GRUPO setIVCD_GPR(String IVCD_GPR) {
        this.IVCD_GPR = IVCD_GPR;
        return this;
    }
    /**
    * Obtém IVD2_GPR
    * return IVD2_GPR
    * @generated
    */
    public String getIVD2_GPR() {
        return this.IVD2_GPR;
    }

    /**
    * Define IVD2_GPR
    * @param IVD2_GPR IVD2_GPR
    * @generated
    */
    public GRUPO setIVD2_GPR(String IVD2_GPR) {
        this.IVD2_GPR = IVD2_GPR;
        return this;
    }
    /**
    * Obtém PVPC_GPR
    * return PVPC_GPR
    * @generated
    */
    public String getPVPC_GPR() {
        return this.PVPC_GPR;
    }

    /**
    * Define PVPC_GPR
    * @param PVPC_GPR PVPC_GPR
    * @generated
    */
    public GRUPO setPVPC_GPR(String PVPC_GPR) {
        this.PVPC_GPR = PVPC_GPR;
        return this;
    }
    /**
    * Obtém QADC_GPR
    * return QADC_GPR
    * @generated
    */
    public Integer getQADC_GPR() {
        return this.QADC_GPR;
    }

    /**
    * Define QADC_GPR
    * @param QADC_GPR QADC_GPR
    * @generated
    */
    public GRUPO setQADC_GPR(Integer QADC_GPR) {
        this.QADC_GPR = QADC_GPR;
        return this;
    }
    /**
    * Obtém SITU_GPR
    * return SITU_GPR
    * @generated
    */
    public String getSITU_GPR() {
        return this.SITU_GPR;
    }

    /**
    * Define SITU_GPR
    * @param SITU_GPR SITU_GPR
    * @generated
    */
    public GRUPO setSITU_GPR(String SITU_GPR) {
        this.SITU_GPR = SITU_GPR;
        return this;
    }
    /**
    * Obtém UADC_GPR
    * return UADC_GPR
    * @generated
    */
    public String getUADC_GPR() {
        return this.UADC_GPR;
    }

    /**
    * Define UADC_GPR
    * @param UADC_GPR UADC_GPR
    * @generated
    */
    public GRUPO setUADC_GPR(String UADC_GPR) {
        this.UADC_GPR = UADC_GPR;
        return this;
    }
    /**
    * Obtém UCVT_GPR
    * return UCVT_GPR
    * @generated
    */
    public String getUCVT_GPR() {
        return this.UCVT_GPR;
    }

    /**
    * Define UCVT_GPR
    * @param UCVT_GPR UCVT_GPR
    * @generated
    */
    public GRUPO setUCVT_GPR(String UCVT_GPR) {
        this.UCVT_GPR = UCVT_GPR;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
GRUPO object = (GRUPO)obj;
        if (CODI_GPR != null ? !CODI_GPR.equals(object.CODI_GPR) : object.CODI_GPR != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_GPR == null) ? 0 : CODI_GPR.hashCode());
        return result;
    }

}
