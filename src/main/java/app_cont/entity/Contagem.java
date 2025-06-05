
package app_cont.entity;

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
* Classe que representa a tabela CONTAGEM
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"CONTAGEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Contagem")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
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
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "ID", nullable = false, length=0, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Cont")
    @Column(name = "DESC_CONT", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String descCont;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Fim Cont")
    @Column(name = "FIM_CONT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean fimCont;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Cont")
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
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Contagem setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descCont
    * return descCont
    * @generated
    */
    public java.lang.String getDescCont() {
        return this.descCont;
    }

    /**
    * Define descCont
    * @param descCont descCont
    * @generated
    */
    public Contagem setDescCont(java.lang.String descCont) {
        this.descCont = descCont;
        return this;
    }
    /**
    * Obtém fimCont
    * return fimCont
    * @generated
    */
    public java.lang.Boolean getFimCont() {
        return this.fimCont;
    }

    /**
    * Define fimCont
    * @param fimCont fimCont
    * @generated
    */
    public Contagem setFimCont(java.lang.Boolean fimCont) {
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
