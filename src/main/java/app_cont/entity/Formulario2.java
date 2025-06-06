
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
* Classe que representa a tabela FORMULARIO2
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"FORMULARIO2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_cont.entity.Formulario2")
@CronappTable(role=CronappTableRole.CLASS)
public class Formulario2 implements Serializable {
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
    @CronappColumn(attributeType="DOUBLE", label="Quant Form 2")
    @Column(name = "QUANT_FORM2", nullable = true, unique = false, scale=17, insertable=true, updatable=true)
        
        private java.lang.Double quantForm2;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Form 2")
    @Column(name = "DATA_FOMR2", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date dataForm2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_PRODUTO2", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Produto2 prodForm2;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contForm2;


    /**
    * Construtor
    * @generated
    */
    public Formulario2(){
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
    public Formulario2 setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém quantForm2
    * return quantForm2
    * @generated
    */
    public java.lang.Double getQuantForm2() {
        return this.quantForm2;
    }

    /**
    * Define quantForm2
    * @param quantForm2 quantForm2
    * @generated
    */
    public Formulario2 setQuantForm2(java.lang.Double quantForm2) {
        this.quantForm2 = quantForm2;
        return this;
    }
    /**
    * Obtém dataForm2
    * return dataForm2
    * @generated
    */
    public java.util.Date getDataForm2() {
        return this.dataForm2;
    }

    /**
    * Define dataForm2
    * @param dataForm2 dataForm2
    * @generated
    */
    public Formulario2 setDataForm2(java.util.Date dataForm2) {
        this.dataForm2 = dataForm2;
        return this;
    }
    /**
    * Obtém prodForm2
    * return prodForm2
    * @generated
    */
    public Produto2 getProdForm2() {
        return this.prodForm2;
    }

    /**
    * Define prodForm2
    * @param prodForm2 prodForm2
    * @generated
    */
    public Formulario2 setProdForm2(Produto2 prodForm2) {
        this.prodForm2 = prodForm2;
        return this;
    }
    /**
    * Obtém contForm2
    * return contForm2
    * @generated
    */
    public Contagem getContForm2() {
        return this.contForm2;
    }

    /**
    * Define contForm2
    * @param contForm2 contForm2
    * @generated
    */
    public Formulario2 setContForm2(Contagem contForm2) {
        this.contForm2 = contForm2;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Formulario2 object = (Formulario2)obj;
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
