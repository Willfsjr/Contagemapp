
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela PRODUTO1
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PRODUTO1\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Produto1")
public class Produto1 implements Serializable {
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
    @Column(name = "CODI_PROD1", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String codiProd1;


    /**
    * @generated
    */
    @Column(name = "DESC_PROD1", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String descProd1;


    /**
    * @generated
    */
    @Column(name = "CODI_BAR1", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String codiBar1;


    /**
    * @generated
    */
    @Column(name = "CUST_TAB1", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private Double custTab1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_GRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Grupo gprProd1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_SUBGRUPO", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private SubGrupo sbgProd1;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contProd1;


    /**
    * Construtor
    * @generated
    */
    public Produto1(){
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
    public Produto1 setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiProd1
    * return codiProd1
    * @generated
    */
    public String getCodiProd1() {
        return this.codiProd1;
    }

    /**
    * Define codiProd1
    * @param codiProd1 codiProd1
    * @generated
    */
    public Produto1 setCodiProd1(String codiProd1) {
        this.codiProd1 = codiProd1;
        return this;
    }
    /**
    * Obtém descProd1
    * return descProd1
    * @generated
    */
    public String getDescProd1() {
        return this.descProd1;
    }

    /**
    * Define descProd1
    * @param descProd1 descProd1
    * @generated
    */
    public Produto1 setDescProd1(String descProd1) {
        this.descProd1 = descProd1;
        return this;
    }
    /**
    * Obtém codiBar1
    * return codiBar1
    * @generated
    */
    public String getCodiBar1() {
        return this.codiBar1;
    }

    /**
    * Define codiBar1
    * @param codiBar1 codiBar1
    * @generated
    */
    public Produto1 setCodiBar1(String codiBar1) {
        this.codiBar1 = codiBar1;
        return this;
    }
    /**
    * Obtém custTab1
    * return custTab1
    * @generated
    */
    public Double getCustTab1() {
        return this.custTab1;
    }

    /**
    * Define custTab1
    * @param custTab1 custTab1
    * @generated
    */
    public Produto1 setCustTab1(Double custTab1) {
        this.custTab1 = custTab1;
        return this;
    }
    /**
    * Obtém gprProd1
    * return gprProd1
    * @generated
    */
    public Grupo getGprProd1() {
        return this.gprProd1;
    }

    /**
    * Define gprProd1
    * @param gprProd1 gprProd1
    * @generated
    */
    public Produto1 setGprProd1(Grupo gprProd1) {
        this.gprProd1 = gprProd1;
        return this;
    }
    /**
    * Obtém sbgProd1
    * return sbgProd1
    * @generated
    */
    public SubGrupo getSbgProd1() {
        return this.sbgProd1;
    }

    /**
    * Define sbgProd1
    * @param sbgProd1 sbgProd1
    * @generated
    */
    public Produto1 setSbgProd1(SubGrupo sbgProd1) {
        this.sbgProd1 = sbgProd1;
        return this;
    }
    /**
    * Obtém contProd1
    * return contProd1
    * @generated
    */
    public Contagem getContProd1() {
        return this.contProd1;
    }

    /**
    * Define contProd1
    * @param contProd1 contProd1
    * @generated
    */
    public Produto1 setContProd1(Contagem contProd1) {
        this.contProd1 = contProd1;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Produto1 object = (Produto1)obj;
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
