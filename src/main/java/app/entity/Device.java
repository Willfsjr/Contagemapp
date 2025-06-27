
package app.entity;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
* Classe que representa a tabela DEVICE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"DEVICE\"")
@XmlRootElement
@JsonFilter("app.entity.Device")
public class Device implements Serializable {
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
    @Column(name = "token", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String token;


    /**
    * @generated
    */
    @Column(name = "platform", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String platform;


    /**
    * @generated
    */
    @Column(name = "model", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String model;


    /**
    * @generated
    */
    @Column(name = "platformVersion", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String platformVersion;


    /**
    * @generated
    */
    @Column(name = "appName", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String appName;


    /**
    * @generated
    */
    @Column(name = "appVersion", nullable = true, unique = false, insertable=true, updatable=true)
        
        private String appVersion;


    /**
    * Construtor
    * @generated
    */
    public Device(){
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
    public Device setId(String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém token
    * return token
    * @generated
    */
    public String getToken() {
        return this.token;
    }

    /**
    * Define token
    * @param token token
    * @generated
    */
    public Device setToken(String token) {
        this.token = token;
        return this;
    }
    /**
    * Obtém platform
    * return platform
    * @generated
    */
    public String getPlatform() {
        return this.platform;
    }

    /**
    * Define platform
    * @param platform platform
    * @generated
    */
    public Device setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    /**
    * Obtém model
    * return model
    * @generated
    */
    public String getModel() {
        return this.model;
    }

    /**
    * Define model
    * @param model model
    * @generated
    */
    public Device setModel(String model) {
        this.model = model;
        return this;
    }
    /**
    * Obtém platformVersion
    * return platformVersion
    * @generated
    */
    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
    * Define platformVersion
    * @param platformVersion platformVersion
    * @generated
    */
    public Device setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }
    /**
    * Obtém appName
    * return appName
    * @generated
    */
    public String getAppName() {
        return this.appName;
    }

    /**
    * Define appName
    * @param appName appName
    * @generated
    */
    public Device setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    /**
    * Obtém appVersion
    * return appVersion
    * @generated
    */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
    * Define appVersion
    * @param appVersion appVersion
    * @generated
    */
    public Device setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Device object = (Device)obj;
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
