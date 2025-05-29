package app_cont.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class ProdutoPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private ContagemPK contagem;

  /**
   * Construtor
   * @generated
   */
  public ProdutoPK(){
  }

  /**
   * Obtém contagem
   * return contagem
   * @generated
   */
  public ContagemPK getContagem(){
    return this.contagem;
  }

  /**
   * Define contagem
   * @param contagem contagem
   * @generated
   */
  public ProdutoPK setContagem(ContagemPK contagem){
    this.contagem = contagem;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
ProdutoPK object = (ProdutoPK)obj;
    if (contagem != null ? !contagem.equals(object.contagem) : object.contagem != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((contagem == null) ? 0 : contagem.hashCode());
    return result;
  }

}
