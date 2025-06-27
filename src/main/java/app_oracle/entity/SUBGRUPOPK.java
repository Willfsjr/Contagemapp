package app_oracle.entity;

import java.io.Serializable;



/**
* @generated
*
**/
public class SUBGRUPOPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private Integer CODI_GPR;

  /**
   * @generated
   */
  private Integer CODI_SBG;

  /**
   * Construtor
   * @generated
   */
  public SUBGRUPOPK(){
  }

  /**
   * Obtém CODI_GPR
   * return CODI_GPR
   * @generated
   */
  public Integer getCODI_GPR(){
    return this.CODI_GPR;
  }

  /**
   * Define CODI_GPR
   * @param CODI_GPR CODI_GPR
   * @generated
   */
  public SUBGRUPOPK setCODI_GPR(Integer CODI_GPR){
    this.CODI_GPR = CODI_GPR;
    return this;
  }
  /**
   * Obtém CODI_SBG
   * return CODI_SBG
   * @generated
   */
  public Integer getCODI_SBG(){
    return this.CODI_SBG;
  }

  /**
   * Define CODI_SBG
   * @param CODI_SBG CODI_SBG
   * @generated
   */
  public SUBGRUPOPK setCODI_SBG(Integer CODI_SBG){
    this.CODI_SBG = CODI_SBG;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
SUBGRUPOPK object = (SUBGRUPOPK)obj;
    if (CODI_GPR != null ? !CODI_GPR.equals(object.CODI_GPR) : object.CODI_GPR != null) return false;
    if (CODI_SBG != null ? !CODI_SBG.equals(object.CODI_SBG) : object.CODI_SBG != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((CODI_GPR == null) ? 0 : CODI_GPR.hashCode());
    result = 31 * result + ((CODI_SBG == null) ? 0 : CODI_SBG.hashCode());
    return result;
  }

}
