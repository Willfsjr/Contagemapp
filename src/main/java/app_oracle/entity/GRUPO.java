
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
* Classe que representa a tabela GRUPO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"GRUPO\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.GRUPO")
@CronappTable(role=CronappTableRole.AUTO)
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
    @CronappColumn(attributeType="LONG", label="CODI  GPR")
    @Column(name = "CODI_GPR", nullable = false, insertable=true, updatable=true)
        private java.lang.Long CODI_GPR;


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
    @CronappColumn(attributeType="DOUBLE", label="CTAB  GPR")
    @Column(name = "CTAB_GPR", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CTAB_GPR;


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
    @CronappColumn(attributeType="STRING", label="DESC  GPR")
    @Column(name = "DESC_GPR", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String DESC_GPR;


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
    @CronappColumn(attributeType="DOUBLE", label="FTAB  GPR")
    @Column(name = "FTAB_GPR", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double FTAB_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IVCD  GPR")
    @Column(name = "IVCD_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IVCD_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IVD 2 GPR")
    @Column(name = "IVD2_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IVD2_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PVPC  GPR")
    @Column(name = "PVPC_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PVPC_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="QADC  GPR")
    @Column(name = "QADC_GPR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long QADC_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITU  GPR")
    @Column(name = "SITU_GPR", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITU_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UADC  GPR")
    @Column(name = "UADC_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UADC_GPR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UCVT  GPR")
    @Column(name = "UCVT_GPR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UCVT_GPR;


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
    public java.lang.Long getCODI_GPR() {
        return this.CODI_GPR;
    }

    /**
    * Define CODI_GPR
    * @param CODI_GPR CODI_GPR
    * @generated
    */
    public GRUPO setCODI_GPR(java.lang.Long CODI_GPR) {
        this.CODI_GPR = CODI_GPR;
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
    public GRUPO setCODIPESLANREG(java.lang.Long CODIPESLANREG) {
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
    public GRUPO setCODIPESMANUTREG(java.lang.Long CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CTAB_GPR
    * return CTAB_GPR
    * @generated
    */
    public java.lang.Double getCTAB_GPR() {
        return this.CTAB_GPR;
    }

    /**
    * Define CTAB_GPR
    * @param CTAB_GPR CTAB_GPR
    * @generated
    */
    public GRUPO setCTAB_GPR(java.lang.Double CTAB_GPR) {
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
    public java.lang.String getDESC_GPR() {
        return this.DESC_GPR;
    }

    /**
    * Define DESC_GPR
    * @param DESC_GPR DESC_GPR
    * @generated
    */
    public GRUPO setDESC_GPR(java.lang.String DESC_GPR) {
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
    public java.lang.Double getFTAB_GPR() {
        return this.FTAB_GPR;
    }

    /**
    * Define FTAB_GPR
    * @param FTAB_GPR FTAB_GPR
    * @generated
    */
    public GRUPO setFTAB_GPR(java.lang.Double FTAB_GPR) {
        this.FTAB_GPR = FTAB_GPR;
        return this;
    }
    /**
    * Obtém IVCD_GPR
    * return IVCD_GPR
    * @generated
    */
    public java.lang.String getIVCD_GPR() {
        return this.IVCD_GPR;
    }

    /**
    * Define IVCD_GPR
    * @param IVCD_GPR IVCD_GPR
    * @generated
    */
    public GRUPO setIVCD_GPR(java.lang.String IVCD_GPR) {
        this.IVCD_GPR = IVCD_GPR;
        return this;
    }
    /**
    * Obtém IVD2_GPR
    * return IVD2_GPR
    * @generated
    */
    public java.lang.String getIVD2_GPR() {
        return this.IVD2_GPR;
    }

    /**
    * Define IVD2_GPR
    * @param IVD2_GPR IVD2_GPR
    * @generated
    */
    public GRUPO setIVD2_GPR(java.lang.String IVD2_GPR) {
        this.IVD2_GPR = IVD2_GPR;
        return this;
    }
    /**
    * Obtém PVPC_GPR
    * return PVPC_GPR
    * @generated
    */
    public java.lang.String getPVPC_GPR() {
        return this.PVPC_GPR;
    }

    /**
    * Define PVPC_GPR
    * @param PVPC_GPR PVPC_GPR
    * @generated
    */
    public GRUPO setPVPC_GPR(java.lang.String PVPC_GPR) {
        this.PVPC_GPR = PVPC_GPR;
        return this;
    }
    /**
    * Obtém QADC_GPR
    * return QADC_GPR
    * @generated
    */
    public java.lang.Long getQADC_GPR() {
        return this.QADC_GPR;
    }

    /**
    * Define QADC_GPR
    * @param QADC_GPR QADC_GPR
    * @generated
    */
    public GRUPO setQADC_GPR(java.lang.Long QADC_GPR) {
        this.QADC_GPR = QADC_GPR;
        return this;
    }
    /**
    * Obtém SITU_GPR
    * return SITU_GPR
    * @generated
    */
    public java.lang.String getSITU_GPR() {
        return this.SITU_GPR;
    }

    /**
    * Define SITU_GPR
    * @param SITU_GPR SITU_GPR
    * @generated
    */
    public GRUPO setSITU_GPR(java.lang.String SITU_GPR) {
        this.SITU_GPR = SITU_GPR;
        return this;
    }
    /**
    * Obtém UADC_GPR
    * return UADC_GPR
    * @generated
    */
    public java.lang.String getUADC_GPR() {
        return this.UADC_GPR;
    }

    /**
    * Define UADC_GPR
    * @param UADC_GPR UADC_GPR
    * @generated
    */
    public GRUPO setUADC_GPR(java.lang.String UADC_GPR) {
        this.UADC_GPR = UADC_GPR;
        return this;
    }
    /**
    * Obtém UCVT_GPR
    * return UCVT_GPR
    * @generated
    */
    public java.lang.String getUCVT_GPR() {
        return this.UCVT_GPR;
    }

    /**
    * Define UCVT_GPR
    * @param UCVT_GPR UCVT_GPR
    * @generated
    */
    public GRUPO setUCVT_GPR(java.lang.String UCVT_GPR) {
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
