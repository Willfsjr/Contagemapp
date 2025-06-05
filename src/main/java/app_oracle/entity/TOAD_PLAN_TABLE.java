
package app_oracle.entity;

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
* Classe que representa a tabela TOAD_PLAN_TABLE
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"TOAD_PLAN_TABLE\"", schema="\"NEWFRD\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app_oracle.entity.TOAD_PLAN_TABLE")
@CronappTable(role=CronappTableRole.AUTO)
public class TOAD_PLAN_TABLE implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="STATEMENT  ID")
    @Column(name = "STATEMENT_ID", nullable = false, length=30, insertable=true, updatable=true)
        private java.lang.String STATEMENT_ID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ACCESS  PREDICATES")
    @Column(name = "ACCESS_PREDICATES", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String ACCESS_PREDICATES;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="BYTES")
    @Column(name = "BYTES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long BYTES;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CARDINALITY")
    @Column(name = "CARDINALITY", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CARDINALITY;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="COST")
    @Column(name = "COST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long COST;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="CPU  COST")
    @Column(name = "CPU_COST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long CPU_COST;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="DEPTH")
    @Column(name = "DEPTH", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long DEPTH;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="DISTRIBUTION")
    @Column(name = "DISTRIBUTION", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String DISTRIBUTION;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="FILTER  PREDICATES")
    @Column(name = "FILTER_PREDICATES", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String FILTER_PREDICATES;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="ID")
    @Column(name = "ID", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long ID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="IO  COST")
    @Column(name = "IO_COST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long IO_COST;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBJECT  ALIAS")
    @Column(name = "OBJECT_ALIAS", nullable = true, unique = false, length=65, insertable=true, updatable=true)
        
        private java.lang.String OBJECT_ALIAS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="OBJECT  INSTANCE")
    @Column(name = "OBJECT_INSTANCE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long OBJECT_INSTANCE;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBJECT  NAME")
    @Column(name = "OBJECT_NAME", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String OBJECT_NAME;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBJECT  NODE")
    @Column(name = "OBJECT_NODE", nullable = true, unique = false, length=128, insertable=true, updatable=true)
        
        private java.lang.String OBJECT_NODE;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBJECT  OWNER")
    @Column(name = "OBJECT_OWNER", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String OBJECT_OWNER;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OBJECT  TYPE")
    @Column(name = "OBJECT_TYPE", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String OBJECT_TYPE;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OPERATION")
    @Column(name = "OPERATION", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String OPERATION;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OPTIMIZER")
    @Column(name = "OPTIMIZER", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String OPTIMIZER;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OPTIONS")
    @Column(name = "OPTIONS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String OPTIONS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OTHER")
    @Column(name = "OTHER", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String OTHER;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OTHER  TAG")
    @Column(name = "OTHER_TAG", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String OTHER_TAG;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="OTHER  XML")
    @Column(name = "OTHER_XML", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String OTHER_XML;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="PARENT  ID")
    @Column(name = "PARENT_ID", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long PARENT_ID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="PARTITION  ID")
    @Column(name = "PARTITION_ID", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long PARTITION_ID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PARTITION  START")
    @Column(name = "PARTITION_START", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String PARTITION_START;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PARTITION  STOP")
    @Column(name = "PARTITION_STOP", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String PARTITION_STOP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="PLAN  ID")
    @Column(name = "PLAN_ID", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double PLAN_ID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="POSITION")
    @Column(name = "POSITION", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long POSITION;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="PROJECTION")
    @Column(name = "PROJECTION", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String PROJECTION;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="QBLOCK  NAME")
    @Column(name = "QBLOCK_NAME", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String QBLOCK_NAME;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="REMARKS")
    @Column(name = "REMARKS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
        
        private java.lang.String REMARKS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="SEARCH  COLUMNS")
    @Column(name = "SEARCH_COLUMNS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double SEARCH_COLUMNS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="TEMP  SPACE")
    @Column(name = "TEMP_SPACE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long TEMP_SPACE;


    /**
    * @generated
    */
    @CronappColumn(attributeType="LONG", label="TIME")
    @Column(name = "TIME", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Long TIME;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="TIMESTAMP")
    @Column(name = "TIMESTAMP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date TIMESTAMP;


    /**
    * Construtor
    * @generated
    */
    public TOAD_PLAN_TABLE(){
    }

    /**
    * Obtém STATEMENT_ID
    * return STATEMENT_ID
    * @generated
    */
    public java.lang.String getSTATEMENT_ID() {
        return this.STATEMENT_ID;
    }

    /**
    * Define STATEMENT_ID
    * @param STATEMENT_ID STATEMENT_ID
    * @generated
    */
    public TOAD_PLAN_TABLE setSTATEMENT_ID(java.lang.String STATEMENT_ID) {
        this.STATEMENT_ID = STATEMENT_ID;
        return this;
    }
    /**
    * Obtém ACCESS_PREDICATES
    * return ACCESS_PREDICATES
    * @generated
    */
    public java.lang.String getACCESS_PREDICATES() {
        return this.ACCESS_PREDICATES;
    }

    /**
    * Define ACCESS_PREDICATES
    * @param ACCESS_PREDICATES ACCESS_PREDICATES
    * @generated
    */
    public TOAD_PLAN_TABLE setACCESS_PREDICATES(java.lang.String ACCESS_PREDICATES) {
        this.ACCESS_PREDICATES = ACCESS_PREDICATES;
        return this;
    }
    /**
    * Obtém BYTES
    * return BYTES
    * @generated
    */
    public java.lang.Long getBYTES() {
        return this.BYTES;
    }

    /**
    * Define BYTES
    * @param BYTES BYTES
    * @generated
    */
    public TOAD_PLAN_TABLE setBYTES(java.lang.Long BYTES) {
        this.BYTES = BYTES;
        return this;
    }
    /**
    * Obtém CARDINALITY
    * return CARDINALITY
    * @generated
    */
    public java.lang.Long getCARDINALITY() {
        return this.CARDINALITY;
    }

    /**
    * Define CARDINALITY
    * @param CARDINALITY CARDINALITY
    * @generated
    */
    public TOAD_PLAN_TABLE setCARDINALITY(java.lang.Long CARDINALITY) {
        this.CARDINALITY = CARDINALITY;
        return this;
    }
    /**
    * Obtém COST
    * return COST
    * @generated
    */
    public java.lang.Long getCOST() {
        return this.COST;
    }

    /**
    * Define COST
    * @param COST COST
    * @generated
    */
    public TOAD_PLAN_TABLE setCOST(java.lang.Long COST) {
        this.COST = COST;
        return this;
    }
    /**
    * Obtém CPU_COST
    * return CPU_COST
    * @generated
    */
    public java.lang.Long getCPU_COST() {
        return this.CPU_COST;
    }

    /**
    * Define CPU_COST
    * @param CPU_COST CPU_COST
    * @generated
    */
    public TOAD_PLAN_TABLE setCPU_COST(java.lang.Long CPU_COST) {
        this.CPU_COST = CPU_COST;
        return this;
    }
    /**
    * Obtém DEPTH
    * return DEPTH
    * @generated
    */
    public java.lang.Long getDEPTH() {
        return this.DEPTH;
    }

    /**
    * Define DEPTH
    * @param DEPTH DEPTH
    * @generated
    */
    public TOAD_PLAN_TABLE setDEPTH(java.lang.Long DEPTH) {
        this.DEPTH = DEPTH;
        return this;
    }
    /**
    * Obtém DISTRIBUTION
    * return DISTRIBUTION
    * @generated
    */
    public java.lang.String getDISTRIBUTION() {
        return this.DISTRIBUTION;
    }

    /**
    * Define DISTRIBUTION
    * @param DISTRIBUTION DISTRIBUTION
    * @generated
    */
    public TOAD_PLAN_TABLE setDISTRIBUTION(java.lang.String DISTRIBUTION) {
        this.DISTRIBUTION = DISTRIBUTION;
        return this;
    }
    /**
    * Obtém FILTER_PREDICATES
    * return FILTER_PREDICATES
    * @generated
    */
    public java.lang.String getFILTER_PREDICATES() {
        return this.FILTER_PREDICATES;
    }

    /**
    * Define FILTER_PREDICATES
    * @param FILTER_PREDICATES FILTER_PREDICATES
    * @generated
    */
    public TOAD_PLAN_TABLE setFILTER_PREDICATES(java.lang.String FILTER_PREDICATES) {
        this.FILTER_PREDICATES = FILTER_PREDICATES;
        return this;
    }
    /**
    * Obtém ID
    * return ID
    * @generated
    */
    public java.lang.Long getID() {
        return this.ID;
    }

    /**
    * Define ID
    * @param ID ID
    * @generated
    */
    public TOAD_PLAN_TABLE setID(java.lang.Long ID) {
        this.ID = ID;
        return this;
    }
    /**
    * Obtém IO_COST
    * return IO_COST
    * @generated
    */
    public java.lang.Long getIO_COST() {
        return this.IO_COST;
    }

    /**
    * Define IO_COST
    * @param IO_COST IO_COST
    * @generated
    */
    public TOAD_PLAN_TABLE setIO_COST(java.lang.Long IO_COST) {
        this.IO_COST = IO_COST;
        return this;
    }
    /**
    * Obtém OBJECT_ALIAS
    * return OBJECT_ALIAS
    * @generated
    */
    public java.lang.String getOBJECT_ALIAS() {
        return this.OBJECT_ALIAS;
    }

    /**
    * Define OBJECT_ALIAS
    * @param OBJECT_ALIAS OBJECT_ALIAS
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_ALIAS(java.lang.String OBJECT_ALIAS) {
        this.OBJECT_ALIAS = OBJECT_ALIAS;
        return this;
    }
    /**
    * Obtém OBJECT_INSTANCE
    * return OBJECT_INSTANCE
    * @generated
    */
    public java.lang.Long getOBJECT_INSTANCE() {
        return this.OBJECT_INSTANCE;
    }

    /**
    * Define OBJECT_INSTANCE
    * @param OBJECT_INSTANCE OBJECT_INSTANCE
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_INSTANCE(java.lang.Long OBJECT_INSTANCE) {
        this.OBJECT_INSTANCE = OBJECT_INSTANCE;
        return this;
    }
    /**
    * Obtém OBJECT_NAME
    * return OBJECT_NAME
    * @generated
    */
    public java.lang.String getOBJECT_NAME() {
        return this.OBJECT_NAME;
    }

    /**
    * Define OBJECT_NAME
    * @param OBJECT_NAME OBJECT_NAME
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_NAME(java.lang.String OBJECT_NAME) {
        this.OBJECT_NAME = OBJECT_NAME;
        return this;
    }
    /**
    * Obtém OBJECT_NODE
    * return OBJECT_NODE
    * @generated
    */
    public java.lang.String getOBJECT_NODE() {
        return this.OBJECT_NODE;
    }

    /**
    * Define OBJECT_NODE
    * @param OBJECT_NODE OBJECT_NODE
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_NODE(java.lang.String OBJECT_NODE) {
        this.OBJECT_NODE = OBJECT_NODE;
        return this;
    }
    /**
    * Obtém OBJECT_OWNER
    * return OBJECT_OWNER
    * @generated
    */
    public java.lang.String getOBJECT_OWNER() {
        return this.OBJECT_OWNER;
    }

    /**
    * Define OBJECT_OWNER
    * @param OBJECT_OWNER OBJECT_OWNER
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_OWNER(java.lang.String OBJECT_OWNER) {
        this.OBJECT_OWNER = OBJECT_OWNER;
        return this;
    }
    /**
    * Obtém OBJECT_TYPE
    * return OBJECT_TYPE
    * @generated
    */
    public java.lang.String getOBJECT_TYPE() {
        return this.OBJECT_TYPE;
    }

    /**
    * Define OBJECT_TYPE
    * @param OBJECT_TYPE OBJECT_TYPE
    * @generated
    */
    public TOAD_PLAN_TABLE setOBJECT_TYPE(java.lang.String OBJECT_TYPE) {
        this.OBJECT_TYPE = OBJECT_TYPE;
        return this;
    }
    /**
    * Obtém OPERATION
    * return OPERATION
    * @generated
    */
    public java.lang.String getOPERATION() {
        return this.OPERATION;
    }

    /**
    * Define OPERATION
    * @param OPERATION OPERATION
    * @generated
    */
    public TOAD_PLAN_TABLE setOPERATION(java.lang.String OPERATION) {
        this.OPERATION = OPERATION;
        return this;
    }
    /**
    * Obtém OPTIMIZER
    * return OPTIMIZER
    * @generated
    */
    public java.lang.String getOPTIMIZER() {
        return this.OPTIMIZER;
    }

    /**
    * Define OPTIMIZER
    * @param OPTIMIZER OPTIMIZER
    * @generated
    */
    public TOAD_PLAN_TABLE setOPTIMIZER(java.lang.String OPTIMIZER) {
        this.OPTIMIZER = OPTIMIZER;
        return this;
    }
    /**
    * Obtém OPTIONS
    * return OPTIONS
    * @generated
    */
    public java.lang.String getOPTIONS() {
        return this.OPTIONS;
    }

    /**
    * Define OPTIONS
    * @param OPTIONS OPTIONS
    * @generated
    */
    public TOAD_PLAN_TABLE setOPTIONS(java.lang.String OPTIONS) {
        this.OPTIONS = OPTIONS;
        return this;
    }
    /**
    * Obtém OTHER
    * return OTHER
    * @generated
    */
    public java.lang.String getOTHER() {
        return this.OTHER;
    }

    /**
    * Define OTHER
    * @param OTHER OTHER
    * @generated
    */
    public TOAD_PLAN_TABLE setOTHER(java.lang.String OTHER) {
        this.OTHER = OTHER;
        return this;
    }
    /**
    * Obtém OTHER_TAG
    * return OTHER_TAG
    * @generated
    */
    public java.lang.String getOTHER_TAG() {
        return this.OTHER_TAG;
    }

    /**
    * Define OTHER_TAG
    * @param OTHER_TAG OTHER_TAG
    * @generated
    */
    public TOAD_PLAN_TABLE setOTHER_TAG(java.lang.String OTHER_TAG) {
        this.OTHER_TAG = OTHER_TAG;
        return this;
    }
    /**
    * Obtém OTHER_XML
    * return OTHER_XML
    * @generated
    */
    public java.lang.String getOTHER_XML() {
        return this.OTHER_XML;
    }

    /**
    * Define OTHER_XML
    * @param OTHER_XML OTHER_XML
    * @generated
    */
    public TOAD_PLAN_TABLE setOTHER_XML(java.lang.String OTHER_XML) {
        this.OTHER_XML = OTHER_XML;
        return this;
    }
    /**
    * Obtém PARENT_ID
    * return PARENT_ID
    * @generated
    */
    public java.lang.Long getPARENT_ID() {
        return this.PARENT_ID;
    }

    /**
    * Define PARENT_ID
    * @param PARENT_ID PARENT_ID
    * @generated
    */
    public TOAD_PLAN_TABLE setPARENT_ID(java.lang.Long PARENT_ID) {
        this.PARENT_ID = PARENT_ID;
        return this;
    }
    /**
    * Obtém PARTITION_ID
    * return PARTITION_ID
    * @generated
    */
    public java.lang.Long getPARTITION_ID() {
        return this.PARTITION_ID;
    }

    /**
    * Define PARTITION_ID
    * @param PARTITION_ID PARTITION_ID
    * @generated
    */
    public TOAD_PLAN_TABLE setPARTITION_ID(java.lang.Long PARTITION_ID) {
        this.PARTITION_ID = PARTITION_ID;
        return this;
    }
    /**
    * Obtém PARTITION_START
    * return PARTITION_START
    * @generated
    */
    public java.lang.String getPARTITION_START() {
        return this.PARTITION_START;
    }

    /**
    * Define PARTITION_START
    * @param PARTITION_START PARTITION_START
    * @generated
    */
    public TOAD_PLAN_TABLE setPARTITION_START(java.lang.String PARTITION_START) {
        this.PARTITION_START = PARTITION_START;
        return this;
    }
    /**
    * Obtém PARTITION_STOP
    * return PARTITION_STOP
    * @generated
    */
    public java.lang.String getPARTITION_STOP() {
        return this.PARTITION_STOP;
    }

    /**
    * Define PARTITION_STOP
    * @param PARTITION_STOP PARTITION_STOP
    * @generated
    */
    public TOAD_PLAN_TABLE setPARTITION_STOP(java.lang.String PARTITION_STOP) {
        this.PARTITION_STOP = PARTITION_STOP;
        return this;
    }
    /**
    * Obtém PLAN_ID
    * return PLAN_ID
    * @generated
    */
    public java.lang.Double getPLAN_ID() {
        return this.PLAN_ID;
    }

    /**
    * Define PLAN_ID
    * @param PLAN_ID PLAN_ID
    * @generated
    */
    public TOAD_PLAN_TABLE setPLAN_ID(java.lang.Double PLAN_ID) {
        this.PLAN_ID = PLAN_ID;
        return this;
    }
    /**
    * Obtém POSITION
    * return POSITION
    * @generated
    */
    public java.lang.Long getPOSITION() {
        return this.POSITION;
    }

    /**
    * Define POSITION
    * @param POSITION POSITION
    * @generated
    */
    public TOAD_PLAN_TABLE setPOSITION(java.lang.Long POSITION) {
        this.POSITION = POSITION;
        return this;
    }
    /**
    * Obtém PROJECTION
    * return PROJECTION
    * @generated
    */
    public java.lang.String getPROJECTION() {
        return this.PROJECTION;
    }

    /**
    * Define PROJECTION
    * @param PROJECTION PROJECTION
    * @generated
    */
    public TOAD_PLAN_TABLE setPROJECTION(java.lang.String PROJECTION) {
        this.PROJECTION = PROJECTION;
        return this;
    }
    /**
    * Obtém QBLOCK_NAME
    * return QBLOCK_NAME
    * @generated
    */
    public java.lang.String getQBLOCK_NAME() {
        return this.QBLOCK_NAME;
    }

    /**
    * Define QBLOCK_NAME
    * @param QBLOCK_NAME QBLOCK_NAME
    * @generated
    */
    public TOAD_PLAN_TABLE setQBLOCK_NAME(java.lang.String QBLOCK_NAME) {
        this.QBLOCK_NAME = QBLOCK_NAME;
        return this;
    }
    /**
    * Obtém REMARKS
    * return REMARKS
    * @generated
    */
    public java.lang.String getREMARKS() {
        return this.REMARKS;
    }

    /**
    * Define REMARKS
    * @param REMARKS REMARKS
    * @generated
    */
    public TOAD_PLAN_TABLE setREMARKS(java.lang.String REMARKS) {
        this.REMARKS = REMARKS;
        return this;
    }
    /**
    * Obtém SEARCH_COLUMNS
    * return SEARCH_COLUMNS
    * @generated
    */
    public java.lang.Double getSEARCH_COLUMNS() {
        return this.SEARCH_COLUMNS;
    }

    /**
    * Define SEARCH_COLUMNS
    * @param SEARCH_COLUMNS SEARCH_COLUMNS
    * @generated
    */
    public TOAD_PLAN_TABLE setSEARCH_COLUMNS(java.lang.Double SEARCH_COLUMNS) {
        this.SEARCH_COLUMNS = SEARCH_COLUMNS;
        return this;
    }
    /**
    * Obtém TEMP_SPACE
    * return TEMP_SPACE
    * @generated
    */
    public java.lang.Long getTEMP_SPACE() {
        return this.TEMP_SPACE;
    }

    /**
    * Define TEMP_SPACE
    * @param TEMP_SPACE TEMP_SPACE
    * @generated
    */
    public TOAD_PLAN_TABLE setTEMP_SPACE(java.lang.Long TEMP_SPACE) {
        this.TEMP_SPACE = TEMP_SPACE;
        return this;
    }
    /**
    * Obtém TIME
    * return TIME
    * @generated
    */
    public java.lang.Long getTIME() {
        return this.TIME;
    }

    /**
    * Define TIME
    * @param TIME TIME
    * @generated
    */
    public TOAD_PLAN_TABLE setTIME(java.lang.Long TIME) {
        this.TIME = TIME;
        return this;
    }
    /**
    * Obtém TIMESTAMP
    * return TIMESTAMP
    * @generated
    */
    public java.util.Date getTIMESTAMP() {
        return this.TIMESTAMP;
    }

    /**
    * Define TIMESTAMP
    * @param TIMESTAMP TIMESTAMP
    * @generated
    */
    public TOAD_PLAN_TABLE setTIMESTAMP(java.util.Date TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TOAD_PLAN_TABLE object = (TOAD_PLAN_TABLE)obj;
        if (STATEMENT_ID != null ? !STATEMENT_ID.equals(object.STATEMENT_ID) : object.STATEMENT_ID != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((STATEMENT_ID == null) ? 0 : STATEMENT_ID.hashCode());
        return result;
    }

}
