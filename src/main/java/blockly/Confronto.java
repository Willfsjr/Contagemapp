package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Confronto {

public static final int TIMEOUT = 300;

/**
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 13/06/2025, 15:32:32
 *
 */
public static Var encerrarContagem(@ParamMetaData(description = "idCont", id = "81c2b90d") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var contador = Var.VAR_NULL;
   private Var contObj = Var.VAR_NULL;
   private Var contLoja = Var.VAR_NULL;
   private Var contDpt = Var.VAR_NULL;
   private Var estoqueERP = Var.VAR_NULL;
   private Var inserirA = Var.VAR_NULL;
   private Var codiPsvObj = Var.VAR_NULL;
   private Var codiPsv = Var.VAR_NULL;
   private Var prodEst = Var.VAR_NULL;
   private Var inserirB = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    contador =
    Var.valueOf(0);
    try {
         contObj =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c.lojaCont.codiLoja, \n	c.depCont.codiDpt \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",idCont));
        contLoja =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[0]"));
        contDpt =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[1]"));
        if (
        Var.valueOf(
        cronapi.logic.Operations.isNullOrEmpty(contLoja).getObjectAsBoolean() &&
        cronapi.logic.Operations.isNullOrEmpty(contDpt).getObjectAsBoolean()).getObjectAsBoolean()) {
            estoqueERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.qteTotal \nfrom \n	Estoquecontagem e"));
        } else {
            if (
            cronapi.logic.Operations.isNullOrEmpty(contDpt).getObjectAsBoolean()) {
                estoqueERP =
                cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere \n	e.codiEmp = :codiEmp"),Var.valueOf("codiEmp",contLoja));
            } else {
                estoqueERP =
                cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere \n	e.codiEmp = :codiEmp AND \n	e.codiDpt = :codiDpt"),Var.valueOf("codiEmp",contLoja),Var.valueOf("codiDpt",contDpt));
            }
        }
        while (
        cronapi.database.Operations.hasElement(estoqueERP).getObjectAsBoolean()) {
            inserirA =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.AtualizaEstoque"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(estoqueERP,
            Var.valueOf("this[0]"))),Var.valueOf("codiDpt",
            cronapi.database.Operations.getField(estoqueERP,
            Var.valueOf("this[1]"))),Var.valueOf("codiEmp",
            cronapi.database.Operations.getField(estoqueERP,
            Var.valueOf("this[2]"))),Var.valueOf("qteTotal",
            cronapi.database.Operations.getField(estoqueERP,
            Var.valueOf("this[3]"))),Var.valueOf("contEst",idCont)));
            cronapi.database.Operations.next(estoqueERP);
        } // end while
        codiPsvObj =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("select \n	p \nfrom \n	Produto1 p  \nwhere \n	p.contProd1 = :contProd1"),Var.valueOf("contProd1",idCont));
        while (
        cronapi.database.Operations.hasElement(codiPsvObj).getObjectAsBoolean()) {
            codiPsv =
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[0].codiProd1"));
            prodEst =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("select \n	a \nfrom \n	AtualizaEstoque a  \nwhere \n	a.contEst = :contEst AND \n	a.codiPsv = :codiPsv"),Var.valueOf("contEst",idCont),Var.valueOf("codiPsv",codiPsv));
            if (
            cronapi.logic.Operations.isNullOrEmpty(prodEst)
            .negate().getObjectAsBoolean()) {
                inserirB =
                cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Estoque"),
                cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Estoque"),Var.valueOf("codiEst",
                cronapi.database.Operations.getField(prodEst,
                Var.valueOf("this[0].codiPsv"))),Var.valueOf("codiDpt",
                cronapi.database.Operations.getField(prodEst,
                Var.valueOf("this[0].codiDpt"))),Var.valueOf("codiEmp",
                cronapi.database.Operations.getField(prodEst,
                Var.valueOf("this[0].codiEmp"))),Var.valueOf("qteTotal",
                cronapi.database.Operations.getField(prodEst,
                Var.valueOf("this[0].qteTotal"))),Var.valueOf("contEst",
                cronapi.database.Operations.getField(prodEst,
                Var.valueOf("this[0].contEst")))));
            }
            cronapi.database.Operations.close(prodEst);
            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
            cronapi.database.Operations.next(codiPsvObj);
        } // end while
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Contagem"), Var.valueOf("update \n	Contagem  \nset \n	fimCont = :fimCont \nwhere \n	id = :id"),Var.valueOf("fimCont",
        Var.VAR_TRUE),Var.valueOf("id",idCont));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("contagem"),
        Var.valueOf("true"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal71744"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf(
        Var.valueOf("Confronto Concluído com Sucesso: ").getObjectAsString() +
        contador.getObjectAsString() +
        Var.valueOf(" Produtos Confrontados").getObjectAsString()));
        cronapi.database.Operations.close(contObj);
        cronapi.database.Operations.close(estoqueERP);
        cronapi.database.Operations.close(codiPsvObj);
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.AtualizaEstoque"), Var.valueOf("delete from \n	\n	AtualizaEstoque  \nwhere \n	contEst = :contEst"),Var.valueOf("contEst",idCont));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Erro: Confronto não Realizado!"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal71744"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

