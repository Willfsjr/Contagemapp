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
* Classe que representa a tabela ATUALIZA_ESTOQUE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ATUALIZA_ESTOQUE\"")
@XmlRootElement
@JsonFilter("app_cont.entity.AtualizaEstoque")
public class AtualizaEstoque implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "CODI_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String codiPsv;


    /**
    * @generated
    */
    @Column(name = "DESC_PSV", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String descPsv;


    /**
    * @generated
    */
    @Column(name = "CODI_DPT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiDpt;


    /**
    * @generated
    */
    @Column(name = "CODI_EMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiEmp;


    /**
    * @generated
    */
    @Column(name = "QTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Double qteTotal;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_CONTAGEM", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true)
        
        private Contagem contEst;


    /**
    * Construtor
    * @generated
    */
    public AtualizaEstoque(){
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
    public AtualizaEstoque setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codiPsv
    * return codiPsv
    * @generated
    */
    public String getCodiPsv() {
        return this.codiPsv;
    }

    /**
    * Define codiPsv
    * @param codiPsv codiPsv
    * @generated
    */
    public AtualizaEstoque setCodiPsv(String codiPsv) {
        this.codiPsv = codiPsv;
        return this;
    }
    /**
    * Obtém descPsv
    * return descPsv
    * @generated
    */
    public String getDescPsv() {
        return this.descPsv;
    }

    /**
    * Define descPsv
    * @param descPsv descPsv
    * @generated
    */
    public AtualizaEstoque setDescPsv(String descPsv) {
        this.descPsv = descPsv;
        return this;
    }
    /**
    * Obtém codiDpt
    * return codiDpt
    * @generated
    */
    public Integer getCodiDpt() {
        return this.codiDpt;
    }

    /**
    * Define codiDpt
    * @param codiDpt codiDpt
    * @generated
    */
    public AtualizaEstoque setCodiDpt(Integer codiDpt) {
        this.codiDpt = codiDpt;
        return this;
    }
    /**
    * Obtém codiEmp
    * return codiEmp
    * @generated
    */
    public Integer getCodiEmp() {
        return this.codiEmp;
    }

    /**
    * Define codiEmp
    * @param codiEmp codiEmp
    * @generated
    */
    public AtualizaEstoque setCodiEmp(Integer codiEmp) {
        this.codiEmp = codiEmp;
        return this;
    }
    /**
    * Obtém qteTotal
    * return qteTotal
    * @generated
    */
    public Double getQteTotal() {
        return this.qteTotal;
    }

    /**
    * Define qteTotal
    * @param qteTotal qteTotal
    * @generated
    */
    public AtualizaEstoque setQteTotal(Double qteTotal) {
        this.qteTotal = qteTotal;
        return this;
    }
    /**
    * Obtém contEst
    * return contEst
    * @generated
    */
    public Contagem getContEst() {
        return this.contEst;
    }

    /**
    * Define contEst
    * @param contEst contEst
    * @generated
    */
    public AtualizaEstoque setContEst(Contagem contEst) {
        this.contEst = contEst;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AtualizaEstoque object = (AtualizaEstoque)obj;
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
