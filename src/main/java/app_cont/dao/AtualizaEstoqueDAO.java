package app_cont.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app_cont.entity.AtualizaEstoque;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app_cont-AtualizaEstoqueDAO")
@Transactional(transactionManager="app_cont-TransactionManager")
public interface AtualizaEstoqueDAO extends JpaRepository<AtualizaEstoque, java.lang.String> {

}
