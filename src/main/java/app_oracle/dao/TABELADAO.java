package app_oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app_oracle.entity.TABELA;
import app_oracle.entity.TABELAPK;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app_oracle-TABELADAO")
@Transactional(transactionManager="app_oracle-TransactionManager")
public interface TABELADAO extends JpaRepository<TABELA, TABELAPK> {

}
