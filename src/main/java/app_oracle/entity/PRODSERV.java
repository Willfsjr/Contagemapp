
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
* Classe que representa a tabela PRODSERV
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODSERV\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.PRODSERV")
@CronappTable(role=CronappTableRole.CLASS)
public class PRODSERV implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="ACOD  PSV")
    @Column(name = "ACOD_PSV", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String ACOD_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ADES  PSV")
    @Column(name = "ADES_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String ADES_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AGM  PSV")
    @Column(name = "AGM_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AGM_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AUNI  PSV")
    @Column(name = "AUNI_PSV", nullable = true, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.String AUNI_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CANP  PSV")
    @Column(name = "CANP_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CANP_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CARA  PSV")
    @Column(name = "CARA_PSV", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String CARA_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CDAN  PSV")
    @Column(name = "CDAN_PSV", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String CDAN_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CHEK  PSV")
    @Column(name = "CHEK_PSV", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String CHEK_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CLAS  PSV")
    @Column(name = "CLAS_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CLAS_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CLPD  PSV")
    @Column(name = "CLPD_PSV", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String CLPD_PSV;


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
    @CronappColumn(attributeType="STRING", label="CODI  ACB")
    @Column(name = "CODI_ACB", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String CODI_ACB;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  BDC")
    @Column(name = "CODI_BDC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_BDC;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  CFP")
    @Column(name = "CODI_CFP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_CFP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  CUN")
    @Column(name = "CODI_CUN", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_CUN;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  DIC")
    @Column(name = "CODI_DIC", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String CODI_DIC;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  GPR")
    @Column(name = "CODI_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  PES")
    @Column(name = "CODI_PES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_PES;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  PRI")
    @Column(name = "CODI_PRI", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_PRI;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  PS 1")
    @Column(name = "CODI_PS1", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String CODI_PS1;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  SBG")
    @Column(name = "CODI_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_SBG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  TIP")
    @Column(name = "CODI_TIP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_TIP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="COMB  PSV")
    @Column(name = "COMB_PSV", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private java.lang.String COMB_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="COMP  PSV")
    @Column(name = "COMP_PSV", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String COMP_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CONC  PSV")
    @Column(name = "CONC_PSV", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CONC_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CTDE  PSV")
    @Column(name = "CTDE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CTDE_PSV;


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
    @CronappColumn(attributeType="DOUBLE", label="DENS  PSV")
    @Column(name = "DENS_PSV", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DENS_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DESC  PSV")
    @Column(name = "DESC_PSV", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String DESC_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DETA  PSV")
    @Column(name = "DETA_PSV", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String DETA_PSV;


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
    @CronappColumn(attributeType="DOUBLE", label="DMOF  PSV")
    @Column(name = "DMOF_PSV", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DMOF_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="DSOF  PSV")
    @Column(name = "DSOF_PSV", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double DSOF_PSV;


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
    @CronappColumn(attributeType="STRING", label="FCIO  PSV")
    @Column(name = "FCIO_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String FCIO_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ICAE  PSV")
    @Column(name = "ICAE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ICAE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IDNF  PSV")
    @Column(name = "IDNF_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IDNF_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="LIAC  PSV")
    @Column(name = "LIAC_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String LIAC_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="LIDE  PSV")
    @Column(name = "LIDE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String LIDE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="LPMD  PSV")
    @Column(name = "LPMD_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String LPMD_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MAPA  PSV")
    @Column(name = "MAPA_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String MAPA_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NOVO  PSV")
    @Column(name = "NOVO_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NOVO_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBSE  PSV")
    @Column(name = "OBSE_PSV", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String OBSE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="POLF  PSV")
    @Column(name = "POLF_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String POLF_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PPAT  PSV")
    @Column(name = "PPAT_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PPAT_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PROD  TRC")
    @Column(name = "PROD_TRC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PROD_TRC;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PRSE  PSV")
    @Column(name = "PRSE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PRSE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="QTPA  PSV")
    @Column(name = "QTPA_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer QTPA_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="SAGM  PSV")
    @Column(name = "SAGM_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer SAGM_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITE  PSV")
    @Column(name = "SITE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITU  PSV")
    @Column(name = "SITU_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITU_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="TPEF  PSV")
    @Column(name = "TPEF_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer TPEF_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TSIP  PSV")
    @Column(name = "TSIP_PSV", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String TSIP_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UGNE  PSV")
    @Column(name = "UGNE_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UGNE_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="UNFA  PSV")
    @Column(name = "UNFA_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer UNFA_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UNID  PSV")
    @Column(name = "UNID_PSV", nullable = true, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.String UNID_PSV;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UTIC  PSV")
    @Column(name = "UTIC_PSV", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UTIC_PSV;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="VCDO  PSV")
    @Column(name = "VCDO_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date VCDO_PSV;


    /**
    * Construtor
    * @generated
    */
    public PRODSERV(){
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
    public PRODSERV setCODI_PSV(java.lang.String CODI_PSV) {
        this.CODI_PSV = CODI_PSV;
        return this;
    }
    /**
    * Obtém ACOD_PSV
    * return ACOD_PSV
    * @generated
    */
    public java.lang.String getACOD_PSV() {
        return this.ACOD_PSV;
    }

    /**
    * Define ACOD_PSV
    * @param ACOD_PSV ACOD_PSV
    * @generated
    */
    public PRODSERV setACOD_PSV(java.lang.String ACOD_PSV) {
        this.ACOD_PSV = ACOD_PSV;
        return this;
    }
    /**
    * Obtém ADES_PSV
    * return ADES_PSV
    * @generated
    */
    public java.lang.String getADES_PSV() {
        return this.ADES_PSV;
    }

    /**
    * Define ADES_PSV
    * @param ADES_PSV ADES_PSV
    * @generated
    */
    public PRODSERV setADES_PSV(java.lang.String ADES_PSV) {
        this.ADES_PSV = ADES_PSV;
        return this;
    }
    /**
    * Obtém AGM_PSV
    * return AGM_PSV
    * @generated
    */
    public java.lang.String getAGM_PSV() {
        return this.AGM_PSV;
    }

    /**
    * Define AGM_PSV
    * @param AGM_PSV AGM_PSV
    * @generated
    */
    public PRODSERV setAGM_PSV(java.lang.String AGM_PSV) {
        this.AGM_PSV = AGM_PSV;
        return this;
    }
    /**
    * Obtém AUNI_PSV
    * return AUNI_PSV
    * @generated
    */
    public java.lang.String getAUNI_PSV() {
        return this.AUNI_PSV;
    }

    /**
    * Define AUNI_PSV
    * @param AUNI_PSV AUNI_PSV
    * @generated
    */
    public PRODSERV setAUNI_PSV(java.lang.String AUNI_PSV) {
        this.AUNI_PSV = AUNI_PSV;
        return this;
    }
    /**
    * Obtém CANP_PSV
    * return CANP_PSV
    * @generated
    */
    public java.lang.String getCANP_PSV() {
        return this.CANP_PSV;
    }

    /**
    * Define CANP_PSV
    * @param CANP_PSV CANP_PSV
    * @generated
    */
    public PRODSERV setCANP_PSV(java.lang.String CANP_PSV) {
        this.CANP_PSV = CANP_PSV;
        return this;
    }
    /**
    * Obtém CARA_PSV
    * return CARA_PSV
    * @generated
    */
    public java.lang.String getCARA_PSV() {
        return this.CARA_PSV;
    }

    /**
    * Define CARA_PSV
    * @param CARA_PSV CARA_PSV
    * @generated
    */
    public PRODSERV setCARA_PSV(java.lang.String CARA_PSV) {
        this.CARA_PSV = CARA_PSV;
        return this;
    }
    /**
    * Obtém CDAN_PSV
    * return CDAN_PSV
    * @generated
    */
    public java.lang.String getCDAN_PSV() {
        return this.CDAN_PSV;
    }

    /**
    * Define CDAN_PSV
    * @param CDAN_PSV CDAN_PSV
    * @generated
    */
    public PRODSERV setCDAN_PSV(java.lang.String CDAN_PSV) {
        this.CDAN_PSV = CDAN_PSV;
        return this;
    }
    /**
    * Obtém CHEK_PSV
    * return CHEK_PSV
    * @generated
    */
    public java.lang.String getCHEK_PSV() {
        return this.CHEK_PSV;
    }

    /**
    * Define CHEK_PSV
    * @param CHEK_PSV CHEK_PSV
    * @generated
    */
    public PRODSERV setCHEK_PSV(java.lang.String CHEK_PSV) {
        this.CHEK_PSV = CHEK_PSV;
        return this;
    }
    /**
    * Obtém CLAS_PSV
    * return CLAS_PSV
    * @generated
    */
    public java.lang.String getCLAS_PSV() {
        return this.CLAS_PSV;
    }

    /**
    * Define CLAS_PSV
    * @param CLAS_PSV CLAS_PSV
    * @generated
    */
    public PRODSERV setCLAS_PSV(java.lang.String CLAS_PSV) {
        this.CLAS_PSV = CLAS_PSV;
        return this;
    }
    /**
    * Obtém CLPD_PSV
    * return CLPD_PSV
    * @generated
    */
    public java.lang.String getCLPD_PSV() {
        return this.CLPD_PSV;
    }

    /**
    * Define CLPD_PSV
    * @param CLPD_PSV CLPD_PSV
    * @generated
    */
    public PRODSERV setCLPD_PSV(java.lang.String CLPD_PSV) {
        this.CLPD_PSV = CLPD_PSV;
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
    public PRODSERV setCODIPESLANREG(java.lang.Integer CODIPESLANREG) {
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
    public PRODSERV setCODIPESMANUTREG(java.lang.Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CODI_ACB
    * return CODI_ACB
    * @generated
    */
    public java.lang.String getCODI_ACB() {
        return this.CODI_ACB;
    }

    /**
    * Define CODI_ACB
    * @param CODI_ACB CODI_ACB
    * @generated
    */
    public PRODSERV setCODI_ACB(java.lang.String CODI_ACB) {
        this.CODI_ACB = CODI_ACB;
        return this;
    }
    /**
    * Obtém CODI_BDC
    * return CODI_BDC
    * @generated
    */
    public java.lang.Integer getCODI_BDC() {
        return this.CODI_BDC;
    }

    /**
    * Define CODI_BDC
    * @param CODI_BDC CODI_BDC
    * @generated
    */
    public PRODSERV setCODI_BDC(java.lang.Integer CODI_BDC) {
        this.CODI_BDC = CODI_BDC;
        return this;
    }
    /**
    * Obtém CODI_CFP
    * return CODI_CFP
    * @generated
    */
    public java.lang.Integer getCODI_CFP() {
        return this.CODI_CFP;
    }

    /**
    * Define CODI_CFP
    * @param CODI_CFP CODI_CFP
    * @generated
    */
    public PRODSERV setCODI_CFP(java.lang.Integer CODI_CFP) {
        this.CODI_CFP = CODI_CFP;
        return this;
    }
    /**
    * Obtém CODI_CUN
    * return CODI_CUN
    * @generated
    */
    public java.lang.Integer getCODI_CUN() {
        return this.CODI_CUN;
    }

    /**
    * Define CODI_CUN
    * @param CODI_CUN CODI_CUN
    * @generated
    */
    public PRODSERV setCODI_CUN(java.lang.Integer CODI_CUN) {
        this.CODI_CUN = CODI_CUN;
        return this;
    }
    /**
    * Obtém CODI_DIC
    * return CODI_DIC
    * @generated
    */
    public java.lang.String getCODI_DIC() {
        return this.CODI_DIC;
    }

    /**
    * Define CODI_DIC
    * @param CODI_DIC CODI_DIC
    * @generated
    */
    public PRODSERV setCODI_DIC(java.lang.String CODI_DIC) {
        this.CODI_DIC = CODI_DIC;
        return this;
    }
    /**
    * Obtém CODI_GPR
    * return CODI_GPR
    * @generated
    */
    public java.lang.Integer getCODI_GPR() {
        return this.CODI_GPR;
    }

    /**
    * Define CODI_GPR
    * @param CODI_GPR CODI_GPR
    * @generated
    */
    public PRODSERV setCODI_GPR(java.lang.Integer CODI_GPR) {
        this.CODI_GPR = CODI_GPR;
        return this;
    }
    /**
    * Obtém CODI_PES
    * return CODI_PES
    * @generated
    */
    public java.lang.Integer getCODI_PES() {
        return this.CODI_PES;
    }

    /**
    * Define CODI_PES
    * @param CODI_PES CODI_PES
    * @generated
    */
    public PRODSERV setCODI_PES(java.lang.Integer CODI_PES) {
        this.CODI_PES = CODI_PES;
        return this;
    }
    /**
    * Obtém CODI_PRI
    * return CODI_PRI
    * @generated
    */
    public java.lang.Integer getCODI_PRI() {
        return this.CODI_PRI;
    }

    /**
    * Define CODI_PRI
    * @param CODI_PRI CODI_PRI
    * @generated
    */
    public PRODSERV setCODI_PRI(java.lang.Integer CODI_PRI) {
        this.CODI_PRI = CODI_PRI;
        return this;
    }
    /**
    * Obtém CODI_PS1
    * return CODI_PS1
    * @generated
    */
    public java.lang.String getCODI_PS1() {
        return this.CODI_PS1;
    }

    /**
    * Define CODI_PS1
    * @param CODI_PS1 CODI_PS1
    * @generated
    */
    public PRODSERV setCODI_PS1(java.lang.String CODI_PS1) {
        this.CODI_PS1 = CODI_PS1;
        return this;
    }
    /**
    * Obtém CODI_SBG
    * return CODI_SBG
    * @generated
    */
    public java.lang.Integer getCODI_SBG() {
        return this.CODI_SBG;
    }

    /**
    * Define CODI_SBG
    * @param CODI_SBG CODI_SBG
    * @generated
    */
    public PRODSERV setCODI_SBG(java.lang.Integer CODI_SBG) {
        this.CODI_SBG = CODI_SBG;
        return this;
    }
    /**
    * Obtém CODI_TIP
    * return CODI_TIP
    * @generated
    */
    public java.lang.Integer getCODI_TIP() {
        return this.CODI_TIP;
    }

    /**
    * Define CODI_TIP
    * @param CODI_TIP CODI_TIP
    * @generated
    */
    public PRODSERV setCODI_TIP(java.lang.Integer CODI_TIP) {
        this.CODI_TIP = CODI_TIP;
        return this;
    }
    /**
    * Obtém COMB_PSV
    * return COMB_PSV
    * @generated
    */
    public java.lang.String getCOMB_PSV() {
        return this.COMB_PSV;
    }

    /**
    * Define COMB_PSV
    * @param COMB_PSV COMB_PSV
    * @generated
    */
    public PRODSERV setCOMB_PSV(java.lang.String COMB_PSV) {
        this.COMB_PSV = COMB_PSV;
        return this;
    }
    /**
    * Obtém COMP_PSV
    * return COMP_PSV
    * @generated
    */
    public java.lang.String getCOMP_PSV() {
        return this.COMP_PSV;
    }

    /**
    * Define COMP_PSV
    * @param COMP_PSV COMP_PSV
    * @generated
    */
    public PRODSERV setCOMP_PSV(java.lang.String COMP_PSV) {
        this.COMP_PSV = COMP_PSV;
        return this;
    }
    /**
    * Obtém CONC_PSV
    * return CONC_PSV
    * @generated
    */
    public java.lang.Double getCONC_PSV() {
        return this.CONC_PSV;
    }

    /**
    * Define CONC_PSV
    * @param CONC_PSV CONC_PSV
    * @generated
    */
    public PRODSERV setCONC_PSV(java.lang.Double CONC_PSV) {
        this.CONC_PSV = CONC_PSV;
        return this;
    }
    /**
    * Obtém CTDE_PSV
    * return CTDE_PSV
    * @generated
    */
    public java.lang.String getCTDE_PSV() {
        return this.CTDE_PSV;
    }

    /**
    * Define CTDE_PSV
    * @param CTDE_PSV CTDE_PSV
    * @generated
    */
    public PRODSERV setCTDE_PSV(java.lang.String CTDE_PSV) {
        this.CTDE_PSV = CTDE_PSV;
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
    public PRODSERV setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DENS_PSV
    * return DENS_PSV
    * @generated
    */
    public java.lang.Double getDENS_PSV() {
        return this.DENS_PSV;
    }

    /**
    * Define DENS_PSV
    * @param DENS_PSV DENS_PSV
    * @generated
    */
    public PRODSERV setDENS_PSV(java.lang.Double DENS_PSV) {
        this.DENS_PSV = DENS_PSV;
        return this;
    }
    /**
    * Obtém DESC_PSV
    * return DESC_PSV
    * @generated
    */
    public java.lang.String getDESC_PSV() {
        return this.DESC_PSV;
    }

    /**
    * Define DESC_PSV
    * @param DESC_PSV DESC_PSV
    * @generated
    */
    public PRODSERV setDESC_PSV(java.lang.String DESC_PSV) {
        this.DESC_PSV = DESC_PSV;
        return this;
    }
    /**
    * Obtém DETA_PSV
    * return DETA_PSV
    * @generated
    */
    public java.lang.String getDETA_PSV() {
        return this.DETA_PSV;
    }

    /**
    * Define DETA_PSV
    * @param DETA_PSV DETA_PSV
    * @generated
    */
    public PRODSERV setDETA_PSV(java.lang.String DETA_PSV) {
        this.DETA_PSV = DETA_PSV;
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
    public PRODSERV setDINSERT(java.util.Date DINSERT) {
        this.DINSERT = DINSERT;
        return this;
    }
    /**
    * Obtém DMOF_PSV
    * return DMOF_PSV
    * @generated
    */
    public java.lang.Double getDMOF_PSV() {
        return this.DMOF_PSV;
    }

    /**
    * Define DMOF_PSV
    * @param DMOF_PSV DMOF_PSV
    * @generated
    */
    public PRODSERV setDMOF_PSV(java.lang.Double DMOF_PSV) {
        this.DMOF_PSV = DMOF_PSV;
        return this;
    }
    /**
    * Obtém DSOF_PSV
    * return DSOF_PSV
    * @generated
    */
    public java.lang.Double getDSOF_PSV() {
        return this.DSOF_PSV;
    }

    /**
    * Define DSOF_PSV
    * @param DSOF_PSV DSOF_PSV
    * @generated
    */
    public PRODSERV setDSOF_PSV(java.lang.Double DSOF_PSV) {
        this.DSOF_PSV = DSOF_PSV;
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
    public PRODSERV setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public PRODSERV setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém FCIO_PSV
    * return FCIO_PSV
    * @generated
    */
    public java.lang.String getFCIO_PSV() {
        return this.FCIO_PSV;
    }

    /**
    * Define FCIO_PSV
    * @param FCIO_PSV FCIO_PSV
    * @generated
    */
    public PRODSERV setFCIO_PSV(java.lang.String FCIO_PSV) {
        this.FCIO_PSV = FCIO_PSV;
        return this;
    }
    /**
    * Obtém ICAE_PSV
    * return ICAE_PSV
    * @generated
    */
    public java.lang.String getICAE_PSV() {
        return this.ICAE_PSV;
    }

    /**
    * Define ICAE_PSV
    * @param ICAE_PSV ICAE_PSV
    * @generated
    */
    public PRODSERV setICAE_PSV(java.lang.String ICAE_PSV) {
        this.ICAE_PSV = ICAE_PSV;
        return this;
    }
    /**
    * Obtém IDNF_PSV
    * return IDNF_PSV
    * @generated
    */
    public java.lang.String getIDNF_PSV() {
        return this.IDNF_PSV;
    }

    /**
    * Define IDNF_PSV
    * @param IDNF_PSV IDNF_PSV
    * @generated
    */
    public PRODSERV setIDNF_PSV(java.lang.String IDNF_PSV) {
        this.IDNF_PSV = IDNF_PSV;
        return this;
    }
    /**
    * Obtém LIAC_PSV
    * return LIAC_PSV
    * @generated
    */
    public java.lang.String getLIAC_PSV() {
        return this.LIAC_PSV;
    }

    /**
    * Define LIAC_PSV
    * @param LIAC_PSV LIAC_PSV
    * @generated
    */
    public PRODSERV setLIAC_PSV(java.lang.String LIAC_PSV) {
        this.LIAC_PSV = LIAC_PSV;
        return this;
    }
    /**
    * Obtém LIDE_PSV
    * return LIDE_PSV
    * @generated
    */
    public java.lang.String getLIDE_PSV() {
        return this.LIDE_PSV;
    }

    /**
    * Define LIDE_PSV
    * @param LIDE_PSV LIDE_PSV
    * @generated
    */
    public PRODSERV setLIDE_PSV(java.lang.String LIDE_PSV) {
        this.LIDE_PSV = LIDE_PSV;
        return this;
    }
    /**
    * Obtém LPMD_PSV
    * return LPMD_PSV
    * @generated
    */
    public java.lang.String getLPMD_PSV() {
        return this.LPMD_PSV;
    }

    /**
    * Define LPMD_PSV
    * @param LPMD_PSV LPMD_PSV
    * @generated
    */
    public PRODSERV setLPMD_PSV(java.lang.String LPMD_PSV) {
        this.LPMD_PSV = LPMD_PSV;
        return this;
    }
    /**
    * Obtém MAPA_PSV
    * return MAPA_PSV
    * @generated
    */
    public java.lang.String getMAPA_PSV() {
        return this.MAPA_PSV;
    }

    /**
    * Define MAPA_PSV
    * @param MAPA_PSV MAPA_PSV
    * @generated
    */
    public PRODSERV setMAPA_PSV(java.lang.String MAPA_PSV) {
        this.MAPA_PSV = MAPA_PSV;
        return this;
    }
    /**
    * Obtém NOVO_PSV
    * return NOVO_PSV
    * @generated
    */
    public java.lang.String getNOVO_PSV() {
        return this.NOVO_PSV;
    }

    /**
    * Define NOVO_PSV
    * @param NOVO_PSV NOVO_PSV
    * @generated
    */
    public PRODSERV setNOVO_PSV(java.lang.String NOVO_PSV) {
        this.NOVO_PSV = NOVO_PSV;
        return this;
    }
    /**
    * Obtém OBSE_PSV
    * return OBSE_PSV
    * @generated
    */
    public java.lang.String getOBSE_PSV() {
        return this.OBSE_PSV;
    }

    /**
    * Define OBSE_PSV
    * @param OBSE_PSV OBSE_PSV
    * @generated
    */
    public PRODSERV setOBSE_PSV(java.lang.String OBSE_PSV) {
        this.OBSE_PSV = OBSE_PSV;
        return this;
    }
    /**
    * Obtém POLF_PSV
    * return POLF_PSV
    * @generated
    */
    public java.lang.String getPOLF_PSV() {
        return this.POLF_PSV;
    }

    /**
    * Define POLF_PSV
    * @param POLF_PSV POLF_PSV
    * @generated
    */
    public PRODSERV setPOLF_PSV(java.lang.String POLF_PSV) {
        this.POLF_PSV = POLF_PSV;
        return this;
    }
    /**
    * Obtém PPAT_PSV
    * return PPAT_PSV
    * @generated
    */
    public java.lang.String getPPAT_PSV() {
        return this.PPAT_PSV;
    }

    /**
    * Define PPAT_PSV
    * @param PPAT_PSV PPAT_PSV
    * @generated
    */
    public PRODSERV setPPAT_PSV(java.lang.String PPAT_PSV) {
        this.PPAT_PSV = PPAT_PSV;
        return this;
    }
    /**
    * Obtém PROD_TRC
    * return PROD_TRC
    * @generated
    */
    public java.lang.String getPROD_TRC() {
        return this.PROD_TRC;
    }

    /**
    * Define PROD_TRC
    * @param PROD_TRC PROD_TRC
    * @generated
    */
    public PRODSERV setPROD_TRC(java.lang.String PROD_TRC) {
        this.PROD_TRC = PROD_TRC;
        return this;
    }
    /**
    * Obtém PRSE_PSV
    * return PRSE_PSV
    * @generated
    */
    public java.lang.String getPRSE_PSV() {
        return this.PRSE_PSV;
    }

    /**
    * Define PRSE_PSV
    * @param PRSE_PSV PRSE_PSV
    * @generated
    */
    public PRODSERV setPRSE_PSV(java.lang.String PRSE_PSV) {
        this.PRSE_PSV = PRSE_PSV;
        return this;
    }
    /**
    * Obtém QTPA_PSV
    * return QTPA_PSV
    * @generated
    */
    public java.lang.Integer getQTPA_PSV() {
        return this.QTPA_PSV;
    }

    /**
    * Define QTPA_PSV
    * @param QTPA_PSV QTPA_PSV
    * @generated
    */
    public PRODSERV setQTPA_PSV(java.lang.Integer QTPA_PSV) {
        this.QTPA_PSV = QTPA_PSV;
        return this;
    }
    /**
    * Obtém SAGM_PSV
    * return SAGM_PSV
    * @generated
    */
    public java.lang.Integer getSAGM_PSV() {
        return this.SAGM_PSV;
    }

    /**
    * Define SAGM_PSV
    * @param SAGM_PSV SAGM_PSV
    * @generated
    */
    public PRODSERV setSAGM_PSV(java.lang.Integer SAGM_PSV) {
        this.SAGM_PSV = SAGM_PSV;
        return this;
    }
    /**
    * Obtém SITE_PSV
    * return SITE_PSV
    * @generated
    */
    public java.lang.String getSITE_PSV() {
        return this.SITE_PSV;
    }

    /**
    * Define SITE_PSV
    * @param SITE_PSV SITE_PSV
    * @generated
    */
    public PRODSERV setSITE_PSV(java.lang.String SITE_PSV) {
        this.SITE_PSV = SITE_PSV;
        return this;
    }
    /**
    * Obtém SITU_PSV
    * return SITU_PSV
    * @generated
    */
    public java.lang.String getSITU_PSV() {
        return this.SITU_PSV;
    }

    /**
    * Define SITU_PSV
    * @param SITU_PSV SITU_PSV
    * @generated
    */
    public PRODSERV setSITU_PSV(java.lang.String SITU_PSV) {
        this.SITU_PSV = SITU_PSV;
        return this;
    }
    /**
    * Obtém TPEF_PSV
    * return TPEF_PSV
    * @generated
    */
    public java.lang.Integer getTPEF_PSV() {
        return this.TPEF_PSV;
    }

    /**
    * Define TPEF_PSV
    * @param TPEF_PSV TPEF_PSV
    * @generated
    */
    public PRODSERV setTPEF_PSV(java.lang.Integer TPEF_PSV) {
        this.TPEF_PSV = TPEF_PSV;
        return this;
    }
    /**
    * Obtém TSIP_PSV
    * return TSIP_PSV
    * @generated
    */
    public java.lang.String getTSIP_PSV() {
        return this.TSIP_PSV;
    }

    /**
    * Define TSIP_PSV
    * @param TSIP_PSV TSIP_PSV
    * @generated
    */
    public PRODSERV setTSIP_PSV(java.lang.String TSIP_PSV) {
        this.TSIP_PSV = TSIP_PSV;
        return this;
    }
    /**
    * Obtém UGNE_PSV
    * return UGNE_PSV
    * @generated
    */
    public java.lang.String getUGNE_PSV() {
        return this.UGNE_PSV;
    }

    /**
    * Define UGNE_PSV
    * @param UGNE_PSV UGNE_PSV
    * @generated
    */
    public PRODSERV setUGNE_PSV(java.lang.String UGNE_PSV) {
        this.UGNE_PSV = UGNE_PSV;
        return this;
    }
    /**
    * Obtém UNFA_PSV
    * return UNFA_PSV
    * @generated
    */
    public java.lang.Integer getUNFA_PSV() {
        return this.UNFA_PSV;
    }

    /**
    * Define UNFA_PSV
    * @param UNFA_PSV UNFA_PSV
    * @generated
    */
    public PRODSERV setUNFA_PSV(java.lang.Integer UNFA_PSV) {
        this.UNFA_PSV = UNFA_PSV;
        return this;
    }
    /**
    * Obtém UNID_PSV
    * return UNID_PSV
    * @generated
    */
    public java.lang.String getUNID_PSV() {
        return this.UNID_PSV;
    }

    /**
    * Define UNID_PSV
    * @param UNID_PSV UNID_PSV
    * @generated
    */
    public PRODSERV setUNID_PSV(java.lang.String UNID_PSV) {
        this.UNID_PSV = UNID_PSV;
        return this;
    }
    /**
    * Obtém UTIC_PSV
    * return UTIC_PSV
    * @generated
    */
    public java.lang.String getUTIC_PSV() {
        return this.UTIC_PSV;
    }

    /**
    * Define UTIC_PSV
    * @param UTIC_PSV UTIC_PSV
    * @generated
    */
    public PRODSERV setUTIC_PSV(java.lang.String UTIC_PSV) {
        this.UTIC_PSV = UTIC_PSV;
        return this;
    }
    /**
    * Obtém VCDO_PSV
    * return VCDO_PSV
    * @generated
    */
    public java.util.Date getVCDO_PSV() {
        return this.VCDO_PSV;
    }

    /**
    * Define VCDO_PSV
    * @param VCDO_PSV VCDO_PSV
    * @generated
    */
    public PRODSERV setVCDO_PSV(java.util.Date VCDO_PSV) {
        this.VCDO_PSV = VCDO_PSV;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PRODSERV object = (PRODSERV)obj;
        if (CODI_PSV != null ? !CODI_PSV.equals(object.CODI_PSV) : object.CODI_PSV != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_PSV == null) ? 0 : CODI_PSV.hashCode());
        return result;
    }

}
