
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;




/**
* Classe que representa a tabela CONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CONTAGEM\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Contagem")
public class Contagem implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ID", nullable = false, length=0, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "DESC_CONT", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String descCont;


    /**
    * @generated
    */
    @Column(name = "FIM_CONT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Boolean fimCont;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CONT", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date dataCont;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_LOJA", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "CONTAGEM_FK_LOJA_LOJA_ID", foreignKeyDefinition = "FOREIGN KEY (FK_LOJA) REFERENCES LOJA (ID) ON DELETE CASCADE"))
        
        private Loja lojaCont;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_DEPOSITO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Deposito depCont;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_GRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Grupo gprCont;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_SUBGRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private SubGrupo sbgCont;


    /**
    * Construtor
    * @generated
    */
    public Contagem(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Contagem setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descCont
    * return descCont
    * @generated
    */
    public String getDescCont() {
        return this.descCont;
    }

    /**
    * Define descCont
    * @param descCont descCont
    * @generated
    */
    public Contagem setDescCont(String descCont) {
        this.descCont = descCont;
        return this;
    }
    /**
    * Obtém fimCont
    * return fimCont
    * @generated
    */
    public Boolean getFimCont() {
        return this.fimCont;
    }

    /**
    * Define fimCont
    * @param fimCont fimCont
    * @generated
    */
    public Contagem setFimCont(Boolean fimCont) {
        this.fimCont = fimCont;
        return this;
    }
    /**
    * Obtém dataCont
    * return dataCont
    * @generated
    */
    public java.util.Date getDataCont() {
        return this.dataCont;
    }

    /**
    * Define dataCont
    * @param dataCont dataCont
    * @generated
    */
    public Contagem setDataCont(java.util.Date dataCont) {
        this.dataCont = dataCont;
        return this;
    }
    /**
    * Obtém lojaCont
    * return lojaCont
    * @generated
    */
    public Loja getLojaCont() {
        return this.lojaCont;
    }

    /**
    * Define lojaCont
    * @param lojaCont lojaCont
    * @generated
    */
    public Contagem setLojaCont(Loja lojaCont) {
        this.lojaCont = lojaCont;
        return this;
    }
    /**
    * Obtém depCont
    * return depCont
    * @generated
    */
    public Deposito getDepCont() {
        return this.depCont;
    }

    /**
    * Define depCont
    * @param depCont depCont
    * @generated
    */
    public Contagem setDepCont(Deposito depCont) {
        this.depCont = depCont;
        return this;
    }
    /**
    * Obtém gprCont
    * return gprCont
    * @generated
    */
    public Grupo getGprCont() {
        return this.gprCont;
    }

    /**
    * Define gprCont
    * @param gprCont gprCont
    * @generated
    */
    public Contagem setGprCont(Grupo gprCont) {
        this.gprCont = gprCont;
        return this;
    }
    /**
    * Obtém sbgCont
    * return sbgCont
    * @generated
    */
    public SubGrupo getSbgCont() {
        return this.sbgCont;
    }

    /**
    * Define sbgCont
    * @param sbgCont sbgCont
    * @generated
    */
    public Contagem setSbgCont(SubGrupo sbgCont) {
        this.sbgCont = sbgCont;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Contagem object = (Contagem)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
