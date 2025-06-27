
package app.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela LOGIN
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"LOGIN\"")
@XmlRootElement
@JsonFilter("app.entity.Login")
public class Login implements Serializable {
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
        private String id;


    /**
    * @generated
    */
    @Column(name = "login_provider", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private String loginProvider;


    /**
    * @generated
    */
    @Column(name = "provider_display_name", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private String providerDisplayName;


    /**
    * @generated
    */
    @Column(name = "provider_key", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private String providerKey;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "LOGIN_USER_ID_USER_ID", foreignKeyDefinition = "FOREIGN KEY (user_id) REFERENCES USER (id) ON DELETE CASCADE"))
        
        private User user;


    /**
    * Construtor
    * @generated
    */
    public Login(){
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
    public Login setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém loginProvider
    * return loginProvider
    * @generated
    */
    public String getLoginProvider() {
        return this.loginProvider;
    }

    /**
    * Define loginProvider
    * @param loginProvider loginProvider
    * @generated
    */
    public Login setLoginProvider(String loginProvider) {
        this.loginProvider = loginProvider;
        return this;
    }
    /**
    * Obtém providerDisplayName
    * return providerDisplayName
    * @generated
    */
    public String getProviderDisplayName() {
        return this.providerDisplayName;
    }

    /**
    * Define providerDisplayName
    * @param providerDisplayName providerDisplayName
    * @generated
    */
    public Login setProviderDisplayName(String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
        return this;
    }
    /**
    * Obtém providerKey
    * return providerKey
    * @generated
    */
    public String getProviderKey() {
        return this.providerKey;
    }

    /**
    * Define providerKey
    * @param providerKey providerKey
    * @generated
    */
    public Login setProviderKey(String providerKey) {
        this.providerKey = providerKey;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Login setUser(User user) {
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Login object = (Login)obj;
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
