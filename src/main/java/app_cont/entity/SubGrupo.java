
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
* Classe que representa a tabela SUBGRUPO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"SUBGRUPO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.SubGrupo")
@CronappTable(role=CronappTableRole.CLASS)
public class SubGrupo implements Serializable {
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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Codi Sbg")
    @Column(name = "CODI_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codiSbg;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Desc Sbg")
    @Column(name = "DESC_SBG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descSbg;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_GRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Grupo gprSbg;


    /**
    * Construtor
    * @generated
    */
    public SubGrupo(){
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
    public SubGrupo setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiSbg
    * return codiSbg
    * @generated
    */
    public java.lang.Integer getCodiSbg() {
        return this.codiSbg;
    }

    /**
    * Define codiSbg
    * @param codiSbg codiSbg
    * @generated
    */
    public SubGrupo setCodiSbg(java.lang.Integer codiSbg) {
        this.codiSbg = codiSbg;
        return this;
    }
    /**
    * Obtém descSbg
    * return descSbg
    * @generated
    */
    public java.lang.String getDescSbg() {
        return this.descSbg;
    }

    /**
    * Define descSbg
    * @param descSbg descSbg
    * @generated
    */
    public SubGrupo setDescSbg(java.lang.String descSbg) {
        this.descSbg = descSbg;
        return this;
    }
    /**
    * Obtém gprSbg
    * return gprSbg
    * @generated
    */
    public Grupo getGprSbg() {
        return this.gprSbg;
    }

    /**
    * Define gprSbg
    * @param gprSbg gprSbg
    * @generated
    */
    public SubGrupo setGprSbg(Grupo gprSbg) {
        this.gprSbg = gprSbg;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SubGrupo object = (SubGrupo)obj;
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
