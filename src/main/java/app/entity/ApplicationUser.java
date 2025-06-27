
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
* Classe que representa a tabela APPLICATION_USER
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"APPLICATION_USER\"")
@XmlRootElement
@JsonFilter("app.entity.ApplicationUser")
public class ApplicationUser implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="application_id", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Application application;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="user_id", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "APPLICATION_USER_USER_ID_USER_ID", foreignKeyDefinition = "FOREIGN KEY (user_id) REFERENCES USER (id) ON DELETE CASCADE"))
        
        private User user;


    /**
    * Construtor
    * @generated
    */
    public ApplicationUser(){
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
    public ApplicationUser setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém application
    * return application
    * @generated
    */
    public Application getApplication() {
        return this.application;
    }

    /**
    * Define application
    * @param application application
    * @generated
    */
    public ApplicationUser setApplication(Application application) {
        this.application = application;
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
    public ApplicationUser setUser(User user) {
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
ApplicationUser object = (ApplicationUser)obj;
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
