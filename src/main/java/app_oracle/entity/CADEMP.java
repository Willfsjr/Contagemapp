
package app_oracle.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import cronapi.CronapiByteHeaderSignature;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela CADEMP
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CADEMP\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.CADEMP")
@CronappTable(role=CronappTableRole.CLASS)
public class CADEMP implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="CODI  EMP")
    @Column(name = "CODI_EMP", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer CODI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ABRE  MUN")
    @Column(name = "ABRE_MUN", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String ABRE_MUN;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACCC  EMP")
    @Column(name = "ACCC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ACCC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACNF  EMP")
    @Column(name = "ACNF_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ACNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACNP  EMP")
    @Column(name = "ACNP_EMP", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String ACNP_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACON  EMP")
    @Column(name = "ACON_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ACON_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACTE  EMP")
    @Column(name = "ACTE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ACTE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AECD  EMP")
    @Column(name = "AECD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AECD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AECX  EMP")
    @Column(name = "AECX_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AECX_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AMBI  EMP")
    @Column(name = "AMBI_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AMBI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AMBS  EMP")
    @Column(name = "AMBS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AMBS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ANFC  EMP")
    @Column(name = "ANFC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ANFC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ANFS  EMP")
    @Column(name = "ANFS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ANFS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ASCC  EMP")
    @Column(name = "ASCC_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ASCC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ASCT  EMP")
    @Column(name = "ASCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ASCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ASNF  EMP")
    @Column(name = "ASNF_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ASNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ASUN  EMP")
    @Column(name = "ASUN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String ASUN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ATIV  EMP")
    @Column(name = "ATIV_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String ATIV_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="AVAL  CND")
    @Column(name = "AVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String AVAL_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="BAIC  EMP")
    @Column(name = "BAIC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String BAIC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="BAIR  EMP")
    @Column(name = "BAIR_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String BAIR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CAE  EMP")
    @Column(name = "CAE_EMP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private java.lang.String CAE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CARI  EMP")
    @Column(name = "CARI_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String CARI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CAUT  CND")
    @Column(name = "CAUT_CND", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String CAUT_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CAVE  EMP")
    @Column(name = "CAVE_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CAVE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CCCT  EMP")
    @Column(name = "CCCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String CCCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CCER  EMP")
    @Column(name = "CCER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String CCER_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CENF  EMP")
    @Column(name = "CENF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String CENF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CEPC  EMP")
    @Column(name = "CEPC_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String CEPC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CEP  EMP")
    @Column(name = "CEP_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String CEP_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CHEK  EMP")
    @Column(name = "CHEK_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String CHEK_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CICE  EMP")
    @Column(name = "CICE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CICE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CIMA  EMP")
    @Column(name = "CIMA_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String CIMA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CJUR  EMP")
    @Column(name = "CJUR_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CJUR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CLIA  EMP")
    @Column(name = "CLIA_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CLIA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CMAT  EMP")
    @Column(name = "CMAT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CMAT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CMER  EMP")
    @Column(name = "CMER_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CMER_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CNFS  EMP")
    @Column(name = "CNFS_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String CNFS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CNPJ  EMP")
    @Column(name = "CNPJ_EMP", nullable = false, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String CNPJ_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="COD 1 TRA")
    @Column(name = "COD1_TRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer COD1_TRA;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="COD 2 TRA")
    @Column(name = "COD2_TRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer COD2_TRA;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODA  EMP")
    @Column(name = "CODA_EMP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private java.lang.String CODA_EMP;


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
    @CronappColumn(attributeType="INTEGER", label="CODI  AUD")
    @Column(name = "CODI_AUD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_AUD;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  CND")
    @Column(name = "CODI_CND", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String CODI_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  CTD")
    @Column(name = "CODI_CTD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_CTD;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  FCR")
    @Column(name = "CODI_FCR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_FCR;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  INS")
    @Column(name = "CODI_INS", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String CODI_INS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  MUN")
    @Column(name = "CODI_MUN", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_MUN;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CODI  PES")
    @Column(name = "CODI_PES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CODI_PES;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODI  PRF")
    @Column(name = "CODI_PRF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CODI_PRF;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CODM  EMP")
    @Column(name = "CODM_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String CODM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="COMP  EMP")
    @Column(name = "COMP_EMP", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String COMP_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CONT  EMP")
    @Column(name = "CONT_EMP", nullable = true, unique = false, length=65, insertable=true, updatable=true)
        
        private java.lang.String CONT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CPON  EMP")
    @Column(name = "CPON_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String CPON_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CTRL  SOE")
    @Column(name = "CTRL_SOE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer CTRL_SOE;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="CVEN  EMP")
    @Column(name = "CVEN_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double CVEN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CXPO  EMP")
    @Column(name = "CXPO_EMP", nullable = true, unique = false, length=6, insertable=true, updatable=true)
        
        private java.lang.String CXPO_EMP;


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
    @CronappColumn(attributeType="STRING", label="DCCT  EMP")
    @Column(name = "DCCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String DCCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DCER  EMP")
    @Column(name = "DCER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String DCER_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DCON  EMP")
    @Column(name = "DCON_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DCON_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DDES  EMP")
    @Column(name = "DDES_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DDES_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DFIN  EMP")
    @Column(name = "DFIN_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DFIN_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DFU  EMP")
    @Column(name = "DFU_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DFU_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DICC  EMP")
    @Column(name = "DICC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DICC_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DICP  EMP")
    @Column(name = "DICP_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DICP_EMP;


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
    @CronappColumn(attributeType="DATETIME", label="DJC  EMP")
    @Column(name = "DJC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DJC_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DSEF  EMP")
    @Column(name = "DSEF_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DSEF_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DTIC  EMP")
    @Column(name = "DTIC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DTIC_EMP;


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
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DVCR  EMP")
    @Column(name = "DVCR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVCR_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DVCV  EMP")
    @Column(name = "DVCV_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVCV_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="DVTR  EMP")
    @Column(name = "DVTR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVTR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EACA  EMP")
    @Column(name = "EACA_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String EACA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EASS  EMP")
    @Column(name = "EASS_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String EASS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EBNS  EMP")
    @Column(name = "EBNS_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String EBNS_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="ECDT  EMP")
    @Column(name = "ECDT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date ECDT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ECER  EMP")
    @Column(name = "ECER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ECER_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ECHR  EMP")
    @Column(name = "ECHR_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String ECHR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EDCE  EMP")
    @Column(name = "EDCE_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String EDCE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EDIS  EMP")
    @Column(name = "EDIS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String EDIS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EECC  EMP")
    @Column(name = "EECC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String EECC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EEMA  EMP")
    @Column(name = "EEMA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String EEMA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EGRP  EMP")
    @Column(name = "EGRP_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String EGRP_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ELTR  EMP")
    @Column(name = "ELTR_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ELTR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EMAC  EMP")
    @Column(name = "EMAC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String EMAC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EMAI  EMP")
    @Column(name = "EMAI_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String EMAI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EMCA  EMP")
    @Column(name = "EMCA_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String EMCA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="EMPR  FOL")
    @Column(name = "EMPR_FOL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer EMPR_FOL;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EMSG  EMP")
    @Column(name = "EMSG_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String EMSG_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ENDC  EMP")
    @Column(name = "ENDC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String ENDC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ENDE  EMP")
    @Column(name = "ENDE_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String ENDE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ENVE  EMP")
    @Column(name = "ENVE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ENVE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ESCN  EMP")
    @Column(name = "ESCN_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ESCN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ESER  EMP")
    @Column(name = "ESER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String ESER_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ESUB  EMP")
    @Column(name = "ESUB_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String ESUB_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="EULL  EMP")
    @Column(name = "EULL_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer EULL_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="EUTE  EMP")
    @Column(name = "EUTE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String EUTE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FANT  EMP")
    @Column(name = "FANT_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String FANT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FAXC  EMP")
    @Column(name = "FAXC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String FAXC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FAX  EMP")
    @Column(name = "FAX_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String FAX_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FDCT  EMP")
    @Column(name = "FDCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String FDCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FONC  EMP")
    @Column(name = "FONC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String FONC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FONE  EMP")
    @Column(name = "FONE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String FONE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FORE  EMP")
    @Column(name = "FORE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String FORE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="GPDF  EMP")
    @Column(name = "GPDF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String GPDF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="GPZE  EMP")
    @Column(name = "GPZE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String GPZE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="HCON  EMP")
    @Column(name = "HCON_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String HCON_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IDAF  EMP")
    @Column(name = "IDAF_EMP", nullable = true, unique = false, length=25, insertable=true, updatable=true)
        
        private java.lang.String IDAF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IDAT  EMP")
    @Column(name = "IDAT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IDAT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IDCT  EMP")
    @Column(name = "IDCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IDCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IDEN  EMP")
    @Column(name = "IDEN_EMP", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String IDEN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ILOG  EMP")
    @Column(name = "ILOG_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ILOG_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IMCA  EMP")
    @Column(name = "IMCA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IMCA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IMHS  EMP")
    @Column(name = "IMHS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IMHS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INDD  EMP")
    @Column(name = "INDD_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String INDD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INE  EMP")
    @Column(name = "INE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String INE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INM  EMP")
    @Column(name = "INM_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String INM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INST  EMP")
    @Column(name = "INST_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String INST_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INTC  EMP")
    @Column(name = "INTC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String INTC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="INTE  EMP")
    @Column(name = "INTE_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String INTE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ITAX  SEM")
    @Column(name = "ITAX_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ITAX_SEM;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="IUCD  EMP")
    @Column(name = "IUCD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String IUCD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="IVLR  EMP")
    @Column(name = "IVLR_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double IVLR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="LAUD  EMP")
    @Column(name = "LAUD_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String LAUD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="LCTE  EMP")
    @Column(name = "LCTE_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer LCTE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="LMDF  EMP")
    @Column(name = "LMDF_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer LMDF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="IMAGE_DATABASE", label="LOGO  EMP")
    @Column(name = "LOGO_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private byte[] LOGO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="LTRA  EMP")
    @Column(name = "LTRA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String LTRA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MCNF  EMP")
    @Column(name = "MCNF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String MCNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MDCT  EMP")
    @Column(name = "MDCT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MDCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MECT  EMP")
    @Column(name = "MECT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MECT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MICT  EMP")
    @Column(name = "MICT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MICT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="MOD  EMP")
    @Column(name = "MOD_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer MOD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MPCT  EMP")
    @Column(name = "MPCT_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String MPCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MSCC  EMP")
    @Column(name = "MSCC_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String MSCC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="MSCT  EMP")
    @Column(name = "MSCT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double MSCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MSIM  EMP")
    @Column(name = "MSIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String MSIM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="MSNF  EMP")
    @Column(name = "MSNF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String MSNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="MUNC  EMP")
    @Column(name = "MUNC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer MUNC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NCRE  EMP")
    @Column(name = "NCRE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String NCRE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NCVI  EMP")
    @Column(name = "NCVI_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String NCVI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NESO  EMP")
    @Column(name = "NESO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NESO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NFC 4 EMP")
    @Column(name = "NFC4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NFC4_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NFE 4 EMP")
    @Column(name = "NFE4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NFE4_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NFEC  EMP")
    @Column(name = "NFEC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NFEC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NFES  EMP")
    @Column(name = "NFES_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NFES_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NFLT  EMP")
    @Column(name = "NFLT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NFLT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NGRE  EMP")
    @Column(name = "NGRE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String NGRE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NIRE  EMP")
    @Column(name = "NIRE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String NIRE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NLCC  EMP")
    @Column(name = "NLCC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NLCC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NLIC  EMP")
    @Column(name = "NLIC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String NLIC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NLTS  EMP")
    @Column(name = "NLTS_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NLTS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NREG  EMP")
    @Column(name = "NREG_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String NREG_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NRLT  EMP")
    @Column(name = "NRLT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NRLT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NSCE  EMP")
    @Column(name = "NSCE_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String NSCE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NSCT  EMP")
    @Column(name = "NSCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String NSCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NTAR  EMP")
    @Column(name = "NTAR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NTAR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NTCT  EMP")
    @Column(name = "NTCT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NTCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="NUCO  EMP")
    @Column(name = "NUCO_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer NUCO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NUMC  EMP")
    @Column(name = "NUMC_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String NUMC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="NUME  EMP")
    @Column(name = "NUME_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String NUME_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ORIM  EMP")
    @Column(name = "ORIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String ORIM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PDCB  EMP")
    @Column(name = "PDCB_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PDCB_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PDCC  EMP")
    @Column(name = "PDCC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PDCC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PDCD  EMP")
    @Column(name = "PDCD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PDCD_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PDCE  EMP")
    @Column(name = "PDCE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PDCE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PDCR  EMP")
    @Column(name = "PDCR_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PDCR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="PEFI  EMP")
    @Column(name = "PEFI_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer PEFI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PICT  EMP")
    @Column(name = "PICT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PICT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PORE  EMP")
    @Column(name = "PORE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String PORE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="PPAR  EMP")
    @Column(name = "PPAR_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] PPAR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RAZA  EMP")
    @Column(name = "RAZA_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String RAZA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="REGI  EMP")
    @Column(name = "REGI_EMP", nullable = true, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.String REGI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RENA  EMP")
    @Column(name = "RENA_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String RENA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RNTC  EMP")
    @Column(name = "RNTC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String RNTC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RQFA  EMP")
    @Column(name = "RQFA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String RQFA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RREC  EMP")
    @Column(name = "RREC_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String RREC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="RVAL  CND")
    @Column(name = "RVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String RVAL_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SAPM  EMP")
    @Column(name = "SAPM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SAPM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SCAN  EMP")
    @Column(name = "SCAN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SCAN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SCNF  EMP")
    @Column(name = "SCNF_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SCNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SCST  EMP")
    @Column(name = "SCST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SCST_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SENV  EMP")
    @Column(name = "SENV_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SENV_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SHAB  EMP")
    @Column(name = "SHAB_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String SHAB_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SINI  EMP")
    @Column(name = "SINI_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SINI_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SINP  EMP")
    @Column(name = "SINP_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SINP_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SINU  EMP")
    @Column(name = "SINU_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SINU_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITE  CND")
    @Column(name = "SITE_CND", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String SITE_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SITU  EMP")
    @Column(name = "SITU_EMP", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SITU_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SLOG  EMP")
    @Column(name = "SLOG_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String SLOG_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SNFC  EMP")
    @Column(name = "SNFC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SNFC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SOUT  EMP")
    @Column(name = "SOUT_EMP", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String SOUT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SPAT  EMP")
    @Column(name = "SPAT_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String SPAT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="SPCE  EMP")
    @Column(name = "SPCE_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer SPCE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SPIT  EMP")
    @Column(name = "SPIT_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String SPIT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SPMA  EMP")
    @Column(name = "SPMA_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String SPMA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SPNA  EMP")
    @Column(name = "SPNA_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String SPNA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SPTC  EMP")
    @Column(name = "SPTC_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String SPTC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SRES  EMP")
    @Column(name = "SRES_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SRES_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SRET  EMP")
    @Column(name = "SRET_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SRET_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SROU  EMP")
    @Column(name = "SROU_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String SROU_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWCA  EMP")
    @Column(name = "SWCA_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWCA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWCO  EMP")
    @Column(name = "SWCO_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWCO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWIN  EMP")
    @Column(name = "SWIN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWIN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWRC  EMP")
    @Column(name = "SWRC_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWRC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWRT  EMP")
    @Column(name = "SWRT_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWRT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="SWST  EMP")
    @Column(name = "SWST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String SWST_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TBLO  SEM")
    @Column(name = "TBLO_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String TBLO_SEM;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="TCCO  EMP")
    @Column(name = "TCCO_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double TCCO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="TCRE  EMP")
    @Column(name = "TCRE_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private java.lang.Double TCRE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TIPO  EMP")
    @Column(name = "TIPO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String TIPO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TJUR  EMP")
    @Column(name = "TJUR_EMP", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String TJUR_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TPAG  EMP")
    @Column(name = "TPAG_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String TPAG_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TVAL  CND")
    @Column(name = "TVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String TVAL_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UCFO  EMP")
    @Column(name = "UCFO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UCFO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UCRC  EMP")
    @Column(name = "UCRC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UCRC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UECF  EMP")
    @Column(name = "UECF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UECF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UPAF  EMP")
    @Column(name = "UPAF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UPAF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UTEV  EMP")
    @Column(name = "UTEV_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String UTEV_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="VALI  CND")
    @Column(name = "VALI_CND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date VALI_CND;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VEND  EMP")
    @Column(name = "VEND_EMP", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String VEND_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VERS  EMP")
    @Column(name = "VERS_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String VERS_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VIIM  EMP")
    @Column(name = "VIIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String VIIM_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VMCT  EMP")
    @Column(name = "VMCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String VMCT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VNF 4 EMP")
    @Column(name = "VNF4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String VNF4_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="VTAX  SEM")
    @Column(name = "VTAX_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String VTAX_SEM;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WCAN  EMP")
    @Column(name = "WCAN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WCAN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WCNF  EMP")
    @Column(name = "WCNF_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WCNF_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WCST  EMP")
    @Column(name = "WCST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WCST_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WENV  EMP")
    @Column(name = "WENV_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WENV_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WESE  EMP")
    @Column(name = "WESE_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WESE_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WINU  EMP")
    @Column(name = "WINU_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WINU_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WRET  EMP")
    @Column(name = "WRET_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WRET_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSCA  EMP")
    @Column(name = "WSCA_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSCA_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSCO  EMP")
    @Column(name = "WSCO_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSCO_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSIN  EMP")
    @Column(name = "WSIN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSIN_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSRC  EMP")
    @Column(name = "WSRC_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSRC_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSRT  EMP")
    @Column(name = "WSRT_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSRT_EMP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="WSST  EMP")
    @Column(name = "WSST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String WSST_EMP;


    /**
    * Construtor
    * @generated
    */
    public CADEMP(){
    }

    /**
    * Obtém CODI_EMP
    * return CODI_EMP
    * @generated
    */
    public java.lang.Integer getCODI_EMP() {
        return this.CODI_EMP;
    }

    /**
    * Define CODI_EMP
    * @param CODI_EMP CODI_EMP
    * @generated
    */
    public CADEMP setCODI_EMP(java.lang.Integer CODI_EMP) {
        this.CODI_EMP = CODI_EMP;
        return this;
    }
    /**
    * Obtém ABRE_MUN
    * return ABRE_MUN
    * @generated
    */
    public java.lang.String getABRE_MUN() {
        return this.ABRE_MUN;
    }

    /**
    * Define ABRE_MUN
    * @param ABRE_MUN ABRE_MUN
    * @generated
    */
    public CADEMP setABRE_MUN(java.lang.String ABRE_MUN) {
        this.ABRE_MUN = ABRE_MUN;
        return this;
    }
    /**
    * Obtém ACCC_EMP
    * return ACCC_EMP
    * @generated
    */
    public java.lang.String getACCC_EMP() {
        return this.ACCC_EMP;
    }

    /**
    * Define ACCC_EMP
    * @param ACCC_EMP ACCC_EMP
    * @generated
    */
    public CADEMP setACCC_EMP(java.lang.String ACCC_EMP) {
        this.ACCC_EMP = ACCC_EMP;
        return this;
    }
    /**
    * Obtém ACNF_EMP
    * return ACNF_EMP
    * @generated
    */
    public java.lang.String getACNF_EMP() {
        return this.ACNF_EMP;
    }

    /**
    * Define ACNF_EMP
    * @param ACNF_EMP ACNF_EMP
    * @generated
    */
    public CADEMP setACNF_EMP(java.lang.String ACNF_EMP) {
        this.ACNF_EMP = ACNF_EMP;
        return this;
    }
    /**
    * Obtém ACNP_EMP
    * return ACNP_EMP
    * @generated
    */
    public java.lang.String getACNP_EMP() {
        return this.ACNP_EMP;
    }

    /**
    * Define ACNP_EMP
    * @param ACNP_EMP ACNP_EMP
    * @generated
    */
    public CADEMP setACNP_EMP(java.lang.String ACNP_EMP) {
        this.ACNP_EMP = ACNP_EMP;
        return this;
    }
    /**
    * Obtém ACON_EMP
    * return ACON_EMP
    * @generated
    */
    public java.lang.String getACON_EMP() {
        return this.ACON_EMP;
    }

    /**
    * Define ACON_EMP
    * @param ACON_EMP ACON_EMP
    * @generated
    */
    public CADEMP setACON_EMP(java.lang.String ACON_EMP) {
        this.ACON_EMP = ACON_EMP;
        return this;
    }
    /**
    * Obtém ACTE_EMP
    * return ACTE_EMP
    * @generated
    */
    public java.lang.String getACTE_EMP() {
        return this.ACTE_EMP;
    }

    /**
    * Define ACTE_EMP
    * @param ACTE_EMP ACTE_EMP
    * @generated
    */
    public CADEMP setACTE_EMP(java.lang.String ACTE_EMP) {
        this.ACTE_EMP = ACTE_EMP;
        return this;
    }
    /**
    * Obtém AECD_EMP
    * return AECD_EMP
    * @generated
    */
    public java.lang.String getAECD_EMP() {
        return this.AECD_EMP;
    }

    /**
    * Define AECD_EMP
    * @param AECD_EMP AECD_EMP
    * @generated
    */
    public CADEMP setAECD_EMP(java.lang.String AECD_EMP) {
        this.AECD_EMP = AECD_EMP;
        return this;
    }
    /**
    * Obtém AECX_EMP
    * return AECX_EMP
    * @generated
    */
    public java.lang.String getAECX_EMP() {
        return this.AECX_EMP;
    }

    /**
    * Define AECX_EMP
    * @param AECX_EMP AECX_EMP
    * @generated
    */
    public CADEMP setAECX_EMP(java.lang.String AECX_EMP) {
        this.AECX_EMP = AECX_EMP;
        return this;
    }
    /**
    * Obtém AMBI_EMP
    * return AMBI_EMP
    * @generated
    */
    public java.lang.String getAMBI_EMP() {
        return this.AMBI_EMP;
    }

    /**
    * Define AMBI_EMP
    * @param AMBI_EMP AMBI_EMP
    * @generated
    */
    public CADEMP setAMBI_EMP(java.lang.String AMBI_EMP) {
        this.AMBI_EMP = AMBI_EMP;
        return this;
    }
    /**
    * Obtém AMBS_EMP
    * return AMBS_EMP
    * @generated
    */
    public java.lang.String getAMBS_EMP() {
        return this.AMBS_EMP;
    }

    /**
    * Define AMBS_EMP
    * @param AMBS_EMP AMBS_EMP
    * @generated
    */
    public CADEMP setAMBS_EMP(java.lang.String AMBS_EMP) {
        this.AMBS_EMP = AMBS_EMP;
        return this;
    }
    /**
    * Obtém ANFC_EMP
    * return ANFC_EMP
    * @generated
    */
    public java.lang.String getANFC_EMP() {
        return this.ANFC_EMP;
    }

    /**
    * Define ANFC_EMP
    * @param ANFC_EMP ANFC_EMP
    * @generated
    */
    public CADEMP setANFC_EMP(java.lang.String ANFC_EMP) {
        this.ANFC_EMP = ANFC_EMP;
        return this;
    }
    /**
    * Obtém ANFS_EMP
    * return ANFS_EMP
    * @generated
    */
    public java.lang.String getANFS_EMP() {
        return this.ANFS_EMP;
    }

    /**
    * Define ANFS_EMP
    * @param ANFS_EMP ANFS_EMP
    * @generated
    */
    public CADEMP setANFS_EMP(java.lang.String ANFS_EMP) {
        this.ANFS_EMP = ANFS_EMP;
        return this;
    }
    /**
    * Obtém ASCC_EMP
    * return ASCC_EMP
    * @generated
    */
    public java.lang.String getASCC_EMP() {
        return this.ASCC_EMP;
    }

    /**
    * Define ASCC_EMP
    * @param ASCC_EMP ASCC_EMP
    * @generated
    */
    public CADEMP setASCC_EMP(java.lang.String ASCC_EMP) {
        this.ASCC_EMP = ASCC_EMP;
        return this;
    }
    /**
    * Obtém ASCT_EMP
    * return ASCT_EMP
    * @generated
    */
    public java.lang.String getASCT_EMP() {
        return this.ASCT_EMP;
    }

    /**
    * Define ASCT_EMP
    * @param ASCT_EMP ASCT_EMP
    * @generated
    */
    public CADEMP setASCT_EMP(java.lang.String ASCT_EMP) {
        this.ASCT_EMP = ASCT_EMP;
        return this;
    }
    /**
    * Obtém ASNF_EMP
    * return ASNF_EMP
    * @generated
    */
    public java.lang.String getASNF_EMP() {
        return this.ASNF_EMP;
    }

    /**
    * Define ASNF_EMP
    * @param ASNF_EMP ASNF_EMP
    * @generated
    */
    public CADEMP setASNF_EMP(java.lang.String ASNF_EMP) {
        this.ASNF_EMP = ASNF_EMP;
        return this;
    }
    /**
    * Obtém ASUN_EMP
    * return ASUN_EMP
    * @generated
    */
    public java.lang.String getASUN_EMP() {
        return this.ASUN_EMP;
    }

    /**
    * Define ASUN_EMP
    * @param ASUN_EMP ASUN_EMP
    * @generated
    */
    public CADEMP setASUN_EMP(java.lang.String ASUN_EMP) {
        this.ASUN_EMP = ASUN_EMP;
        return this;
    }
    /**
    * Obtém ATIV_EMP
    * return ATIV_EMP
    * @generated
    */
    public java.lang.String getATIV_EMP() {
        return this.ATIV_EMP;
    }

    /**
    * Define ATIV_EMP
    * @param ATIV_EMP ATIV_EMP
    * @generated
    */
    public CADEMP setATIV_EMP(java.lang.String ATIV_EMP) {
        this.ATIV_EMP = ATIV_EMP;
        return this;
    }
    /**
    * Obtém AVAL_CND
    * return AVAL_CND
    * @generated
    */
    public java.lang.String getAVAL_CND() {
        return this.AVAL_CND;
    }

    /**
    * Define AVAL_CND
    * @param AVAL_CND AVAL_CND
    * @generated
    */
    public CADEMP setAVAL_CND(java.lang.String AVAL_CND) {
        this.AVAL_CND = AVAL_CND;
        return this;
    }
    /**
    * Obtém BAIC_EMP
    * return BAIC_EMP
    * @generated
    */
    public java.lang.String getBAIC_EMP() {
        return this.BAIC_EMP;
    }

    /**
    * Define BAIC_EMP
    * @param BAIC_EMP BAIC_EMP
    * @generated
    */
    public CADEMP setBAIC_EMP(java.lang.String BAIC_EMP) {
        this.BAIC_EMP = BAIC_EMP;
        return this;
    }
    /**
    * Obtém BAIR_EMP
    * return BAIR_EMP
    * @generated
    */
    public java.lang.String getBAIR_EMP() {
        return this.BAIR_EMP;
    }

    /**
    * Define BAIR_EMP
    * @param BAIR_EMP BAIR_EMP
    * @generated
    */
    public CADEMP setBAIR_EMP(java.lang.String BAIR_EMP) {
        this.BAIR_EMP = BAIR_EMP;
        return this;
    }
    /**
    * Obtém CAE_EMP
    * return CAE_EMP
    * @generated
    */
    public java.lang.String getCAE_EMP() {
        return this.CAE_EMP;
    }

    /**
    * Define CAE_EMP
    * @param CAE_EMP CAE_EMP
    * @generated
    */
    public CADEMP setCAE_EMP(java.lang.String CAE_EMP) {
        this.CAE_EMP = CAE_EMP;
        return this;
    }
    /**
    * Obtém CARI_EMP
    * return CARI_EMP
    * @generated
    */
    public java.lang.String getCARI_EMP() {
        return this.CARI_EMP;
    }

    /**
    * Define CARI_EMP
    * @param CARI_EMP CARI_EMP
    * @generated
    */
    public CADEMP setCARI_EMP(java.lang.String CARI_EMP) {
        this.CARI_EMP = CARI_EMP;
        return this;
    }
    /**
    * Obtém CAUT_CND
    * return CAUT_CND
    * @generated
    */
    public java.lang.String getCAUT_CND() {
        return this.CAUT_CND;
    }

    /**
    * Define CAUT_CND
    * @param CAUT_CND CAUT_CND
    * @generated
    */
    public CADEMP setCAUT_CND(java.lang.String CAUT_CND) {
        this.CAUT_CND = CAUT_CND;
        return this;
    }
    /**
    * Obtém CAVE_EMP
    * return CAVE_EMP
    * @generated
    */
    public java.lang.Double getCAVE_EMP() {
        return this.CAVE_EMP;
    }

    /**
    * Define CAVE_EMP
    * @param CAVE_EMP CAVE_EMP
    * @generated
    */
    public CADEMP setCAVE_EMP(java.lang.Double CAVE_EMP) {
        this.CAVE_EMP = CAVE_EMP;
        return this;
    }
    /**
    * Obtém CCCT_EMP
    * return CCCT_EMP
    * @generated
    */
    public java.lang.String getCCCT_EMP() {
        return this.CCCT_EMP;
    }

    /**
    * Define CCCT_EMP
    * @param CCCT_EMP CCCT_EMP
    * @generated
    */
    public CADEMP setCCCT_EMP(java.lang.String CCCT_EMP) {
        this.CCCT_EMP = CCCT_EMP;
        return this;
    }
    /**
    * Obtém CCER_EMP
    * return CCER_EMP
    * @generated
    */
    public java.lang.String getCCER_EMP() {
        return this.CCER_EMP;
    }

    /**
    * Define CCER_EMP
    * @param CCER_EMP CCER_EMP
    * @generated
    */
    public CADEMP setCCER_EMP(java.lang.String CCER_EMP) {
        this.CCER_EMP = CCER_EMP;
        return this;
    }
    /**
    * Obtém CENF_EMP
    * return CENF_EMP
    * @generated
    */
    public java.lang.String getCENF_EMP() {
        return this.CENF_EMP;
    }

    /**
    * Define CENF_EMP
    * @param CENF_EMP CENF_EMP
    * @generated
    */
    public CADEMP setCENF_EMP(java.lang.String CENF_EMP) {
        this.CENF_EMP = CENF_EMP;
        return this;
    }
    /**
    * Obtém CEPC_EMP
    * return CEPC_EMP
    * @generated
    */
    public java.lang.String getCEPC_EMP() {
        return this.CEPC_EMP;
    }

    /**
    * Define CEPC_EMP
    * @param CEPC_EMP CEPC_EMP
    * @generated
    */
    public CADEMP setCEPC_EMP(java.lang.String CEPC_EMP) {
        this.CEPC_EMP = CEPC_EMP;
        return this;
    }
    /**
    * Obtém CEP_EMP
    * return CEP_EMP
    * @generated
    */
    public java.lang.String getCEP_EMP() {
        return this.CEP_EMP;
    }

    /**
    * Define CEP_EMP
    * @param CEP_EMP CEP_EMP
    * @generated
    */
    public CADEMP setCEP_EMP(java.lang.String CEP_EMP) {
        this.CEP_EMP = CEP_EMP;
        return this;
    }
    /**
    * Obtém CHEK_EMP
    * return CHEK_EMP
    * @generated
    */
    public java.lang.String getCHEK_EMP() {
        return this.CHEK_EMP;
    }

    /**
    * Define CHEK_EMP
    * @param CHEK_EMP CHEK_EMP
    * @generated
    */
    public CADEMP setCHEK_EMP(java.lang.String CHEK_EMP) {
        this.CHEK_EMP = CHEK_EMP;
        return this;
    }
    /**
    * Obtém CICE_EMP
    * return CICE_EMP
    * @generated
    */
    public java.lang.String getCICE_EMP() {
        return this.CICE_EMP;
    }

    /**
    * Define CICE_EMP
    * @param CICE_EMP CICE_EMP
    * @generated
    */
    public CADEMP setCICE_EMP(java.lang.String CICE_EMP) {
        this.CICE_EMP = CICE_EMP;
        return this;
    }
    /**
    * Obtém CIMA_EMP
    * return CIMA_EMP
    * @generated
    */
    public java.lang.String getCIMA_EMP() {
        return this.CIMA_EMP;
    }

    /**
    * Define CIMA_EMP
    * @param CIMA_EMP CIMA_EMP
    * @generated
    */
    public CADEMP setCIMA_EMP(java.lang.String CIMA_EMP) {
        this.CIMA_EMP = CIMA_EMP;
        return this;
    }
    /**
    * Obtém CJUR_EMP
    * return CJUR_EMP
    * @generated
    */
    public java.lang.Double getCJUR_EMP() {
        return this.CJUR_EMP;
    }

    /**
    * Define CJUR_EMP
    * @param CJUR_EMP CJUR_EMP
    * @generated
    */
    public CADEMP setCJUR_EMP(java.lang.Double CJUR_EMP) {
        this.CJUR_EMP = CJUR_EMP;
        return this;
    }
    /**
    * Obtém CLIA_EMP
    * return CLIA_EMP
    * @generated
    */
    public java.lang.Integer getCLIA_EMP() {
        return this.CLIA_EMP;
    }

    /**
    * Define CLIA_EMP
    * @param CLIA_EMP CLIA_EMP
    * @generated
    */
    public CADEMP setCLIA_EMP(java.lang.Integer CLIA_EMP) {
        this.CLIA_EMP = CLIA_EMP;
        return this;
    }
    /**
    * Obtém CMAT_EMP
    * return CMAT_EMP
    * @generated
    */
    public java.lang.Integer getCMAT_EMP() {
        return this.CMAT_EMP;
    }

    /**
    * Define CMAT_EMP
    * @param CMAT_EMP CMAT_EMP
    * @generated
    */
    public CADEMP setCMAT_EMP(java.lang.Integer CMAT_EMP) {
        this.CMAT_EMP = CMAT_EMP;
        return this;
    }
    /**
    * Obtém CMER_EMP
    * return CMER_EMP
    * @generated
    */
    public java.lang.Integer getCMER_EMP() {
        return this.CMER_EMP;
    }

    /**
    * Define CMER_EMP
    * @param CMER_EMP CMER_EMP
    * @generated
    */
    public CADEMP setCMER_EMP(java.lang.Integer CMER_EMP) {
        this.CMER_EMP = CMER_EMP;
        return this;
    }
    /**
    * Obtém CNFS_EMP
    * return CNFS_EMP
    * @generated
    */
    public java.lang.String getCNFS_EMP() {
        return this.CNFS_EMP;
    }

    /**
    * Define CNFS_EMP
    * @param CNFS_EMP CNFS_EMP
    * @generated
    */
    public CADEMP setCNFS_EMP(java.lang.String CNFS_EMP) {
        this.CNFS_EMP = CNFS_EMP;
        return this;
    }
    /**
    * Obtém CNPJ_EMP
    * return CNPJ_EMP
    * @generated
    */
    public java.lang.String getCNPJ_EMP() {
        return this.CNPJ_EMP;
    }

    /**
    * Define CNPJ_EMP
    * @param CNPJ_EMP CNPJ_EMP
    * @generated
    */
    public CADEMP setCNPJ_EMP(java.lang.String CNPJ_EMP) {
        this.CNPJ_EMP = CNPJ_EMP;
        return this;
    }
    /**
    * Obtém COD1_TRA
    * return COD1_TRA
    * @generated
    */
    public java.lang.Integer getCOD1_TRA() {
        return this.COD1_TRA;
    }

    /**
    * Define COD1_TRA
    * @param COD1_TRA COD1_TRA
    * @generated
    */
    public CADEMP setCOD1_TRA(java.lang.Integer COD1_TRA) {
        this.COD1_TRA = COD1_TRA;
        return this;
    }
    /**
    * Obtém COD2_TRA
    * return COD2_TRA
    * @generated
    */
    public java.lang.Integer getCOD2_TRA() {
        return this.COD2_TRA;
    }

    /**
    * Define COD2_TRA
    * @param COD2_TRA COD2_TRA
    * @generated
    */
    public CADEMP setCOD2_TRA(java.lang.Integer COD2_TRA) {
        this.COD2_TRA = COD2_TRA;
        return this;
    }
    /**
    * Obtém CODA_EMP
    * return CODA_EMP
    * @generated
    */
    public java.lang.String getCODA_EMP() {
        return this.CODA_EMP;
    }

    /**
    * Define CODA_EMP
    * @param CODA_EMP CODA_EMP
    * @generated
    */
    public CADEMP setCODA_EMP(java.lang.String CODA_EMP) {
        this.CODA_EMP = CODA_EMP;
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
    public CADEMP setCODIPESLANREG(java.lang.Integer CODIPESLANREG) {
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
    public CADEMP setCODIPESMANUTREG(java.lang.Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CODI_AUD
    * return CODI_AUD
    * @generated
    */
    public java.lang.Integer getCODI_AUD() {
        return this.CODI_AUD;
    }

    /**
    * Define CODI_AUD
    * @param CODI_AUD CODI_AUD
    * @generated
    */
    public CADEMP setCODI_AUD(java.lang.Integer CODI_AUD) {
        this.CODI_AUD = CODI_AUD;
        return this;
    }
    /**
    * Obtém CODI_CND
    * return CODI_CND
    * @generated
    */
    public java.lang.String getCODI_CND() {
        return this.CODI_CND;
    }

    /**
    * Define CODI_CND
    * @param CODI_CND CODI_CND
    * @generated
    */
    public CADEMP setCODI_CND(java.lang.String CODI_CND) {
        this.CODI_CND = CODI_CND;
        return this;
    }
    /**
    * Obtém CODI_CTD
    * return CODI_CTD
    * @generated
    */
    public java.lang.Integer getCODI_CTD() {
        return this.CODI_CTD;
    }

    /**
    * Define CODI_CTD
    * @param CODI_CTD CODI_CTD
    * @generated
    */
    public CADEMP setCODI_CTD(java.lang.Integer CODI_CTD) {
        this.CODI_CTD = CODI_CTD;
        return this;
    }
    /**
    * Obtém CODI_FCR
    * return CODI_FCR
    * @generated
    */
    public java.lang.Integer getCODI_FCR() {
        return this.CODI_FCR;
    }

    /**
    * Define CODI_FCR
    * @param CODI_FCR CODI_FCR
    * @generated
    */
    public CADEMP setCODI_FCR(java.lang.Integer CODI_FCR) {
        this.CODI_FCR = CODI_FCR;
        return this;
    }
    /**
    * Obtém CODI_INS
    * return CODI_INS
    * @generated
    */
    public java.lang.String getCODI_INS() {
        return this.CODI_INS;
    }

    /**
    * Define CODI_INS
    * @param CODI_INS CODI_INS
    * @generated
    */
    public CADEMP setCODI_INS(java.lang.String CODI_INS) {
        this.CODI_INS = CODI_INS;
        return this;
    }
    /**
    * Obtém CODI_MUN
    * return CODI_MUN
    * @generated
    */
    public java.lang.Integer getCODI_MUN() {
        return this.CODI_MUN;
    }

    /**
    * Define CODI_MUN
    * @param CODI_MUN CODI_MUN
    * @generated
    */
    public CADEMP setCODI_MUN(java.lang.Integer CODI_MUN) {
        this.CODI_MUN = CODI_MUN;
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
    public CADEMP setCODI_PES(java.lang.Integer CODI_PES) {
        this.CODI_PES = CODI_PES;
        return this;
    }
    /**
    * Obtém CODI_PRF
    * return CODI_PRF
    * @generated
    */
    public java.lang.String getCODI_PRF() {
        return this.CODI_PRF;
    }

    /**
    * Define CODI_PRF
    * @param CODI_PRF CODI_PRF
    * @generated
    */
    public CADEMP setCODI_PRF(java.lang.String CODI_PRF) {
        this.CODI_PRF = CODI_PRF;
        return this;
    }
    /**
    * Obtém CODM_EMP
    * return CODM_EMP
    * @generated
    */
    public java.lang.String getCODM_EMP() {
        return this.CODM_EMP;
    }

    /**
    * Define CODM_EMP
    * @param CODM_EMP CODM_EMP
    * @generated
    */
    public CADEMP setCODM_EMP(java.lang.String CODM_EMP) {
        this.CODM_EMP = CODM_EMP;
        return this;
    }
    /**
    * Obtém COMP_EMP
    * return COMP_EMP
    * @generated
    */
    public java.lang.String getCOMP_EMP() {
        return this.COMP_EMP;
    }

    /**
    * Define COMP_EMP
    * @param COMP_EMP COMP_EMP
    * @generated
    */
    public CADEMP setCOMP_EMP(java.lang.String COMP_EMP) {
        this.COMP_EMP = COMP_EMP;
        return this;
    }
    /**
    * Obtém CONT_EMP
    * return CONT_EMP
    * @generated
    */
    public java.lang.String getCONT_EMP() {
        return this.CONT_EMP;
    }

    /**
    * Define CONT_EMP
    * @param CONT_EMP CONT_EMP
    * @generated
    */
    public CADEMP setCONT_EMP(java.lang.String CONT_EMP) {
        this.CONT_EMP = CONT_EMP;
        return this;
    }
    /**
    * Obtém CPON_EMP
    * return CPON_EMP
    * @generated
    */
    public java.lang.String getCPON_EMP() {
        return this.CPON_EMP;
    }

    /**
    * Define CPON_EMP
    * @param CPON_EMP CPON_EMP
    * @generated
    */
    public CADEMP setCPON_EMP(java.lang.String CPON_EMP) {
        this.CPON_EMP = CPON_EMP;
        return this;
    }
    /**
    * Obtém CTRL_SOE
    * return CTRL_SOE
    * @generated
    */
    public java.lang.Integer getCTRL_SOE() {
        return this.CTRL_SOE;
    }

    /**
    * Define CTRL_SOE
    * @param CTRL_SOE CTRL_SOE
    * @generated
    */
    public CADEMP setCTRL_SOE(java.lang.Integer CTRL_SOE) {
        this.CTRL_SOE = CTRL_SOE;
        return this;
    }
    /**
    * Obtém CVEN_EMP
    * return CVEN_EMP
    * @generated
    */
    public java.lang.Double getCVEN_EMP() {
        return this.CVEN_EMP;
    }

    /**
    * Define CVEN_EMP
    * @param CVEN_EMP CVEN_EMP
    * @generated
    */
    public CADEMP setCVEN_EMP(java.lang.Double CVEN_EMP) {
        this.CVEN_EMP = CVEN_EMP;
        return this;
    }
    /**
    * Obtém CXPO_EMP
    * return CXPO_EMP
    * @generated
    */
    public java.lang.String getCXPO_EMP() {
        return this.CXPO_EMP;
    }

    /**
    * Define CXPO_EMP
    * @param CXPO_EMP CXPO_EMP
    * @generated
    */
    public CADEMP setCXPO_EMP(java.lang.String CXPO_EMP) {
        this.CXPO_EMP = CXPO_EMP;
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
    public CADEMP setDATAULTIMASINCRONIZACAOAPI(java.util.Date DATAULTIMASINCRONIZACAOAPI) {
        this.DATAULTIMASINCRONIZACAOAPI = DATAULTIMASINCRONIZACAOAPI;
        return this;
    }
    /**
    * Obtém DCCT_EMP
    * return DCCT_EMP
    * @generated
    */
    public java.lang.String getDCCT_EMP() {
        return this.DCCT_EMP;
    }

    /**
    * Define DCCT_EMP
    * @param DCCT_EMP DCCT_EMP
    * @generated
    */
    public CADEMP setDCCT_EMP(java.lang.String DCCT_EMP) {
        this.DCCT_EMP = DCCT_EMP;
        return this;
    }
    /**
    * Obtém DCER_EMP
    * return DCER_EMP
    * @generated
    */
    public java.lang.String getDCER_EMP() {
        return this.DCER_EMP;
    }

    /**
    * Define DCER_EMP
    * @param DCER_EMP DCER_EMP
    * @generated
    */
    public CADEMP setDCER_EMP(java.lang.String DCER_EMP) {
        this.DCER_EMP = DCER_EMP;
        return this;
    }
    /**
    * Obtém DCON_EMP
    * return DCON_EMP
    * @generated
    */
    public java.util.Date getDCON_EMP() {
        return this.DCON_EMP;
    }

    /**
    * Define DCON_EMP
    * @param DCON_EMP DCON_EMP
    * @generated
    */
    public CADEMP setDCON_EMP(java.util.Date DCON_EMP) {
        this.DCON_EMP = DCON_EMP;
        return this;
    }
    /**
    * Obtém DDES_EMP
    * return DDES_EMP
    * @generated
    */
    public java.util.Date getDDES_EMP() {
        return this.DDES_EMP;
    }

    /**
    * Define DDES_EMP
    * @param DDES_EMP DDES_EMP
    * @generated
    */
    public CADEMP setDDES_EMP(java.util.Date DDES_EMP) {
        this.DDES_EMP = DDES_EMP;
        return this;
    }
    /**
    * Obtém DFIN_EMP
    * return DFIN_EMP
    * @generated
    */
    public java.util.Date getDFIN_EMP() {
        return this.DFIN_EMP;
    }

    /**
    * Define DFIN_EMP
    * @param DFIN_EMP DFIN_EMP
    * @generated
    */
    public CADEMP setDFIN_EMP(java.util.Date DFIN_EMP) {
        this.DFIN_EMP = DFIN_EMP;
        return this;
    }
    /**
    * Obtém DFU_EMP
    * return DFU_EMP
    * @generated
    */
    public java.util.Date getDFU_EMP() {
        return this.DFU_EMP;
    }

    /**
    * Define DFU_EMP
    * @param DFU_EMP DFU_EMP
    * @generated
    */
    public CADEMP setDFU_EMP(java.util.Date DFU_EMP) {
        this.DFU_EMP = DFU_EMP;
        return this;
    }
    /**
    * Obtém DICC_EMP
    * return DICC_EMP
    * @generated
    */
    public java.util.Date getDICC_EMP() {
        return this.DICC_EMP;
    }

    /**
    * Define DICC_EMP
    * @param DICC_EMP DICC_EMP
    * @generated
    */
    public CADEMP setDICC_EMP(java.util.Date DICC_EMP) {
        this.DICC_EMP = DICC_EMP;
        return this;
    }
    /**
    * Obtém DICP_EMP
    * return DICP_EMP
    * @generated
    */
    public java.util.Date getDICP_EMP() {
        return this.DICP_EMP;
    }

    /**
    * Define DICP_EMP
    * @param DICP_EMP DICP_EMP
    * @generated
    */
    public CADEMP setDICP_EMP(java.util.Date DICP_EMP) {
        this.DICP_EMP = DICP_EMP;
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
    public CADEMP setDINSERT(java.util.Date DINSERT) {
        this.DINSERT = DINSERT;
        return this;
    }
    /**
    * Obtém DJC_EMP
    * return DJC_EMP
    * @generated
    */
    public java.util.Date getDJC_EMP() {
        return this.DJC_EMP;
    }

    /**
    * Define DJC_EMP
    * @param DJC_EMP DJC_EMP
    * @generated
    */
    public CADEMP setDJC_EMP(java.util.Date DJC_EMP) {
        this.DJC_EMP = DJC_EMP;
        return this;
    }
    /**
    * Obtém DSEF_EMP
    * return DSEF_EMP
    * @generated
    */
    public java.util.Date getDSEF_EMP() {
        return this.DSEF_EMP;
    }

    /**
    * Define DSEF_EMP
    * @param DSEF_EMP DSEF_EMP
    * @generated
    */
    public CADEMP setDSEF_EMP(java.util.Date DSEF_EMP) {
        this.DSEF_EMP = DSEF_EMP;
        return this;
    }
    /**
    * Obtém DTIC_EMP
    * return DTIC_EMP
    * @generated
    */
    public java.util.Date getDTIC_EMP() {
        return this.DTIC_EMP;
    }

    /**
    * Define DTIC_EMP
    * @param DTIC_EMP DTIC_EMP
    * @generated
    */
    public CADEMP setDTIC_EMP(java.util.Date DTIC_EMP) {
        this.DTIC_EMP = DTIC_EMP;
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
    public CADEMP setDTSYNCAPI(java.util.Date DTSYNCAPI) {
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
    public CADEMP setDUMANUT(java.util.Date DUMANUT) {
        this.DUMANUT = DUMANUT;
        return this;
    }
    /**
    * Obtém DVCR_EMP
    * return DVCR_EMP
    * @generated
    */
    public java.util.Date getDVCR_EMP() {
        return this.DVCR_EMP;
    }

    /**
    * Define DVCR_EMP
    * @param DVCR_EMP DVCR_EMP
    * @generated
    */
    public CADEMP setDVCR_EMP(java.util.Date DVCR_EMP) {
        this.DVCR_EMP = DVCR_EMP;
        return this;
    }
    /**
    * Obtém DVCV_EMP
    * return DVCV_EMP
    * @generated
    */
    public java.util.Date getDVCV_EMP() {
        return this.DVCV_EMP;
    }

    /**
    * Define DVCV_EMP
    * @param DVCV_EMP DVCV_EMP
    * @generated
    */
    public CADEMP setDVCV_EMP(java.util.Date DVCV_EMP) {
        this.DVCV_EMP = DVCV_EMP;
        return this;
    }
    /**
    * Obtém DVTR_EMP
    * return DVTR_EMP
    * @generated
    */
    public java.util.Date getDVTR_EMP() {
        return this.DVTR_EMP;
    }

    /**
    * Define DVTR_EMP
    * @param DVTR_EMP DVTR_EMP
    * @generated
    */
    public CADEMP setDVTR_EMP(java.util.Date DVTR_EMP) {
        this.DVTR_EMP = DVTR_EMP;
        return this;
    }
    /**
    * Obtém EACA_EMP
    * return EACA_EMP
    * @generated
    */
    public java.lang.String getEACA_EMP() {
        return this.EACA_EMP;
    }

    /**
    * Define EACA_EMP
    * @param EACA_EMP EACA_EMP
    * @generated
    */
    public CADEMP setEACA_EMP(java.lang.String EACA_EMP) {
        this.EACA_EMP = EACA_EMP;
        return this;
    }
    /**
    * Obtém EASS_EMP
    * return EASS_EMP
    * @generated
    */
    public java.lang.String getEASS_EMP() {
        return this.EASS_EMP;
    }

    /**
    * Define EASS_EMP
    * @param EASS_EMP EASS_EMP
    * @generated
    */
    public CADEMP setEASS_EMP(java.lang.String EASS_EMP) {
        this.EASS_EMP = EASS_EMP;
        return this;
    }
    /**
    * Obtém EBNS_EMP
    * return EBNS_EMP
    * @generated
    */
    public java.lang.String getEBNS_EMP() {
        return this.EBNS_EMP;
    }

    /**
    * Define EBNS_EMP
    * @param EBNS_EMP EBNS_EMP
    * @generated
    */
    public CADEMP setEBNS_EMP(java.lang.String EBNS_EMP) {
        this.EBNS_EMP = EBNS_EMP;
        return this;
    }
    /**
    * Obtém ECDT_EMP
    * return ECDT_EMP
    * @generated
    */
    public java.util.Date getECDT_EMP() {
        return this.ECDT_EMP;
    }

    /**
    * Define ECDT_EMP
    * @param ECDT_EMP ECDT_EMP
    * @generated
    */
    public CADEMP setECDT_EMP(java.util.Date ECDT_EMP) {
        this.ECDT_EMP = ECDT_EMP;
        return this;
    }
    /**
    * Obtém ECER_EMP
    * return ECER_EMP
    * @generated
    */
    public java.lang.String getECER_EMP() {
        return this.ECER_EMP;
    }

    /**
    * Define ECER_EMP
    * @param ECER_EMP ECER_EMP
    * @generated
    */
    public CADEMP setECER_EMP(java.lang.String ECER_EMP) {
        this.ECER_EMP = ECER_EMP;
        return this;
    }
    /**
    * Obtém ECHR_EMP
    * return ECHR_EMP
    * @generated
    */
    public java.lang.String getECHR_EMP() {
        return this.ECHR_EMP;
    }

    /**
    * Define ECHR_EMP
    * @param ECHR_EMP ECHR_EMP
    * @generated
    */
    public CADEMP setECHR_EMP(java.lang.String ECHR_EMP) {
        this.ECHR_EMP = ECHR_EMP;
        return this;
    }
    /**
    * Obtém EDCE_EMP
    * return EDCE_EMP
    * @generated
    */
    public java.lang.String getEDCE_EMP() {
        return this.EDCE_EMP;
    }

    /**
    * Define EDCE_EMP
    * @param EDCE_EMP EDCE_EMP
    * @generated
    */
    public CADEMP setEDCE_EMP(java.lang.String EDCE_EMP) {
        this.EDCE_EMP = EDCE_EMP;
        return this;
    }
    /**
    * Obtém EDIS_EMP
    * return EDIS_EMP
    * @generated
    */
    public java.lang.String getEDIS_EMP() {
        return this.EDIS_EMP;
    }

    /**
    * Define EDIS_EMP
    * @param EDIS_EMP EDIS_EMP
    * @generated
    */
    public CADEMP setEDIS_EMP(java.lang.String EDIS_EMP) {
        this.EDIS_EMP = EDIS_EMP;
        return this;
    }
    /**
    * Obtém EECC_EMP
    * return EECC_EMP
    * @generated
    */
    public java.lang.String getEECC_EMP() {
        return this.EECC_EMP;
    }

    /**
    * Define EECC_EMP
    * @param EECC_EMP EECC_EMP
    * @generated
    */
    public CADEMP setEECC_EMP(java.lang.String EECC_EMP) {
        this.EECC_EMP = EECC_EMP;
        return this;
    }
    /**
    * Obtém EEMA_EMP
    * return EEMA_EMP
    * @generated
    */
    public java.lang.String getEEMA_EMP() {
        return this.EEMA_EMP;
    }

    /**
    * Define EEMA_EMP
    * @param EEMA_EMP EEMA_EMP
    * @generated
    */
    public CADEMP setEEMA_EMP(java.lang.String EEMA_EMP) {
        this.EEMA_EMP = EEMA_EMP;
        return this;
    }
    /**
    * Obtém EGRP_EMP
    * return EGRP_EMP
    * @generated
    */
    public java.lang.String getEGRP_EMP() {
        return this.EGRP_EMP;
    }

    /**
    * Define EGRP_EMP
    * @param EGRP_EMP EGRP_EMP
    * @generated
    */
    public CADEMP setEGRP_EMP(java.lang.String EGRP_EMP) {
        this.EGRP_EMP = EGRP_EMP;
        return this;
    }
    /**
    * Obtém ELTR_EMP
    * return ELTR_EMP
    * @generated
    */
    public java.lang.String getELTR_EMP() {
        return this.ELTR_EMP;
    }

    /**
    * Define ELTR_EMP
    * @param ELTR_EMP ELTR_EMP
    * @generated
    */
    public CADEMP setELTR_EMP(java.lang.String ELTR_EMP) {
        this.ELTR_EMP = ELTR_EMP;
        return this;
    }
    /**
    * Obtém EMAC_EMP
    * return EMAC_EMP
    * @generated
    */
    public java.lang.String getEMAC_EMP() {
        return this.EMAC_EMP;
    }

    /**
    * Define EMAC_EMP
    * @param EMAC_EMP EMAC_EMP
    * @generated
    */
    public CADEMP setEMAC_EMP(java.lang.String EMAC_EMP) {
        this.EMAC_EMP = EMAC_EMP;
        return this;
    }
    /**
    * Obtém EMAI_EMP
    * return EMAI_EMP
    * @generated
    */
    public java.lang.String getEMAI_EMP() {
        return this.EMAI_EMP;
    }

    /**
    * Define EMAI_EMP
    * @param EMAI_EMP EMAI_EMP
    * @generated
    */
    public CADEMP setEMAI_EMP(java.lang.String EMAI_EMP) {
        this.EMAI_EMP = EMAI_EMP;
        return this;
    }
    /**
    * Obtém EMCA_EMP
    * return EMCA_EMP
    * @generated
    */
    public java.lang.String getEMCA_EMP() {
        return this.EMCA_EMP;
    }

    /**
    * Define EMCA_EMP
    * @param EMCA_EMP EMCA_EMP
    * @generated
    */
    public CADEMP setEMCA_EMP(java.lang.String EMCA_EMP) {
        this.EMCA_EMP = EMCA_EMP;
        return this;
    }
    /**
    * Obtém EMPR_FOL
    * return EMPR_FOL
    * @generated
    */
    public java.lang.Integer getEMPR_FOL() {
        return this.EMPR_FOL;
    }

    /**
    * Define EMPR_FOL
    * @param EMPR_FOL EMPR_FOL
    * @generated
    */
    public CADEMP setEMPR_FOL(java.lang.Integer EMPR_FOL) {
        this.EMPR_FOL = EMPR_FOL;
        return this;
    }
    /**
    * Obtém EMSG_EMP
    * return EMSG_EMP
    * @generated
    */
    public java.lang.String getEMSG_EMP() {
        return this.EMSG_EMP;
    }

    /**
    * Define EMSG_EMP
    * @param EMSG_EMP EMSG_EMP
    * @generated
    */
    public CADEMP setEMSG_EMP(java.lang.String EMSG_EMP) {
        this.EMSG_EMP = EMSG_EMP;
        return this;
    }
    /**
    * Obtém ENDC_EMP
    * return ENDC_EMP
    * @generated
    */
    public java.lang.String getENDC_EMP() {
        return this.ENDC_EMP;
    }

    /**
    * Define ENDC_EMP
    * @param ENDC_EMP ENDC_EMP
    * @generated
    */
    public CADEMP setENDC_EMP(java.lang.String ENDC_EMP) {
        this.ENDC_EMP = ENDC_EMP;
        return this;
    }
    /**
    * Obtém ENDE_EMP
    * return ENDE_EMP
    * @generated
    */
    public java.lang.String getENDE_EMP() {
        return this.ENDE_EMP;
    }

    /**
    * Define ENDE_EMP
    * @param ENDE_EMP ENDE_EMP
    * @generated
    */
    public CADEMP setENDE_EMP(java.lang.String ENDE_EMP) {
        this.ENDE_EMP = ENDE_EMP;
        return this;
    }
    /**
    * Obtém ENVE_EMP
    * return ENVE_EMP
    * @generated
    */
    public java.lang.String getENVE_EMP() {
        return this.ENVE_EMP;
    }

    /**
    * Define ENVE_EMP
    * @param ENVE_EMP ENVE_EMP
    * @generated
    */
    public CADEMP setENVE_EMP(java.lang.String ENVE_EMP) {
        this.ENVE_EMP = ENVE_EMP;
        return this;
    }
    /**
    * Obtém ESCN_EMP
    * return ESCN_EMP
    * @generated
    */
    public java.lang.String getESCN_EMP() {
        return this.ESCN_EMP;
    }

    /**
    * Define ESCN_EMP
    * @param ESCN_EMP ESCN_EMP
    * @generated
    */
    public CADEMP setESCN_EMP(java.lang.String ESCN_EMP) {
        this.ESCN_EMP = ESCN_EMP;
        return this;
    }
    /**
    * Obtém ESER_EMP
    * return ESER_EMP
    * @generated
    */
    public java.lang.String getESER_EMP() {
        return this.ESER_EMP;
    }

    /**
    * Define ESER_EMP
    * @param ESER_EMP ESER_EMP
    * @generated
    */
    public CADEMP setESER_EMP(java.lang.String ESER_EMP) {
        this.ESER_EMP = ESER_EMP;
        return this;
    }
    /**
    * Obtém ESUB_EMP
    * return ESUB_EMP
    * @generated
    */
    public java.lang.String getESUB_EMP() {
        return this.ESUB_EMP;
    }

    /**
    * Define ESUB_EMP
    * @param ESUB_EMP ESUB_EMP
    * @generated
    */
    public CADEMP setESUB_EMP(java.lang.String ESUB_EMP) {
        this.ESUB_EMP = ESUB_EMP;
        return this;
    }
    /**
    * Obtém EULL_EMP
    * return EULL_EMP
    * @generated
    */
    public java.lang.Integer getEULL_EMP() {
        return this.EULL_EMP;
    }

    /**
    * Define EULL_EMP
    * @param EULL_EMP EULL_EMP
    * @generated
    */
    public CADEMP setEULL_EMP(java.lang.Integer EULL_EMP) {
        this.EULL_EMP = EULL_EMP;
        return this;
    }
    /**
    * Obtém EUTE_EMP
    * return EUTE_EMP
    * @generated
    */
    public java.lang.String getEUTE_EMP() {
        return this.EUTE_EMP;
    }

    /**
    * Define EUTE_EMP
    * @param EUTE_EMP EUTE_EMP
    * @generated
    */
    public CADEMP setEUTE_EMP(java.lang.String EUTE_EMP) {
        this.EUTE_EMP = EUTE_EMP;
        return this;
    }
    /**
    * Obtém FANT_EMP
    * return FANT_EMP
    * @generated
    */
    public java.lang.String getFANT_EMP() {
        return this.FANT_EMP;
    }

    /**
    * Define FANT_EMP
    * @param FANT_EMP FANT_EMP
    * @generated
    */
    public CADEMP setFANT_EMP(java.lang.String FANT_EMP) {
        this.FANT_EMP = FANT_EMP;
        return this;
    }
    /**
    * Obtém FAXC_EMP
    * return FAXC_EMP
    * @generated
    */
    public java.lang.String getFAXC_EMP() {
        return this.FAXC_EMP;
    }

    /**
    * Define FAXC_EMP
    * @param FAXC_EMP FAXC_EMP
    * @generated
    */
    public CADEMP setFAXC_EMP(java.lang.String FAXC_EMP) {
        this.FAXC_EMP = FAXC_EMP;
        return this;
    }
    /**
    * Obtém FAX_EMP
    * return FAX_EMP
    * @generated
    */
    public java.lang.String getFAX_EMP() {
        return this.FAX_EMP;
    }

    /**
    * Define FAX_EMP
    * @param FAX_EMP FAX_EMP
    * @generated
    */
    public CADEMP setFAX_EMP(java.lang.String FAX_EMP) {
        this.FAX_EMP = FAX_EMP;
        return this;
    }
    /**
    * Obtém FDCT_EMP
    * return FDCT_EMP
    * @generated
    */
    public java.lang.String getFDCT_EMP() {
        return this.FDCT_EMP;
    }

    /**
    * Define FDCT_EMP
    * @param FDCT_EMP FDCT_EMP
    * @generated
    */
    public CADEMP setFDCT_EMP(java.lang.String FDCT_EMP) {
        this.FDCT_EMP = FDCT_EMP;
        return this;
    }
    /**
    * Obtém FONC_EMP
    * return FONC_EMP
    * @generated
    */
    public java.lang.String getFONC_EMP() {
        return this.FONC_EMP;
    }

    /**
    * Define FONC_EMP
    * @param FONC_EMP FONC_EMP
    * @generated
    */
    public CADEMP setFONC_EMP(java.lang.String FONC_EMP) {
        this.FONC_EMP = FONC_EMP;
        return this;
    }
    /**
    * Obtém FONE_EMP
    * return FONE_EMP
    * @generated
    */
    public java.lang.String getFONE_EMP() {
        return this.FONE_EMP;
    }

    /**
    * Define FONE_EMP
    * @param FONE_EMP FONE_EMP
    * @generated
    */
    public CADEMP setFONE_EMP(java.lang.String FONE_EMP) {
        this.FONE_EMP = FONE_EMP;
        return this;
    }
    /**
    * Obtém FORE_EMP
    * return FORE_EMP
    * @generated
    */
    public java.lang.String getFORE_EMP() {
        return this.FORE_EMP;
    }

    /**
    * Define FORE_EMP
    * @param FORE_EMP FORE_EMP
    * @generated
    */
    public CADEMP setFORE_EMP(java.lang.String FORE_EMP) {
        this.FORE_EMP = FORE_EMP;
        return this;
    }
    /**
    * Obtém GPDF_EMP
    * return GPDF_EMP
    * @generated
    */
    public java.lang.String getGPDF_EMP() {
        return this.GPDF_EMP;
    }

    /**
    * Define GPDF_EMP
    * @param GPDF_EMP GPDF_EMP
    * @generated
    */
    public CADEMP setGPDF_EMP(java.lang.String GPDF_EMP) {
        this.GPDF_EMP = GPDF_EMP;
        return this;
    }
    /**
    * Obtém GPZE_EMP
    * return GPZE_EMP
    * @generated
    */
    public java.lang.String getGPZE_EMP() {
        return this.GPZE_EMP;
    }

    /**
    * Define GPZE_EMP
    * @param GPZE_EMP GPZE_EMP
    * @generated
    */
    public CADEMP setGPZE_EMP(java.lang.String GPZE_EMP) {
        this.GPZE_EMP = GPZE_EMP;
        return this;
    }
    /**
    * Obtém HCON_EMP
    * return HCON_EMP
    * @generated
    */
    public java.lang.String getHCON_EMP() {
        return this.HCON_EMP;
    }

    /**
    * Define HCON_EMP
    * @param HCON_EMP HCON_EMP
    * @generated
    */
    public CADEMP setHCON_EMP(java.lang.String HCON_EMP) {
        this.HCON_EMP = HCON_EMP;
        return this;
    }
    /**
    * Obtém IDAF_EMP
    * return IDAF_EMP
    * @generated
    */
    public java.lang.String getIDAF_EMP() {
        return this.IDAF_EMP;
    }

    /**
    * Define IDAF_EMP
    * @param IDAF_EMP IDAF_EMP
    * @generated
    */
    public CADEMP setIDAF_EMP(java.lang.String IDAF_EMP) {
        this.IDAF_EMP = IDAF_EMP;
        return this;
    }
    /**
    * Obtém IDAT_EMP
    * return IDAT_EMP
    * @generated
    */
    public java.lang.String getIDAT_EMP() {
        return this.IDAT_EMP;
    }

    /**
    * Define IDAT_EMP
    * @param IDAT_EMP IDAT_EMP
    * @generated
    */
    public CADEMP setIDAT_EMP(java.lang.String IDAT_EMP) {
        this.IDAT_EMP = IDAT_EMP;
        return this;
    }
    /**
    * Obtém IDCT_EMP
    * return IDCT_EMP
    * @generated
    */
    public java.lang.String getIDCT_EMP() {
        return this.IDCT_EMP;
    }

    /**
    * Define IDCT_EMP
    * @param IDCT_EMP IDCT_EMP
    * @generated
    */
    public CADEMP setIDCT_EMP(java.lang.String IDCT_EMP) {
        this.IDCT_EMP = IDCT_EMP;
        return this;
    }
    /**
    * Obtém IDEN_EMP
    * return IDEN_EMP
    * @generated
    */
    public java.lang.String getIDEN_EMP() {
        return this.IDEN_EMP;
    }

    /**
    * Define IDEN_EMP
    * @param IDEN_EMP IDEN_EMP
    * @generated
    */
    public CADEMP setIDEN_EMP(java.lang.String IDEN_EMP) {
        this.IDEN_EMP = IDEN_EMP;
        return this;
    }
    /**
    * Obtém ILOG_EMP
    * return ILOG_EMP
    * @generated
    */
    public java.lang.String getILOG_EMP() {
        return this.ILOG_EMP;
    }

    /**
    * Define ILOG_EMP
    * @param ILOG_EMP ILOG_EMP
    * @generated
    */
    public CADEMP setILOG_EMP(java.lang.String ILOG_EMP) {
        this.ILOG_EMP = ILOG_EMP;
        return this;
    }
    /**
    * Obtém IMCA_EMP
    * return IMCA_EMP
    * @generated
    */
    public java.lang.String getIMCA_EMP() {
        return this.IMCA_EMP;
    }

    /**
    * Define IMCA_EMP
    * @param IMCA_EMP IMCA_EMP
    * @generated
    */
    public CADEMP setIMCA_EMP(java.lang.String IMCA_EMP) {
        this.IMCA_EMP = IMCA_EMP;
        return this;
    }
    /**
    * Obtém IMHS_EMP
    * return IMHS_EMP
    * @generated
    */
    public java.lang.String getIMHS_EMP() {
        return this.IMHS_EMP;
    }

    /**
    * Define IMHS_EMP
    * @param IMHS_EMP IMHS_EMP
    * @generated
    */
    public CADEMP setIMHS_EMP(java.lang.String IMHS_EMP) {
        this.IMHS_EMP = IMHS_EMP;
        return this;
    }
    /**
    * Obtém INDD_EMP
    * return INDD_EMP
    * @generated
    */
    public java.lang.String getINDD_EMP() {
        return this.INDD_EMP;
    }

    /**
    * Define INDD_EMP
    * @param INDD_EMP INDD_EMP
    * @generated
    */
    public CADEMP setINDD_EMP(java.lang.String INDD_EMP) {
        this.INDD_EMP = INDD_EMP;
        return this;
    }
    /**
    * Obtém INE_EMP
    * return INE_EMP
    * @generated
    */
    public java.lang.String getINE_EMP() {
        return this.INE_EMP;
    }

    /**
    * Define INE_EMP
    * @param INE_EMP INE_EMP
    * @generated
    */
    public CADEMP setINE_EMP(java.lang.String INE_EMP) {
        this.INE_EMP = INE_EMP;
        return this;
    }
    /**
    * Obtém INM_EMP
    * return INM_EMP
    * @generated
    */
    public java.lang.String getINM_EMP() {
        return this.INM_EMP;
    }

    /**
    * Define INM_EMP
    * @param INM_EMP INM_EMP
    * @generated
    */
    public CADEMP setINM_EMP(java.lang.String INM_EMP) {
        this.INM_EMP = INM_EMP;
        return this;
    }
    /**
    * Obtém INST_EMP
    * return INST_EMP
    * @generated
    */
    public java.lang.String getINST_EMP() {
        return this.INST_EMP;
    }

    /**
    * Define INST_EMP
    * @param INST_EMP INST_EMP
    * @generated
    */
    public CADEMP setINST_EMP(java.lang.String INST_EMP) {
        this.INST_EMP = INST_EMP;
        return this;
    }
    /**
    * Obtém INTC_EMP
    * return INTC_EMP
    * @generated
    */
    public java.lang.String getINTC_EMP() {
        return this.INTC_EMP;
    }

    /**
    * Define INTC_EMP
    * @param INTC_EMP INTC_EMP
    * @generated
    */
    public CADEMP setINTC_EMP(java.lang.String INTC_EMP) {
        this.INTC_EMP = INTC_EMP;
        return this;
    }
    /**
    * Obtém INTE_EMP
    * return INTE_EMP
    * @generated
    */
    public java.lang.String getINTE_EMP() {
        return this.INTE_EMP;
    }

    /**
    * Define INTE_EMP
    * @param INTE_EMP INTE_EMP
    * @generated
    */
    public CADEMP setINTE_EMP(java.lang.String INTE_EMP) {
        this.INTE_EMP = INTE_EMP;
        return this;
    }
    /**
    * Obtém ITAX_SEM
    * return ITAX_SEM
    * @generated
    */
    public java.lang.String getITAX_SEM() {
        return this.ITAX_SEM;
    }

    /**
    * Define ITAX_SEM
    * @param ITAX_SEM ITAX_SEM
    * @generated
    */
    public CADEMP setITAX_SEM(java.lang.String ITAX_SEM) {
        this.ITAX_SEM = ITAX_SEM;
        return this;
    }
    /**
    * Obtém IUCD_EMP
    * return IUCD_EMP
    * @generated
    */
    public java.lang.String getIUCD_EMP() {
        return this.IUCD_EMP;
    }

    /**
    * Define IUCD_EMP
    * @param IUCD_EMP IUCD_EMP
    * @generated
    */
    public CADEMP setIUCD_EMP(java.lang.String IUCD_EMP) {
        this.IUCD_EMP = IUCD_EMP;
        return this;
    }
    /**
    * Obtém IVLR_EMP
    * return IVLR_EMP
    * @generated
    */
    public java.lang.Double getIVLR_EMP() {
        return this.IVLR_EMP;
    }

    /**
    * Define IVLR_EMP
    * @param IVLR_EMP IVLR_EMP
    * @generated
    */
    public CADEMP setIVLR_EMP(java.lang.Double IVLR_EMP) {
        this.IVLR_EMP = IVLR_EMP;
        return this;
    }
    /**
    * Obtém LAUD_EMP
    * return LAUD_EMP
    * @generated
    */
    public java.lang.String getLAUD_EMP() {
        return this.LAUD_EMP;
    }

    /**
    * Define LAUD_EMP
    * @param LAUD_EMP LAUD_EMP
    * @generated
    */
    public CADEMP setLAUD_EMP(java.lang.String LAUD_EMP) {
        this.LAUD_EMP = LAUD_EMP;
        return this;
    }
    /**
    * Obtém LCTE_EMP
    * return LCTE_EMP
    * @generated
    */
    public java.lang.Integer getLCTE_EMP() {
        return this.LCTE_EMP;
    }

    /**
    * Define LCTE_EMP
    * @param LCTE_EMP LCTE_EMP
    * @generated
    */
    public CADEMP setLCTE_EMP(java.lang.Integer LCTE_EMP) {
        this.LCTE_EMP = LCTE_EMP;
        return this;
    }
    /**
    * Obtém LMDF_EMP
    * return LMDF_EMP
    * @generated
    */
    public java.lang.Integer getLMDF_EMP() {
        return this.LMDF_EMP;
    }

    /**
    * Define LMDF_EMP
    * @param LMDF_EMP LMDF_EMP
    * @generated
    */
    public CADEMP setLMDF_EMP(java.lang.Integer LMDF_EMP) {
        this.LMDF_EMP = LMDF_EMP;
        return this;
    }
    /**
    * Obtém LOGO_EMP
    * return LOGO_EMP
    * @generated
    */
    public byte[] getLOGO_EMP() {
        return this.LOGO_EMP;
    }

    /**
    * Define LOGO_EMP
    * @param LOGO_EMP LOGO_EMP
    * @generated
    */
    public CADEMP setLOGO_EMP(byte[] LOGO_EMP) {
        this.LOGO_EMP = LOGO_EMP;
        return this;
    }
    /**
    * Obtém LTRA_EMP
    * return LTRA_EMP
    * @generated
    */
    public java.lang.String getLTRA_EMP() {
        return this.LTRA_EMP;
    }

    /**
    * Define LTRA_EMP
    * @param LTRA_EMP LTRA_EMP
    * @generated
    */
    public CADEMP setLTRA_EMP(java.lang.String LTRA_EMP) {
        this.LTRA_EMP = LTRA_EMP;
        return this;
    }
    /**
    * Obtém MCNF_EMP
    * return MCNF_EMP
    * @generated
    */
    public java.lang.String getMCNF_EMP() {
        return this.MCNF_EMP;
    }

    /**
    * Define MCNF_EMP
    * @param MCNF_EMP MCNF_EMP
    * @generated
    */
    public CADEMP setMCNF_EMP(java.lang.String MCNF_EMP) {
        this.MCNF_EMP = MCNF_EMP;
        return this;
    }
    /**
    * Obtém MDCT_EMP
    * return MDCT_EMP
    * @generated
    */
    public java.lang.Double getMDCT_EMP() {
        return this.MDCT_EMP;
    }

    /**
    * Define MDCT_EMP
    * @param MDCT_EMP MDCT_EMP
    * @generated
    */
    public CADEMP setMDCT_EMP(java.lang.Double MDCT_EMP) {
        this.MDCT_EMP = MDCT_EMP;
        return this;
    }
    /**
    * Obtém MECT_EMP
    * return MECT_EMP
    * @generated
    */
    public java.lang.Double getMECT_EMP() {
        return this.MECT_EMP;
    }

    /**
    * Define MECT_EMP
    * @param MECT_EMP MECT_EMP
    * @generated
    */
    public CADEMP setMECT_EMP(java.lang.Double MECT_EMP) {
        this.MECT_EMP = MECT_EMP;
        return this;
    }
    /**
    * Obtém MICT_EMP
    * return MICT_EMP
    * @generated
    */
    public java.lang.Double getMICT_EMP() {
        return this.MICT_EMP;
    }

    /**
    * Define MICT_EMP
    * @param MICT_EMP MICT_EMP
    * @generated
    */
    public CADEMP setMICT_EMP(java.lang.Double MICT_EMP) {
        this.MICT_EMP = MICT_EMP;
        return this;
    }
    /**
    * Obtém MOD_EMP
    * return MOD_EMP
    * @generated
    */
    public java.lang.Integer getMOD_EMP() {
        return this.MOD_EMP;
    }

    /**
    * Define MOD_EMP
    * @param MOD_EMP MOD_EMP
    * @generated
    */
    public CADEMP setMOD_EMP(java.lang.Integer MOD_EMP) {
        this.MOD_EMP = MOD_EMP;
        return this;
    }
    /**
    * Obtém MPCT_EMP
    * return MPCT_EMP
    * @generated
    */
    public java.lang.String getMPCT_EMP() {
        return this.MPCT_EMP;
    }

    /**
    * Define MPCT_EMP
    * @param MPCT_EMP MPCT_EMP
    * @generated
    */
    public CADEMP setMPCT_EMP(java.lang.String MPCT_EMP) {
        this.MPCT_EMP = MPCT_EMP;
        return this;
    }
    /**
    * Obtém MSCC_EMP
    * return MSCC_EMP
    * @generated
    */
    public java.lang.String getMSCC_EMP() {
        return this.MSCC_EMP;
    }

    /**
    * Define MSCC_EMP
    * @param MSCC_EMP MSCC_EMP
    * @generated
    */
    public CADEMP setMSCC_EMP(java.lang.String MSCC_EMP) {
        this.MSCC_EMP = MSCC_EMP;
        return this;
    }
    /**
    * Obtém MSCT_EMP
    * return MSCT_EMP
    * @generated
    */
    public java.lang.Double getMSCT_EMP() {
        return this.MSCT_EMP;
    }

    /**
    * Define MSCT_EMP
    * @param MSCT_EMP MSCT_EMP
    * @generated
    */
    public CADEMP setMSCT_EMP(java.lang.Double MSCT_EMP) {
        this.MSCT_EMP = MSCT_EMP;
        return this;
    }
    /**
    * Obtém MSIM_EMP
    * return MSIM_EMP
    * @generated
    */
    public java.lang.String getMSIM_EMP() {
        return this.MSIM_EMP;
    }

    /**
    * Define MSIM_EMP
    * @param MSIM_EMP MSIM_EMP
    * @generated
    */
    public CADEMP setMSIM_EMP(java.lang.String MSIM_EMP) {
        this.MSIM_EMP = MSIM_EMP;
        return this;
    }
    /**
    * Obtém MSNF_EMP
    * return MSNF_EMP
    * @generated
    */
    public java.lang.String getMSNF_EMP() {
        return this.MSNF_EMP;
    }

    /**
    * Define MSNF_EMP
    * @param MSNF_EMP MSNF_EMP
    * @generated
    */
    public CADEMP setMSNF_EMP(java.lang.String MSNF_EMP) {
        this.MSNF_EMP = MSNF_EMP;
        return this;
    }
    /**
    * Obtém MUNC_EMP
    * return MUNC_EMP
    * @generated
    */
    public java.lang.Integer getMUNC_EMP() {
        return this.MUNC_EMP;
    }

    /**
    * Define MUNC_EMP
    * @param MUNC_EMP MUNC_EMP
    * @generated
    */
    public CADEMP setMUNC_EMP(java.lang.Integer MUNC_EMP) {
        this.MUNC_EMP = MUNC_EMP;
        return this;
    }
    /**
    * Obtém NCRE_EMP
    * return NCRE_EMP
    * @generated
    */
    public java.lang.String getNCRE_EMP() {
        return this.NCRE_EMP;
    }

    /**
    * Define NCRE_EMP
    * @param NCRE_EMP NCRE_EMP
    * @generated
    */
    public CADEMP setNCRE_EMP(java.lang.String NCRE_EMP) {
        this.NCRE_EMP = NCRE_EMP;
        return this;
    }
    /**
    * Obtém NCVI_EMP
    * return NCVI_EMP
    * @generated
    */
    public java.lang.String getNCVI_EMP() {
        return this.NCVI_EMP;
    }

    /**
    * Define NCVI_EMP
    * @param NCVI_EMP NCVI_EMP
    * @generated
    */
    public CADEMP setNCVI_EMP(java.lang.String NCVI_EMP) {
        this.NCVI_EMP = NCVI_EMP;
        return this;
    }
    /**
    * Obtém NESO_EMP
    * return NESO_EMP
    * @generated
    */
    public java.lang.String getNESO_EMP() {
        return this.NESO_EMP;
    }

    /**
    * Define NESO_EMP
    * @param NESO_EMP NESO_EMP
    * @generated
    */
    public CADEMP setNESO_EMP(java.lang.String NESO_EMP) {
        this.NESO_EMP = NESO_EMP;
        return this;
    }
    /**
    * Obtém NFC4_EMP
    * return NFC4_EMP
    * @generated
    */
    public java.lang.String getNFC4_EMP() {
        return this.NFC4_EMP;
    }

    /**
    * Define NFC4_EMP
    * @param NFC4_EMP NFC4_EMP
    * @generated
    */
    public CADEMP setNFC4_EMP(java.lang.String NFC4_EMP) {
        this.NFC4_EMP = NFC4_EMP;
        return this;
    }
    /**
    * Obtém NFE4_EMP
    * return NFE4_EMP
    * @generated
    */
    public java.lang.String getNFE4_EMP() {
        return this.NFE4_EMP;
    }

    /**
    * Define NFE4_EMP
    * @param NFE4_EMP NFE4_EMP
    * @generated
    */
    public CADEMP setNFE4_EMP(java.lang.String NFE4_EMP) {
        this.NFE4_EMP = NFE4_EMP;
        return this;
    }
    /**
    * Obtém NFEC_EMP
    * return NFEC_EMP
    * @generated
    */
    public java.lang.String getNFEC_EMP() {
        return this.NFEC_EMP;
    }

    /**
    * Define NFEC_EMP
    * @param NFEC_EMP NFEC_EMP
    * @generated
    */
    public CADEMP setNFEC_EMP(java.lang.String NFEC_EMP) {
        this.NFEC_EMP = NFEC_EMP;
        return this;
    }
    /**
    * Obtém NFES_EMP
    * return NFES_EMP
    * @generated
    */
    public java.lang.String getNFES_EMP() {
        return this.NFES_EMP;
    }

    /**
    * Define NFES_EMP
    * @param NFES_EMP NFES_EMP
    * @generated
    */
    public CADEMP setNFES_EMP(java.lang.String NFES_EMP) {
        this.NFES_EMP = NFES_EMP;
        return this;
    }
    /**
    * Obtém NFLT_EMP
    * return NFLT_EMP
    * @generated
    */
    public java.lang.String getNFLT_EMP() {
        return this.NFLT_EMP;
    }

    /**
    * Define NFLT_EMP
    * @param NFLT_EMP NFLT_EMP
    * @generated
    */
    public CADEMP setNFLT_EMP(java.lang.String NFLT_EMP) {
        this.NFLT_EMP = NFLT_EMP;
        return this;
    }
    /**
    * Obtém NGRE_EMP
    * return NGRE_EMP
    * @generated
    */
    public java.lang.String getNGRE_EMP() {
        return this.NGRE_EMP;
    }

    /**
    * Define NGRE_EMP
    * @param NGRE_EMP NGRE_EMP
    * @generated
    */
    public CADEMP setNGRE_EMP(java.lang.String NGRE_EMP) {
        this.NGRE_EMP = NGRE_EMP;
        return this;
    }
    /**
    * Obtém NIRE_EMP
    * return NIRE_EMP
    * @generated
    */
    public java.lang.String getNIRE_EMP() {
        return this.NIRE_EMP;
    }

    /**
    * Define NIRE_EMP
    * @param NIRE_EMP NIRE_EMP
    * @generated
    */
    public CADEMP setNIRE_EMP(java.lang.String NIRE_EMP) {
        this.NIRE_EMP = NIRE_EMP;
        return this;
    }
    /**
    * Obtém NLCC_EMP
    * return NLCC_EMP
    * @generated
    */
    public java.lang.Integer getNLCC_EMP() {
        return this.NLCC_EMP;
    }

    /**
    * Define NLCC_EMP
    * @param NLCC_EMP NLCC_EMP
    * @generated
    */
    public CADEMP setNLCC_EMP(java.lang.Integer NLCC_EMP) {
        this.NLCC_EMP = NLCC_EMP;
        return this;
    }
    /**
    * Obtém NLIC_EMP
    * return NLIC_EMP
    * @generated
    */
    public java.lang.String getNLIC_EMP() {
        return this.NLIC_EMP;
    }

    /**
    * Define NLIC_EMP
    * @param NLIC_EMP NLIC_EMP
    * @generated
    */
    public CADEMP setNLIC_EMP(java.lang.String NLIC_EMP) {
        this.NLIC_EMP = NLIC_EMP;
        return this;
    }
    /**
    * Obtém NLTS_EMP
    * return NLTS_EMP
    * @generated
    */
    public java.lang.Integer getNLTS_EMP() {
        return this.NLTS_EMP;
    }

    /**
    * Define NLTS_EMP
    * @param NLTS_EMP NLTS_EMP
    * @generated
    */
    public CADEMP setNLTS_EMP(java.lang.Integer NLTS_EMP) {
        this.NLTS_EMP = NLTS_EMP;
        return this;
    }
    /**
    * Obtém NREG_EMP
    * return NREG_EMP
    * @generated
    */
    public java.lang.String getNREG_EMP() {
        return this.NREG_EMP;
    }

    /**
    * Define NREG_EMP
    * @param NREG_EMP NREG_EMP
    * @generated
    */
    public CADEMP setNREG_EMP(java.lang.String NREG_EMP) {
        this.NREG_EMP = NREG_EMP;
        return this;
    }
    /**
    * Obtém NRLT_EMP
    * return NRLT_EMP
    * @generated
    */
    public java.lang.Integer getNRLT_EMP() {
        return this.NRLT_EMP;
    }

    /**
    * Define NRLT_EMP
    * @param NRLT_EMP NRLT_EMP
    * @generated
    */
    public CADEMP setNRLT_EMP(java.lang.Integer NRLT_EMP) {
        this.NRLT_EMP = NRLT_EMP;
        return this;
    }
    /**
    * Obtém NSCE_EMP
    * return NSCE_EMP
    * @generated
    */
    public java.lang.String getNSCE_EMP() {
        return this.NSCE_EMP;
    }

    /**
    * Define NSCE_EMP
    * @param NSCE_EMP NSCE_EMP
    * @generated
    */
    public CADEMP setNSCE_EMP(java.lang.String NSCE_EMP) {
        this.NSCE_EMP = NSCE_EMP;
        return this;
    }
    /**
    * Obtém NSCT_EMP
    * return NSCT_EMP
    * @generated
    */
    public java.lang.String getNSCT_EMP() {
        return this.NSCT_EMP;
    }

    /**
    * Define NSCT_EMP
    * @param NSCT_EMP NSCT_EMP
    * @generated
    */
    public CADEMP setNSCT_EMP(java.lang.String NSCT_EMP) {
        this.NSCT_EMP = NSCT_EMP;
        return this;
    }
    /**
    * Obtém NTAR_EMP
    * return NTAR_EMP
    * @generated
    */
    public java.lang.Integer getNTAR_EMP() {
        return this.NTAR_EMP;
    }

    /**
    * Define NTAR_EMP
    * @param NTAR_EMP NTAR_EMP
    * @generated
    */
    public CADEMP setNTAR_EMP(java.lang.Integer NTAR_EMP) {
        this.NTAR_EMP = NTAR_EMP;
        return this;
    }
    /**
    * Obtém NTCT_EMP
    * return NTCT_EMP
    * @generated
    */
    public java.lang.Integer getNTCT_EMP() {
        return this.NTCT_EMP;
    }

    /**
    * Define NTCT_EMP
    * @param NTCT_EMP NTCT_EMP
    * @generated
    */
    public CADEMP setNTCT_EMP(java.lang.Integer NTCT_EMP) {
        this.NTCT_EMP = NTCT_EMP;
        return this;
    }
    /**
    * Obtém NUCO_EMP
    * return NUCO_EMP
    * @generated
    */
    public java.lang.Integer getNUCO_EMP() {
        return this.NUCO_EMP;
    }

    /**
    * Define NUCO_EMP
    * @param NUCO_EMP NUCO_EMP
    * @generated
    */
    public CADEMP setNUCO_EMP(java.lang.Integer NUCO_EMP) {
        this.NUCO_EMP = NUCO_EMP;
        return this;
    }
    /**
    * Obtém NUMC_EMP
    * return NUMC_EMP
    * @generated
    */
    public java.lang.String getNUMC_EMP() {
        return this.NUMC_EMP;
    }

    /**
    * Define NUMC_EMP
    * @param NUMC_EMP NUMC_EMP
    * @generated
    */
    public CADEMP setNUMC_EMP(java.lang.String NUMC_EMP) {
        this.NUMC_EMP = NUMC_EMP;
        return this;
    }
    /**
    * Obtém NUME_EMP
    * return NUME_EMP
    * @generated
    */
    public java.lang.String getNUME_EMP() {
        return this.NUME_EMP;
    }

    /**
    * Define NUME_EMP
    * @param NUME_EMP NUME_EMP
    * @generated
    */
    public CADEMP setNUME_EMP(java.lang.String NUME_EMP) {
        this.NUME_EMP = NUME_EMP;
        return this;
    }
    /**
    * Obtém ORIM_EMP
    * return ORIM_EMP
    * @generated
    */
    public java.lang.String getORIM_EMP() {
        return this.ORIM_EMP;
    }

    /**
    * Define ORIM_EMP
    * @param ORIM_EMP ORIM_EMP
    * @generated
    */
    public CADEMP setORIM_EMP(java.lang.String ORIM_EMP) {
        this.ORIM_EMP = ORIM_EMP;
        return this;
    }
    /**
    * Obtém PDCB_EMP
    * return PDCB_EMP
    * @generated
    */
    public java.lang.String getPDCB_EMP() {
        return this.PDCB_EMP;
    }

    /**
    * Define PDCB_EMP
    * @param PDCB_EMP PDCB_EMP
    * @generated
    */
    public CADEMP setPDCB_EMP(java.lang.String PDCB_EMP) {
        this.PDCB_EMP = PDCB_EMP;
        return this;
    }
    /**
    * Obtém PDCC_EMP
    * return PDCC_EMP
    * @generated
    */
    public java.lang.String getPDCC_EMP() {
        return this.PDCC_EMP;
    }

    /**
    * Define PDCC_EMP
    * @param PDCC_EMP PDCC_EMP
    * @generated
    */
    public CADEMP setPDCC_EMP(java.lang.String PDCC_EMP) {
        this.PDCC_EMP = PDCC_EMP;
        return this;
    }
    /**
    * Obtém PDCD_EMP
    * return PDCD_EMP
    * @generated
    */
    public java.lang.String getPDCD_EMP() {
        return this.PDCD_EMP;
    }

    /**
    * Define PDCD_EMP
    * @param PDCD_EMP PDCD_EMP
    * @generated
    */
    public CADEMP setPDCD_EMP(java.lang.String PDCD_EMP) {
        this.PDCD_EMP = PDCD_EMP;
        return this;
    }
    /**
    * Obtém PDCE_EMP
    * return PDCE_EMP
    * @generated
    */
    public java.lang.String getPDCE_EMP() {
        return this.PDCE_EMP;
    }

    /**
    * Define PDCE_EMP
    * @param PDCE_EMP PDCE_EMP
    * @generated
    */
    public CADEMP setPDCE_EMP(java.lang.String PDCE_EMP) {
        this.PDCE_EMP = PDCE_EMP;
        return this;
    }
    /**
    * Obtém PDCR_EMP
    * return PDCR_EMP
    * @generated
    */
    public java.lang.String getPDCR_EMP() {
        return this.PDCR_EMP;
    }

    /**
    * Define PDCR_EMP
    * @param PDCR_EMP PDCR_EMP
    * @generated
    */
    public CADEMP setPDCR_EMP(java.lang.String PDCR_EMP) {
        this.PDCR_EMP = PDCR_EMP;
        return this;
    }
    /**
    * Obtém PEFI_EMP
    * return PEFI_EMP
    * @generated
    */
    public java.lang.Integer getPEFI_EMP() {
        return this.PEFI_EMP;
    }

    /**
    * Define PEFI_EMP
    * @param PEFI_EMP PEFI_EMP
    * @generated
    */
    public CADEMP setPEFI_EMP(java.lang.Integer PEFI_EMP) {
        this.PEFI_EMP = PEFI_EMP;
        return this;
    }
    /**
    * Obtém PICT_EMP
    * return PICT_EMP
    * @generated
    */
    public java.lang.String getPICT_EMP() {
        return this.PICT_EMP;
    }

    /**
    * Define PICT_EMP
    * @param PICT_EMP PICT_EMP
    * @generated
    */
    public CADEMP setPICT_EMP(java.lang.String PICT_EMP) {
        this.PICT_EMP = PICT_EMP;
        return this;
    }
    /**
    * Obtém PORE_EMP
    * return PORE_EMP
    * @generated
    */
    public java.lang.String getPORE_EMP() {
        return this.PORE_EMP;
    }

    /**
    * Define PORE_EMP
    * @param PORE_EMP PORE_EMP
    * @generated
    */
    public CADEMP setPORE_EMP(java.lang.String PORE_EMP) {
        this.PORE_EMP = PORE_EMP;
        return this;
    }
    /**
    * Obtém PPAR_EMP
    * return PPAR_EMP
    * @generated
    */
    public byte[] getPPAR_EMP() {
        return this.PPAR_EMP;
    }

    /**
    * Define PPAR_EMP
    * @param PPAR_EMP PPAR_EMP
    * @generated
    */
    public CADEMP setPPAR_EMP(byte[] PPAR_EMP) {
        this.PPAR_EMP = PPAR_EMP;
        return this;
    }
    /**
    * Obtém RAZA_EMP
    * return RAZA_EMP
    * @generated
    */
    public java.lang.String getRAZA_EMP() {
        return this.RAZA_EMP;
    }

    /**
    * Define RAZA_EMP
    * @param RAZA_EMP RAZA_EMP
    * @generated
    */
    public CADEMP setRAZA_EMP(java.lang.String RAZA_EMP) {
        this.RAZA_EMP = RAZA_EMP;
        return this;
    }
    /**
    * Obtém REGI_EMP
    * return REGI_EMP
    * @generated
    */
    public java.lang.String getREGI_EMP() {
        return this.REGI_EMP;
    }

    /**
    * Define REGI_EMP
    * @param REGI_EMP REGI_EMP
    * @generated
    */
    public CADEMP setREGI_EMP(java.lang.String REGI_EMP) {
        this.REGI_EMP = REGI_EMP;
        return this;
    }
    /**
    * Obtém RENA_EMP
    * return RENA_EMP
    * @generated
    */
    public java.lang.String getRENA_EMP() {
        return this.RENA_EMP;
    }

    /**
    * Define RENA_EMP
    * @param RENA_EMP RENA_EMP
    * @generated
    */
    public CADEMP setRENA_EMP(java.lang.String RENA_EMP) {
        this.RENA_EMP = RENA_EMP;
        return this;
    }
    /**
    * Obtém RNTC_EMP
    * return RNTC_EMP
    * @generated
    */
    public java.lang.String getRNTC_EMP() {
        return this.RNTC_EMP;
    }

    /**
    * Define RNTC_EMP
    * @param RNTC_EMP RNTC_EMP
    * @generated
    */
    public CADEMP setRNTC_EMP(java.lang.String RNTC_EMP) {
        this.RNTC_EMP = RNTC_EMP;
        return this;
    }
    /**
    * Obtém RQFA_EMP
    * return RQFA_EMP
    * @generated
    */
    public java.lang.String getRQFA_EMP() {
        return this.RQFA_EMP;
    }

    /**
    * Define RQFA_EMP
    * @param RQFA_EMP RQFA_EMP
    * @generated
    */
    public CADEMP setRQFA_EMP(java.lang.String RQFA_EMP) {
        this.RQFA_EMP = RQFA_EMP;
        return this;
    }
    /**
    * Obtém RREC_EMP
    * return RREC_EMP
    * @generated
    */
    public java.lang.String getRREC_EMP() {
        return this.RREC_EMP;
    }

    /**
    * Define RREC_EMP
    * @param RREC_EMP RREC_EMP
    * @generated
    */
    public CADEMP setRREC_EMP(java.lang.String RREC_EMP) {
        this.RREC_EMP = RREC_EMP;
        return this;
    }
    /**
    * Obtém RVAL_CND
    * return RVAL_CND
    * @generated
    */
    public java.lang.String getRVAL_CND() {
        return this.RVAL_CND;
    }

    /**
    * Define RVAL_CND
    * @param RVAL_CND RVAL_CND
    * @generated
    */
    public CADEMP setRVAL_CND(java.lang.String RVAL_CND) {
        this.RVAL_CND = RVAL_CND;
        return this;
    }
    /**
    * Obtém SAPM_EMP
    * return SAPM_EMP
    * @generated
    */
    public java.lang.String getSAPM_EMP() {
        return this.SAPM_EMP;
    }

    /**
    * Define SAPM_EMP
    * @param SAPM_EMP SAPM_EMP
    * @generated
    */
    public CADEMP setSAPM_EMP(java.lang.String SAPM_EMP) {
        this.SAPM_EMP = SAPM_EMP;
        return this;
    }
    /**
    * Obtém SCAN_EMP
    * return SCAN_EMP
    * @generated
    */
    public java.lang.String getSCAN_EMP() {
        return this.SCAN_EMP;
    }

    /**
    * Define SCAN_EMP
    * @param SCAN_EMP SCAN_EMP
    * @generated
    */
    public CADEMP setSCAN_EMP(java.lang.String SCAN_EMP) {
        this.SCAN_EMP = SCAN_EMP;
        return this;
    }
    /**
    * Obtém SCNF_EMP
    * return SCNF_EMP
    * @generated
    */
    public java.lang.String getSCNF_EMP() {
        return this.SCNF_EMP;
    }

    /**
    * Define SCNF_EMP
    * @param SCNF_EMP SCNF_EMP
    * @generated
    */
    public CADEMP setSCNF_EMP(java.lang.String SCNF_EMP) {
        this.SCNF_EMP = SCNF_EMP;
        return this;
    }
    /**
    * Obtém SCST_EMP
    * return SCST_EMP
    * @generated
    */
    public java.lang.String getSCST_EMP() {
        return this.SCST_EMP;
    }

    /**
    * Define SCST_EMP
    * @param SCST_EMP SCST_EMP
    * @generated
    */
    public CADEMP setSCST_EMP(java.lang.String SCST_EMP) {
        this.SCST_EMP = SCST_EMP;
        return this;
    }
    /**
    * Obtém SENV_EMP
    * return SENV_EMP
    * @generated
    */
    public java.lang.String getSENV_EMP() {
        return this.SENV_EMP;
    }

    /**
    * Define SENV_EMP
    * @param SENV_EMP SENV_EMP
    * @generated
    */
    public CADEMP setSENV_EMP(java.lang.String SENV_EMP) {
        this.SENV_EMP = SENV_EMP;
        return this;
    }
    /**
    * Obtém SHAB_EMP
    * return SHAB_EMP
    * @generated
    */
    public java.lang.String getSHAB_EMP() {
        return this.SHAB_EMP;
    }

    /**
    * Define SHAB_EMP
    * @param SHAB_EMP SHAB_EMP
    * @generated
    */
    public CADEMP setSHAB_EMP(java.lang.String SHAB_EMP) {
        this.SHAB_EMP = SHAB_EMP;
        return this;
    }
    /**
    * Obtém SINI_EMP
    * return SINI_EMP
    * @generated
    */
    public java.lang.String getSINI_EMP() {
        return this.SINI_EMP;
    }

    /**
    * Define SINI_EMP
    * @param SINI_EMP SINI_EMP
    * @generated
    */
    public CADEMP setSINI_EMP(java.lang.String SINI_EMP) {
        this.SINI_EMP = SINI_EMP;
        return this;
    }
    /**
    * Obtém SINP_EMP
    * return SINP_EMP
    * @generated
    */
    public java.lang.String getSINP_EMP() {
        return this.SINP_EMP;
    }

    /**
    * Define SINP_EMP
    * @param SINP_EMP SINP_EMP
    * @generated
    */
    public CADEMP setSINP_EMP(java.lang.String SINP_EMP) {
        this.SINP_EMP = SINP_EMP;
        return this;
    }
    /**
    * Obtém SINU_EMP
    * return SINU_EMP
    * @generated
    */
    public java.lang.String getSINU_EMP() {
        return this.SINU_EMP;
    }

    /**
    * Define SINU_EMP
    * @param SINU_EMP SINU_EMP
    * @generated
    */
    public CADEMP setSINU_EMP(java.lang.String SINU_EMP) {
        this.SINU_EMP = SINU_EMP;
        return this;
    }
    /**
    * Obtém SITE_CND
    * return SITE_CND
    * @generated
    */
    public java.lang.String getSITE_CND() {
        return this.SITE_CND;
    }

    /**
    * Define SITE_CND
    * @param SITE_CND SITE_CND
    * @generated
    */
    public CADEMP setSITE_CND(java.lang.String SITE_CND) {
        this.SITE_CND = SITE_CND;
        return this;
    }
    /**
    * Obtém SITU_EMP
    * return SITU_EMP
    * @generated
    */
    public java.lang.String getSITU_EMP() {
        return this.SITU_EMP;
    }

    /**
    * Define SITU_EMP
    * @param SITU_EMP SITU_EMP
    * @generated
    */
    public CADEMP setSITU_EMP(java.lang.String SITU_EMP) {
        this.SITU_EMP = SITU_EMP;
        return this;
    }
    /**
    * Obtém SLOG_EMP
    * return SLOG_EMP
    * @generated
    */
    public java.lang.String getSLOG_EMP() {
        return this.SLOG_EMP;
    }

    /**
    * Define SLOG_EMP
    * @param SLOG_EMP SLOG_EMP
    * @generated
    */
    public CADEMP setSLOG_EMP(java.lang.String SLOG_EMP) {
        this.SLOG_EMP = SLOG_EMP;
        return this;
    }
    /**
    * Obtém SNFC_EMP
    * return SNFC_EMP
    * @generated
    */
    public java.lang.String getSNFC_EMP() {
        return this.SNFC_EMP;
    }

    /**
    * Define SNFC_EMP
    * @param SNFC_EMP SNFC_EMP
    * @generated
    */
    public CADEMP setSNFC_EMP(java.lang.String SNFC_EMP) {
        this.SNFC_EMP = SNFC_EMP;
        return this;
    }
    /**
    * Obtém SOUT_EMP
    * return SOUT_EMP
    * @generated
    */
    public java.lang.String getSOUT_EMP() {
        return this.SOUT_EMP;
    }

    /**
    * Define SOUT_EMP
    * @param SOUT_EMP SOUT_EMP
    * @generated
    */
    public CADEMP setSOUT_EMP(java.lang.String SOUT_EMP) {
        this.SOUT_EMP = SOUT_EMP;
        return this;
    }
    /**
    * Obtém SPAT_EMP
    * return SPAT_EMP
    * @generated
    */
    public java.lang.String getSPAT_EMP() {
        return this.SPAT_EMP;
    }

    /**
    * Define SPAT_EMP
    * @param SPAT_EMP SPAT_EMP
    * @generated
    */
    public CADEMP setSPAT_EMP(java.lang.String SPAT_EMP) {
        this.SPAT_EMP = SPAT_EMP;
        return this;
    }
    /**
    * Obtém SPCE_EMP
    * return SPCE_EMP
    * @generated
    */
    public java.lang.Integer getSPCE_EMP() {
        return this.SPCE_EMP;
    }

    /**
    * Define SPCE_EMP
    * @param SPCE_EMP SPCE_EMP
    * @generated
    */
    public CADEMP setSPCE_EMP(java.lang.Integer SPCE_EMP) {
        this.SPCE_EMP = SPCE_EMP;
        return this;
    }
    /**
    * Obtém SPIT_EMP
    * return SPIT_EMP
    * @generated
    */
    public java.lang.String getSPIT_EMP() {
        return this.SPIT_EMP;
    }

    /**
    * Define SPIT_EMP
    * @param SPIT_EMP SPIT_EMP
    * @generated
    */
    public CADEMP setSPIT_EMP(java.lang.String SPIT_EMP) {
        this.SPIT_EMP = SPIT_EMP;
        return this;
    }
    /**
    * Obtém SPMA_EMP
    * return SPMA_EMP
    * @generated
    */
    public java.lang.String getSPMA_EMP() {
        return this.SPMA_EMP;
    }

    /**
    * Define SPMA_EMP
    * @param SPMA_EMP SPMA_EMP
    * @generated
    */
    public CADEMP setSPMA_EMP(java.lang.String SPMA_EMP) {
        this.SPMA_EMP = SPMA_EMP;
        return this;
    }
    /**
    * Obtém SPNA_EMP
    * return SPNA_EMP
    * @generated
    */
    public java.lang.String getSPNA_EMP() {
        return this.SPNA_EMP;
    }

    /**
    * Define SPNA_EMP
    * @param SPNA_EMP SPNA_EMP
    * @generated
    */
    public CADEMP setSPNA_EMP(java.lang.String SPNA_EMP) {
        this.SPNA_EMP = SPNA_EMP;
        return this;
    }
    /**
    * Obtém SPTC_EMP
    * return SPTC_EMP
    * @generated
    */
    public java.lang.String getSPTC_EMP() {
        return this.SPTC_EMP;
    }

    /**
    * Define SPTC_EMP
    * @param SPTC_EMP SPTC_EMP
    * @generated
    */
    public CADEMP setSPTC_EMP(java.lang.String SPTC_EMP) {
        this.SPTC_EMP = SPTC_EMP;
        return this;
    }
    /**
    * Obtém SRES_EMP
    * return SRES_EMP
    * @generated
    */
    public java.lang.String getSRES_EMP() {
        return this.SRES_EMP;
    }

    /**
    * Define SRES_EMP
    * @param SRES_EMP SRES_EMP
    * @generated
    */
    public CADEMP setSRES_EMP(java.lang.String SRES_EMP) {
        this.SRES_EMP = SRES_EMP;
        return this;
    }
    /**
    * Obtém SRET_EMP
    * return SRET_EMP
    * @generated
    */
    public java.lang.String getSRET_EMP() {
        return this.SRET_EMP;
    }

    /**
    * Define SRET_EMP
    * @param SRET_EMP SRET_EMP
    * @generated
    */
    public CADEMP setSRET_EMP(java.lang.String SRET_EMP) {
        this.SRET_EMP = SRET_EMP;
        return this;
    }
    /**
    * Obtém SROU_EMP
    * return SROU_EMP
    * @generated
    */
    public java.lang.String getSROU_EMP() {
        return this.SROU_EMP;
    }

    /**
    * Define SROU_EMP
    * @param SROU_EMP SROU_EMP
    * @generated
    */
    public CADEMP setSROU_EMP(java.lang.String SROU_EMP) {
        this.SROU_EMP = SROU_EMP;
        return this;
    }
    /**
    * Obtém SWCA_EMP
    * return SWCA_EMP
    * @generated
    */
    public java.lang.String getSWCA_EMP() {
        return this.SWCA_EMP;
    }

    /**
    * Define SWCA_EMP
    * @param SWCA_EMP SWCA_EMP
    * @generated
    */
    public CADEMP setSWCA_EMP(java.lang.String SWCA_EMP) {
        this.SWCA_EMP = SWCA_EMP;
        return this;
    }
    /**
    * Obtém SWCO_EMP
    * return SWCO_EMP
    * @generated
    */
    public java.lang.String getSWCO_EMP() {
        return this.SWCO_EMP;
    }

    /**
    * Define SWCO_EMP
    * @param SWCO_EMP SWCO_EMP
    * @generated
    */
    public CADEMP setSWCO_EMP(java.lang.String SWCO_EMP) {
        this.SWCO_EMP = SWCO_EMP;
        return this;
    }
    /**
    * Obtém SWIN_EMP
    * return SWIN_EMP
    * @generated
    */
    public java.lang.String getSWIN_EMP() {
        return this.SWIN_EMP;
    }

    /**
    * Define SWIN_EMP
    * @param SWIN_EMP SWIN_EMP
    * @generated
    */
    public CADEMP setSWIN_EMP(java.lang.String SWIN_EMP) {
        this.SWIN_EMP = SWIN_EMP;
        return this;
    }
    /**
    * Obtém SWRC_EMP
    * return SWRC_EMP
    * @generated
    */
    public java.lang.String getSWRC_EMP() {
        return this.SWRC_EMP;
    }

    /**
    * Define SWRC_EMP
    * @param SWRC_EMP SWRC_EMP
    * @generated
    */
    public CADEMP setSWRC_EMP(java.lang.String SWRC_EMP) {
        this.SWRC_EMP = SWRC_EMP;
        return this;
    }
    /**
    * Obtém SWRT_EMP
    * return SWRT_EMP
    * @generated
    */
    public java.lang.String getSWRT_EMP() {
        return this.SWRT_EMP;
    }

    /**
    * Define SWRT_EMP
    * @param SWRT_EMP SWRT_EMP
    * @generated
    */
    public CADEMP setSWRT_EMP(java.lang.String SWRT_EMP) {
        this.SWRT_EMP = SWRT_EMP;
        return this;
    }
    /**
    * Obtém SWST_EMP
    * return SWST_EMP
    * @generated
    */
    public java.lang.String getSWST_EMP() {
        return this.SWST_EMP;
    }

    /**
    * Define SWST_EMP
    * @param SWST_EMP SWST_EMP
    * @generated
    */
    public CADEMP setSWST_EMP(java.lang.String SWST_EMP) {
        this.SWST_EMP = SWST_EMP;
        return this;
    }
    /**
    * Obtém TBLO_SEM
    * return TBLO_SEM
    * @generated
    */
    public java.lang.String getTBLO_SEM() {
        return this.TBLO_SEM;
    }

    /**
    * Define TBLO_SEM
    * @param TBLO_SEM TBLO_SEM
    * @generated
    */
    public CADEMP setTBLO_SEM(java.lang.String TBLO_SEM) {
        this.TBLO_SEM = TBLO_SEM;
        return this;
    }
    /**
    * Obtém TCCO_EMP
    * return TCCO_EMP
    * @generated
    */
    public java.lang.Double getTCCO_EMP() {
        return this.TCCO_EMP;
    }

    /**
    * Define TCCO_EMP
    * @param TCCO_EMP TCCO_EMP
    * @generated
    */
    public CADEMP setTCCO_EMP(java.lang.Double TCCO_EMP) {
        this.TCCO_EMP = TCCO_EMP;
        return this;
    }
    /**
    * Obtém TCRE_EMP
    * return TCRE_EMP
    * @generated
    */
    public java.lang.Double getTCRE_EMP() {
        return this.TCRE_EMP;
    }

    /**
    * Define TCRE_EMP
    * @param TCRE_EMP TCRE_EMP
    * @generated
    */
    public CADEMP setTCRE_EMP(java.lang.Double TCRE_EMP) {
        this.TCRE_EMP = TCRE_EMP;
        return this;
    }
    /**
    * Obtém TIPO_EMP
    * return TIPO_EMP
    * @generated
    */
    public java.lang.String getTIPO_EMP() {
        return this.TIPO_EMP;
    }

    /**
    * Define TIPO_EMP
    * @param TIPO_EMP TIPO_EMP
    * @generated
    */
    public CADEMP setTIPO_EMP(java.lang.String TIPO_EMP) {
        this.TIPO_EMP = TIPO_EMP;
        return this;
    }
    /**
    * Obtém TJUR_EMP
    * return TJUR_EMP
    * @generated
    */
    public java.lang.String getTJUR_EMP() {
        return this.TJUR_EMP;
    }

    /**
    * Define TJUR_EMP
    * @param TJUR_EMP TJUR_EMP
    * @generated
    */
    public CADEMP setTJUR_EMP(java.lang.String TJUR_EMP) {
        this.TJUR_EMP = TJUR_EMP;
        return this;
    }
    /**
    * Obtém TPAG_EMP
    * return TPAG_EMP
    * @generated
    */
    public java.lang.String getTPAG_EMP() {
        return this.TPAG_EMP;
    }

    /**
    * Define TPAG_EMP
    * @param TPAG_EMP TPAG_EMP
    * @generated
    */
    public CADEMP setTPAG_EMP(java.lang.String TPAG_EMP) {
        this.TPAG_EMP = TPAG_EMP;
        return this;
    }
    /**
    * Obtém TVAL_CND
    * return TVAL_CND
    * @generated
    */
    public java.lang.String getTVAL_CND() {
        return this.TVAL_CND;
    }

    /**
    * Define TVAL_CND
    * @param TVAL_CND TVAL_CND
    * @generated
    */
    public CADEMP setTVAL_CND(java.lang.String TVAL_CND) {
        this.TVAL_CND = TVAL_CND;
        return this;
    }
    /**
    * Obtém UCFO_EMP
    * return UCFO_EMP
    * @generated
    */
    public java.lang.String getUCFO_EMP() {
        return this.UCFO_EMP;
    }

    /**
    * Define UCFO_EMP
    * @param UCFO_EMP UCFO_EMP
    * @generated
    */
    public CADEMP setUCFO_EMP(java.lang.String UCFO_EMP) {
        this.UCFO_EMP = UCFO_EMP;
        return this;
    }
    /**
    * Obtém UCRC_EMP
    * return UCRC_EMP
    * @generated
    */
    public java.lang.String getUCRC_EMP() {
        return this.UCRC_EMP;
    }

    /**
    * Define UCRC_EMP
    * @param UCRC_EMP UCRC_EMP
    * @generated
    */
    public CADEMP setUCRC_EMP(java.lang.String UCRC_EMP) {
        this.UCRC_EMP = UCRC_EMP;
        return this;
    }
    /**
    * Obtém UECF_EMP
    * return UECF_EMP
    * @generated
    */
    public java.lang.String getUECF_EMP() {
        return this.UECF_EMP;
    }

    /**
    * Define UECF_EMP
    * @param UECF_EMP UECF_EMP
    * @generated
    */
    public CADEMP setUECF_EMP(java.lang.String UECF_EMP) {
        this.UECF_EMP = UECF_EMP;
        return this;
    }
    /**
    * Obtém UPAF_EMP
    * return UPAF_EMP
    * @generated
    */
    public java.lang.String getUPAF_EMP() {
        return this.UPAF_EMP;
    }

    /**
    * Define UPAF_EMP
    * @param UPAF_EMP UPAF_EMP
    * @generated
    */
    public CADEMP setUPAF_EMP(java.lang.String UPAF_EMP) {
        this.UPAF_EMP = UPAF_EMP;
        return this;
    }
    /**
    * Obtém UTEV_EMP
    * return UTEV_EMP
    * @generated
    */
    public java.lang.String getUTEV_EMP() {
        return this.UTEV_EMP;
    }

    /**
    * Define UTEV_EMP
    * @param UTEV_EMP UTEV_EMP
    * @generated
    */
    public CADEMP setUTEV_EMP(java.lang.String UTEV_EMP) {
        this.UTEV_EMP = UTEV_EMP;
        return this;
    }
    /**
    * Obtém VALI_CND
    * return VALI_CND
    * @generated
    */
    public java.util.Date getVALI_CND() {
        return this.VALI_CND;
    }

    /**
    * Define VALI_CND
    * @param VALI_CND VALI_CND
    * @generated
    */
    public CADEMP setVALI_CND(java.util.Date VALI_CND) {
        this.VALI_CND = VALI_CND;
        return this;
    }
    /**
    * Obtém VEND_EMP
    * return VEND_EMP
    * @generated
    */
    public java.lang.String getVEND_EMP() {
        return this.VEND_EMP;
    }

    /**
    * Define VEND_EMP
    * @param VEND_EMP VEND_EMP
    * @generated
    */
    public CADEMP setVEND_EMP(java.lang.String VEND_EMP) {
        this.VEND_EMP = VEND_EMP;
        return this;
    }
    /**
    * Obtém VERS_EMP
    * return VERS_EMP
    * @generated
    */
    public java.lang.String getVERS_EMP() {
        return this.VERS_EMP;
    }

    /**
    * Define VERS_EMP
    * @param VERS_EMP VERS_EMP
    * @generated
    */
    public CADEMP setVERS_EMP(java.lang.String VERS_EMP) {
        this.VERS_EMP = VERS_EMP;
        return this;
    }
    /**
    * Obtém VIIM_EMP
    * return VIIM_EMP
    * @generated
    */
    public java.lang.String getVIIM_EMP() {
        return this.VIIM_EMP;
    }

    /**
    * Define VIIM_EMP
    * @param VIIM_EMP VIIM_EMP
    * @generated
    */
    public CADEMP setVIIM_EMP(java.lang.String VIIM_EMP) {
        this.VIIM_EMP = VIIM_EMP;
        return this;
    }
    /**
    * Obtém VMCT_EMP
    * return VMCT_EMP
    * @generated
    */
    public java.lang.String getVMCT_EMP() {
        return this.VMCT_EMP;
    }

    /**
    * Define VMCT_EMP
    * @param VMCT_EMP VMCT_EMP
    * @generated
    */
    public CADEMP setVMCT_EMP(java.lang.String VMCT_EMP) {
        this.VMCT_EMP = VMCT_EMP;
        return this;
    }
    /**
    * Obtém VNF4_EMP
    * return VNF4_EMP
    * @generated
    */
    public java.lang.String getVNF4_EMP() {
        return this.VNF4_EMP;
    }

    /**
    * Define VNF4_EMP
    * @param VNF4_EMP VNF4_EMP
    * @generated
    */
    public CADEMP setVNF4_EMP(java.lang.String VNF4_EMP) {
        this.VNF4_EMP = VNF4_EMP;
        return this;
    }
    /**
    * Obtém VTAX_SEM
    * return VTAX_SEM
    * @generated
    */
    public java.lang.String getVTAX_SEM() {
        return this.VTAX_SEM;
    }

    /**
    * Define VTAX_SEM
    * @param VTAX_SEM VTAX_SEM
    * @generated
    */
    public CADEMP setVTAX_SEM(java.lang.String VTAX_SEM) {
        this.VTAX_SEM = VTAX_SEM;
        return this;
    }
    /**
    * Obtém WCAN_EMP
    * return WCAN_EMP
    * @generated
    */
    public java.lang.String getWCAN_EMP() {
        return this.WCAN_EMP;
    }

    /**
    * Define WCAN_EMP
    * @param WCAN_EMP WCAN_EMP
    * @generated
    */
    public CADEMP setWCAN_EMP(java.lang.String WCAN_EMP) {
        this.WCAN_EMP = WCAN_EMP;
        return this;
    }
    /**
    * Obtém WCNF_EMP
    * return WCNF_EMP
    * @generated
    */
    public java.lang.String getWCNF_EMP() {
        return this.WCNF_EMP;
    }

    /**
    * Define WCNF_EMP
    * @param WCNF_EMP WCNF_EMP
    * @generated
    */
    public CADEMP setWCNF_EMP(java.lang.String WCNF_EMP) {
        this.WCNF_EMP = WCNF_EMP;
        return this;
    }
    /**
    * Obtém WCST_EMP
    * return WCST_EMP
    * @generated
    */
    public java.lang.String getWCST_EMP() {
        return this.WCST_EMP;
    }

    /**
    * Define WCST_EMP
    * @param WCST_EMP WCST_EMP
    * @generated
    */
    public CADEMP setWCST_EMP(java.lang.String WCST_EMP) {
        this.WCST_EMP = WCST_EMP;
        return this;
    }
    /**
    * Obtém WENV_EMP
    * return WENV_EMP
    * @generated
    */
    public java.lang.String getWENV_EMP() {
        return this.WENV_EMP;
    }

    /**
    * Define WENV_EMP
    * @param WENV_EMP WENV_EMP
    * @generated
    */
    public CADEMP setWENV_EMP(java.lang.String WENV_EMP) {
        this.WENV_EMP = WENV_EMP;
        return this;
    }
    /**
    * Obtém WESE_EMP
    * return WESE_EMP
    * @generated
    */
    public java.lang.String getWESE_EMP() {
        return this.WESE_EMP;
    }

    /**
    * Define WESE_EMP
    * @param WESE_EMP WESE_EMP
    * @generated
    */
    public CADEMP setWESE_EMP(java.lang.String WESE_EMP) {
        this.WESE_EMP = WESE_EMP;
        return this;
    }
    /**
    * Obtém WINU_EMP
    * return WINU_EMP
    * @generated
    */
    public java.lang.String getWINU_EMP() {
        return this.WINU_EMP;
    }

    /**
    * Define WINU_EMP
    * @param WINU_EMP WINU_EMP
    * @generated
    */
    public CADEMP setWINU_EMP(java.lang.String WINU_EMP) {
        this.WINU_EMP = WINU_EMP;
        return this;
    }
    /**
    * Obtém WRET_EMP
    * return WRET_EMP
    * @generated
    */
    public java.lang.String getWRET_EMP() {
        return this.WRET_EMP;
    }

    /**
    * Define WRET_EMP
    * @param WRET_EMP WRET_EMP
    * @generated
    */
    public CADEMP setWRET_EMP(java.lang.String WRET_EMP) {
        this.WRET_EMP = WRET_EMP;
        return this;
    }
    /**
    * Obtém WSCA_EMP
    * return WSCA_EMP
    * @generated
    */
    public java.lang.String getWSCA_EMP() {
        return this.WSCA_EMP;
    }

    /**
    * Define WSCA_EMP
    * @param WSCA_EMP WSCA_EMP
    * @generated
    */
    public CADEMP setWSCA_EMP(java.lang.String WSCA_EMP) {
        this.WSCA_EMP = WSCA_EMP;
        return this;
    }
    /**
    * Obtém WSCO_EMP
    * return WSCO_EMP
    * @generated
    */
    public java.lang.String getWSCO_EMP() {
        return this.WSCO_EMP;
    }

    /**
    * Define WSCO_EMP
    * @param WSCO_EMP WSCO_EMP
    * @generated
    */
    public CADEMP setWSCO_EMP(java.lang.String WSCO_EMP) {
        this.WSCO_EMP = WSCO_EMP;
        return this;
    }
    /**
    * Obtém WSIN_EMP
    * return WSIN_EMP
    * @generated
    */
    public java.lang.String getWSIN_EMP() {
        return this.WSIN_EMP;
    }

    /**
    * Define WSIN_EMP
    * @param WSIN_EMP WSIN_EMP
    * @generated
    */
    public CADEMP setWSIN_EMP(java.lang.String WSIN_EMP) {
        this.WSIN_EMP = WSIN_EMP;
        return this;
    }
    /**
    * Obtém WSRC_EMP
    * return WSRC_EMP
    * @generated
    */
    public java.lang.String getWSRC_EMP() {
        return this.WSRC_EMP;
    }

    /**
    * Define WSRC_EMP
    * @param WSRC_EMP WSRC_EMP
    * @generated
    */
    public CADEMP setWSRC_EMP(java.lang.String WSRC_EMP) {
        this.WSRC_EMP = WSRC_EMP;
        return this;
    }
    /**
    * Obtém WSRT_EMP
    * return WSRT_EMP
    * @generated
    */
    public java.lang.String getWSRT_EMP() {
        return this.WSRT_EMP;
    }

    /**
    * Define WSRT_EMP
    * @param WSRT_EMP WSRT_EMP
    * @generated
    */
    public CADEMP setWSRT_EMP(java.lang.String WSRT_EMP) {
        this.WSRT_EMP = WSRT_EMP;
        return this;
    }
    /**
    * Obtém WSST_EMP
    * return WSST_EMP
    * @generated
    */
    public java.lang.String getWSST_EMP() {
        return this.WSST_EMP;
    }

    /**
    * Define WSST_EMP
    * @param WSST_EMP WSST_EMP
    * @generated
    */
    public CADEMP setWSST_EMP(java.lang.String WSST_EMP) {
        this.WSST_EMP = WSST_EMP;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CADEMP object = (CADEMP)obj;
        if (CODI_EMP != null ? !CODI_EMP.equals(object.CODI_EMP) : object.CODI_EMP != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((CODI_EMP == null) ? 0 : CODI_EMP.hashCode());
        return result;
    }

}
