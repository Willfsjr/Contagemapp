
package app.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela ROLE_SECURABLE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ROLE_SECURABLE\"")
@XmlRootElement
@JsonFilter("app.entity.RoleSecurable")
public class RoleSecurable implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="role_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "ROLE_SECURABLE_ROLE_ID_ROLE_ID", foreignKeyDefinition = "FOREIGN KEY (role_id) REFERENCES ROLE (id) ON DELETE CASCADE"))
        
        private Role role;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="securable_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "ROLE_SECURABLE_SECURABLE_ID_SECURABLE_ID", foreignKeyDefinition = "FOREIGN KEY (securable_id) REFERENCES SECURABLE (id) ON DELETE CASCADE"))
        
        private Securable securable;


    /**
    * Construtor
    * @generated
    */
    public RoleSecurable(){
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
    public RoleSecurable setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém role
    * return role
    * @generated
    */
    public Role getRole() {
        return this.role;
    }

    /**
    * Define role
    * @param role role
    * @generated
    */
    public RoleSecurable setRole(Role role) {
        this.role = role;
        return this;
    }
    /**
    * Obtém securable
    * return securable
    * @generated
    */
    public Securable getSecurable() {
        return this.securable;
    }

    /**
    * Define securable
    * @param securable securable
    * @generated
    */
    public RoleSecurable setSecurable(Securable securable) {
        this.securable = securable;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
RoleSecurable object = (RoleSecurable)obj;
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
