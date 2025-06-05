package app_oracle.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class TABELAPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String CODI_PSV;

  /**
   * @generated
   */
  private java.lang.Long TABE_CTA;

  /**
   * Construtor
   * @generated
   */
  public TABELAPK(){
  }

  /**
   * Obtém CODI_PSV
   * return CODI_PSV
   * @generated
   */
  public java.lang.String getCODI_PSV(){
    return this.CODI_PSV;
  }

  /**
   * Define CODI_PSV
   * @param CODI_PSV CODI_PSV
   * @generated
   */
  public TABELAPK setCODI_PSV(java.lang.String CODI_PSV){
    this.CODI_PSV = CODI_PSV;
    return this;
  }
  /**
   * Obtém TABE_CTA
   * return TABE_CTA
   * @generated
   */
  public java.lang.Long getTABE_CTA(){
    return this.TABE_CTA;
  }

  /**
   * Define TABE_CTA
   * @param TABE_CTA TABE_CTA
   * @generated
   */
  public TABELAPK setTABE_CTA(java.lang.Long TABE_CTA){
    this.TABE_CTA = TABE_CTA;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
TABELAPK object = (TABELAPK)obj;
    if (CODI_PSV != null ? !CODI_PSV.equals(object.CODI_PSV) : object.CODI_PSV != null) return false;
    if (TABE_CTA != null ? !TABE_CTA.equals(object.TABE_CTA) : object.TABE_CTA != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((CODI_PSV == null) ? 0 : CODI_PSV.hashCode());
    result = 31 * result + ((TABE_CTA == null) ? 0 : TABE_CTA.hashCode());
    return result;
  }

}
