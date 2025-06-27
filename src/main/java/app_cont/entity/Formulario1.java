
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela FORMULARIO1
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"FORMULARIO1\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Formulario1")
public class Formulario1 implements Serializable {
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
    @Column(name = "QUANT_FORM1", nullable = true, unique = false, scale=17, insertable=true, updatable=true)
        
        private Double quantForm1;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_FORM1", nullable = true, unique = false, precision=6, scale=6, insertable=true, updatable=true)
        
        private java.util.Date dataForm1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_PRODUTO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Produto1 prodForm1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contForm1;


    /**
    * Construtor
    * @generated
    */
    public Formulario1(){
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
    public Formulario1 setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém quantForm1
    * return quantForm1
    * @generated
    */
    public Double getQuantForm1() {
        return this.quantForm1;
    }

    /**
    * Define quantForm1
    * @param quantForm1 quantForm1
    * @generated
    */
    public Formulario1 setQuantForm1(Double quantForm1) {
        this.quantForm1 = quantForm1;
        return this;
    }
    /**
    * Obtém dataForm1
    * return dataForm1
    * @generated
    */
    public java.util.Date getDataForm1() {
        return this.dataForm1;
    }

    /**
    * Define dataForm1
    * @param dataForm1 dataForm1
    * @generated
    */
    public Formulario1 setDataForm1(java.util.Date dataForm1) {
        this.dataForm1 = dataForm1;
        return this;
    }
    /**
    * Obtém prodForm1
    * return prodForm1
    * @generated
    */
    public Produto1 getProdForm1() {
        return this.prodForm1;
    }

    /**
    * Define prodForm1
    * @param prodForm1 prodForm1
    * @generated
    */
    public Formulario1 setProdForm1(Produto1 prodForm1) {
        this.prodForm1 = prodForm1;
        return this;
    }
    /**
    * Obtém contForm1
    * return contForm1
    * @generated
    */
    public Contagem getContForm1() {
        return this.contForm1;
    }

    /**
    * Define contForm1
    * @param contForm1 contForm1
    * @generated
    */
    public Formulario1 setContForm1(Contagem contForm1) {
        this.contForm1 = contForm1;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Formulario1 object = (Formulario1)obj;
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
