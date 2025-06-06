package app_cont.dao;

import app_cont.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app_cont-Produto1DAO")
@Transactional(transactionManager="app_cont-TransactionManager")
public interface Produto1DAO extends JpaRepository<Produto1, java.lang.String> {

}
