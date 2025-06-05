
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
* Classe que representa a tabela SUBGRUPO
* @generated
*/
@jakarta.persistence.Entity
@IdClass(SUBGRUPOPK.class)
@jakarta.persistence.Table(name = "\"SUBGRUPO\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.SUBGRUPO")
@CronappTable(role=CronappTableRole.AUTO)
public class SUBGRUPO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="LONG", label="CODI  GPR")
    @Column(name = "CODI_GPR", nullable = false, insertable=true, updatable=true)
        private java.lang.Long CODI_GPR;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="LONG", label="CODI  SBG")
    @Column(name = "CODI_SBG", nullable = false, insertable=true, updatable=true)
        private java.lang.Long CODI_SBG;



    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CODIPESLANREG")
    @Column(name = "CODIPESLANREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CODIPESLANREG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CODIPESMANUTREG")
    @Column(name = "CODIPESMANUTREG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CODIPESMANUTREG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CODI  BDC")
    @Column(name = "CODI_BDC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CODI_BDC;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CODI  CRO")
    @Column(name = "CODI_CRO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CODI_CRO;


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
    @CronappColumn(attributeType="STRING", label="DESC  SBG")
    @Column(name = "DESC_SBG", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String DESC_SBG;


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
    @CronappColumn(attributeType="STRING", label="IMAR  SBG")
    @Column(name = "IMAR_SBG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IMAR_SBG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IVD 2 SBG")
    @Column(name = "IVD2_SBG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IVD2_SBG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MLUC  SBG")
    @Column(name = "MLUC_SBG", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MLUC_SBG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITU  SBG")
    @Column(name = "SITU_SBG", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITU_SBG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="TABE  CTA")
    @Column(name = "TABE_CTA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long TABE_CTA;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VHIT  SBG")
    @Column(name = "VHIT_SBG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String VHIT_SBG;


    /**
    * Construtor
    * @generated
    */
    public SUBGRUPO(){
    }

    /**
    * Obtém CODI_GPR
    * return CODI_GPR
    * @generated
    */
    public java.lang.Long getCODI_GPR() {
        return this.CODI_GPR;
    }

    /**
    * Define CODI_GPR
    * @param CODI_GPR CODI_GPR
    * @generated
    */
    public SUBGRUPO setCODI_GPR(java.lang.Long CODI_GPR) {
        this.CODI_GPR = CODI_GPR;
        return this;
    }
    /**
    * Obtém CODI_SBG
    * return CODI_SBG
    * @generated
    */
    public java.lang.Long getCODI_SBG() {
        return this.CODI_SBG;
    }

    /**
    * Define CODI_SBG
    * @param CODI_SBG CODI_SBG
    * @generated
    */
    public SUBGRUPO setCODI_SBG(java.lang.Long CODI_SBG) {
        this.CODI_SBG = CODI_SBG;
        return this;
    }
    /**
    * Obtém CODIPESLANREG
    * return CODIPESLANREG
    * @generated
    */
    public java.lang.Long getCODIPESLANREG() {
        return this.CODIPESLANREG;
    }

    /**
    * Define CODIPESLANREG
    * @param CODIPESLANREG CODIPESLANREG
    * @generated
    */
    public SUBGRUPO setCODIPESLANREG(java.lang.Long CODIPESLANREG) {
        this.CODIPESLANREG = CODIPESLANREG;
        return this;
    }
    /**
    * Obtém CODIPESMANUTREG
    * return CODIPESMANUTREG
    * @generated
    */
    public java.lang.Long getCODIPESMANUTREG() {
        return this.CODIPESMANUTREG;
    }

    /**
    * Define CODIPESMANUTREG
    * @param CODIPESMANUTREG CODIPESMANUTREG
    * @generated
    */
    public SUBGRUPO setCODIPESMANUTREG(java.lang.Long CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CODI_BDC
    * return CODI_BDC
    * @generated
    */
    public java.lang.Long getCODI_BDC() {
        return this.CODI_BDC;
    }

    /**
    * Define CODI_BDC
    * @param CODI_BDC CODI_BDC
    * @generated
    */
    public SUBGRUPO setCODI_BDC(java.lang.Long CODI_BDC) {
        this.CODI_BDC = CODI_BDC;
        return this;
    }
    /**
    * Obtém CODI_CRO
    * return CODI_CRO
    * @generated
    */
    public java.lang.Long getCODI_CRO() {
        return this.CODI_CRO;
    }

    /**
    * Define CODI_CRO
    * @param CODI_CRO CODI_CRO
    * @generated
    */
    public SUBGRUPO setCODI_CRO(java.lang.Long CODI_CRO) {
        this.CODI_CRO = CODI_CRO;
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
    public SUBGRUPO setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DESC_SBG
    * return DESC_SBG
    * @generated
    */
    public java.lang.String getDESC_SBG() {
        return this.DESC_SBG;
    }

    /**
    * Define DESC_SBG
    * @param DESC_SBG DESC_SBG
    * @generated
    */
    public SUBGRUPO setDESC_SBG(java.lang.String DESC_SBG) {
        this.DESC_SBG = DESC_SBG;
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
    public SUBGRUPO setDINSERT(java.util.Date DINSERT) {
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
    public SUBGRUPO setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public SUBGRUPO setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém IMAR_SBG
    * return IMAR_SBG
    * @generated
    */
    public java.lang.String getIMAR_SBG() {
        return this.IMAR_SBG;
    }

    /**
    * Define IMAR_SBG
    * @param IMAR_SBG IMAR_SBG
    * @generated
    */
    public SUBGRUPO setIMAR_SBG(java.lang.String IMAR_SBG) {
        this.IMAR_SBG = IMAR_SBG;
        return this;
    }
    /**
    * Obtém IVD2_SBG
    * return IVD2_SBG
    * @generated
    */
    public java.lang.String getIVD2_SBG() {
        return this.IVD2_SBG;
    }

    /**
    * Define IVD2_SBG
    * @param IVD2_SBG IVD2_SBG
    * @generated
    */
    public SUBGRUPO setIVD2_SBG(java.lang.String IVD2_SBG) {
        this.IVD2_SBG = IVD2_SBG;
        return this;
    }
    /**
    * Obtém MLUC_SBG
    * return MLUC_SBG
    * @generated
    */
    public java.lang.Double getMLUC_SBG() {
        return this.MLUC_SBG;
    }

    /**
    * Define MLUC_SBG
    * @param MLUC_SBG MLUC_SBG
    * @generated
    */
    public SUBGRUPO setMLUC_SBG(java.lang.Double MLUC_SBG) {
        this.MLUC_SBG = MLUC_SBG;
        return this;
    }
    /**
    * Obtém SITU_SBG
    * return SITU_SBG
    * @generated
    */
    public java.lang.String getSITU_SBG() {
        return this.SITU_SBG;
    }

    /**
    * Define SITU_SBG
    * @param SITU_SBG SITU_SBG
    * @generated
    */
    public SUBGRUPO setSITU_SBG(java.lang.String SITU_SBG) {
        this.SITU_SBG = SITU_SBG;
        return this;
    }
    /**
    * Obtém TABE_CTA
    * return TABE_CTA
    * @generated
    */
    public java.lang.Long getTABE_CTA() {
        return this.TABE_CTA;
    }

    /**
    * Define TABE_CTA
    * @param TABE_CTA TABE_CTA
    * @generated
    */
    public SUBGRUPO setTABE_CTA(java.lang.Long TABE_CTA) {
        this.TABE_CTA = TABE_CTA;
        return this;
    }
    /**
    * Obtém VHIT_SBG
    * return VHIT_SBG
    * @generated
    */
    public java.lang.String getVHIT_SBG() {
        return this.VHIT_SBG;
    }

    /**
    * Define VHIT_SBG
    * @param VHIT_SBG VHIT_SBG
    * @generated
    */
    public SUBGRUPO setVHIT_SBG(java.lang.String VHIT_SBG) {
        this.VHIT_SBG = VHIT_SBG;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SUBGRUPO object = (SUBGRUPO)obj;
        if (CODI_GPR != null ? !CODI_GPR.equals(object.CODI_GPR) : object.CODI_GPR != null) return false;
        if (CODI_SBG != null ? !CODI_SBG.equals(object.CODI_SBG) : object.CODI_SBG != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_GPR == null) ? 0 : CODI_GPR.hashCode());
        result = 31 * result + ((CODI_SBG == null) ? 0 : CODI_SBG.hashCode());
        return result;
    }

}
