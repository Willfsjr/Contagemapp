
package app.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela AUDIT_LOG
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"AUDIT_LOG\"")
@XmlRootElement
@JsonFilter("app.entity.AuditLog")
public class AuditLog implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private Integer id;


    /**
    * @generated
    */
    @Column(name = "type", nullable = false, unique = false, insertable=true, updatable=true)
        
        private String type;


    /**
    * @generated
    */
    @Column(name = "command", nullable = false, unique = false, insertable=true, updatable=true)
        
        private String command;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateCreated", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date date;


    /**
    * @generated
    */
    @Column(name = "objectData", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private String objectData;


    /**
    * @generated
    */
    @Column(name = "userName", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String user;


    /**
    * @generated
    */
    @Column(name = "host", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String host;


    /**
    * @generated
    */
    @Column(name = "agent", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String agent;


    /**
    * @generated
    */
    @Column(name = "server", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String server;


    /**
    * @generated
    */
    @Column(name = "affectedFields", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String affectedFields;


    /**
    * @generated
    */
    @Column(name = "category", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String category;


    /**
    * @generated
    */
    @Column(name = "application", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String application;


    /**
    * @generated
    */
    @Column(name = "error", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String error;


    /**
    * Construtor
    * @generated
    */
    public AuditLog(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public AuditLog setId(Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém type
    * return type
    * @generated
    */
    public String getType() {
        return this.type;
    }

    /**
    * Define type
    * @param type type
    * @generated
    */
    public AuditLog setType(String type) {
        this.type = type;
        return this;
    }
    /**
    * Obtém command
    * return command
    * @generated
    */
    public String getCommand() {
        return this.command;
    }

    /**
    * Define command
    * @param command command
    * @generated
    */
    public AuditLog setCommand(String command) {
        this.command = command;
        return this;
    }
    /**
    * Obtém date
    * return date
    * @generated
    */
    public java.util.Date getDate() {
        return this.date;
    }

    /**
    * Define date
    * @param date date
    * @generated
    */
    public AuditLog setDate(java.util.Date date) {
        this.date = date;
        return this;
    }
    /**
    * Obtém objectData
    * return objectData
    * @generated
    */
    public String getObjectData() {
        return this.objectData;
    }

    /**
    * Define objectData
    * @param objectData objectData
    * @generated
    */
    public AuditLog setObjectData(String objectData) {
        this.objectData = objectData;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public String getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public AuditLog setUser(String user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém host
    * return host
    * @generated
    */
    public String getHost() {
        return this.host;
    }

    /**
    * Define host
    * @param host host
    * @generated
    */
    public AuditLog setHost(String host) {
        this.host = host;
        return this;
    }
    /**
    * Obtém agent
    * return agent
    * @generated
    */
    public String getAgent() {
        return this.agent;
    }

    /**
    * Define agent
    * @param agent agent
    * @generated
    */
    public AuditLog setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    /**
    * Obtém server
    * return server
    * @generated
    */
    public String getServer() {
        return this.server;
    }

    /**
    * Define server
    * @param server server
    * @generated
    */
    public AuditLog setServer(String server) {
        this.server = server;
        return this;
    }
    /**
    * Obtém affectedFields
    * return affectedFields
    * @generated
    */
    public String getAffectedFields() {
        return this.affectedFields;
    }

    /**
    * Define affectedFields
    * @param affectedFields affectedFields
    * @generated
    */
    public AuditLog setAffectedFields(String affectedFields) {
        this.affectedFields = affectedFields;
        return this;
    }
    /**
    * Obtém category
    * return category
    * @generated
    */
    public String getCategory() {
        return this.category;
    }

    /**
    * Define category
    * @param category category
    * @generated
    */
    public AuditLog setCategory(String category) {
        this.category = category;
        return this;
    }
    /**
    * Obtém application
    * return application
    * @generated
    */
    public String getApplication() {
        return this.application;
    }

    /**
    * Define application
    * @param application application
    * @generated
    */
    public AuditLog setApplication(String application) {
        this.application = application;
        return this;
    }
    /**
    * Obtém error
    * return error
    * @generated
    */
    public String getError() {
        return this.error;
    }

    /**
    * Define error
    * @param error error
    * @generated
    */
    public AuditLog setError(String error) {
        this.error = error;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AuditLog object = (AuditLog)obj;
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
