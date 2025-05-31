
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
* Classe que representa a tabela LOJA
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"LOJA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Loja")
@CronappTable(role=CronappTableRole.CLASS)
public class Loja implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Loja Id")
    @Column(name = "loja_id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String lojaId;


    /**
    * @generated
    */
    @CronappColumn(attributeType="SHORT", label="Codigo")
    @Column(name = "codigo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short codigo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * Construtor
    * @generated
    */
    public Loja(){
    }

    /**
    * Obtém lojaId
    * return lojaId
    * @generated
    */
    public java.lang.String getLojaId() {
        return this.lojaId;
    }

    /**
    * Define lojaId
    * @param lojaId lojaId
    * @generated
    */
    public Loja setLojaId(java.lang.String lojaId) {
        this.lojaId = lojaId;
        return this;
    }
    /**
    * Obtém codigo
    * return codigo
    * @generated
    */
    public java.lang.Short getCodigo() {
        return this.codigo;
    }

    /**
    * Define codigo
    * @param codigo codigo
    * @generated
    */
    public Loja setCodigo(java.lang.Short codigo) {
        this.codigo = codigo;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Loja setName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Loja object = (Loja)obj;
        if (lojaId != null ? !lojaId.equals(object.lojaId) : object.lojaId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((lojaId == null) ? 0 : lojaId.hashCode());
        return result;
    }

}
