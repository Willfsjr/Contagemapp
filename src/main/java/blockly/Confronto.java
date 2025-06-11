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
 * @since 11/06/2025, 17:57:57
 *
 */
public static Var confrontoEstoque(@ParamMetaData(description = "idCont", id = "5285df7e") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var prodEst = Var.VAR_NULL;
   private Var inserirB = Var.VAR_NULL;

   public Var call() throws Exception {
    prodEst =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("select \n	a \nfrom \n	AtualizaEstoque a  \nwhere \n	a.contEst = :contEst"),Var.valueOf("contEst",idCont));
    inserirB = Var.VAR_NULL;
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 11/06/2025, 17:57:57
 *
 */
public static Var encerrarContagem(@ParamMetaData(description = "idCont", id = "81c2b90d") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Contagem"), Var.valueOf("update \n	Contagem  \nset \n	fimCont = :fimCont \nwhere \n	id = :id"),Var.valueOf("fimCont",
    Var.VAR_TRUE),Var.valueOf("id",idCont));
    return
Var.valueOf(obterEstoque(idCont));
   }
 }.call();
}

/**
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 11/06/2025, 17:57:57
 *
 */
public static Var obterEstoque(@ParamMetaData(description = "idCont", id = "afe8f604") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var contObj = Var.VAR_NULL;
   private Var contLoja = Var.VAR_NULL;
   private Var contDpt = Var.VAR_NULL;
   private Var estoqueERP = Var.VAR_NULL;
   private Var inserirA = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    contObj =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",idCont));
    contLoja =
    cronapi.database.Operations.getField(contObj, Var.valueOf("this[0].lojaCont.codiLoja"));
    contDpt =
    cronapi.database.Operations.getField(contObj, Var.valueOf("this[0].depCont.codiDpt"));
    estoqueERP =
    cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.descPsv, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere NOT ( \n	e.codiEmp = :codiEmp OR \n	e.codiDpt = :codiDpt )"),Var.valueOf("codiEmp",contLoja),Var.valueOf("codiDpt",contDpt));
    try {
         while (
        cronapi.database.Operations.hasElement(estoqueERP).getObjectAsBoolean()) {
            inserirA =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.AtualizaEstoque"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(estoqueERP, Var.valueOf("this[0]"))),Var.valueOf("codiDpt",
            cronapi.database.Operations.getField(estoqueERP, Var.valueOf("this[1]"))),Var.valueOf("codiEmp",
            cronapi.database.Operations.getField(estoqueERP, Var.valueOf("this[2]"))),Var.valueOf("qteTotal",
            cronapi.database.Operations.getField(estoqueERP, Var.valueOf("this[4]"))),Var.valueOf("contEst",idCont)));
            cronapi.database.Operations.next(estoqueERP);
        } // end while
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
     }
    return
Var.valueOf(confrontoEstoque(idCont));
   }
 }.call();
}

}

