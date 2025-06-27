
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
* Classe que representa a tabela CODBARRA
* @generated
*/
@jakarta.persistence.Entity
@IdClass(CODBARRAPK.class)
@jakarta.persistence.Table(name = "\"CODBARRA\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.CODBARRA")
public class CODBARRA implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "CODI_BAR", nullable = false, length=14, insertable=true, updatable=true)
        private String CODI_BAR;

    /**
    * @generated
    */
    @Id
    @Column(name = "CODI_PSV", nullable = false, length=15, insertable=true, updatable=true)
        private String CODI_PSV;



    /**
    * @generated
    */
    @Column(name = "CGTI_BAR", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private String CGTI_BAR;


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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DGTI_BAR", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DGTI_BAR;


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
    @Column(name = "FCON_BAR", nullable = false, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double FCON_BAR;


    /**
    * @generated
    */
    @Column(name = "GTIN_BAR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String GTIN_BAR;


    /**
    * @generated
    */
    @Column(name = "MGTI_BAR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String MGTI_BAR;


    /**
    * @generated
    */
    @Column(name = "NGTI_BAR", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private String NGTI_BAR;


    /**
    * @generated
    */
    @Column(name = "RGTI_BAR", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private String RGTI_BAR;


    /**
    * @generated
    */
    @Column(name = "SGTI_BAR", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String SGTI_BAR;


    /**
    * @generated
    */
    @Column(name = "STAG_BAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer STAG_BAR;


    /**
    * @generated
    */
    @Column(name = "TCOD_BAR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String TCOD_BAR;


    /**
    * @generated
    */
    @Column(name = "TGTI_BAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer TGTI_BAR;


    /**
    * @generated
    */
    @Column(name = "UNID_BAR", nullable = false, unique = false, length=14, insertable=true, updatable=true)
        
        private String UNID_BAR;


    /**
    * @generated
    */
    @Column(name = "VGTI_BAR", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String VGTI_BAR;


    /**
    * Construtor
    * @generated
    */
    public CODBARRA(){
    }

    /**
    * Obtém CODI_BAR
    * return CODI_BAR
    * @generated
    */
    public String getCODI_BAR() {
        return this.CODI_BAR;
    }

    /**
    * Define CODI_BAR
    * @param CODI_BAR CODI_BAR
    * @generated
    */
    public CODBARRA setCODI_BAR(String CODI_BAR) {
        this.CODI_BAR = CODI_BAR;
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
    public CODBARRA setCODI_PSV(String CODI_PSV) {
        this.CODI_PSV = CODI_PSV;
        return this;
    }
    /**
    * Obtém CGTI_BAR
    * return CGTI_BAR
    * @generated
    */
    public String getCGTI_BAR() {
        return this.CGTI_BAR;
    }

    /**
    * Define CGTI_BAR
    * @param CGTI_BAR CGTI_BAR
    * @generated
    */
    public CODBARRA setCGTI_BAR(String CGTI_BAR) {
        this.CGTI_BAR = CGTI_BAR;
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
    public CODBARRA setCODIPESLANREG(Integer CODIPESLANREG) {
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
    public CODBARRA setCODIPESMANUTREG(Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
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
    public CODBARRA setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DGTI_BAR
    * return DGTI_BAR
    * @generated
    */
    public java.util.Date getDGTI_BAR() {
        return this.DGTI_BAR;
    }

    /**
    * Define DGTI_BAR
    * @param DGTI_BAR DGTI_BAR
    * @generated
    */
    public CODBARRA setDGTI_BAR(java.util.Date DGTI_BAR) {
        this.DGTI_BAR = DGTI_BAR;
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
    public CODBARRA setDINSERT(java.util.Date DINSERT) {
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
    public CODBARRA setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public CODBARRA setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém FCON_BAR
    * return FCON_BAR
    * @generated
    */
    public Double getFCON_BAR() {
        return this.FCON_BAR;
    }

    /**
    * Define FCON_BAR
    * @param FCON_BAR FCON_BAR
    * @generated
    */
    public CODBARRA setFCON_BAR(Double FCON_BAR) {
        this.FCON_BAR = FCON_BAR;
        return this;
    }
    /**
    * Obtém GTIN_BAR
    * return GTIN_BAR
    * @generated
    */
    public String getGTIN_BAR() {
        return this.GTIN_BAR;
    }

    /**
    * Define GTIN_BAR
    * @param GTIN_BAR GTIN_BAR
    * @generated
    */
    public CODBARRA setGTIN_BAR(String GTIN_BAR) {
        this.GTIN_BAR = GTIN_BAR;
        return this;
    }
    /**
    * Obtém MGTI_BAR
    * return MGTI_BAR
    * @generated
    */
    public String getMGTI_BAR() {
        return this.MGTI_BAR;
    }

    /**
    * Define MGTI_BAR
    * @param MGTI_BAR MGTI_BAR
    * @generated
    */
    public CODBARRA setMGTI_BAR(String MGTI_BAR) {
        this.MGTI_BAR = MGTI_BAR;
        return this;
    }
    /**
    * Obtém NGTI_BAR
    * return NGTI_BAR
    * @generated
    */
    public String getNGTI_BAR() {
        return this.NGTI_BAR;
    }

    /**
    * Define NGTI_BAR
    * @param NGTI_BAR NGTI_BAR
    * @generated
    */
    public CODBARRA setNGTI_BAR(String NGTI_BAR) {
        this.NGTI_BAR = NGTI_BAR;
        return this;
    }
    /**
    * Obtém RGTI_BAR
    * return RGTI_BAR
    * @generated
    */
    public String getRGTI_BAR() {
        return this.RGTI_BAR;
    }

    /**
    * Define RGTI_BAR
    * @param RGTI_BAR RGTI_BAR
    * @generated
    */
    public CODBARRA setRGTI_BAR(String RGTI_BAR) {
        this.RGTI_BAR = RGTI_BAR;
        return this;
    }
    /**
    * Obtém SGTI_BAR
    * return SGTI_BAR
    * @generated
    */
    public String getSGTI_BAR() {
        return this.SGTI_BAR;
    }

    /**
    * Define SGTI_BAR
    * @param SGTI_BAR SGTI_BAR
    * @generated
    */
    public CODBARRA setSGTI_BAR(String SGTI_BAR) {
        this.SGTI_BAR = SGTI_BAR;
        return this;
    }
    /**
    * Obtém STAG_BAR
    * return STAG_BAR
    * @generated
    */
    public Integer getSTAG_BAR() {
        return this.STAG_BAR;
    }

    /**
    * Define STAG_BAR
    * @param STAG_BAR STAG_BAR
    * @generated
    */
    public CODBARRA setSTAG_BAR(Integer STAG_BAR) {
        this.STAG_BAR = STAG_BAR;
        return this;
    }
    /**
    * Obtém TCOD_BAR
    * return TCOD_BAR
    * @generated
    */
    public String getTCOD_BAR() {
        return this.TCOD_BAR;
    }

    /**
    * Define TCOD_BAR
    * @param TCOD_BAR TCOD_BAR
    * @generated
    */
    public CODBARRA setTCOD_BAR(String TCOD_BAR) {
        this.TCOD_BAR = TCOD_BAR;
        return this;
    }
    /**
    * Obtém TGTI_BAR
    * return TGTI_BAR
    * @generated
    */
    public Integer getTGTI_BAR() {
        return this.TGTI_BAR;
    }

    /**
    * Define TGTI_BAR
    * @param TGTI_BAR TGTI_BAR
    * @generated
    */
    public CODBARRA setTGTI_BAR(Integer TGTI_BAR) {
        this.TGTI_BAR = TGTI_BAR;
        return this;
    }
    /**
    * Obtém UNID_BAR
    * return UNID_BAR
    * @generated
    */
    public String getUNID_BAR() {
        return this.UNID_BAR;
    }

    /**
    * Define UNID_BAR
    * @param UNID_BAR UNID_BAR
    * @generated
    */
    public CODBARRA setUNID_BAR(String UNID_BAR) {
        this.UNID_BAR = UNID_BAR;
        return this;
    }
    /**
    * Obtém VGTI_BAR
    * return VGTI_BAR
    * @generated
    */
    public String getVGTI_BAR() {
        return this.VGTI_BAR;
    }

    /**
    * Define VGTI_BAR
    * @param VGTI_BAR VGTI_BAR
    * @generated
    */
    public CODBARRA setVGTI_BAR(String VGTI_BAR) {
        this.VGTI_BAR = VGTI_BAR;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CODBARRA object = (CODBARRA)obj;
        if (CODI_BAR != null ? !CODI_BAR.equals(object.CODI_BAR) : object.CODI_BAR != null) return false;
        if (CODI_PSV != null ? !CODI_PSV.equals(object.CODI_PSV) : object.CODI_PSV != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_BAR == null) ? 0 : CODI_BAR.hashCode());
        result = 31 * result + ((CODI_PSV == null) ? 0 : CODI_PSV.hashCode());
        return result;
    }

}
