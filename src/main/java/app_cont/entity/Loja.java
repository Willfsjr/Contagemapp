
package app_cont.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela LOJA
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"LOJA\"")
@XmlRootElement
@JsonFilter("app_cont.entity.Loja")
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
    @Column(name = "ID", nullable = false, length=0, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "DESC_LOJA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private String descLoja;


    /**
    * @generated
    */
    @Column(name = "CODI_LOJA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private Integer codiLoja;


    /**
    * @generated
    */
    @Column(name = "CNPJ", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String cnpj;


    /**
    * @generated
    */
    @Column(name = "ENDERECO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String logradouro;


    /**
    * @generated
    */
    @Column(name = "CIDADE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String cidade;


    /**
    * Construtor
    * @generated
    */
    public Loja(){
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
    public Loja setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descLoja
    * return descLoja
    * @generated
    */
    public String getDescLoja() {
        return this.descLoja;
    }

    /**
    * Define descLoja
    * @param descLoja descLoja
    * @generated
    */
    public Loja setDescLoja(String descLoja) {
        this.descLoja = descLoja;
        return this;
    }
    /**
    * Obtém codiLoja
    * return codiLoja
    * @generated
    */
    public Integer getCodiLoja() {
        return this.codiLoja;
    }

    /**
    * Define codiLoja
    * @param codiLoja codiLoja
    * @generated
    */
    public Loja setCodiLoja(Integer codiLoja) {
        this.codiLoja = codiLoja;
        return this;
    }
    /**
    * Obtém cnpj
    * return cnpj
    * @generated
    */
    public String getCnpj() {
        return this.cnpj;
    }

    /**
    * Define cnpj
    * @param cnpj cnpj
    * @generated
    */
    public Loja setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    /**
    * Obtém logradouro
    * return logradouro
    * @generated
    */
    public String getLogradouro() {
        return this.logradouro;
    }

    /**
    * Define logradouro
    * @param logradouro logradouro
    * @generated
    */
    public Loja setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    public String getCidade() {
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Loja setCidade(String cidade) {
        this.cidade = cidade;
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
