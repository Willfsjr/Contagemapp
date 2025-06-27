
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela TABELA
* @generated
*/
@jakarta.persistence.Entity
@IdClass(TABELAPK.class)
@jakarta.persistence.Table(name = "\"TABELA\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.TABELA")
public class TABELA implements Serializable {
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
        private String CODI_PSV;

    /**
    * @generated
    */
    @Id
    @Column(name = "TABE_CTA", nullable = false, insertable=true, updatable=true)
        private Integer TABE_CTA;



    /**
    * @generated
    */
    @Column(name = "AACR_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double AACR_TAB;


    /**
    * @generated
    */
    @Column(name = "ABAS_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double ABAS_TAB;


    /**
    * @generated
    */
    @Column(name = "ACRE_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double ACRE_TAB;


    /**
    * @generated
    */
    @Column(name = "ADES_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double ADES_TAB;


    /**
    * @generated
    */
    @Column(name = "BASI_TAB", nullable = false, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double BASI_TAB;


    /**
    * @generated
    */
    @Column(name = "CHEK_TAB", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String CHEK_TAB;


    /**
    * @generated
    */
    @Column(name = "CICL_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String CICL_TAB;


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
    @Column(name = "COMI_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double COMI_TAB;


    /**
    * @generated
    */
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double CUST_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @Column(name = "DESC_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double DESC_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DINSERT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DINSERT;


    /**
    * @generated
    */
    @Column(name = "DMOF_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double DMOF_TAB;


    /**
    * @generated
    */
    @Column(name = "DSCT_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String DSCT_TAB;


    /**
    * @generated
    */
    @Column(name = "DSOF_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double DSOF_TAB;


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
    @Column(name = "MARG_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MARG_TAB;


    /**
    * @generated
    */
    @Column(name = "MKP_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MKP_TAB;


    /**
    * @generated
    */
    @Column(name = "PACR_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double PACR_TAB;


    /**
    * @generated
    */
    @Column(name = "PDES_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double PDES_TAB;


    /**
    * @generated
    */
    @Column(name = "QMIN_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double QMIN_TAB;


    /**
    * @generated
    */
    @Column(name = "QTDC_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double QTDC_TAB;


    /**
    * @generated
    */
    @Column(name = "RIVC_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String RIVC_TAB;


    /**
    * @generated
    */
    @Column(name = "SITU_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SITU_TAB;


    /**
    * @generated
    */
    @Column(name = "TCUS_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String TCUS_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VCDO_TAB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date VCDO_TAB;


    /**
    * @generated
    */
    @Column(name = "VLOH_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double VLOH_TAB;


    /**
    * Construtor
    * @generated
    */
    public TABELA(){
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
    public TABELA setCODI_PSV(String CODI_PSV) {
        this.CODI_PSV = CODI_PSV;
        return this;
    }
    /**
    * Obtém TABE_CTA
    * return TABE_CTA
    * @generated
    */
    public Integer getTABE_CTA() {
        return this.TABE_CTA;
    }

    /**
    * Define TABE_CTA
    * @param TABE_CTA TABE_CTA
    * @generated
    */
    public TABELA setTABE_CTA(Integer TABE_CTA) {
        this.TABE_CTA = TABE_CTA;
        return this;
    }
    /**
    * Obtém AACR_TAB
    * return AACR_TAB
    * @generated
    */
    public Double getAACR_TAB() {
        return this.AACR_TAB;
    }

    /**
    * Define AACR_TAB
    * @param AACR_TAB AACR_TAB
    * @generated
    */
    public TABELA setAACR_TAB(Double AACR_TAB) {
        this.AACR_TAB = AACR_TAB;
        return this;
    }
    /**
    * Obtém ABAS_TAB
    * return ABAS_TAB
    * @generated
    */
    public Double getABAS_TAB() {
        return this.ABAS_TAB;
    }

    /**
    * Define ABAS_TAB
    * @param ABAS_TAB ABAS_TAB
    * @generated
    */
    public TABELA setABAS_TAB(Double ABAS_TAB) {
        this.ABAS_TAB = ABAS_TAB;
        return this;
    }
    /**
    * Obtém ACRE_TAB
    * return ACRE_TAB
    * @generated
    */
    public Double getACRE_TAB() {
        return this.ACRE_TAB;
    }

    /**
    * Define ACRE_TAB
    * @param ACRE_TAB ACRE_TAB
    * @generated
    */
    public TABELA setACRE_TAB(Double ACRE_TAB) {
        this.ACRE_TAB = ACRE_TAB;
        return this;
    }
    /**
    * Obtém ADES_TAB
    * return ADES_TAB
    * @generated
    */
    public Double getADES_TAB() {
        return this.ADES_TAB;
    }

    /**
    * Define ADES_TAB
    * @param ADES_TAB ADES_TAB
    * @generated
    */
    public TABELA setADES_TAB(Double ADES_TAB) {
        this.ADES_TAB = ADES_TAB;
        return this;
    }
    /**
    * Obtém BASI_TAB
    * return BASI_TAB
    * @generated
    */
    public Double getBASI_TAB() {
        return this.BASI_TAB;
    }

    /**
    * Define BASI_TAB
    * @param BASI_TAB BASI_TAB
    * @generated
    */
    public TABELA setBASI_TAB(Double BASI_TAB) {
        this.BASI_TAB = BASI_TAB;
        return this;
    }
    /**
    * Obtém CHEK_TAB
    * return CHEK_TAB
    * @generated
    */
    public String getCHEK_TAB() {
        return this.CHEK_TAB;
    }

    /**
    * Define CHEK_TAB
    * @param CHEK_TAB CHEK_TAB
    * @generated
    */
    public TABELA setCHEK_TAB(String CHEK_TAB) {
        this.CHEK_TAB = CHEK_TAB;
        return this;
    }
    /**
    * Obtém CICL_TAB
    * return CICL_TAB
    * @generated
    */
    public String getCICL_TAB() {
        return this.CICL_TAB;
    }

    /**
    * Define CICL_TAB
    * @param CICL_TAB CICL_TAB
    * @generated
    */
    public TABELA setCICL_TAB(String CICL_TAB) {
        this.CICL_TAB = CICL_TAB;
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
    public TABELA setCODIPESLANREG(Integer CODIPESLANREG) {
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
    public TABELA setCODIPESMANUTREG(Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém COMI_TAB
    * return COMI_TAB
    * @generated
    */
    public Double getCOMI_TAB() {
        return this.COMI_TAB;
    }

    /**
    * Define COMI_TAB
    * @param COMI_TAB COMI_TAB
    * @generated
    */
    public TABELA setCOMI_TAB(Double COMI_TAB) {
        this.COMI_TAB = COMI_TAB;
        return this;
    }
    /**
    * Obtém CUST_TAB
    * return CUST_TAB
    * @generated
    */
    public Double getCUST_TAB() {
        return this.CUST_TAB;
    }

    /**
    * Define CUST_TAB
    * @param CUST_TAB CUST_TAB
    * @generated
    */
    public TABELA setCUST_TAB(Double CUST_TAB) {
        this.CUST_TAB = CUST_TAB;
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
    public TABELA setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DESC_TAB
    * return DESC_TAB
    * @generated
    */
    public Double getDESC_TAB() {
        return this.DESC_TAB;
    }

    /**
    * Define DESC_TAB
    * @param DESC_TAB DESC_TAB
    * @generated
    */
    public TABELA setDESC_TAB(Double DESC_TAB) {
        this.DESC_TAB = DESC_TAB;
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
    public TABELA setDINSERT(java.util.Date DINSERT) {
        this.DINSERT = DINSERT;
        return this;
    }
    /**
    * Obtém DMOF_TAB
    * return DMOF_TAB
    * @generated
    */
    public Double getDMOF_TAB() {
        return this.DMOF_TAB;
    }

    /**
    * Define DMOF_TAB
    * @param DMOF_TAB DMOF_TAB
    * @generated
    */
    public TABELA setDMOF_TAB(Double DMOF_TAB) {
        this.DMOF_TAB = DMOF_TAB;
        return this;
    }
    /**
    * Obtém DSCT_TAB
    * return DSCT_TAB
    * @generated
    */
    public String getDSCT_TAB() {
        return this.DSCT_TAB;
    }

    /**
    * Define DSCT_TAB
    * @param DSCT_TAB DSCT_TAB
    * @generated
    */
    public TABELA setDSCT_TAB(String DSCT_TAB) {
        this.DSCT_TAB = DSCT_TAB;
        return this;
    }
    /**
    * Obtém DSOF_TAB
    * return DSOF_TAB
    * @generated
    */
    public Double getDSOF_TAB() {
        return this.DSOF_TAB;
    }

    /**
    * Define DSOF_TAB
    * @param DSOF_TAB DSOF_TAB
    * @generated
    */
    public TABELA setDSOF_TAB(Double DSOF_TAB) {
        this.DSOF_TAB = DSOF_TAB;
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
    public TABELA setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public TABELA setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém MARG_TAB
    * return MARG_TAB
    * @generated
    */
    public Double getMARG_TAB() {
        return this.MARG_TAB;
    }

    /**
    * Define MARG_TAB
    * @param MARG_TAB MARG_TAB
    * @generated
    */
    public TABELA setMARG_TAB(Double MARG_TAB) {
        this.MARG_TAB = MARG_TAB;
        return this;
    }
    /**
    * Obtém MKP_TAB
    * return MKP_TAB
    * @generated
    */
    public Double getMKP_TAB() {
        return this.MKP_TAB;
    }

    /**
    * Define MKP_TAB
    * @param MKP_TAB MKP_TAB
    * @generated
    */
    public TABELA setMKP_TAB(Double MKP_TAB) {
        this.MKP_TAB = MKP_TAB;
        return this;
    }
    /**
    * Obtém PACR_TAB
    * return PACR_TAB
    * @generated
    */
    public Double getPACR_TAB() {
        return this.PACR_TAB;
    }

    /**
    * Define PACR_TAB
    * @param PACR_TAB PACR_TAB
    * @generated
    */
    public TABELA setPACR_TAB(Double PACR_TAB) {
        this.PACR_TAB = PACR_TAB;
        return this;
    }
    /**
    * Obtém PDES_TAB
    * return PDES_TAB
    * @generated
    */
    public Double getPDES_TAB() {
        return this.PDES_TAB;
    }

    /**
    * Define PDES_TAB
    * @param PDES_TAB PDES_TAB
    * @generated
    */
    public TABELA setPDES_TAB(Double PDES_TAB) {
        this.PDES_TAB = PDES_TAB;
        return this;
    }
    /**
    * Obtém QMIN_TAB
    * return QMIN_TAB
    * @generated
    */
    public Double getQMIN_TAB() {
        return this.QMIN_TAB;
    }

    /**
    * Define QMIN_TAB
    * @param QMIN_TAB QMIN_TAB
    * @generated
    */
    public TABELA setQMIN_TAB(Double QMIN_TAB) {
        this.QMIN_TAB = QMIN_TAB;
        return this;
    }
    /**
    * Obtém QTDC_TAB
    * return QTDC_TAB
    * @generated
    */
    public Double getQTDC_TAB() {
        return this.QTDC_TAB;
    }

    /**
    * Define QTDC_TAB
    * @param QTDC_TAB QTDC_TAB
    * @generated
    */
    public TABELA setQTDC_TAB(Double QTDC_TAB) {
        this.QTDC_TAB = QTDC_TAB;
        return this;
    }
    /**
    * Obtém RIVC_TAB
    * return RIVC_TAB
    * @generated
    */
    public String getRIVC_TAB() {
        return this.RIVC_TAB;
    }

    /**
    * Define RIVC_TAB
    * @param RIVC_TAB RIVC_TAB
    * @generated
    */
    public TABELA setRIVC_TAB(String RIVC_TAB) {
        this.RIVC_TAB = RIVC_TAB;
        return this;
    }
    /**
    * Obtém SITU_TAB
    * return SITU_TAB
    * @generated
    */
    public String getSITU_TAB() {
        return this.SITU_TAB;
    }

    /**
    * Define SITU_TAB
    * @param SITU_TAB SITU_TAB
    * @generated
    */
    public TABELA setSITU_TAB(String SITU_TAB) {
        this.SITU_TAB = SITU_TAB;
        return this;
    }
    /**
    * Obtém TCUS_TAB
    * return TCUS_TAB
    * @generated
    */
    public String getTCUS_TAB() {
        return this.TCUS_TAB;
    }

    /**
    * Define TCUS_TAB
    * @param TCUS_TAB TCUS_TAB
    * @generated
    */
    public TABELA setTCUS_TAB(String TCUS_TAB) {
        this.TCUS_TAB = TCUS_TAB;
        return this;
    }
    /**
    * Obtém VCDO_TAB
    * return VCDO_TAB
    * @generated
    */
    public java.util.Date getVCDO_TAB() {
        return this.VCDO_TAB;
    }

    /**
    * Define VCDO_TAB
    * @param VCDO_TAB VCDO_TAB
    * @generated
    */
    public TABELA setVCDO_TAB(java.util.Date VCDO_TAB) {
        this.VCDO_TAB = VCDO_TAB;
        return this;
    }
    /**
    * Obtém VLOH_TAB
    * return VLOH_TAB
    * @generated
    */
    public Double getVLOH_TAB() {
        return this.VLOH_TAB;
    }

    /**
    * Define VLOH_TAB
    * @param VLOH_TAB VLOH_TAB
    * @generated
    */
    public TABELA setVLOH_TAB(Double VLOH_TAB) {
        this.VLOH_TAB = VLOH_TAB;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TABELA object = (TABELA)obj;
        if (CODI_PSV != null ? !CODI_PSV.equals(object.CODI_PSV) : object.CODI_PSV != null) return false;
        if (TABE_CTA != null ? !TABE_CTA.equals(object.TABE_CTA) : object.TABE_CTA != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_PSV == null) ? 0 : CODI_PSV.hashCode());
        result = 31 * result + ((TABE_CTA == null) ? 0 : TABE_CTA.hashCode());
        return result;
    }

}
