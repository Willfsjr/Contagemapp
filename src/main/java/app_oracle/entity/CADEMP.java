
package app_oracle.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela CADEMP
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CADEMP\"", schema="\"NEWFRD\"")
@XmlRootElement
@JsonFilter("app_oracle.entity.CADEMP")
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
    @Column(name = "CODI_EMP", nullable = false, insertable=true, updatable=true)
        private Integer CODI_EMP;


    /**
    * @generated
    */
    @Column(name = "ABRE_MUN", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String ABRE_MUN;


    /**
    * @generated
    */
    @Column(name = "ACCC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ACCC_EMP;


    /**
    * @generated
    */
    @Column(name = "ACNF_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ACNF_EMP;


    /**
    * @generated
    */
    @Column(name = "ACNP_EMP", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private String ACNP_EMP;


    /**
    * @generated
    */
    @Column(name = "ACON_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ACON_EMP;


    /**
    * @generated
    */
    @Column(name = "ACTE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ACTE_EMP;


    /**
    * @generated
    */
    @Column(name = "AECD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AECD_EMP;


    /**
    * @generated
    */
    @Column(name = "AECX_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AECX_EMP;


    /**
    * @generated
    */
    @Column(name = "AMBI_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AMBI_EMP;


    /**
    * @generated
    */
    @Column(name = "AMBS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AMBS_EMP;


    /**
    * @generated
    */
    @Column(name = "ANFC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ANFC_EMP;


    /**
    * @generated
    */
    @Column(name = "ANFS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ANFS_EMP;


    /**
    * @generated
    */
    @Column(name = "ASCC_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ASCC_EMP;


    /**
    * @generated
    */
    @Column(name = "ASCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ASCT_EMP;


    /**
    * @generated
    */
    @Column(name = "ASNF_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ASNF_EMP;


    /**
    * @generated
    */
    @Column(name = "ASUN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String ASUN_EMP;


    /**
    * @generated
    */
    @Column(name = "ATIV_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private String ATIV_EMP;


    /**
    * @generated
    */
    @Column(name = "AVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String AVAL_CND;


    /**
    * @generated
    */
    @Column(name = "BAIC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String BAIC_EMP;


    /**
    * @generated
    */
    @Column(name = "BAIR_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String BAIR_EMP;


    /**
    * @generated
    */
    @Column(name = "CAE_EMP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private String CAE_EMP;


    /**
    * @generated
    */
    @Column(name = "CARI_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private String CARI_EMP;


    /**
    * @generated
    */
    @Column(name = "CAUT_CND", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String CAUT_CND;


    /**
    * @generated
    */
    @Column(name = "CAVE_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double CAVE_EMP;


    /**
    * @generated
    */
    @Column(name = "CCCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String CCCT_EMP;


    /**
    * @generated
    */
    @Column(name = "CCER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String CCER_EMP;


    /**
    * @generated
    */
    @Column(name = "CENF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String CENF_EMP;


    /**
    * @generated
    */
    @Column(name = "CEPC_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private String CEPC_EMP;


    /**
    * @generated
    */
    @Column(name = "CEP_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private String CEP_EMP;


    /**
    * @generated
    */
    @Column(name = "CHEK_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String CHEK_EMP;


    /**
    * @generated
    */
    @Column(name = "CICE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String CICE_EMP;


    /**
    * @generated
    */
    @Column(name = "CIMA_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String CIMA_EMP;


    /**
    * @generated
    */
    @Column(name = "CJUR_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double CJUR_EMP;


    /**
    * @generated
    */
    @Column(name = "CLIA_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CLIA_EMP;


    /**
    * @generated
    */
    @Column(name = "CMAT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CMAT_EMP;


    /**
    * @generated
    */
    @Column(name = "CMER_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CMER_EMP;


    /**
    * @generated
    */
    @Column(name = "CNFS_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String CNFS_EMP;


    /**
    * @generated
    */
    @Column(name = "CNPJ_EMP", nullable = false, unique = false, length=14, insertable=true, updatable=true)
        
        private String CNPJ_EMP;


    /**
    * @generated
    */
    @Column(name = "COD1_TRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer COD1_TRA;


    /**
    * @generated
    */
    @Column(name = "COD2_TRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer COD2_TRA;


    /**
    * @generated
    */
    @Column(name = "CODA_EMP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private String CODA_EMP;


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
    @Column(name = "CODI_AUD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_AUD;


    /**
    * @generated
    */
    @Column(name = "CODI_CND", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String CODI_CND;


    /**
    * @generated
    */
    @Column(name = "CODI_CTD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_CTD;


    /**
    * @generated
    */
    @Column(name = "CODI_FCR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_FCR;


    /**
    * @generated
    */
    @Column(name = "CODI_INS", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String CODI_INS;


    /**
    * @generated
    */
    @Column(name = "CODI_MUN", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_MUN;


    /**
    * @generated
    */
    @Column(name = "CODI_PES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CODI_PES;


    /**
    * @generated
    */
    @Column(name = "CODI_PRF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String CODI_PRF;


    /**
    * @generated
    */
    @Column(name = "CODM_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private String CODM_EMP;


    /**
    * @generated
    */
    @Column(name = "COMP_EMP", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private String COMP_EMP;


    /**
    * @generated
    */
    @Column(name = "CONT_EMP", nullable = true, unique = false, length=65, insertable=true, updatable=true)
        
        private String CONT_EMP;


    /**
    * @generated
    */
    @Column(name = "CPON_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String CPON_EMP;


    /**
    * @generated
    */
    @Column(name = "CTRL_SOE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer CTRL_SOE;


    /**
    * @generated
    */
    @Column(name = "CVEN_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double CVEN_EMP;


    /**
    * @generated
    */
    @Column(name = "CXPO_EMP", nullable = true, unique = false, length=6, insertable=true, updatable=true)
        
        private String CXPO_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATAULTIMASINCRONIZACAOAPI", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date DATAULTIMASINCRONIZACAOAPI;


    /**
    * @generated
    */
    @Column(name = "DCCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String DCCT_EMP;


    /**
    * @generated
    */
    @Column(name = "DCER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String DCER_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DCON_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DCON_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DDES_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DDES_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DFIN_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DFIN_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DFU_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DFU_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DICC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DICC_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DICP_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DICP_EMP;


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
    @Column(name = "DJC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DJC_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DSEF_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DSEF_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DTIC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DTIC_EMP;


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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DVCR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVCR_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DVCV_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVCV_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DVTR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DVTR_EMP;


    /**
    * @generated
    */
    @Column(name = "EACA_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String EACA_EMP;


    /**
    * @generated
    */
    @Column(name = "EASS_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String EASS_EMP;


    /**
    * @generated
    */
    @Column(name = "EBNS_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private String EBNS_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ECDT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date ECDT_EMP;


    /**
    * @generated
    */
    @Column(name = "ECER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ECER_EMP;


    /**
    * @generated
    */
    @Column(name = "ECHR_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private String ECHR_EMP;


    /**
    * @generated
    */
    @Column(name = "EDCE_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String EDCE_EMP;


    /**
    * @generated
    */
    @Column(name = "EDIS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String EDIS_EMP;


    /**
    * @generated
    */
    @Column(name = "EECC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String EECC_EMP;


    /**
    * @generated
    */
    @Column(name = "EEMA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String EEMA_EMP;


    /**
    * @generated
    */
    @Column(name = "EGRP_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String EGRP_EMP;


    /**
    * @generated
    */
    @Column(name = "ELTR_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ELTR_EMP;


    /**
    * @generated
    */
    @Column(name = "EMAC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String EMAC_EMP;


    /**
    * @generated
    */
    @Column(name = "EMAI_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String EMAI_EMP;


    /**
    * @generated
    */
    @Column(name = "EMCA_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String EMCA_EMP;


    /**
    * @generated
    */
    @Column(name = "EMPR_FOL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer EMPR_FOL;


    /**
    * @generated
    */
    @Column(name = "EMSG_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String EMSG_EMP;


    /**
    * @generated
    */
    @Column(name = "ENDC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String ENDC_EMP;


    /**
    * @generated
    */
    @Column(name = "ENDE_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String ENDE_EMP;


    /**
    * @generated
    */
    @Column(name = "ENVE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ENVE_EMP;


    /**
    * @generated
    */
    @Column(name = "ESCN_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ESCN_EMP;


    /**
    * @generated
    */
    @Column(name = "ESER_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String ESER_EMP;


    /**
    * @generated
    */
    @Column(name = "ESUB_EMP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private String ESUB_EMP;


    /**
    * @generated
    */
    @Column(name = "EULL_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer EULL_EMP;


    /**
    * @generated
    */
    @Column(name = "EUTE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String EUTE_EMP;


    /**
    * @generated
    */
    @Column(name = "FANT_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private String FANT_EMP;


    /**
    * @generated
    */
    @Column(name = "FAXC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String FAXC_EMP;


    /**
    * @generated
    */
    @Column(name = "FAX_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String FAX_EMP;


    /**
    * @generated
    */
    @Column(name = "FDCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String FDCT_EMP;


    /**
    * @generated
    */
    @Column(name = "FONC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String FONC_EMP;


    /**
    * @generated
    */
    @Column(name = "FONE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String FONE_EMP;


    /**
    * @generated
    */
    @Column(name = "FORE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String FORE_EMP;


    /**
    * @generated
    */
    @Column(name = "GPDF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String GPDF_EMP;


    /**
    * @generated
    */
    @Column(name = "GPZE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String GPZE_EMP;


    /**
    * @generated
    */
    @Column(name = "HCON_EMP", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private String HCON_EMP;


    /**
    * @generated
    */
    @Column(name = "IDAF_EMP", nullable = true, unique = false, length=25, insertable=true, updatable=true)
        
        private String IDAF_EMP;


    /**
    * @generated
    */
    @Column(name = "IDAT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IDAT_EMP;


    /**
    * @generated
    */
    @Column(name = "IDCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IDCT_EMP;


    /**
    * @generated
    */
    @Column(name = "IDEN_EMP", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private String IDEN_EMP;


    /**
    * @generated
    */
    @Column(name = "ILOG_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ILOG_EMP;


    /**
    * @generated
    */
    @Column(name = "IMCA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IMCA_EMP;


    /**
    * @generated
    */
    @Column(name = "IMHS_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IMHS_EMP;


    /**
    * @generated
    */
    @Column(name = "INDD_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String INDD_EMP;


    /**
    * @generated
    */
    @Column(name = "INE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String INE_EMP;


    /**
    * @generated
    */
    @Column(name = "INM_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String INM_EMP;


    /**
    * @generated
    */
    @Column(name = "INST_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String INST_EMP;


    /**
    * @generated
    */
    @Column(name = "INTC_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String INTC_EMP;


    /**
    * @generated
    */
    @Column(name = "INTE_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String INTE_EMP;


    /**
    * @generated
    */
    @Column(name = "ITAX_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ITAX_SEM;


    /**
    * @generated
    */
    @Column(name = "IUCD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String IUCD_EMP;


    /**
    * @generated
    */
    @Column(name = "IVLR_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double IVLR_EMP;


    /**
    * @generated
    */
    @Column(name = "LAUD_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private String LAUD_EMP;


    /**
    * @generated
    */
    @Column(name = "LCTE_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer LCTE_EMP;


    /**
    * @generated
    */
    @Column(name = "LMDF_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer LMDF_EMP;


    /**
    * @generated
    */
    @Column(name = "LOGO_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private byte[] LOGO_EMP;


    /**
    * @generated
    */
    @Column(name = "LTRA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String LTRA_EMP;


    /**
    * @generated
    */
    @Column(name = "MCNF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String MCNF_EMP;


    /**
    * @generated
    */
    @Column(name = "MDCT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MDCT_EMP;


    /**
    * @generated
    */
    @Column(name = "MECT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MECT_EMP;


    /**
    * @generated
    */
    @Column(name = "MICT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MICT_EMP;


    /**
    * @generated
    */
    @Column(name = "MOD_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer MOD_EMP;


    /**
    * @generated
    */
    @Column(name = "MPCT_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String MPCT_EMP;


    /**
    * @generated
    */
    @Column(name = "MSCC_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String MSCC_EMP;


    /**
    * @generated
    */
    @Column(name = "MSCT_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double MSCT_EMP;


    /**
    * @generated
    */
    @Column(name = "MSIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String MSIM_EMP;


    /**
    * @generated
    */
    @Column(name = "MSNF_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private String MSNF_EMP;


    /**
    * @generated
    */
    @Column(name = "MUNC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer MUNC_EMP;


    /**
    * @generated
    */
    @Column(name = "NCRE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String NCRE_EMP;


    /**
    * @generated
    */
    @Column(name = "NCVI_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String NCVI_EMP;


    /**
    * @generated
    */
    @Column(name = "NESO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NESO_EMP;


    /**
    * @generated
    */
    @Column(name = "NFC4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NFC4_EMP;


    /**
    * @generated
    */
    @Column(name = "NFE4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NFE4_EMP;


    /**
    * @generated
    */
    @Column(name = "NFEC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NFEC_EMP;


    /**
    * @generated
    */
    @Column(name = "NFES_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NFES_EMP;


    /**
    * @generated
    */
    @Column(name = "NFLT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NFLT_EMP;


    /**
    * @generated
    */
    @Column(name = "NGRE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String NGRE_EMP;


    /**
    * @generated
    */
    @Column(name = "NIRE_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String NIRE_EMP;


    /**
    * @generated
    */
    @Column(name = "NLCC_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NLCC_EMP;


    /**
    * @generated
    */
    @Column(name = "NLIC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String NLIC_EMP;


    /**
    * @generated
    */
    @Column(name = "NLTS_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NLTS_EMP;


    /**
    * @generated
    */
    @Column(name = "NREG_EMP", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private String NREG_EMP;


    /**
    * @generated
    */
    @Column(name = "NRLT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NRLT_EMP;


    /**
    * @generated
    */
    @Column(name = "NSCE_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String NSCE_EMP;


    /**
    * @generated
    */
    @Column(name = "NSCT_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String NSCT_EMP;


    /**
    * @generated
    */
    @Column(name = "NTAR_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NTAR_EMP;


    /**
    * @generated
    */
    @Column(name = "NTCT_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NTCT_EMP;


    /**
    * @generated
    */
    @Column(name = "NUCO_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer NUCO_EMP;


    /**
    * @generated
    */
    @Column(name = "NUMC_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String NUMC_EMP;


    /**
    * @generated
    */
    @Column(name = "NUME_EMP", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private String NUME_EMP;


    /**
    * @generated
    */
    @Column(name = "ORIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String ORIM_EMP;


    /**
    * @generated
    */
    @Column(name = "PDCB_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PDCB_EMP;


    /**
    * @generated
    */
    @Column(name = "PDCC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PDCC_EMP;


    /**
    * @generated
    */
    @Column(name = "PDCD_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PDCD_EMP;


    /**
    * @generated
    */
    @Column(name = "PDCE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PDCE_EMP;


    /**
    * @generated
    */
    @Column(name = "PDCR_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PDCR_EMP;


    /**
    * @generated
    */
    @Column(name = "PEFI_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer PEFI_EMP;


    /**
    * @generated
    */
    @Column(name = "PICT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PICT_EMP;


    /**
    * @generated
    */
    @Column(name = "PORE_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String PORE_EMP;


    /**
    * @generated
    */
    @Column(name = "PPAR_EMP", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private byte[] PPAR_EMP;


    /**
    * @generated
    */
    @Column(name = "RAZA_EMP", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private String RAZA_EMP;


    /**
    * @generated
    */
    @Column(name = "REGI_EMP", nullable = true, unique = false, length=4, insertable=true, updatable=true)
        
        private String REGI_EMP;


    /**
    * @generated
    */
    @Column(name = "RENA_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String RENA_EMP;


    /**
    * @generated
    */
    @Column(name = "RNTC_EMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private String RNTC_EMP;


    /**
    * @generated
    */
    @Column(name = "RQFA_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String RQFA_EMP;


    /**
    * @generated
    */
    @Column(name = "RREC_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String RREC_EMP;


    /**
    * @generated
    */
    @Column(name = "RVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String RVAL_CND;


    /**
    * @generated
    */
    @Column(name = "SAPM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SAPM_EMP;


    /**
    * @generated
    */
    @Column(name = "SCAN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SCAN_EMP;


    /**
    * @generated
    */
    @Column(name = "SCNF_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SCNF_EMP;


    /**
    * @generated
    */
    @Column(name = "SCST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SCST_EMP;


    /**
    * @generated
    */
    @Column(name = "SENV_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SENV_EMP;


    /**
    * @generated
    */
    @Column(name = "SHAB_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private String SHAB_EMP;


    /**
    * @generated
    */
    @Column(name = "SINI_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SINI_EMP;


    /**
    * @generated
    */
    @Column(name = "SINP_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SINP_EMP;


    /**
    * @generated
    */
    @Column(name = "SINU_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SINU_EMP;


    /**
    * @generated
    */
    @Column(name = "SITE_CND", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String SITE_CND;


    /**
    * @generated
    */
    @Column(name = "SITU_EMP", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String SITU_EMP;


    /**
    * @generated
    */
    @Column(name = "SLOG_EMP", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private String SLOG_EMP;


    /**
    * @generated
    */
    @Column(name = "SNFC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SNFC_EMP;


    /**
    * @generated
    */
    @Column(name = "SOUT_EMP", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private String SOUT_EMP;


    /**
    * @generated
    */
    @Column(name = "SPAT_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String SPAT_EMP;


    /**
    * @generated
    */
    @Column(name = "SPCE_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer SPCE_EMP;


    /**
    * @generated
    */
    @Column(name = "SPIT_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String SPIT_EMP;


    /**
    * @generated
    */
    @Column(name = "SPMA_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String SPMA_EMP;


    /**
    * @generated
    */
    @Column(name = "SPNA_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String SPNA_EMP;


    /**
    * @generated
    */
    @Column(name = "SPTC_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String SPTC_EMP;


    /**
    * @generated
    */
    @Column(name = "SRES_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SRES_EMP;


    /**
    * @generated
    */
    @Column(name = "SRET_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SRET_EMP;


    /**
    * @generated
    */
    @Column(name = "SROU_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String SROU_EMP;


    /**
    * @generated
    */
    @Column(name = "SWCA_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWCA_EMP;


    /**
    * @generated
    */
    @Column(name = "SWCO_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWCO_EMP;


    /**
    * @generated
    */
    @Column(name = "SWIN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWIN_EMP;


    /**
    * @generated
    */
    @Column(name = "SWRC_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWRC_EMP;


    /**
    * @generated
    */
    @Column(name = "SWRT_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWRT_EMP;


    /**
    * @generated
    */
    @Column(name = "SWST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String SWST_EMP;


    /**
    * @generated
    */
    @Column(name = "TBLO_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String TBLO_SEM;


    /**
    * @generated
    */
    @Column(name = "TCCO_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double TCCO_EMP;


    /**
    * @generated
    */
    @Column(name = "TCRE_EMP", nullable = true, unique = false, precision=9, scale=9, insertable=true, updatable=true)
        
        private Double TCRE_EMP;


    /**
    * @generated
    */
    @Column(name = "TIPO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String TIPO_EMP;


    /**
    * @generated
    */
    @Column(name = "TJUR_EMP", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private String TJUR_EMP;


    /**
    * @generated
    */
    @Column(name = "TPAG_EMP", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private String TPAG_EMP;


    /**
    * @generated
    */
    @Column(name = "TVAL_CND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String TVAL_CND;


    /**
    * @generated
    */
    @Column(name = "UCFO_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UCFO_EMP;


    /**
    * @generated
    */
    @Column(name = "UCRC_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UCRC_EMP;


    /**
    * @generated
    */
    @Column(name = "UECF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UECF_EMP;


    /**
    * @generated
    */
    @Column(name = "UPAF_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UPAF_EMP;


    /**
    * @generated
    */
    @Column(name = "UTEV_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String UTEV_EMP;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VALI_CND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date VALI_CND;


    /**
    * @generated
    */
    @Column(name = "VEND_EMP", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private String VEND_EMP;


    /**
    * @generated
    */
    @Column(name = "VERS_EMP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private String VERS_EMP;


    /**
    * @generated
    */
    @Column(name = "VIIM_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String VIIM_EMP;


    /**
    * @generated
    */
    @Column(name = "VMCT_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String VMCT_EMP;


    /**
    * @generated
    */
    @Column(name = "VNF4_EMP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String VNF4_EMP;


    /**
    * @generated
    */
    @Column(name = "VTAX_SEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private String VTAX_SEM;


    /**
    * @generated
    */
    @Column(name = "WCAN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WCAN_EMP;


    /**
    * @generated
    */
    @Column(name = "WCNF_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WCNF_EMP;


    /**
    * @generated
    */
    @Column(name = "WCST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WCST_EMP;


    /**
    * @generated
    */
    @Column(name = "WENV_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WENV_EMP;


    /**
    * @generated
    */
    @Column(name = "WESE_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WESE_EMP;


    /**
    * @generated
    */
    @Column(name = "WINU_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WINU_EMP;


    /**
    * @generated
    */
    @Column(name = "WRET_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WRET_EMP;


    /**
    * @generated
    */
    @Column(name = "WSCA_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSCA_EMP;


    /**
    * @generated
    */
    @Column(name = "WSCO_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSCO_EMP;


    /**
    * @generated
    */
    @Column(name = "WSIN_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSIN_EMP;


    /**
    * @generated
    */
    @Column(name = "WSRC_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSRC_EMP;


    /**
    * @generated
    */
    @Column(name = "WSRT_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSRT_EMP;


    /**
    * @generated
    */
    @Column(name = "WSST_EMP", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private String WSST_EMP;


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
    public Integer getCODI_EMP() {
        return this.CODI_EMP;
    }

    /**
    * Define CODI_EMP
    * @param CODI_EMP CODI_EMP
    * @generated
    */
    public CADEMP setCODI_EMP(Integer CODI_EMP) {
        this.CODI_EMP = CODI_EMP;
        return this;
    }
    /**
    * Obtém ABRE_MUN
    * return ABRE_MUN
    * @generated
    */
    public String getABRE_MUN() {
        return this.ABRE_MUN;
    }

    /**
    * Define ABRE_MUN
    * @param ABRE_MUN ABRE_MUN
    * @generated
    */
    public CADEMP setABRE_MUN(String ABRE_MUN) {
        this.ABRE_MUN = ABRE_MUN;
        return this;
    }
    /**
    * Obtém ACCC_EMP
    * return ACCC_EMP
    * @generated
    */
    public String getACCC_EMP() {
        return this.ACCC_EMP;
    }

    /**
    * Define ACCC_EMP
    * @param ACCC_EMP ACCC_EMP
    * @generated
    */
    public CADEMP setACCC_EMP(String ACCC_EMP) {
        this.ACCC_EMP = ACCC_EMP;
        return this;
    }
    /**
    * Obtém ACNF_EMP
    * return ACNF_EMP
    * @generated
    */
    public String getACNF_EMP() {
        return this.ACNF_EMP;
    }

    /**
    * Define ACNF_EMP
    * @param ACNF_EMP ACNF_EMP
    * @generated
    */
    public CADEMP setACNF_EMP(String ACNF_EMP) {
        this.ACNF_EMP = ACNF_EMP;
        return this;
    }
    /**
    * Obtém ACNP_EMP
    * return ACNP_EMP
    * @generated
    */
    public String getACNP_EMP() {
        return this.ACNP_EMP;
    }

    /**
    * Define ACNP_EMP
    * @param ACNP_EMP ACNP_EMP
    * @generated
    */
    public CADEMP setACNP_EMP(String ACNP_EMP) {
        this.ACNP_EMP = ACNP_EMP;
        return this;
    }
    /**
    * Obtém ACON_EMP
    * return ACON_EMP
    * @generated
    */
    public String getACON_EMP() {
        return this.ACON_EMP;
    }

    /**
    * Define ACON_EMP
    * @param ACON_EMP ACON_EMP
    * @generated
    */
    public CADEMP setACON_EMP(String ACON_EMP) {
        this.ACON_EMP = ACON_EMP;
        return this;
    }
    /**
    * Obtém ACTE_EMP
    * return ACTE_EMP
    * @generated
    */
    public String getACTE_EMP() {
        return this.ACTE_EMP;
    }

    /**
    * Define ACTE_EMP
    * @param ACTE_EMP ACTE_EMP
    * @generated
    */
    public CADEMP setACTE_EMP(String ACTE_EMP) {
        this.ACTE_EMP = ACTE_EMP;
        return this;
    }
    /**
    * Obtém AECD_EMP
    * return AECD_EMP
    * @generated
    */
    public String getAECD_EMP() {
        return this.AECD_EMP;
    }

    /**
    * Define AECD_EMP
    * @param AECD_EMP AECD_EMP
    * @generated
    */
    public CADEMP setAECD_EMP(String AECD_EMP) {
        this.AECD_EMP = AECD_EMP;
        return this;
    }
    /**
    * Obtém AECX_EMP
    * return AECX_EMP
    * @generated
    */
    public String getAECX_EMP() {
        return this.AECX_EMP;
    }

    /**
    * Define AECX_EMP
    * @param AECX_EMP AECX_EMP
    * @generated
    */
    public CADEMP setAECX_EMP(String AECX_EMP) {
        this.AECX_EMP = AECX_EMP;
        return this;
    }
    /**
    * Obtém AMBI_EMP
    * return AMBI_EMP
    * @generated
    */
    public String getAMBI_EMP() {
        return this.AMBI_EMP;
    }

    /**
    * Define AMBI_EMP
    * @param AMBI_EMP AMBI_EMP
    * @generated
    */
    public CADEMP setAMBI_EMP(String AMBI_EMP) {
        this.AMBI_EMP = AMBI_EMP;
        return this;
    }
    /**
    * Obtém AMBS_EMP
    * return AMBS_EMP
    * @generated
    */
    public String getAMBS_EMP() {
        return this.AMBS_EMP;
    }

    /**
    * Define AMBS_EMP
    * @param AMBS_EMP AMBS_EMP
    * @generated
    */
    public CADEMP setAMBS_EMP(String AMBS_EMP) {
        this.AMBS_EMP = AMBS_EMP;
        return this;
    }
    /**
    * Obtém ANFC_EMP
    * return ANFC_EMP
    * @generated
    */
    public String getANFC_EMP() {
        return this.ANFC_EMP;
    }

    /**
    * Define ANFC_EMP
    * @param ANFC_EMP ANFC_EMP
    * @generated
    */
    public CADEMP setANFC_EMP(String ANFC_EMP) {
        this.ANFC_EMP = ANFC_EMP;
        return this;
    }
    /**
    * Obtém ANFS_EMP
    * return ANFS_EMP
    * @generated
    */
    public String getANFS_EMP() {
        return this.ANFS_EMP;
    }

    /**
    * Define ANFS_EMP
    * @param ANFS_EMP ANFS_EMP
    * @generated
    */
    public CADEMP setANFS_EMP(String ANFS_EMP) {
        this.ANFS_EMP = ANFS_EMP;
        return this;
    }
    /**
    * Obtém ASCC_EMP
    * return ASCC_EMP
    * @generated
    */
    public String getASCC_EMP() {
        return this.ASCC_EMP;
    }

    /**
    * Define ASCC_EMP
    * @param ASCC_EMP ASCC_EMP
    * @generated
    */
    public CADEMP setASCC_EMP(String ASCC_EMP) {
        this.ASCC_EMP = ASCC_EMP;
        return this;
    }
    /**
    * Obtém ASCT_EMP
    * return ASCT_EMP
    * @generated
    */
    public String getASCT_EMP() {
        return this.ASCT_EMP;
    }

    /**
    * Define ASCT_EMP
    * @param ASCT_EMP ASCT_EMP
    * @generated
    */
    public CADEMP setASCT_EMP(String ASCT_EMP) {
        this.ASCT_EMP = ASCT_EMP;
        return this;
    }
    /**
    * Obtém ASNF_EMP
    * return ASNF_EMP
    * @generated
    */
    public String getASNF_EMP() {
        return this.ASNF_EMP;
    }

    /**
    * Define ASNF_EMP
    * @param ASNF_EMP ASNF_EMP
    * @generated
    */
    public CADEMP setASNF_EMP(String ASNF_EMP) {
        this.ASNF_EMP = ASNF_EMP;
        return this;
    }
    /**
    * Obtém ASUN_EMP
    * return ASUN_EMP
    * @generated
    */
    public String getASUN_EMP() {
        return this.ASUN_EMP;
    }

    /**
    * Define ASUN_EMP
    * @param ASUN_EMP ASUN_EMP
    * @generated
    */
    public CADEMP setASUN_EMP(String ASUN_EMP) {
        this.ASUN_EMP = ASUN_EMP;
        return this;
    }
    /**
    * Obtém ATIV_EMP
    * return ATIV_EMP
    * @generated
    */
    public String getATIV_EMP() {
        return this.ATIV_EMP;
    }

    /**
    * Define ATIV_EMP
    * @param ATIV_EMP ATIV_EMP
    * @generated
    */
    public CADEMP setATIV_EMP(String ATIV_EMP) {
        this.ATIV_EMP = ATIV_EMP;
        return this;
    }
    /**
    * Obtém AVAL_CND
    * return AVAL_CND
    * @generated
    */
    public String getAVAL_CND() {
        return this.AVAL_CND;
    }

    /**
    * Define AVAL_CND
    * @param AVAL_CND AVAL_CND
    * @generated
    */
    public CADEMP setAVAL_CND(String AVAL_CND) {
        this.AVAL_CND = AVAL_CND;
        return this;
    }
    /**
    * Obtém BAIC_EMP
    * return BAIC_EMP
    * @generated
    */
    public String getBAIC_EMP() {
        return this.BAIC_EMP;
    }

    /**
    * Define BAIC_EMP
    * @param BAIC_EMP BAIC_EMP
    * @generated
    */
    public CADEMP setBAIC_EMP(String BAIC_EMP) {
        this.BAIC_EMP = BAIC_EMP;
        return this;
    }
    /**
    * Obtém BAIR_EMP
    * return BAIR_EMP
    * @generated
    */
    public String getBAIR_EMP() {
        return this.BAIR_EMP;
    }

    /**
    * Define BAIR_EMP
    * @param BAIR_EMP BAIR_EMP
    * @generated
    */
    public CADEMP setBAIR_EMP(String BAIR_EMP) {
        this.BAIR_EMP = BAIR_EMP;
        return this;
    }
    /**
    * Obtém CAE_EMP
    * return CAE_EMP
    * @generated
    */
    public String getCAE_EMP() {
        return this.CAE_EMP;
    }

    /**
    * Define CAE_EMP
    * @param CAE_EMP CAE_EMP
    * @generated
    */
    public CADEMP setCAE_EMP(String CAE_EMP) {
        this.CAE_EMP = CAE_EMP;
        return this;
    }
    /**
    * Obtém CARI_EMP
    * return CARI_EMP
    * @generated
    */
    public String getCARI_EMP() {
        return this.CARI_EMP;
    }

    /**
    * Define CARI_EMP
    * @param CARI_EMP CARI_EMP
    * @generated
    */
    public CADEMP setCARI_EMP(String CARI_EMP) {
        this.CARI_EMP = CARI_EMP;
        return this;
    }
    /**
    * Obtém CAUT_CND
    * return CAUT_CND
    * @generated
    */
    public String getCAUT_CND() {
        return this.CAUT_CND;
    }

    /**
    * Define CAUT_CND
    * @param CAUT_CND CAUT_CND
    * @generated
    */
    public CADEMP setCAUT_CND(String CAUT_CND) {
        this.CAUT_CND = CAUT_CND;
        return this;
    }
    /**
    * Obtém CAVE_EMP
    * return CAVE_EMP
    * @generated
    */
    public Double getCAVE_EMP() {
        return this.CAVE_EMP;
    }

    /**
    * Define CAVE_EMP
    * @param CAVE_EMP CAVE_EMP
    * @generated
    */
    public CADEMP setCAVE_EMP(Double CAVE_EMP) {
        this.CAVE_EMP = CAVE_EMP;
        return this;
    }
    /**
    * Obtém CCCT_EMP
    * return CCCT_EMP
    * @generated
    */
    public String getCCCT_EMP() {
        return this.CCCT_EMP;
    }

    /**
    * Define CCCT_EMP
    * @param CCCT_EMP CCCT_EMP
    * @generated
    */
    public CADEMP setCCCT_EMP(String CCCT_EMP) {
        this.CCCT_EMP = CCCT_EMP;
        return this;
    }
    /**
    * Obtém CCER_EMP
    * return CCER_EMP
    * @generated
    */
    public String getCCER_EMP() {
        return this.CCER_EMP;
    }

    /**
    * Define CCER_EMP
    * @param CCER_EMP CCER_EMP
    * @generated
    */
    public CADEMP setCCER_EMP(String CCER_EMP) {
        this.CCER_EMP = CCER_EMP;
        return this;
    }
    /**
    * Obtém CENF_EMP
    * return CENF_EMP
    * @generated
    */
    public String getCENF_EMP() {
        return this.CENF_EMP;
    }

    /**
    * Define CENF_EMP
    * @param CENF_EMP CENF_EMP
    * @generated
    */
    public CADEMP setCENF_EMP(String CENF_EMP) {
        this.CENF_EMP = CENF_EMP;
        return this;
    }
    /**
    * Obtém CEPC_EMP
    * return CEPC_EMP
    * @generated
    */
    public String getCEPC_EMP() {
        return this.CEPC_EMP;
    }

    /**
    * Define CEPC_EMP
    * @param CEPC_EMP CEPC_EMP
    * @generated
    */
    public CADEMP setCEPC_EMP(String CEPC_EMP) {
        this.CEPC_EMP = CEPC_EMP;
        return this;
    }
    /**
    * Obtém CEP_EMP
    * return CEP_EMP
    * @generated
    */
    public String getCEP_EMP() {
        return this.CEP_EMP;
    }

    /**
    * Define CEP_EMP
    * @param CEP_EMP CEP_EMP
    * @generated
    */
    public CADEMP setCEP_EMP(String CEP_EMP) {
        this.CEP_EMP = CEP_EMP;
        return this;
    }
    /**
    * Obtém CHEK_EMP
    * return CHEK_EMP
    * @generated
    */
    public String getCHEK_EMP() {
        return this.CHEK_EMP;
    }

    /**
    * Define CHEK_EMP
    * @param CHEK_EMP CHEK_EMP
    * @generated
    */
    public CADEMP setCHEK_EMP(String CHEK_EMP) {
        this.CHEK_EMP = CHEK_EMP;
        return this;
    }
    /**
    * Obtém CICE_EMP
    * return CICE_EMP
    * @generated
    */
    public String getCICE_EMP() {
        return this.CICE_EMP;
    }

    /**
    * Define CICE_EMP
    * @param CICE_EMP CICE_EMP
    * @generated
    */
    public CADEMP setCICE_EMP(String CICE_EMP) {
        this.CICE_EMP = CICE_EMP;
        return this;
    }
    /**
    * Obtém CIMA_EMP
    * return CIMA_EMP
    * @generated
    */
    public String getCIMA_EMP() {
        return this.CIMA_EMP;
    }

    /**
    * Define CIMA_EMP
    * @param CIMA_EMP CIMA_EMP
    * @generated
    */
    public CADEMP setCIMA_EMP(String CIMA_EMP) {
        this.CIMA_EMP = CIMA_EMP;
        return this;
    }
    /**
    * Obtém CJUR_EMP
    * return CJUR_EMP
    * @generated
    */
    public Double getCJUR_EMP() {
        return this.CJUR_EMP;
    }

    /**
    * Define CJUR_EMP
    * @param CJUR_EMP CJUR_EMP
    * @generated
    */
    public CADEMP setCJUR_EMP(Double CJUR_EMP) {
        this.CJUR_EMP = CJUR_EMP;
        return this;
    }
    /**
    * Obtém CLIA_EMP
    * return CLIA_EMP
    * @generated
    */
    public Integer getCLIA_EMP() {
        return this.CLIA_EMP;
    }

    /**
    * Define CLIA_EMP
    * @param CLIA_EMP CLIA_EMP
    * @generated
    */
    public CADEMP setCLIA_EMP(Integer CLIA_EMP) {
        this.CLIA_EMP = CLIA_EMP;
        return this;
    }
    /**
    * Obtém CMAT_EMP
    * return CMAT_EMP
    * @generated
    */
    public Integer getCMAT_EMP() {
        return this.CMAT_EMP;
    }

    /**
    * Define CMAT_EMP
    * @param CMAT_EMP CMAT_EMP
    * @generated
    */
    public CADEMP setCMAT_EMP(Integer CMAT_EMP) {
        this.CMAT_EMP = CMAT_EMP;
        return this;
    }
    /**
    * Obtém CMER_EMP
    * return CMER_EMP
    * @generated
    */
    public Integer getCMER_EMP() {
        return this.CMER_EMP;
    }

    /**
    * Define CMER_EMP
    * @param CMER_EMP CMER_EMP
    * @generated
    */
    public CADEMP setCMER_EMP(Integer CMER_EMP) {
        this.CMER_EMP = CMER_EMP;
        return this;
    }
    /**
    * Obtém CNFS_EMP
    * return CNFS_EMP
    * @generated
    */
    public String getCNFS_EMP() {
        return this.CNFS_EMP;
    }

    /**
    * Define CNFS_EMP
    * @param CNFS_EMP CNFS_EMP
    * @generated
    */
    public CADEMP setCNFS_EMP(String CNFS_EMP) {
        this.CNFS_EMP = CNFS_EMP;
        return this;
    }
    /**
    * Obtém CNPJ_EMP
    * return CNPJ_EMP
    * @generated
    */
    public String getCNPJ_EMP() {
        return this.CNPJ_EMP;
    }

    /**
    * Define CNPJ_EMP
    * @param CNPJ_EMP CNPJ_EMP
    * @generated
    */
    public CADEMP setCNPJ_EMP(String CNPJ_EMP) {
        this.CNPJ_EMP = CNPJ_EMP;
        return this;
    }
    /**
    * Obtém COD1_TRA
    * return COD1_TRA
    * @generated
    */
    public Integer getCOD1_TRA() {
        return this.COD1_TRA;
    }

    /**
    * Define COD1_TRA
    * @param COD1_TRA COD1_TRA
    * @generated
    */
    public CADEMP setCOD1_TRA(Integer COD1_TRA) {
        this.COD1_TRA = COD1_TRA;
        return this;
    }
    /**
    * Obtém COD2_TRA
    * return COD2_TRA
    * @generated
    */
    public Integer getCOD2_TRA() {
        return this.COD2_TRA;
    }

    /**
    * Define COD2_TRA
    * @param COD2_TRA COD2_TRA
    * @generated
    */
    public CADEMP setCOD2_TRA(Integer COD2_TRA) {
        this.COD2_TRA = COD2_TRA;
        return this;
    }
    /**
    * Obtém CODA_EMP
    * return CODA_EMP
    * @generated
    */
    public String getCODA_EMP() {
        return this.CODA_EMP;
    }

    /**
    * Define CODA_EMP
    * @param CODA_EMP CODA_EMP
    * @generated
    */
    public CADEMP setCODA_EMP(String CODA_EMP) {
        this.CODA_EMP = CODA_EMP;
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
    public CADEMP setCODIPESLANREG(Integer CODIPESLANREG) {
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
    public CADEMP setCODIPESMANUTREG(Integer CODIPESMANUTREG) {
        this.CODIPESMANUTREG = CODIPESMANUTREG;
        return this;
    }
    /**
    * Obtém CODI_AUD
    * return CODI_AUD
    * @generated
    */
    public Integer getCODI_AUD() {
        return this.CODI_AUD;
    }

    /**
    * Define CODI_AUD
    * @param CODI_AUD CODI_AUD
    * @generated
    */
    public CADEMP setCODI_AUD(Integer CODI_AUD) {
        this.CODI_AUD = CODI_AUD;
        return this;
    }
    /**
    * Obtém CODI_CND
    * return CODI_CND
    * @generated
    */
    public String getCODI_CND() {
        return this.CODI_CND;
    }

    /**
    * Define CODI_CND
    * @param CODI_CND CODI_CND
    * @generated
    */
    public CADEMP setCODI_CND(String CODI_CND) {
        this.CODI_CND = CODI_CND;
        return this;
    }
    /**
    * Obtém CODI_CTD
    * return CODI_CTD
    * @generated
    */
    public Integer getCODI_CTD() {
        return this.CODI_CTD;
    }

    /**
    * Define CODI_CTD
    * @param CODI_CTD CODI_CTD
    * @generated
    */
    public CADEMP setCODI_CTD(Integer CODI_CTD) {
        this.CODI_CTD = CODI_CTD;
        return this;
    }
    /**
    * Obtém CODI_FCR
    * return CODI_FCR
    * @generated
    */
    public Integer getCODI_FCR() {
        return this.CODI_FCR;
    }

    /**
    * Define CODI_FCR
    * @param CODI_FCR CODI_FCR
    * @generated
    */
    public CADEMP setCODI_FCR(Integer CODI_FCR) {
        this.CODI_FCR = CODI_FCR;
        return this;
    }
    /**
    * Obtém CODI_INS
    * return CODI_INS
    * @generated
    */
    public String getCODI_INS() {
        return this.CODI_INS;
    }

    /**
    * Define CODI_INS
    * @param CODI_INS CODI_INS
    * @generated
    */
    public CADEMP setCODI_INS(String CODI_INS) {
        this.CODI_INS = CODI_INS;
        return this;
    }
    /**
    * Obtém CODI_MUN
    * return CODI_MUN
    * @generated
    */
    public Integer getCODI_MUN() {
        return this.CODI_MUN;
    }

    /**
    * Define CODI_MUN
    * @param CODI_MUN CODI_MUN
    * @generated
    */
    public CADEMP setCODI_MUN(Integer CODI_MUN) {
        this.CODI_MUN = CODI_MUN;
        return this;
    }
    /**
    * Obtém CODI_PES
    * return CODI_PES
    * @generated
    */
    public Integer getCODI_PES() {
        return this.CODI_PES;
    }

    /**
    * Define CODI_PES
    * @param CODI_PES CODI_PES
    * @generated
    */
    public CADEMP setCODI_PES(Integer CODI_PES) {
        this.CODI_PES = CODI_PES;
        return this;
    }
    /**
    * Obtém CODI_PRF
    * return CODI_PRF
    * @generated
    */
    public String getCODI_PRF() {
        return this.CODI_PRF;
    }

    /**
    * Define CODI_PRF
    * @param CODI_PRF CODI_PRF
    * @generated
    */
    public CADEMP setCODI_PRF(String CODI_PRF) {
        this.CODI_PRF = CODI_PRF;
        return this;
    }
    /**
    * Obtém CODM_EMP
    * return CODM_EMP
    * @generated
    */
    public String getCODM_EMP() {
        return this.CODM_EMP;
    }

    /**
    * Define CODM_EMP
    * @param CODM_EMP CODM_EMP
    * @generated
    */
    public CADEMP setCODM_EMP(String CODM_EMP) {
        this.CODM_EMP = CODM_EMP;
        return this;
    }
    /**
    * Obtém COMP_EMP
    * return COMP_EMP
    * @generated
    */
    public String getCOMP_EMP() {
        return this.COMP_EMP;
    }

    /**
    * Define COMP_EMP
    * @param COMP_EMP COMP_EMP
    * @generated
    */
    public CADEMP setCOMP_EMP(String COMP_EMP) {
        this.COMP_EMP = COMP_EMP;
        return this;
    }
    /**
    * Obtém CONT_EMP
    * return CONT_EMP
    * @generated
    */
    public String getCONT_EMP() {
        return this.CONT_EMP;
    }

    /**
    * Define CONT_EMP
    * @param CONT_EMP CONT_EMP
    * @generated
    */
    public CADEMP setCONT_EMP(String CONT_EMP) {
        this.CONT_EMP = CONT_EMP;
        return this;
    }
    /**
    * Obtém CPON_EMP
    * return CPON_EMP
    * @generated
    */
    public String getCPON_EMP() {
        return this.CPON_EMP;
    }

    /**
    * Define CPON_EMP
    * @param CPON_EMP CPON_EMP
    * @generated
    */
    public CADEMP setCPON_EMP(String CPON_EMP) {
        this.CPON_EMP = CPON_EMP;
        return this;
    }
    /**
    * Obtém CTRL_SOE
    * return CTRL_SOE
    * @generated
    */
    public Integer getCTRL_SOE() {
        return this.CTRL_SOE;
    }

    /**
    * Define CTRL_SOE
    * @param CTRL_SOE CTRL_SOE
    * @generated
    */
    public CADEMP setCTRL_SOE(Integer CTRL_SOE) {
        this.CTRL_SOE = CTRL_SOE;
        return this;
    }
    /**
    * Obtém CVEN_EMP
    * return CVEN_EMP
    * @generated
    */
    public Double getCVEN_EMP() {
        return this.CVEN_EMP;
    }

    /**
    * Define CVEN_EMP
    * @param CVEN_EMP CVEN_EMP
    * @generated
    */
    public CADEMP setCVEN_EMP(Double CVEN_EMP) {
        this.CVEN_EMP = CVEN_EMP;
        return this;
    }
    /**
    * Obtém CXPO_EMP
    * return CXPO_EMP
    * @generated
    */
    public String getCXPO_EMP() {
        return this.CXPO_EMP;
    }

    /**
    * Define CXPO_EMP
    * @param CXPO_EMP CXPO_EMP
    * @generated
    */
    public CADEMP setCXPO_EMP(String CXPO_EMP) {
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
    public String getDCCT_EMP() {
        return this.DCCT_EMP;
    }

    /**
    * Define DCCT_EMP
    * @param DCCT_EMP DCCT_EMP
    * @generated
    */
    public CADEMP setDCCT_EMP(String DCCT_EMP) {
        this.DCCT_EMP = DCCT_EMP;
        return this;
    }
    /**
    * Obtém DCER_EMP
    * return DCER_EMP
    * @generated
    */
    public String getDCER_EMP() {
        return this.DCER_EMP;
    }

    /**
    * Define DCER_EMP
    * @param DCER_EMP DCER_EMP
    * @generated
    */
    public CADEMP setDCER_EMP(String DCER_EMP) {
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
    public String getEACA_EMP() {
        return this.EACA_EMP;
    }

    /**
    * Define EACA_EMP
    * @param EACA_EMP EACA_EMP
    * @generated
    */
    public CADEMP setEACA_EMP(String EACA_EMP) {
        this.EACA_EMP = EACA_EMP;
        return this;
    }
    /**
    * Obtém EASS_EMP
    * return EASS_EMP
    * @generated
    */
    public String getEASS_EMP() {
        return this.EASS_EMP;
    }

    /**
    * Define EASS_EMP
    * @param EASS_EMP EASS_EMP
    * @generated
    */
    public CADEMP setEASS_EMP(String EASS_EMP) {
        this.EASS_EMP = EASS_EMP;
        return this;
    }
    /**
    * Obtém EBNS_EMP
    * return EBNS_EMP
    * @generated
    */
    public String getEBNS_EMP() {
        return this.EBNS_EMP;
    }

    /**
    * Define EBNS_EMP
    * @param EBNS_EMP EBNS_EMP
    * @generated
    */
    public CADEMP setEBNS_EMP(String EBNS_EMP) {
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
    public String getECER_EMP() {
        return this.ECER_EMP;
    }

    /**
    * Define ECER_EMP
    * @param ECER_EMP ECER_EMP
    * @generated
    */
    public CADEMP setECER_EMP(String ECER_EMP) {
        this.ECER_EMP = ECER_EMP;
        return this;
    }
    /**
    * Obtém ECHR_EMP
    * return ECHR_EMP
    * @generated
    */
    public String getECHR_EMP() {
        return this.ECHR_EMP;
    }

    /**
    * Define ECHR_EMP
    * @param ECHR_EMP ECHR_EMP
    * @generated
    */
    public CADEMP setECHR_EMP(String ECHR_EMP) {
        this.ECHR_EMP = ECHR_EMP;
        return this;
    }
    /**
    * Obtém EDCE_EMP
    * return EDCE_EMP
    * @generated
    */
    public String getEDCE_EMP() {
        return this.EDCE_EMP;
    }

    /**
    * Define EDCE_EMP
    * @param EDCE_EMP EDCE_EMP
    * @generated
    */
    public CADEMP setEDCE_EMP(String EDCE_EMP) {
        this.EDCE_EMP = EDCE_EMP;
        return this;
    }
    /**
    * Obtém EDIS_EMP
    * return EDIS_EMP
    * @generated
    */
    public String getEDIS_EMP() {
        return this.EDIS_EMP;
    }

    /**
    * Define EDIS_EMP
    * @param EDIS_EMP EDIS_EMP
    * @generated
    */
    public CADEMP setEDIS_EMP(String EDIS_EMP) {
        this.EDIS_EMP = EDIS_EMP;
        return this;
    }
    /**
    * Obtém EECC_EMP
    * return EECC_EMP
    * @generated
    */
    public String getEECC_EMP() {
        return this.EECC_EMP;
    }

    /**
    * Define EECC_EMP
    * @param EECC_EMP EECC_EMP
    * @generated
    */
    public CADEMP setEECC_EMP(String EECC_EMP) {
        this.EECC_EMP = EECC_EMP;
        return this;
    }
    /**
    * Obtém EEMA_EMP
    * return EEMA_EMP
    * @generated
    */
    public String getEEMA_EMP() {
        return this.EEMA_EMP;
    }

    /**
    * Define EEMA_EMP
    * @param EEMA_EMP EEMA_EMP
    * @generated
    */
    public CADEMP setEEMA_EMP(String EEMA_EMP) {
        this.EEMA_EMP = EEMA_EMP;
        return this;
    }
    /**
    * Obtém EGRP_EMP
    * return EGRP_EMP
    * @generated
    */
    public String getEGRP_EMP() {
        return this.EGRP_EMP;
    }

    /**
    * Define EGRP_EMP
    * @param EGRP_EMP EGRP_EMP
    * @generated
    */
    public CADEMP setEGRP_EMP(String EGRP_EMP) {
        this.EGRP_EMP = EGRP_EMP;
        return this;
    }
    /**
    * Obtém ELTR_EMP
    * return ELTR_EMP
    * @generated
    */
    public String getELTR_EMP() {
        return this.ELTR_EMP;
    }

    /**
    * Define ELTR_EMP
    * @param ELTR_EMP ELTR_EMP
    * @generated
    */
    public CADEMP setELTR_EMP(String ELTR_EMP) {
        this.ELTR_EMP = ELTR_EMP;
        return this;
    }
    /**
    * Obtém EMAC_EMP
    * return EMAC_EMP
    * @generated
    */
    public String getEMAC_EMP() {
        return this.EMAC_EMP;
    }

    /**
    * Define EMAC_EMP
    * @param EMAC_EMP EMAC_EMP
    * @generated
    */
    public CADEMP setEMAC_EMP(String EMAC_EMP) {
        this.EMAC_EMP = EMAC_EMP;
        return this;
    }
    /**
    * Obtém EMAI_EMP
    * return EMAI_EMP
    * @generated
    */
    public String getEMAI_EMP() {
        return this.EMAI_EMP;
    }

    /**
    * Define EMAI_EMP
    * @param EMAI_EMP EMAI_EMP
    * @generated
    */
    public CADEMP setEMAI_EMP(String EMAI_EMP) {
        this.EMAI_EMP = EMAI_EMP;
        return this;
    }
    /**
    * Obtém EMCA_EMP
    * return EMCA_EMP
    * @generated
    */
    public String getEMCA_EMP() {
        return this.EMCA_EMP;
    }

    /**
    * Define EMCA_EMP
    * @param EMCA_EMP EMCA_EMP
    * @generated
    */
    public CADEMP setEMCA_EMP(String EMCA_EMP) {
        this.EMCA_EMP = EMCA_EMP;
        return this;
    }
    /**
    * Obtém EMPR_FOL
    * return EMPR_FOL
    * @generated
    */
    public Integer getEMPR_FOL() {
        return this.EMPR_FOL;
    }

    /**
    * Define EMPR_FOL
    * @param EMPR_FOL EMPR_FOL
    * @generated
    */
    public CADEMP setEMPR_FOL(Integer EMPR_FOL) {
        this.EMPR_FOL = EMPR_FOL;
        return this;
    }
    /**
    * Obtém EMSG_EMP
    * return EMSG_EMP
    * @generated
    */
    public String getEMSG_EMP() {
        return this.EMSG_EMP;
    }

    /**
    * Define EMSG_EMP
    * @param EMSG_EMP EMSG_EMP
    * @generated
    */
    public CADEMP setEMSG_EMP(String EMSG_EMP) {
        this.EMSG_EMP = EMSG_EMP;
        return this;
    }
    /**
    * Obtém ENDC_EMP
    * return ENDC_EMP
    * @generated
    */
    public String getENDC_EMP() {
        return this.ENDC_EMP;
    }

    /**
    * Define ENDC_EMP
    * @param ENDC_EMP ENDC_EMP
    * @generated
    */
    public CADEMP setENDC_EMP(String ENDC_EMP) {
        this.ENDC_EMP = ENDC_EMP;
        return this;
    }
    /**
    * Obtém ENDE_EMP
    * return ENDE_EMP
    * @generated
    */
    public String getENDE_EMP() {
        return this.ENDE_EMP;
    }

    /**
    * Define ENDE_EMP
    * @param ENDE_EMP ENDE_EMP
    * @generated
    */
    public CADEMP setENDE_EMP(String ENDE_EMP) {
        this.ENDE_EMP = ENDE_EMP;
        return this;
    }
    /**
    * Obtém ENVE_EMP
    * return ENVE_EMP
    * @generated
    */
    public String getENVE_EMP() {
        return this.ENVE_EMP;
    }

    /**
    * Define ENVE_EMP
    * @param ENVE_EMP ENVE_EMP
    * @generated
    */
    public CADEMP setENVE_EMP(String ENVE_EMP) {
        this.ENVE_EMP = ENVE_EMP;
        return this;
    }
    /**
    * Obtém ESCN_EMP
    * return ESCN_EMP
    * @generated
    */
    public String getESCN_EMP() {
        return this.ESCN_EMP;
    }

    /**
    * Define ESCN_EMP
    * @param ESCN_EMP ESCN_EMP
    * @generated
    */
    public CADEMP setESCN_EMP(String ESCN_EMP) {
        this.ESCN_EMP = ESCN_EMP;
        return this;
    }
    /**
    * Obtém ESER_EMP
    * return ESER_EMP
    * @generated
    */
    public String getESER_EMP() {
        return this.ESER_EMP;
    }

    /**
    * Define ESER_EMP
    * @param ESER_EMP ESER_EMP
    * @generated
    */
    public CADEMP setESER_EMP(String ESER_EMP) {
        this.ESER_EMP = ESER_EMP;
        return this;
    }
    /**
    * Obtém ESUB_EMP
    * return ESUB_EMP
    * @generated
    */
    public String getESUB_EMP() {
        return this.ESUB_EMP;
    }

    /**
    * Define ESUB_EMP
    * @param ESUB_EMP ESUB_EMP
    * @generated
    */
    public CADEMP setESUB_EMP(String ESUB_EMP) {
        this.ESUB_EMP = ESUB_EMP;
        return this;
    }
    /**
    * Obtém EULL_EMP
    * return EULL_EMP
    * @generated
    */
    public Integer getEULL_EMP() {
        return this.EULL_EMP;
    }

    /**
    * Define EULL_EMP
    * @param EULL_EMP EULL_EMP
    * @generated
    */
    public CADEMP setEULL_EMP(Integer EULL_EMP) {
        this.EULL_EMP = EULL_EMP;
        return this;
    }
    /**
    * Obtém EUTE_EMP
    * return EUTE_EMP
    * @generated
    */
    public String getEUTE_EMP() {
        return this.EUTE_EMP;
    }

    /**
    * Define EUTE_EMP
    * @param EUTE_EMP EUTE_EMP
    * @generated
    */
    public CADEMP setEUTE_EMP(String EUTE_EMP) {
        this.EUTE_EMP = EUTE_EMP;
        return this;
    }
    /**
    * Obtém FANT_EMP
    * return FANT_EMP
    * @generated
    */
    public String getFANT_EMP() {
        return this.FANT_EMP;
    }

    /**
    * Define FANT_EMP
    * @param FANT_EMP FANT_EMP
    * @generated
    */
    public CADEMP setFANT_EMP(String FANT_EMP) {
        this.FANT_EMP = FANT_EMP;
        return this;
    }
    /**
    * Obtém FAXC_EMP
    * return FAXC_EMP
    * @generated
    */
    public String getFAXC_EMP() {
        return this.FAXC_EMP;
    }

    /**
    * Define FAXC_EMP
    * @param FAXC_EMP FAXC_EMP
    * @generated
    */
    public CADEMP setFAXC_EMP(String FAXC_EMP) {
        this.FAXC_EMP = FAXC_EMP;
        return this;
    }
    /**
    * Obtém FAX_EMP
    * return FAX_EMP
    * @generated
    */
    public String getFAX_EMP() {
        return this.FAX_EMP;
    }

    /**
    * Define FAX_EMP
    * @param FAX_EMP FAX_EMP
    * @generated
    */
    public CADEMP setFAX_EMP(String FAX_EMP) {
        this.FAX_EMP = FAX_EMP;
        return this;
    }
    /**
    * Obtém FDCT_EMP
    * return FDCT_EMP
    * @generated
    */
    public String getFDCT_EMP() {
        return this.FDCT_EMP;
    }

    /**
    * Define FDCT_EMP
    * @param FDCT_EMP FDCT_EMP
    * @generated
    */
    public CADEMP setFDCT_EMP(String FDCT_EMP) {
        this.FDCT_EMP = FDCT_EMP;
        return this;
    }
    /**
    * Obtém FONC_EMP
    * return FONC_EMP
    * @generated
    */
    public String getFONC_EMP() {
        return this.FONC_EMP;
    }

    /**
    * Define FONC_EMP
    * @param FONC_EMP FONC_EMP
    * @generated
    */
    public CADEMP setFONC_EMP(String FONC_EMP) {
        this.FONC_EMP = FONC_EMP;
        return this;
    }
    /**
    * Obtém FONE_EMP
    * return FONE_EMP
    * @generated
    */
    public String getFONE_EMP() {
        return this.FONE_EMP;
    }

    /**
    * Define FONE_EMP
    * @param FONE_EMP FONE_EMP
    * @generated
    */
    public CADEMP setFONE_EMP(String FONE_EMP) {
        this.FONE_EMP = FONE_EMP;
        return this;
    }
    /**
    * Obtém FORE_EMP
    * return FORE_EMP
    * @generated
    */
    public String getFORE_EMP() {
        return this.FORE_EMP;
    }

    /**
    * Define FORE_EMP
    * @param FORE_EMP FORE_EMP
    * @generated
    */
    public CADEMP setFORE_EMP(String FORE_EMP) {
        this.FORE_EMP = FORE_EMP;
        return this;
    }
    /**
    * Obtém GPDF_EMP
    * return GPDF_EMP
    * @generated
    */
    public String getGPDF_EMP() {
        return this.GPDF_EMP;
    }

    /**
    * Define GPDF_EMP
    * @param GPDF_EMP GPDF_EMP
    * @generated
    */
    public CADEMP setGPDF_EMP(String GPDF_EMP) {
        this.GPDF_EMP = GPDF_EMP;
        return this;
    }
    /**
    * Obtém GPZE_EMP
    * return GPZE_EMP
    * @generated
    */
    public String getGPZE_EMP() {
        return this.GPZE_EMP;
    }

    /**
    * Define GPZE_EMP
    * @param GPZE_EMP GPZE_EMP
    * @generated
    */
    public CADEMP setGPZE_EMP(String GPZE_EMP) {
        this.GPZE_EMP = GPZE_EMP;
        return this;
    }
    /**
    * Obtém HCON_EMP
    * return HCON_EMP
    * @generated
    */
    public String getHCON_EMP() {
        return this.HCON_EMP;
    }

    /**
    * Define HCON_EMP
    * @param HCON_EMP HCON_EMP
    * @generated
    */
    public CADEMP setHCON_EMP(String HCON_EMP) {
        this.HCON_EMP = HCON_EMP;
        return this;
    }
    /**
    * Obtém IDAF_EMP
    * return IDAF_EMP
    * @generated
    */
    public String getIDAF_EMP() {
        return this.IDAF_EMP;
    }

    /**
    * Define IDAF_EMP
    * @param IDAF_EMP IDAF_EMP
    * @generated
    */
    public CADEMP setIDAF_EMP(String IDAF_EMP) {
        this.IDAF_EMP = IDAF_EMP;
        return this;
    }
    /**
    * Obtém IDAT_EMP
    * return IDAT_EMP
    * @generated
    */
    public String getIDAT_EMP() {
        return this.IDAT_EMP;
    }

    /**
    * Define IDAT_EMP
    * @param IDAT_EMP IDAT_EMP
    * @generated
    */
    public CADEMP setIDAT_EMP(String IDAT_EMP) {
        this.IDAT_EMP = IDAT_EMP;
        return this;
    }
    /**
    * Obtém IDCT_EMP
    * return IDCT_EMP
    * @generated
    */
    public String getIDCT_EMP() {
        return this.IDCT_EMP;
    }

    /**
    * Define IDCT_EMP
    * @param IDCT_EMP IDCT_EMP
    * @generated
    */
    public CADEMP setIDCT_EMP(String IDCT_EMP) {
        this.IDCT_EMP = IDCT_EMP;
        return this;
    }
    /**
    * Obtém IDEN_EMP
    * return IDEN_EMP
    * @generated
    */
    public String getIDEN_EMP() {
        return this.IDEN_EMP;
    }

    /**
    * Define IDEN_EMP
    * @param IDEN_EMP IDEN_EMP
    * @generated
    */
    public CADEMP setIDEN_EMP(String IDEN_EMP) {
        this.IDEN_EMP = IDEN_EMP;
        return this;
    }
    /**
    * Obtém ILOG_EMP
    * return ILOG_EMP
    * @generated
    */
    public String getILOG_EMP() {
        return this.ILOG_EMP;
    }

    /**
    * Define ILOG_EMP
    * @param ILOG_EMP ILOG_EMP
    * @generated
    */
    public CADEMP setILOG_EMP(String ILOG_EMP) {
        this.ILOG_EMP = ILOG_EMP;
        return this;
    }
    /**
    * Obtém IMCA_EMP
    * return IMCA_EMP
    * @generated
    */
    public String getIMCA_EMP() {
        return this.IMCA_EMP;
    }

    /**
    * Define IMCA_EMP
    * @param IMCA_EMP IMCA_EMP
    * @generated
    */
    public CADEMP setIMCA_EMP(String IMCA_EMP) {
        this.IMCA_EMP = IMCA_EMP;
        return this;
    }
    /**
    * Obtém IMHS_EMP
    * return IMHS_EMP
    * @generated
    */
    public String getIMHS_EMP() {
        return this.IMHS_EMP;
    }

    /**
    * Define IMHS_EMP
    * @param IMHS_EMP IMHS_EMP
    * @generated
    */
    public CADEMP setIMHS_EMP(String IMHS_EMP) {
        this.IMHS_EMP = IMHS_EMP;
        return this;
    }
    /**
    * Obtém INDD_EMP
    * return INDD_EMP
    * @generated
    */
    public String getINDD_EMP() {
        return this.INDD_EMP;
    }

    /**
    * Define INDD_EMP
    * @param INDD_EMP INDD_EMP
    * @generated
    */
    public CADEMP setINDD_EMP(String INDD_EMP) {
        this.INDD_EMP = INDD_EMP;
        return this;
    }
    /**
    * Obtém INE_EMP
    * return INE_EMP
    * @generated
    */
    public String getINE_EMP() {
        return this.INE_EMP;
    }

    /**
    * Define INE_EMP
    * @param INE_EMP INE_EMP
    * @generated
    */
    public CADEMP setINE_EMP(String INE_EMP) {
        this.INE_EMP = INE_EMP;
        return this;
    }
    /**
    * Obtém INM_EMP
    * return INM_EMP
    * @generated
    */
    public String getINM_EMP() {
        return this.INM_EMP;
    }

    /**
    * Define INM_EMP
    * @param INM_EMP INM_EMP
    * @generated
    */
    public CADEMP setINM_EMP(String INM_EMP) {
        this.INM_EMP = INM_EMP;
        return this;
    }
    /**
    * Obtém INST_EMP
    * return INST_EMP
    * @generated
    */
    public String getINST_EMP() {
        return this.INST_EMP;
    }

    /**
    * Define INST_EMP
    * @param INST_EMP INST_EMP
    * @generated
    */
    public CADEMP setINST_EMP(String INST_EMP) {
        this.INST_EMP = INST_EMP;
        return this;
    }
    /**
    * Obtém INTC_EMP
    * return INTC_EMP
    * @generated
    */
    public String getINTC_EMP() {
        return this.INTC_EMP;
    }

    /**
    * Define INTC_EMP
    * @param INTC_EMP INTC_EMP
    * @generated
    */
    public CADEMP setINTC_EMP(String INTC_EMP) {
        this.INTC_EMP = INTC_EMP;
        return this;
    }
    /**
    * Obtém INTE_EMP
    * return INTE_EMP
    * @generated
    */
    public String getINTE_EMP() {
        return this.INTE_EMP;
    }

    /**
    * Define INTE_EMP
    * @param INTE_EMP INTE_EMP
    * @generated
    */
    public CADEMP setINTE_EMP(String INTE_EMP) {
        this.INTE_EMP = INTE_EMP;
        return this;
    }
    /**
    * Obtém ITAX_SEM
    * return ITAX_SEM
    * @generated
    */
    public String getITAX_SEM() {
        return this.ITAX_SEM;
    }

    /**
    * Define ITAX_SEM
    * @param ITAX_SEM ITAX_SEM
    * @generated
    */
    public CADEMP setITAX_SEM(String ITAX_SEM) {
        this.ITAX_SEM = ITAX_SEM;
        return this;
    }
    /**
    * Obtém IUCD_EMP
    * return IUCD_EMP
    * @generated
    */
    public String getIUCD_EMP() {
        return this.IUCD_EMP;
    }

    /**
    * Define IUCD_EMP
    * @param IUCD_EMP IUCD_EMP
    * @generated
    */
    public CADEMP setIUCD_EMP(String IUCD_EMP) {
        this.IUCD_EMP = IUCD_EMP;
        return this;
    }
    /**
    * Obtém IVLR_EMP
    * return IVLR_EMP
    * @generated
    */
    public Double getIVLR_EMP() {
        return this.IVLR_EMP;
    }

    /**
    * Define IVLR_EMP
    * @param IVLR_EMP IVLR_EMP
    * @generated
    */
    public CADEMP setIVLR_EMP(Double IVLR_EMP) {
        this.IVLR_EMP = IVLR_EMP;
        return this;
    }
    /**
    * Obtém LAUD_EMP
    * return LAUD_EMP
    * @generated
    */
    public String getLAUD_EMP() {
        return this.LAUD_EMP;
    }

    /**
    * Define LAUD_EMP
    * @param LAUD_EMP LAUD_EMP
    * @generated
    */
    public CADEMP setLAUD_EMP(String LAUD_EMP) {
        this.LAUD_EMP = LAUD_EMP;
        return this;
    }
    /**
    * Obtém LCTE_EMP
    * return LCTE_EMP
    * @generated
    */
    public Integer getLCTE_EMP() {
        return this.LCTE_EMP;
    }

    /**
    * Define LCTE_EMP
    * @param LCTE_EMP LCTE_EMP
    * @generated
    */
    public CADEMP setLCTE_EMP(Integer LCTE_EMP) {
        this.LCTE_EMP = LCTE_EMP;
        return this;
    }
    /**
    * Obtém LMDF_EMP
    * return LMDF_EMP
    * @generated
    */
    public Integer getLMDF_EMP() {
        return this.LMDF_EMP;
    }

    /**
    * Define LMDF_EMP
    * @param LMDF_EMP LMDF_EMP
    * @generated
    */
    public CADEMP setLMDF_EMP(Integer LMDF_EMP) {
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
    public String getLTRA_EMP() {
        return this.LTRA_EMP;
    }

    /**
    * Define LTRA_EMP
    * @param LTRA_EMP LTRA_EMP
    * @generated
    */
    public CADEMP setLTRA_EMP(String LTRA_EMP) {
        this.LTRA_EMP = LTRA_EMP;
        return this;
    }
    /**
    * Obtém MCNF_EMP
    * return MCNF_EMP
    * @generated
    */
    public String getMCNF_EMP() {
        return this.MCNF_EMP;
    }

    /**
    * Define MCNF_EMP
    * @param MCNF_EMP MCNF_EMP
    * @generated
    */
    public CADEMP setMCNF_EMP(String MCNF_EMP) {
        this.MCNF_EMP = MCNF_EMP;
        return this;
    }
    /**
    * Obtém MDCT_EMP
    * return MDCT_EMP
    * @generated
    */
    public Double getMDCT_EMP() {
        return this.MDCT_EMP;
    }

    /**
    * Define MDCT_EMP
    * @param MDCT_EMP MDCT_EMP
    * @generated
    */
    public CADEMP setMDCT_EMP(Double MDCT_EMP) {
        this.MDCT_EMP = MDCT_EMP;
        return this;
    }
    /**
    * Obtém MECT_EMP
    * return MECT_EMP
    * @generated
    */
    public Double getMECT_EMP() {
        return this.MECT_EMP;
    }

    /**
    * Define MECT_EMP
    * @param MECT_EMP MECT_EMP
    * @generated
    */
    public CADEMP setMECT_EMP(Double MECT_EMP) {
        this.MECT_EMP = MECT_EMP;
        return this;
    }
    /**
    * Obtém MICT_EMP
    * return MICT_EMP
    * @generated
    */
    public Double getMICT_EMP() {
        return this.MICT_EMP;
    }

    /**
    * Define MICT_EMP
    * @param MICT_EMP MICT_EMP
    * @generated
    */
    public CADEMP setMICT_EMP(Double MICT_EMP) {
        this.MICT_EMP = MICT_EMP;
        return this;
    }
    /**
    * Obtém MOD_EMP
    * return MOD_EMP
    * @generated
    */
    public Integer getMOD_EMP() {
        return this.MOD_EMP;
    }

    /**
    * Define MOD_EMP
    * @param MOD_EMP MOD_EMP
    * @generated
    */
    public CADEMP setMOD_EMP(Integer MOD_EMP) {
        this.MOD_EMP = MOD_EMP;
        return this;
    }
    /**
    * Obtém MPCT_EMP
    * return MPCT_EMP
    * @generated
    */
    public String getMPCT_EMP() {
        return this.MPCT_EMP;
    }

    /**
    * Define MPCT_EMP
    * @param MPCT_EMP MPCT_EMP
    * @generated
    */
    public CADEMP setMPCT_EMP(String MPCT_EMP) {
        this.MPCT_EMP = MPCT_EMP;
        return this;
    }
    /**
    * Obtém MSCC_EMP
    * return MSCC_EMP
    * @generated
    */
    public String getMSCC_EMP() {
        return this.MSCC_EMP;
    }

    /**
    * Define MSCC_EMP
    * @param MSCC_EMP MSCC_EMP
    * @generated
    */
    public CADEMP setMSCC_EMP(String MSCC_EMP) {
        this.MSCC_EMP = MSCC_EMP;
        return this;
    }
    /**
    * Obtém MSCT_EMP
    * return MSCT_EMP
    * @generated
    */
    public Double getMSCT_EMP() {
        return this.MSCT_EMP;
    }

    /**
    * Define MSCT_EMP
    * @param MSCT_EMP MSCT_EMP
    * @generated
    */
    public CADEMP setMSCT_EMP(Double MSCT_EMP) {
        this.MSCT_EMP = MSCT_EMP;
        return this;
    }
    /**
    * Obtém MSIM_EMP
    * return MSIM_EMP
    * @generated
    */
    public String getMSIM_EMP() {
        return this.MSIM_EMP;
    }

    /**
    * Define MSIM_EMP
    * @param MSIM_EMP MSIM_EMP
    * @generated
    */
    public CADEMP setMSIM_EMP(String MSIM_EMP) {
        this.MSIM_EMP = MSIM_EMP;
        return this;
    }
    /**
    * Obtém MSNF_EMP
    * return MSNF_EMP
    * @generated
    */
    public String getMSNF_EMP() {
        return this.MSNF_EMP;
    }

    /**
    * Define MSNF_EMP
    * @param MSNF_EMP MSNF_EMP
    * @generated
    */
    public CADEMP setMSNF_EMP(String MSNF_EMP) {
        this.MSNF_EMP = MSNF_EMP;
        return this;
    }
    /**
    * Obtém MUNC_EMP
    * return MUNC_EMP
    * @generated
    */
    public Integer getMUNC_EMP() {
        return this.MUNC_EMP;
    }

    /**
    * Define MUNC_EMP
    * @param MUNC_EMP MUNC_EMP
    * @generated
    */
    public CADEMP setMUNC_EMP(Integer MUNC_EMP) {
        this.MUNC_EMP = MUNC_EMP;
        return this;
    }
    /**
    * Obtém NCRE_EMP
    * return NCRE_EMP
    * @generated
    */
    public String getNCRE_EMP() {
        return this.NCRE_EMP;
    }

    /**
    * Define NCRE_EMP
    * @param NCRE_EMP NCRE_EMP
    * @generated
    */
    public CADEMP setNCRE_EMP(String NCRE_EMP) {
        this.NCRE_EMP = NCRE_EMP;
        return this;
    }
    /**
    * Obtém NCVI_EMP
    * return NCVI_EMP
    * @generated
    */
    public String getNCVI_EMP() {
        return this.NCVI_EMP;
    }

    /**
    * Define NCVI_EMP
    * @param NCVI_EMP NCVI_EMP
    * @generated
    */
    public CADEMP setNCVI_EMP(String NCVI_EMP) {
        this.NCVI_EMP = NCVI_EMP;
        return this;
    }
    /**
    * Obtém NESO_EMP
    * return NESO_EMP
    * @generated
    */
    public String getNESO_EMP() {
        return this.NESO_EMP;
    }

    /**
    * Define NESO_EMP
    * @param NESO_EMP NESO_EMP
    * @generated
    */
    public CADEMP setNESO_EMP(String NESO_EMP) {
        this.NESO_EMP = NESO_EMP;
        return this;
    }
    /**
    * Obtém NFC4_EMP
    * return NFC4_EMP
    * @generated
    */
    public String getNFC4_EMP() {
        return this.NFC4_EMP;
    }

    /**
    * Define NFC4_EMP
    * @param NFC4_EMP NFC4_EMP
    * @generated
    */
    public CADEMP setNFC4_EMP(String NFC4_EMP) {
        this.NFC4_EMP = NFC4_EMP;
        return this;
    }
    /**
    * Obtém NFE4_EMP
    * return NFE4_EMP
    * @generated
    */
    public String getNFE4_EMP() {
        return this.NFE4_EMP;
    }

    /**
    * Define NFE4_EMP
    * @param NFE4_EMP NFE4_EMP
    * @generated
    */
    public CADEMP setNFE4_EMP(String NFE4_EMP) {
        this.NFE4_EMP = NFE4_EMP;
        return this;
    }
    /**
    * Obtém NFEC_EMP
    * return NFEC_EMP
    * @generated
    */
    public String getNFEC_EMP() {
        return this.NFEC_EMP;
    }

    /**
    * Define NFEC_EMP
    * @param NFEC_EMP NFEC_EMP
    * @generated
    */
    public CADEMP setNFEC_EMP(String NFEC_EMP) {
        this.NFEC_EMP = NFEC_EMP;
        return this;
    }
    /**
    * Obtém NFES_EMP
    * return NFES_EMP
    * @generated
    */
    public String getNFES_EMP() {
        return this.NFES_EMP;
    }

    /**
    * Define NFES_EMP
    * @param NFES_EMP NFES_EMP
    * @generated
    */
    public CADEMP setNFES_EMP(String NFES_EMP) {
        this.NFES_EMP = NFES_EMP;
        return this;
    }
    /**
    * Obtém NFLT_EMP
    * return NFLT_EMP
    * @generated
    */
    public String getNFLT_EMP() {
        return this.NFLT_EMP;
    }

    /**
    * Define NFLT_EMP
    * @param NFLT_EMP NFLT_EMP
    * @generated
    */
    public CADEMP setNFLT_EMP(String NFLT_EMP) {
        this.NFLT_EMP = NFLT_EMP;
        return this;
    }
    /**
    * Obtém NGRE_EMP
    * return NGRE_EMP
    * @generated
    */
    public String getNGRE_EMP() {
        return this.NGRE_EMP;
    }

    /**
    * Define NGRE_EMP
    * @param NGRE_EMP NGRE_EMP
    * @generated
    */
    public CADEMP setNGRE_EMP(String NGRE_EMP) {
        this.NGRE_EMP = NGRE_EMP;
        return this;
    }
    /**
    * Obtém NIRE_EMP
    * return NIRE_EMP
    * @generated
    */
    public String getNIRE_EMP() {
        return this.NIRE_EMP;
    }

    /**
    * Define NIRE_EMP
    * @param NIRE_EMP NIRE_EMP
    * @generated
    */
    public CADEMP setNIRE_EMP(String NIRE_EMP) {
        this.NIRE_EMP = NIRE_EMP;
        return this;
    }
    /**
    * Obtém NLCC_EMP
    * return NLCC_EMP
    * @generated
    */
    public Integer getNLCC_EMP() {
        return this.NLCC_EMP;
    }

    /**
    * Define NLCC_EMP
    * @param NLCC_EMP NLCC_EMP
    * @generated
    */
    public CADEMP setNLCC_EMP(Integer NLCC_EMP) {
        this.NLCC_EMP = NLCC_EMP;
        return this;
    }
    /**
    * Obtém NLIC_EMP
    * return NLIC_EMP
    * @generated
    */
    public String getNLIC_EMP() {
        return this.NLIC_EMP;
    }

    /**
    * Define NLIC_EMP
    * @param NLIC_EMP NLIC_EMP
    * @generated
    */
    public CADEMP setNLIC_EMP(String NLIC_EMP) {
        this.NLIC_EMP = NLIC_EMP;
        return this;
    }
    /**
    * Obtém NLTS_EMP
    * return NLTS_EMP
    * @generated
    */
    public Integer getNLTS_EMP() {
        return this.NLTS_EMP;
    }

    /**
    * Define NLTS_EMP
    * @param NLTS_EMP NLTS_EMP
    * @generated
    */
    public CADEMP setNLTS_EMP(Integer NLTS_EMP) {
        this.NLTS_EMP = NLTS_EMP;
        return this;
    }
    /**
    * Obtém NREG_EMP
    * return NREG_EMP
    * @generated
    */
    public String getNREG_EMP() {
        return this.NREG_EMP;
    }

    /**
    * Define NREG_EMP
    * @param NREG_EMP NREG_EMP
    * @generated
    */
    public CADEMP setNREG_EMP(String NREG_EMP) {
        this.NREG_EMP = NREG_EMP;
        return this;
    }
    /**
    * Obtém NRLT_EMP
    * return NRLT_EMP
    * @generated
    */
    public Integer getNRLT_EMP() {
        return this.NRLT_EMP;
    }

    /**
    * Define NRLT_EMP
    * @param NRLT_EMP NRLT_EMP
    * @generated
    */
    public CADEMP setNRLT_EMP(Integer NRLT_EMP) {
        this.NRLT_EMP = NRLT_EMP;
        return this;
    }
    /**
    * Obtém NSCE_EMP
    * return NSCE_EMP
    * @generated
    */
    public String getNSCE_EMP() {
        return this.NSCE_EMP;
    }

    /**
    * Define NSCE_EMP
    * @param NSCE_EMP NSCE_EMP
    * @generated
    */
    public CADEMP setNSCE_EMP(String NSCE_EMP) {
        this.NSCE_EMP = NSCE_EMP;
        return this;
    }
    /**
    * Obtém NSCT_EMP
    * return NSCT_EMP
    * @generated
    */
    public String getNSCT_EMP() {
        return this.NSCT_EMP;
    }

    /**
    * Define NSCT_EMP
    * @param NSCT_EMP NSCT_EMP
    * @generated
    */
    public CADEMP setNSCT_EMP(String NSCT_EMP) {
        this.NSCT_EMP = NSCT_EMP;
        return this;
    }
    /**
    * Obtém NTAR_EMP
    * return NTAR_EMP
    * @generated
    */
    public Integer getNTAR_EMP() {
        return this.NTAR_EMP;
    }

    /**
    * Define NTAR_EMP
    * @param NTAR_EMP NTAR_EMP
    * @generated
    */
    public CADEMP setNTAR_EMP(Integer NTAR_EMP) {
        this.NTAR_EMP = NTAR_EMP;
        return this;
    }
    /**
    * Obtém NTCT_EMP
    * return NTCT_EMP
    * @generated
    */
    public Integer getNTCT_EMP() {
        return this.NTCT_EMP;
    }

    /**
    * Define NTCT_EMP
    * @param NTCT_EMP NTCT_EMP
    * @generated
    */
    public CADEMP setNTCT_EMP(Integer NTCT_EMP) {
        this.NTCT_EMP = NTCT_EMP;
        return this;
    }
    /**
    * Obtém NUCO_EMP
    * return NUCO_EMP
    * @generated
    */
    public Integer getNUCO_EMP() {
        return this.NUCO_EMP;
    }

    /**
    * Define NUCO_EMP
    * @param NUCO_EMP NUCO_EMP
    * @generated
    */
    public CADEMP setNUCO_EMP(Integer NUCO_EMP) {
        this.NUCO_EMP = NUCO_EMP;
        return this;
    }
    /**
    * Obtém NUMC_EMP
    * return NUMC_EMP
    * @generated
    */
    public String getNUMC_EMP() {
        return this.NUMC_EMP;
    }

    /**
    * Define NUMC_EMP
    * @param NUMC_EMP NUMC_EMP
    * @generated
    */
    public CADEMP setNUMC_EMP(String NUMC_EMP) {
        this.NUMC_EMP = NUMC_EMP;
        return this;
    }
    /**
    * Obtém NUME_EMP
    * return NUME_EMP
    * @generated
    */
    public String getNUME_EMP() {
        return this.NUME_EMP;
    }

    /**
    * Define NUME_EMP
    * @param NUME_EMP NUME_EMP
    * @generated
    */
    public CADEMP setNUME_EMP(String NUME_EMP) {
        this.NUME_EMP = NUME_EMP;
        return this;
    }
    /**
    * Obtém ORIM_EMP
    * return ORIM_EMP
    * @generated
    */
    public String getORIM_EMP() {
        return this.ORIM_EMP;
    }

    /**
    * Define ORIM_EMP
    * @param ORIM_EMP ORIM_EMP
    * @generated
    */
    public CADEMP setORIM_EMP(String ORIM_EMP) {
        this.ORIM_EMP = ORIM_EMP;
        return this;
    }
    /**
    * Obtém PDCB_EMP
    * return PDCB_EMP
    * @generated
    */
    public String getPDCB_EMP() {
        return this.PDCB_EMP;
    }

    /**
    * Define PDCB_EMP
    * @param PDCB_EMP PDCB_EMP
    * @generated
    */
    public CADEMP setPDCB_EMP(String PDCB_EMP) {
        this.PDCB_EMP = PDCB_EMP;
        return this;
    }
    /**
    * Obtém PDCC_EMP
    * return PDCC_EMP
    * @generated
    */
    public String getPDCC_EMP() {
        return this.PDCC_EMP;
    }

    /**
    * Define PDCC_EMP
    * @param PDCC_EMP PDCC_EMP
    * @generated
    */
    public CADEMP setPDCC_EMP(String PDCC_EMP) {
        this.PDCC_EMP = PDCC_EMP;
        return this;
    }
    /**
    * Obtém PDCD_EMP
    * return PDCD_EMP
    * @generated
    */
    public String getPDCD_EMP() {
        return this.PDCD_EMP;
    }

    /**
    * Define PDCD_EMP
    * @param PDCD_EMP PDCD_EMP
    * @generated
    */
    public CADEMP setPDCD_EMP(String PDCD_EMP) {
        this.PDCD_EMP = PDCD_EMP;
        return this;
    }
    /**
    * Obtém PDCE_EMP
    * return PDCE_EMP
    * @generated
    */
    public String getPDCE_EMP() {
        return this.PDCE_EMP;
    }

    /**
    * Define PDCE_EMP
    * @param PDCE_EMP PDCE_EMP
    * @generated
    */
    public CADEMP setPDCE_EMP(String PDCE_EMP) {
        this.PDCE_EMP = PDCE_EMP;
        return this;
    }
    /**
    * Obtém PDCR_EMP
    * return PDCR_EMP
    * @generated
    */
    public String getPDCR_EMP() {
        return this.PDCR_EMP;
    }

    /**
    * Define PDCR_EMP
    * @param PDCR_EMP PDCR_EMP
    * @generated
    */
    public CADEMP setPDCR_EMP(String PDCR_EMP) {
        this.PDCR_EMP = PDCR_EMP;
        return this;
    }
    /**
    * Obtém PEFI_EMP
    * return PEFI_EMP
    * @generated
    */
    public Integer getPEFI_EMP() {
        return this.PEFI_EMP;
    }

    /**
    * Define PEFI_EMP
    * @param PEFI_EMP PEFI_EMP
    * @generated
    */
    public CADEMP setPEFI_EMP(Integer PEFI_EMP) {
        this.PEFI_EMP = PEFI_EMP;
        return this;
    }
    /**
    * Obtém PICT_EMP
    * return PICT_EMP
    * @generated
    */
    public String getPICT_EMP() {
        return this.PICT_EMP;
    }

    /**
    * Define PICT_EMP
    * @param PICT_EMP PICT_EMP
    * @generated
    */
    public CADEMP setPICT_EMP(String PICT_EMP) {
        this.PICT_EMP = PICT_EMP;
        return this;
    }
    /**
    * Obtém PORE_EMP
    * return PORE_EMP
    * @generated
    */
    public String getPORE_EMP() {
        return this.PORE_EMP;
    }

    /**
    * Define PORE_EMP
    * @param PORE_EMP PORE_EMP
    * @generated
    */
    public CADEMP setPORE_EMP(String PORE_EMP) {
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
    public String getRAZA_EMP() {
        return this.RAZA_EMP;
    }

    /**
    * Define RAZA_EMP
    * @param RAZA_EMP RAZA_EMP
    * @generated
    */
    public CADEMP setRAZA_EMP(String RAZA_EMP) {
        this.RAZA_EMP = RAZA_EMP;
        return this;
    }
    /**
    * Obtém REGI_EMP
    * return REGI_EMP
    * @generated
    */
    public String getREGI_EMP() {
        return this.REGI_EMP;
    }

    /**
    * Define REGI_EMP
    * @param REGI_EMP REGI_EMP
    * @generated
    */
    public CADEMP setREGI_EMP(String REGI_EMP) {
        this.REGI_EMP = REGI_EMP;
        return this;
    }
    /**
    * Obtém RENA_EMP
    * return RENA_EMP
    * @generated
    */
    public String getRENA_EMP() {
        return this.RENA_EMP;
    }

    /**
    * Define RENA_EMP
    * @param RENA_EMP RENA_EMP
    * @generated
    */
    public CADEMP setRENA_EMP(String RENA_EMP) {
        this.RENA_EMP = RENA_EMP;
        return this;
    }
    /**
    * Obtém RNTC_EMP
    * return RNTC_EMP
    * @generated
    */
    public String getRNTC_EMP() {
        return this.RNTC_EMP;
    }

    /**
    * Define RNTC_EMP
    * @param RNTC_EMP RNTC_EMP
    * @generated
    */
    public CADEMP setRNTC_EMP(String RNTC_EMP) {
        this.RNTC_EMP = RNTC_EMP;
        return this;
    }
    /**
    * Obtém RQFA_EMP
    * return RQFA_EMP
    * @generated
    */
    public String getRQFA_EMP() {
        return this.RQFA_EMP;
    }

    /**
    * Define RQFA_EMP
    * @param RQFA_EMP RQFA_EMP
    * @generated
    */
    public CADEMP setRQFA_EMP(String RQFA_EMP) {
        this.RQFA_EMP = RQFA_EMP;
        return this;
    }
    /**
    * Obtém RREC_EMP
    * return RREC_EMP
    * @generated
    */
    public String getRREC_EMP() {
        return this.RREC_EMP;
    }

    /**
    * Define RREC_EMP
    * @param RREC_EMP RREC_EMP
    * @generated
    */
    public CADEMP setRREC_EMP(String RREC_EMP) {
        this.RREC_EMP = RREC_EMP;
        return this;
    }
    /**
    * Obtém RVAL_CND
    * return RVAL_CND
    * @generated
    */
    public String getRVAL_CND() {
        return this.RVAL_CND;
    }

    /**
    * Define RVAL_CND
    * @param RVAL_CND RVAL_CND
    * @generated
    */
    public CADEMP setRVAL_CND(String RVAL_CND) {
        this.RVAL_CND = RVAL_CND;
        return this;
    }
    /**
    * Obtém SAPM_EMP
    * return SAPM_EMP
    * @generated
    */
    public String getSAPM_EMP() {
        return this.SAPM_EMP;
    }

    /**
    * Define SAPM_EMP
    * @param SAPM_EMP SAPM_EMP
    * @generated
    */
    public CADEMP setSAPM_EMP(String SAPM_EMP) {
        this.SAPM_EMP = SAPM_EMP;
        return this;
    }
    /**
    * Obtém SCAN_EMP
    * return SCAN_EMP
    * @generated
    */
    public String getSCAN_EMP() {
        return this.SCAN_EMP;
    }

    /**
    * Define SCAN_EMP
    * @param SCAN_EMP SCAN_EMP
    * @generated
    */
    public CADEMP setSCAN_EMP(String SCAN_EMP) {
        this.SCAN_EMP = SCAN_EMP;
        return this;
    }
    /**
    * Obtém SCNF_EMP
    * return SCNF_EMP
    * @generated
    */
    public String getSCNF_EMP() {
        return this.SCNF_EMP;
    }

    /**
    * Define SCNF_EMP
    * @param SCNF_EMP SCNF_EMP
    * @generated
    */
    public CADEMP setSCNF_EMP(String SCNF_EMP) {
        this.SCNF_EMP = SCNF_EMP;
        return this;
    }
    /**
    * Obtém SCST_EMP
    * return SCST_EMP
    * @generated
    */
    public String getSCST_EMP() {
        return this.SCST_EMP;
    }

    /**
    * Define SCST_EMP
    * @param SCST_EMP SCST_EMP
    * @generated
    */
    public CADEMP setSCST_EMP(String SCST_EMP) {
        this.SCST_EMP = SCST_EMP;
        return this;
    }
    /**
    * Obtém SENV_EMP
    * return SENV_EMP
    * @generated
    */
    public String getSENV_EMP() {
        return this.SENV_EMP;
    }

    /**
    * Define SENV_EMP
    * @param SENV_EMP SENV_EMP
    * @generated
    */
    public CADEMP setSENV_EMP(String SENV_EMP) {
        this.SENV_EMP = SENV_EMP;
        return this;
    }
    /**
    * Obtém SHAB_EMP
    * return SHAB_EMP
    * @generated
    */
    public String getSHAB_EMP() {
        return this.SHAB_EMP;
    }

    /**
    * Define SHAB_EMP
    * @param SHAB_EMP SHAB_EMP
    * @generated
    */
    public CADEMP setSHAB_EMP(String SHAB_EMP) {
        this.SHAB_EMP = SHAB_EMP;
        return this;
    }
    /**
    * Obtém SINI_EMP
    * return SINI_EMP
    * @generated
    */
    public String getSINI_EMP() {
        return this.SINI_EMP;
    }

    /**
    * Define SINI_EMP
    * @param SINI_EMP SINI_EMP
    * @generated
    */
    public CADEMP setSINI_EMP(String SINI_EMP) {
        this.SINI_EMP = SINI_EMP;
        return this;
    }
    /**
    * Obtém SINP_EMP
    * return SINP_EMP
    * @generated
    */
    public String getSINP_EMP() {
        return this.SINP_EMP;
    }

    /**
    * Define SINP_EMP
    * @param SINP_EMP SINP_EMP
    * @generated
    */
    public CADEMP setSINP_EMP(String SINP_EMP) {
        this.SINP_EMP = SINP_EMP;
        return this;
    }
    /**
    * Obtém SINU_EMP
    * return SINU_EMP
    * @generated
    */
    public String getSINU_EMP() {
        return this.SINU_EMP;
    }

    /**
    * Define SINU_EMP
    * @param SINU_EMP SINU_EMP
    * @generated
    */
    public CADEMP setSINU_EMP(String SINU_EMP) {
        this.SINU_EMP = SINU_EMP;
        return this;
    }
    /**
    * Obtém SITE_CND
    * return SITE_CND
    * @generated
    */
    public String getSITE_CND() {
        return this.SITE_CND;
    }

    /**
    * Define SITE_CND
    * @param SITE_CND SITE_CND
    * @generated
    */
    public CADEMP setSITE_CND(String SITE_CND) {
        this.SITE_CND = SITE_CND;
        return this;
    }
    /**
    * Obtém SITU_EMP
    * return SITU_EMP
    * @generated
    */
    public String getSITU_EMP() {
        return this.SITU_EMP;
    }

    /**
    * Define SITU_EMP
    * @param SITU_EMP SITU_EMP
    * @generated
    */
    public CADEMP setSITU_EMP(String SITU_EMP) {
        this.SITU_EMP = SITU_EMP;
        return this;
    }
    /**
    * Obtém SLOG_EMP
    * return SLOG_EMP
    * @generated
    */
    public String getSLOG_EMP() {
        return this.SLOG_EMP;
    }

    /**
    * Define SLOG_EMP
    * @param SLOG_EMP SLOG_EMP
    * @generated
    */
    public CADEMP setSLOG_EMP(String SLOG_EMP) {
        this.SLOG_EMP = SLOG_EMP;
        return this;
    }
    /**
    * Obtém SNFC_EMP
    * return SNFC_EMP
    * @generated
    */
    public String getSNFC_EMP() {
        return this.SNFC_EMP;
    }

    /**
    * Define SNFC_EMP
    * @param SNFC_EMP SNFC_EMP
    * @generated
    */
    public CADEMP setSNFC_EMP(String SNFC_EMP) {
        this.SNFC_EMP = SNFC_EMP;
        return this;
    }
    /**
    * Obtém SOUT_EMP
    * return SOUT_EMP
    * @generated
    */
    public String getSOUT_EMP() {
        return this.SOUT_EMP;
    }

    /**
    * Define SOUT_EMP
    * @param SOUT_EMP SOUT_EMP
    * @generated
    */
    public CADEMP setSOUT_EMP(String SOUT_EMP) {
        this.SOUT_EMP = SOUT_EMP;
        return this;
    }
    /**
    * Obtém SPAT_EMP
    * return SPAT_EMP
    * @generated
    */
    public String getSPAT_EMP() {
        return this.SPAT_EMP;
    }

    /**
    * Define SPAT_EMP
    * @param SPAT_EMP SPAT_EMP
    * @generated
    */
    public CADEMP setSPAT_EMP(String SPAT_EMP) {
        this.SPAT_EMP = SPAT_EMP;
        return this;
    }
    /**
    * Obtém SPCE_EMP
    * return SPCE_EMP
    * @generated
    */
    public Integer getSPCE_EMP() {
        return this.SPCE_EMP;
    }

    /**
    * Define SPCE_EMP
    * @param SPCE_EMP SPCE_EMP
    * @generated
    */
    public CADEMP setSPCE_EMP(Integer SPCE_EMP) {
        this.SPCE_EMP = SPCE_EMP;
        return this;
    }
    /**
    * Obtém SPIT_EMP
    * return SPIT_EMP
    * @generated
    */
    public String getSPIT_EMP() {
        return this.SPIT_EMP;
    }

    /**
    * Define SPIT_EMP
    * @param SPIT_EMP SPIT_EMP
    * @generated
    */
    public CADEMP setSPIT_EMP(String SPIT_EMP) {
        this.SPIT_EMP = SPIT_EMP;
        return this;
    }
    /**
    * Obtém SPMA_EMP
    * return SPMA_EMP
    * @generated
    */
    public String getSPMA_EMP() {
        return this.SPMA_EMP;
    }

    /**
    * Define SPMA_EMP
    * @param SPMA_EMP SPMA_EMP
    * @generated
    */
    public CADEMP setSPMA_EMP(String SPMA_EMP) {
        this.SPMA_EMP = SPMA_EMP;
        return this;
    }
    /**
    * Obtém SPNA_EMP
    * return SPNA_EMP
    * @generated
    */
    public String getSPNA_EMP() {
        return this.SPNA_EMP;
    }

    /**
    * Define SPNA_EMP
    * @param SPNA_EMP SPNA_EMP
    * @generated
    */
    public CADEMP setSPNA_EMP(String SPNA_EMP) {
        this.SPNA_EMP = SPNA_EMP;
        return this;
    }
    /**
    * Obtém SPTC_EMP
    * return SPTC_EMP
    * @generated
    */
    public String getSPTC_EMP() {
        return this.SPTC_EMP;
    }

    /**
    * Define SPTC_EMP
    * @param SPTC_EMP SPTC_EMP
    * @generated
    */
    public CADEMP setSPTC_EMP(String SPTC_EMP) {
        this.SPTC_EMP = SPTC_EMP;
        return this;
    }
    /**
    * Obtém SRES_EMP
    * return SRES_EMP
    * @generated
    */
    public String getSRES_EMP() {
        return this.SRES_EMP;
    }

    /**
    * Define SRES_EMP
    * @param SRES_EMP SRES_EMP
    * @generated
    */
    public CADEMP setSRES_EMP(String SRES_EMP) {
        this.SRES_EMP = SRES_EMP;
        return this;
    }
    /**
    * Obtém SRET_EMP
    * return SRET_EMP
    * @generated
    */
    public String getSRET_EMP() {
        return this.SRET_EMP;
    }

    /**
    * Define SRET_EMP
    * @param SRET_EMP SRET_EMP
    * @generated
    */
    public CADEMP setSRET_EMP(String SRET_EMP) {
        this.SRET_EMP = SRET_EMP;
        return this;
    }
    /**
    * Obtém SROU_EMP
    * return SROU_EMP
    * @generated
    */
    public String getSROU_EMP() {
        return this.SROU_EMP;
    }

    /**
    * Define SROU_EMP
    * @param SROU_EMP SROU_EMP
    * @generated
    */
    public CADEMP setSROU_EMP(String SROU_EMP) {
        this.SROU_EMP = SROU_EMP;
        return this;
    }
    /**
    * Obtém SWCA_EMP
    * return SWCA_EMP
    * @generated
    */
    public String getSWCA_EMP() {
        return this.SWCA_EMP;
    }

    /**
    * Define SWCA_EMP
    * @param SWCA_EMP SWCA_EMP
    * @generated
    */
    public CADEMP setSWCA_EMP(String SWCA_EMP) {
        this.SWCA_EMP = SWCA_EMP;
        return this;
    }
    /**
    * Obtém SWCO_EMP
    * return SWCO_EMP
    * @generated
    */
    public String getSWCO_EMP() {
        return this.SWCO_EMP;
    }

    /**
    * Define SWCO_EMP
    * @param SWCO_EMP SWCO_EMP
    * @generated
    */
    public CADEMP setSWCO_EMP(String SWCO_EMP) {
        this.SWCO_EMP = SWCO_EMP;
        return this;
    }
    /**
    * Obtém SWIN_EMP
    * return SWIN_EMP
    * @generated
    */
    public String getSWIN_EMP() {
        return this.SWIN_EMP;
    }

    /**
    * Define SWIN_EMP
    * @param SWIN_EMP SWIN_EMP
    * @generated
    */
    public CADEMP setSWIN_EMP(String SWIN_EMP) {
        this.SWIN_EMP = SWIN_EMP;
        return this;
    }
    /**
    * Obtém SWRC_EMP
    * return SWRC_EMP
    * @generated
    */
    public String getSWRC_EMP() {
        return this.SWRC_EMP;
    }

    /**
    * Define SWRC_EMP
    * @param SWRC_EMP SWRC_EMP
    * @generated
    */
    public CADEMP setSWRC_EMP(String SWRC_EMP) {
        this.SWRC_EMP = SWRC_EMP;
        return this;
    }
    /**
    * Obtém SWRT_EMP
    * return SWRT_EMP
    * @generated
    */
    public String getSWRT_EMP() {
        return this.SWRT_EMP;
    }

    /**
    * Define SWRT_EMP
    * @param SWRT_EMP SWRT_EMP
    * @generated
    */
    public CADEMP setSWRT_EMP(String SWRT_EMP) {
        this.SWRT_EMP = SWRT_EMP;
        return this;
    }
    /**
    * Obtém SWST_EMP
    * return SWST_EMP
    * @generated
    */
    public String getSWST_EMP() {
        return this.SWST_EMP;
    }

    /**
    * Define SWST_EMP
    * @param SWST_EMP SWST_EMP
    * @generated
    */
    public CADEMP setSWST_EMP(String SWST_EMP) {
        this.SWST_EMP = SWST_EMP;
        return this;
    }
    /**
    * Obtém TBLO_SEM
    * return TBLO_SEM
    * @generated
    */
    public String getTBLO_SEM() {
        return this.TBLO_SEM;
    }

    /**
    * Define TBLO_SEM
    * @param TBLO_SEM TBLO_SEM
    * @generated
    */
    public CADEMP setTBLO_SEM(String TBLO_SEM) {
        this.TBLO_SEM = TBLO_SEM;
        return this;
    }
    /**
    * Obtém TCCO_EMP
    * return TCCO_EMP
    * @generated
    */
    public Double getTCCO_EMP() {
        return this.TCCO_EMP;
    }

    /**
    * Define TCCO_EMP
    * @param TCCO_EMP TCCO_EMP
    * @generated
    */
    public CADEMP setTCCO_EMP(Double TCCO_EMP) {
        this.TCCO_EMP = TCCO_EMP;
        return this;
    }
    /**
    * Obtém TCRE_EMP
    * return TCRE_EMP
    * @generated
    */
    public Double getTCRE_EMP() {
        return this.TCRE_EMP;
    }

    /**
    * Define TCRE_EMP
    * @param TCRE_EMP TCRE_EMP
    * @generated
    */
    public CADEMP setTCRE_EMP(Double TCRE_EMP) {
        this.TCRE_EMP = TCRE_EMP;
        return this;
    }
    /**
    * Obtém TIPO_EMP
    * return TIPO_EMP
    * @generated
    */
    public String getTIPO_EMP() {
        return this.TIPO_EMP;
    }

    /**
    * Define TIPO_EMP
    * @param TIPO_EMP TIPO_EMP
    * @generated
    */
    public CADEMP setTIPO_EMP(String TIPO_EMP) {
        this.TIPO_EMP = TIPO_EMP;
        return this;
    }
    /**
    * Obtém TJUR_EMP
    * return TJUR_EMP
    * @generated
    */
    public String getTJUR_EMP() {
        return this.TJUR_EMP;
    }

    /**
    * Define TJUR_EMP
    * @param TJUR_EMP TJUR_EMP
    * @generated
    */
    public CADEMP setTJUR_EMP(String TJUR_EMP) {
        this.TJUR_EMP = TJUR_EMP;
        return this;
    }
    /**
    * Obtém TPAG_EMP
    * return TPAG_EMP
    * @generated
    */
    public String getTPAG_EMP() {
        return this.TPAG_EMP;
    }

    /**
    * Define TPAG_EMP
    * @param TPAG_EMP TPAG_EMP
    * @generated
    */
    public CADEMP setTPAG_EMP(String TPAG_EMP) {
        this.TPAG_EMP = TPAG_EMP;
        return this;
    }
    /**
    * Obtém TVAL_CND
    * return TVAL_CND
    * @generated
    */
    public String getTVAL_CND() {
        return this.TVAL_CND;
    }

    /**
    * Define TVAL_CND
    * @param TVAL_CND TVAL_CND
    * @generated
    */
    public CADEMP setTVAL_CND(String TVAL_CND) {
        this.TVAL_CND = TVAL_CND;
        return this;
    }
    /**
    * Obtém UCFO_EMP
    * return UCFO_EMP
    * @generated
    */
    public String getUCFO_EMP() {
        return this.UCFO_EMP;
    }

    /**
    * Define UCFO_EMP
    * @param UCFO_EMP UCFO_EMP
    * @generated
    */
    public CADEMP setUCFO_EMP(String UCFO_EMP) {
        this.UCFO_EMP = UCFO_EMP;
        return this;
    }
    /**
    * Obtém UCRC_EMP
    * return UCRC_EMP
    * @generated
    */
    public String getUCRC_EMP() {
        return this.UCRC_EMP;
    }

    /**
    * Define UCRC_EMP
    * @param UCRC_EMP UCRC_EMP
    * @generated
    */
    public CADEMP setUCRC_EMP(String UCRC_EMP) {
        this.UCRC_EMP = UCRC_EMP;
        return this;
    }
    /**
    * Obtém UECF_EMP
    * return UECF_EMP
    * @generated
    */
    public String getUECF_EMP() {
        return this.UECF_EMP;
    }

    /**
    * Define UECF_EMP
    * @param UECF_EMP UECF_EMP
    * @generated
    */
    public CADEMP setUECF_EMP(String UECF_EMP) {
        this.UECF_EMP = UECF_EMP;
        return this;
    }
    /**
    * Obtém UPAF_EMP
    * return UPAF_EMP
    * @generated
    */
    public String getUPAF_EMP() {
        return this.UPAF_EMP;
    }

    /**
    * Define UPAF_EMP
    * @param UPAF_EMP UPAF_EMP
    * @generated
    */
    public CADEMP setUPAF_EMP(String UPAF_EMP) {
        this.UPAF_EMP = UPAF_EMP;
        return this;
    }
    /**
    * Obtém UTEV_EMP
    * return UTEV_EMP
    * @generated
    */
    public String getUTEV_EMP() {
        return this.UTEV_EMP;
    }

    /**
    * Define UTEV_EMP
    * @param UTEV_EMP UTEV_EMP
    * @generated
    */
    public CADEMP setUTEV_EMP(String UTEV_EMP) {
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
    public String getVEND_EMP() {
        return this.VEND_EMP;
    }

    /**
    * Define VEND_EMP
    * @param VEND_EMP VEND_EMP
    * @generated
    */
    public CADEMP setVEND_EMP(String VEND_EMP) {
        this.VEND_EMP = VEND_EMP;
        return this;
    }
    /**
    * Obtém VERS_EMP
    * return VERS_EMP
    * @generated
    */
    public String getVERS_EMP() {
        return this.VERS_EMP;
    }

    /**
    * Define VERS_EMP
    * @param VERS_EMP VERS_EMP
    * @generated
    */
    public CADEMP setVERS_EMP(String VERS_EMP) {
        this.VERS_EMP = VERS_EMP;
        return this;
    }
    /**
    * Obtém VIIM_EMP
    * return VIIM_EMP
    * @generated
    */
    public String getVIIM_EMP() {
        return this.VIIM_EMP;
    }

    /**
    * Define VIIM_EMP
    * @param VIIM_EMP VIIM_EMP
    * @generated
    */
    public CADEMP setVIIM_EMP(String VIIM_EMP) {
        this.VIIM_EMP = VIIM_EMP;
        return this;
    }
    /**
    * Obtém VMCT_EMP
    * return VMCT_EMP
    * @generated
    */
    public String getVMCT_EMP() {
        return this.VMCT_EMP;
    }

    /**
    * Define VMCT_EMP
    * @param VMCT_EMP VMCT_EMP
    * @generated
    */
    public CADEMP setVMCT_EMP(String VMCT_EMP) {
        this.VMCT_EMP = VMCT_EMP;
        return this;
    }
    /**
    * Obtém VNF4_EMP
    * return VNF4_EMP
    * @generated
    */
    public String getVNF4_EMP() {
        return this.VNF4_EMP;
    }

    /**
    * Define VNF4_EMP
    * @param VNF4_EMP VNF4_EMP
    * @generated
    */
    public CADEMP setVNF4_EMP(String VNF4_EMP) {
        this.VNF4_EMP = VNF4_EMP;
        return this;
    }
    /**
    * Obtém VTAX_SEM
    * return VTAX_SEM
    * @generated
    */
    public String getVTAX_SEM() {
        return this.VTAX_SEM;
    }

    /**
    * Define VTAX_SEM
    * @param VTAX_SEM VTAX_SEM
    * @generated
    */
    public CADEMP setVTAX_SEM(String VTAX_SEM) {
        this.VTAX_SEM = VTAX_SEM;
        return this;
    }
    /**
    * Obtém WCAN_EMP
    * return WCAN_EMP
    * @generated
    */
    public String getWCAN_EMP() {
        return this.WCAN_EMP;
    }

    /**
    * Define WCAN_EMP
    * @param WCAN_EMP WCAN_EMP
    * @generated
    */
    public CADEMP setWCAN_EMP(String WCAN_EMP) {
        this.WCAN_EMP = WCAN_EMP;
        return this;
    }
    /**
    * Obtém WCNF_EMP
    * return WCNF_EMP
    * @generated
    */
    public String getWCNF_EMP() {
        return this.WCNF_EMP;
    }

    /**
    * Define WCNF_EMP
    * @param WCNF_EMP WCNF_EMP
    * @generated
    */
    public CADEMP setWCNF_EMP(String WCNF_EMP) {
        this.WCNF_EMP = WCNF_EMP;
        return this;
    }
    /**
    * Obtém WCST_EMP
    * return WCST_EMP
    * @generated
    */
    public String getWCST_EMP() {
        return this.WCST_EMP;
    }

    /**
    * Define WCST_EMP
    * @param WCST_EMP WCST_EMP
    * @generated
    */
    public CADEMP setWCST_EMP(String WCST_EMP) {
        this.WCST_EMP = WCST_EMP;
        return this;
    }
    /**
    * Obtém WENV_EMP
    * return WENV_EMP
    * @generated
    */
    public String getWENV_EMP() {
        return this.WENV_EMP;
    }

    /**
    * Define WENV_EMP
    * @param WENV_EMP WENV_EMP
    * @generated
    */
    public CADEMP setWENV_EMP(String WENV_EMP) {
        this.WENV_EMP = WENV_EMP;
        return this;
    }
    /**
    * Obtém WESE_EMP
    * return WESE_EMP
    * @generated
    */
    public String getWESE_EMP() {
        return this.WESE_EMP;
    }

    /**
    * Define WESE_EMP
    * @param WESE_EMP WESE_EMP
    * @generated
    */
    public CADEMP setWESE_EMP(String WESE_EMP) {
        this.WESE_EMP = WESE_EMP;
        return this;
    }
    /**
    * Obtém WINU_EMP
    * return WINU_EMP
    * @generated
    */
    public String getWINU_EMP() {
        return this.WINU_EMP;
    }

    /**
    * Define WINU_EMP
    * @param WINU_EMP WINU_EMP
    * @generated
    */
    public CADEMP setWINU_EMP(String WINU_EMP) {
        this.WINU_EMP = WINU_EMP;
        return this;
    }
    /**
    * Obtém WRET_EMP
    * return WRET_EMP
    * @generated
    */
    public String getWRET_EMP() {
        return this.WRET_EMP;
    }

    /**
    * Define WRET_EMP
    * @param WRET_EMP WRET_EMP
    * @generated
    */
    public CADEMP setWRET_EMP(String WRET_EMP) {
        this.WRET_EMP = WRET_EMP;
        return this;
    }
    /**
    * Obtém WSCA_EMP
    * return WSCA_EMP
    * @generated
    */
    public String getWSCA_EMP() {
        return this.WSCA_EMP;
    }

    /**
    * Define WSCA_EMP
    * @param WSCA_EMP WSCA_EMP
    * @generated
    */
    public CADEMP setWSCA_EMP(String WSCA_EMP) {
        this.WSCA_EMP = WSCA_EMP;
        return this;
    }
    /**
    * Obtém WSCO_EMP
    * return WSCO_EMP
    * @generated
    */
    public String getWSCO_EMP() {
        return this.WSCO_EMP;
    }

    /**
    * Define WSCO_EMP
    * @param WSCO_EMP WSCO_EMP
    * @generated
    */
    public CADEMP setWSCO_EMP(String WSCO_EMP) {
        this.WSCO_EMP = WSCO_EMP;
        return this;
    }
    /**
    * Obtém WSIN_EMP
    * return WSIN_EMP
    * @generated
    */
    public String getWSIN_EMP() {
        return this.WSIN_EMP;
    }

    /**
    * Define WSIN_EMP
    * @param WSIN_EMP WSIN_EMP
    * @generated
    */
    public CADEMP setWSIN_EMP(String WSIN_EMP) {
        this.WSIN_EMP = WSIN_EMP;
        return this;
    }
    /**
    * Obtém WSRC_EMP
    * return WSRC_EMP
    * @generated
    */
    public String getWSRC_EMP() {
        return this.WSRC_EMP;
    }

    /**
    * Define WSRC_EMP
    * @param WSRC_EMP WSRC_EMP
    * @generated
    */
    public CADEMP setWSRC_EMP(String WSRC_EMP) {
        this.WSRC_EMP = WSRC_EMP;
        return this;
    }
    /**
    * Obtém WSRT_EMP
    * return WSRT_EMP
    * @generated
    */
    public String getWSRT_EMP() {
        return this.WSRT_EMP;
    }

    /**
    * Define WSRT_EMP
    * @param WSRT_EMP WSRT_EMP
    * @generated
    */
    public CADEMP setWSRT_EMP(String WSRT_EMP) {
        this.WSRT_EMP = WSRT_EMP;
        return this;
    }
    /**
    * Obtém WSST_EMP
    * return WSST_EMP
    * @generated
    */
    public String getWSST_EMP() {
        return this.WSST_EMP;
    }

    /**
    * Define WSST_EMP
    * @param WSST_EMP WSST_EMP
    * @generated
    */
    public CADEMP setWSST_EMP(String WSST_EMP) {
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
