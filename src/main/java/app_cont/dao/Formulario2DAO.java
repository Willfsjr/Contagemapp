package app_cont.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app_cont.entity.Formulario2;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app_cont-Formulario2DAO")
@Transactional(transactionManager="app_cont-TransactionManager")
public interface Formulario2DAO extends JpaRepository<Formulario2, java.lang.String> {

}
