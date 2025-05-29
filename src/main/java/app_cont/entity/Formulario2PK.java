package app_cont.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;


/**
* @generated
*
**/
public class Formulario2PK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private ProdutoPK produto;

  /**
   * Construtor
   * @generated
   */
  public Formulario2PK(){
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  public ProdutoPK getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public Formulario2PK setProduto(ProdutoPK produto){
    this.produto = produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
Formulario2PK object = (Formulario2PK)obj;
    if (produto != null ? !produto.equals(object.produto) : object.produto != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((produto == null) ? 0 : produto.hashCode());
    return result;
  }

}
