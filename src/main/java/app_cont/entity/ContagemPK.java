package app_cont.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class ContagemPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String loja;

  /**
   * Construtor
   * @generated
   */
  public ContagemPK(){
  }

  /**
   * Obtém loja
   * return loja
   * @generated
   */
  public java.lang.String getLoja(){
    return this.loja;
  }

  /**
   * Define loja
   * @param loja loja
   * @generated
   */
  public ContagemPK setLoja(java.lang.String loja){
    this.loja = loja;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
ContagemPK object = (ContagemPK)obj;
    if (loja != null ? !loja.equals(object.loja) : object.loja != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((loja == null) ? 0 : loja.hashCode());
    return result;
  }

}
