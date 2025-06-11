
package app_oracle.entity;

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
* Classe que representa a tabela TABELA
* @generated
*/
@jakarta.persistence.Entity
@IdClass(TABELAPK.class)
@jakarta.persistence.Table(name = "\"TABELA\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.TABELA")
@CronappTable(role=CronappTableRole.CLASS)
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
    @CronappColumn(attributeType="STRING", label="CODI  PSV")
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private java.lang.String CODI_PSV;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="TABE  CTA")
    @Column(name = "TABE_CTA", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer TABE_CTA;



    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="AACR  TAB")
    @Column(name = "AACR_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double AACR_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="ABAS  TAB")
    @Column(name = "ABAS_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double ABAS_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="ACRE  TAB")
    @Column(name = "ACRE_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double ACRE_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="ADES  TAB")
    @Column(name = "ADES_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double ADES_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="BASI  TAB")
    @Column(name = "BASI_TAB", nullable = false, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double BASI_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CHEK  TAB")
    @Column(name = "CHEK_TAB", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String CHEK_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CICL  TAB")
    @Column(name = "CICL_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CICL_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODIPESLANREG")
    @Column(name = "CODIPESLANREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODIPESLANREG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODIPESMANUTREG")
    @Column(name = "CODIPESMANUTREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODIPESMANUTREG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="COMI  TAB")
    @Column(name = "COMI_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double COMI_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CUST  TAB")
    @Column(name = "CUST_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CUST_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DATAULTIMASINCRONIZACAOAPI")
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="DESC  TAB")
    @Column(name = "DESC_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DESC_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DINSERT")
    @Column(name = "DINSERT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DINSERT;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="DMOF  TAB")
    @Column(name = "DMOF_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DMOF_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DSCT  TAB")
    @Column(name = "DSCT_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String DSCT_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="DSOF  TAB")
    @Column(name = "DSOF_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DSOF_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DTSYNCAPI")
    @Column(name = "DTSYNCAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DTSYNCAPI;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DUMANUT")
    @Column(name = "DUMANUT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DUMANUT;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MARG  TAB")
    @Column(name = "MARG_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MARG_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MKP  TAB")
    @Column(name = "MKP_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MKP_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="PACR  TAB")
    @Column(name = "PACR_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double PACR_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="PDES  TAB")
    @Column(name = "PDES_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double PDES_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="QMIN  TAB")
    @Column(name = "QMIN_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double QMIN_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="QTDC  TAB")
    @Column(name = "QTDC_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double QTDC_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RIVC  TAB")
    @Column(name = "RIVC_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String RIVC_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITU  TAB")
    @Column(name = "SITU_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITU_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TCUS  TAB")
    @Column(name = "TCUS_TAB", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String TCUS_TAB;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="VCDO  TAB")
    @Column(name = "VCDO_TAB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date VCDO_TAB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="VLOH  TAB")
    @Column(name = "VLOH_TAB", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double VLOH_TAB;


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
    public java.lang.String getCODI_PSV() {
        return this.CODI_PSV;
    }

    /**
    * Define CODI_PSV
    * @param CODI_PSV CODI_PSV
    * @generated
    */
    public TABELA setCODI_PSV(java.lang.String CODI_PSV) {
        this.CODI_PSV = CODI_PSV;
        return this;
    }
    /**
    * Obtém TABE_CTA
    * return TABE_CTA
    * @generated
    */
    public java.lang.Integer getTABE_CTA() {
        return this.TABE_CTA;
    }

    /**
    * Define TABE_CTA
    * @param TABE_CTA TABE_CTA
    * @generated
    */
    public TABELA setTABE_CTA(java.lang.Integer TABE_CTA) {
        this.TABE_CTA = TABE_CTA;
        return this;
    }
    /**
    * Obtém AACR_TAB
    * return AACR_TAB
    * @generated
    */
    public java.lang.Double getAACR_TAB() {
        return this.AACR_TAB;
    }

    /**
    * Define AACR_TAB
    * @param AACR_TAB AACR_TAB
    * @generated
    */
    public TABELA setAACR_TAB(java.lang.Double AACR_TAB) {
        this.AACR_TAB = AACR_TAB;
        return this;
    }
    /**
    * Obtém ABAS_TAB
    * return ABAS_TAB
    * @generated
    */
    public java.lang.Double getABAS_TAB() {
        return this.ABAS_TAB;
    }

    /**
    * Define ABAS_TAB
    * @param ABAS_TAB ABAS_TAB
    * @generated
    */
    public TABELA setABAS_TAB(java.lang.Double ABAS_TAB) {
        this.ABAS_TAB = ABAS_TAB;
        return this;
    }
    /**
    * Obtém ACRE_TAB
    * return ACRE_TAB
    * @generated
    */
    public java.lang.Double getACRE_TAB() {
        return this.ACRE_TAB;
    }

    /**
    * Define ACRE_TAB
    * @param ACRE_TAB ACRE_TAB
    * @generated
    */
    public TABELA setACRE_TAB(java.lang.Double ACRE_TAB) {
        this.ACRE_TAB = ACRE_TAB;
        return this;
    }
    /**
    * Obtém ADES_TAB
    * return ADES_TAB
    * @generated
    */
    public java.lang.Double getADES_TAB() {
        return this.ADES_TAB;
    }

    /**
    * Define ADES_TAB
    * @param ADES_TAB ADES_TAB
    * @generated
    */
    public TABELA setADES_TAB(java.lang.Double ADES_TAB) {
        this.ADES_TAB = ADES_TAB;
        return this;
    }
    /**
    * Obtém BASI_TAB
    * return BASI_TAB
    * @generated
    */
    public java.lang.Double getBASI_TAB() {
        return this.BASI_TAB;
    }

    /**
    * Define BASI_TAB
    * @param BASI_TAB BASI_TAB
    * @generated
    */
    public TABELA setBASI_TAB(java.lang.Double BASI_TAB) {
        this.BASI_TAB = BASI_TAB;
        return this;
    }
    /**
    * Obtém CHEK_TAB
    * return CHEK_TAB
    * @generated
    */
    public java.lang.String getCHEK_TAB() {
        return this.CHEK_TAB;
    }

    /**
    * Define CHEK_TAB
    * @param CHEK_TAB CHEK_TAB
    * @generated
    */
    public TABELA setCHEK_TAB(java.lang.String CHEK_TAB) {
        this.CHEK_TAB = CHEK_TAB;
        return this;
    }
    /**
    * Obtém CICL_TAB
    * return CICL_TAB
    * @generated
    */
    public java.lang.String getCICL_TAB() {
        return this.CICL_TAB;
    }

    /**
    * Define CICL_TAB
    * @param CICL_TAB CICL_TAB
    * @generated
    */
    public TABELA setCICL_TAB(java.lang.String CICL_TAB) {
        this.CICL_TAB = CICL_TAB;
        return this;
    }
    /**
    * Obtém CODIPESLANREG
    * return CODIPESLANREG
    * @generated
    */
    public java.lang.Integer getCODIPESLANREG() {
        return this.CODIPESLANREG;
    }

    /**
    * Define CODIPESLANREG
    * @param CODIPESLANREG CODIPESLANREG
    * @generated
    */
    public TABELA setCODIPESLANREG(java.lang.Integer CODIPESLANREG) {
        this.CODIPESLANREG = CODIPESLANREG;
        return this;
    }
    /**
    * Obtém CODIPESMANUTREG
    * return CODIPESMANUTREG
    * @generated
    */
    public java.lang.Integer getCODIPESMANUTREG() {
        return this.CODIPESMANUTREG;
    }

    /**
    * Define CODIPESMANUTREG
    * @param CODIPESMANUTREG CODIPESMANUTREG
    * @generated
    */
    public TABELA setCODIPESMANUTREG(java.lang.Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém COMI_TAB
    * return COMI_TAB
    * @generated
    */
    public java.lang.Double getCOMI_TAB() {
        return this.COMI_TAB;
    }

    /**
    * Define COMI_TAB
    * @param COMI_TAB COMI_TAB
    * @generated
    */
    public TABELA setCOMI_TAB(java.lang.Double COMI_TAB) {
        this.COMI_TAB = COMI_TAB;
        return this;
    }
    /**
    * Obtém CUST_TAB
    * return CUST_TAB
    * @generated
    */
    public java.lang.Double getCUST_TAB() {
        return this.CUST_TAB;
    }

    /**
    * Define CUST_TAB
    * @param CUST_TAB CUST_TAB
    * @generated
    */
    public TABELA setCUST_TAB(java.lang.Double CUST_TAB) {
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
    public java.lang.Double getDESC_TAB() {
        return this.DESC_TAB;
    }

    /**
    * Define DESC_TAB
    * @param DESC_TAB DESC_TAB
    * @generated
    */
    public TABELA setDESC_TAB(java.lang.Double DESC_TAB) {
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
    public java.lang.Double getDMOF_TAB() {
        return this.DMOF_TAB;
    }

    /**
    * Define DMOF_TAB
    * @param DMOF_TAB DMOF_TAB
    * @generated
    */
    public TABELA setDMOF_TAB(java.lang.Double DMOF_TAB) {
        this.DMOF_TAB = DMOF_TAB;
        return this;
    }
    /**
    * Obtém DSCT_TAB
    * return DSCT_TAB
    * @generated
    */
    public java.lang.String getDSCT_TAB() {
        return this.DSCT_TAB;
    }

    /**
    * Define DSCT_TAB
    * @param DSCT_TAB DSCT_TAB
    * @generated
    */
    public TABELA setDSCT_TAB(java.lang.String DSCT_TAB) {
        this.DSCT_TAB = DSCT_TAB;
        return this;
    }
    /**
    * Obtém DSOF_TAB
    * return DSOF_TAB
    * @generated
    */
    public java.lang.Double getDSOF_TAB() {
        return this.DSOF_TAB;
    }

    /**
    * Define DSOF_TAB
    * @param DSOF_TAB DSOF_TAB
    * @generated
    */
    public TABELA setDSOF_TAB(java.lang.Double DSOF_TAB) {
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
    public java.lang.Double getMARG_TAB() {
        return this.MARG_TAB;
    }

    /**
    * Define MARG_TAB
    * @param MARG_TAB MARG_TAB
    * @generated
    */
    public TABELA setMARG_TAB(java.lang.Double MARG_TAB) {
        this.MARG_TAB = MARG_TAB;
        return this;
    }
    /**
    * Obtém MKP_TAB
    * return MKP_TAB
    * @generated
    */
    public java.lang.Double getMKP_TAB() {
        return this.MKP_TAB;
    }

    /**
    * Define MKP_TAB
    * @param MKP_TAB MKP_TAB
    * @generated
    */
    public TABELA setMKP_TAB(java.lang.Double MKP_TAB) {
        this.MKP_TAB = MKP_TAB;
        return this;
    }
    /**
    * Obtém PACR_TAB
    * return PACR_TAB
    * @generated
    */
    public java.lang.Double getPACR_TAB() {
        return this.PACR_TAB;
    }

    /**
    * Define PACR_TAB
    * @param PACR_TAB PACR_TAB
    * @generated
    */
    public TABELA setPACR_TAB(java.lang.Double PACR_TAB) {
        this.PACR_TAB = PACR_TAB;
        return this;
    }
    /**
    * Obtém PDES_TAB
    * return PDES_TAB
    * @generated
    */
    public java.lang.Double getPDES_TAB() {
        return this.PDES_TAB;
    }

    /**
    * Define PDES_TAB
    * @param PDES_TAB PDES_TAB
    * @generated
    */
    public TABELA setPDES_TAB(java.lang.Double PDES_TAB) {
        this.PDES_TAB = PDES_TAB;
        return this;
    }
    /**
    * Obtém QMIN_TAB
    * return QMIN_TAB
    * @generated
    */
    public java.lang.Double getQMIN_TAB() {
        return this.QMIN_TAB;
    }

    /**
    * Define QMIN_TAB
    * @param QMIN_TAB QMIN_TAB
    * @generated
    */
    public TABELA setQMIN_TAB(java.lang.Double QMIN_TAB) {
        this.QMIN_TAB = QMIN_TAB;
        return this;
    }
    /**
    * Obtém QTDC_TAB
    * return QTDC_TAB
    * @generated
    */
    public java.lang.Double getQTDC_TAB() {
        return this.QTDC_TAB;
    }

    /**
    * Define QTDC_TAB
    * @param QTDC_TAB QTDC_TAB
    * @generated
    */
    public TABELA setQTDC_TAB(java.lang.Double QTDC_TAB) {
        this.QTDC_TAB = QTDC_TAB;
        return this;
    }
    /**
    * Obtém RIVC_TAB
    * return RIVC_TAB
    * @generated
    */
    public java.lang.String getRIVC_TAB() {
        return this.RIVC_TAB;
    }

    /**
    * Define RIVC_TAB
    * @param RIVC_TAB RIVC_TAB
    * @generated
    */
    public TABELA setRIVC_TAB(java.lang.String RIVC_TAB) {
        this.RIVC_TAB = RIVC_TAB;
        return this;
    }
    /**
    * Obtém SITU_TAB
    * return SITU_TAB
    * @generated
    */
    public java.lang.String getSITU_TAB() {
        return this.SITU_TAB;
    }

    /**
    * Define SITU_TAB
    * @param SITU_TAB SITU_TAB
    * @generated
    */
    public TABELA setSITU_TAB(java.lang.String SITU_TAB) {
        this.SITU_TAB = SITU_TAB;
        return this;
    }
    /**
    * Obtém TCUS_TAB
    * return TCUS_TAB
    * @generated
    */
    public java.lang.String getTCUS_TAB() {
        return this.TCUS_TAB;
    }

    /**
    * Define TCUS_TAB
    * @param TCUS_TAB TCUS_TAB
    * @generated
    */
    public TABELA setTCUS_TAB(java.lang.String TCUS_TAB) {
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
    public java.lang.Double getVLOH_TAB() {
        return this.VLOH_TAB;
    }

    /**
    * Define VLOH_TAB
    * @param VLOH_TAB VLOH_TAB
    * @generated
    */
    public TABELA setVLOH_TAB(java.lang.Double VLOH_TAB) {
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
