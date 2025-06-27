package app_oracle.entity;

import java.io.Serializable;



/**
* @generated
*
**/
public class CODBARRAPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private String CODI_BAR;

  /**
   * @generated
   */
  private String CODI_PSV;

  /**
   * Construtor
   * @generated
   */
  public CODBARRAPK(){
  }

  /**
   * Obtém CODI_BAR
   * return CODI_BAR
   * @generated
   */
  public String getCODI_BAR(){
    return this.CODI_BAR;
  }

  /**
   * Define CODI_BAR
   * @param CODI_BAR CODI_BAR
   * @generated
   */
  public CODBARRAPK setCODI_BAR(String CODI_BAR){
    this.CODI_BAR = CODI_BAR;
    return this;
  }
  /**
   * Obtém CODI_PSV
   * return CODI_PSV
   * @generated
   */
  public String getCODI_PSV(){
    return this.CODI_PSV;
  }

  /**
   * Define CODI_PSV
   * @param CODI_PSV CODI_PSV
   * @generated
   */
  public CODBARRAPK setCODI_PSV(String CODI_PSV){
    this.CODI_PSV = CODI_PSV;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
CODBARRAPK object = (CODBARRAPK)obj;
    if (CODI_BAR != null ? !CODI_BAR.equals(object.CODI_BAR) : object.CODI_BAR != null) return false;
    if (CODI_PSV != null ? !CODI_PSV.equals(object.CODI_PSV) : object.CODI_PSV != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((CODI_BAR == null) ? 0 : CODI_BAR.hashCode());
    result = 31 * result + ((CODI_PSV == null) ? 0 : CODI_PSV.hashCode());
    return result;
  }

}
