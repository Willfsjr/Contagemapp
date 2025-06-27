package app_oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app_oracle.entity.TOAD_PLAN_TABLE;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app_oracle-TOAD_PLAN_TABLEDAO")
@Transactional(transactionManager="app_oracle-TransactionManager")
public interface TOAD_PLAN_TABLEDAO extends JpaRepository<TOAD_PLAN_TABLE, java.lang.String> {

}
