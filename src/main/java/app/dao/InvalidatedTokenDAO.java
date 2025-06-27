package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.entity.InvalidatedToken;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app-InvalidatedTokenDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface InvalidatedTokenDAO extends JpaRepository<InvalidatedToken, java.lang.String> {

}
