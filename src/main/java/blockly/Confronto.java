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
 * @since 17/06/2025, 14:38:38
 *
 */
public static Var encerrarContagem(@ParamMetaData(description = "idCont", id = "81c2b90d") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var contador = Var.VAR_NULL;
   private Var contObj = Var.VAR_NULL;
   private Var contLoja = Var.VAR_NULL;
   private Var contDpt = Var.VAR_NULL;
   private Var contGpr = Var.VAR_NULL;
   private Var contSbg = Var.VAR_NULL;
   private Var estoqueERP = Var.VAR_NULL;
   private Var prodAtuEstCodiPsv = Var.VAR_NULL;
   private Var prodAtuProdCodiPsv = Var.VAR_NULL;
   private Var inserirA = Var.VAR_NULL;
   private Var prodConf = Var.VAR_NULL;
   private Var inserirB = Var.VAR_NULL;
   private Var fom1ObjPsv = Var.VAR_NULL;
   private Var fomr1CodiPsv = Var.VAR_NULL;
   private Var ConfNull = Var.VAR_NULL;
   private Var inserirC = Var.VAR_NULL;
   private Var codiPsvObj = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    contador =
    Var.valueOf(0);
    try {
         contObj =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c.lojaCont.codiLoja, \n	c.depCont.codiDpt, \n	c.gprCont.codiGpr, \n	c.sbgCont.codiSbg \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",idCont));
        contLoja =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[0]"));
        contDpt =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[1]"));
        contGpr =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[2]"));
        contSbg =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[3]"));
        if (
        Var.valueOf(
        cronapi.logic.Operations.isNullOrEmpty(contLoja).getObjectAsBoolean() &&
        cronapi.logic.Operations.isNullOrEmpty(contDpt).getObjectAsBoolean()).getObjectAsBoolean()) {
            estoqueERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.descPsv, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere \n	e.qteTotal > 0"));
        } else {
            if (
            cronapi.logic.Operations.isNullOrEmpty(contDpt).getObjectAsBoolean()) {
                estoqueERP =
                cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.descPsv, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere \n	e.codiEmp = :codiEmp AND \n	e.qteTotal > 0"),Var.valueOf("codiEmp",contLoja));
            } else {
                estoqueERP =
                cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.codiPsv, \n	e.codiDpt, \n	e.codiEmp, \n	e.descPsv, \n	e.qteTotal \nfrom \n	Estoquecontagem e  \nwhere \n	e.codiEmp = :codiEmp AND \n	e.codiDpt = :codiDpt AND \n	e.qteTotal > 0"),Var.valueOf("codiEmp",contLoja),Var.valueOf("codiDpt",contDpt));
            }
        }
        while (
        cronapi.database.Operations.hasElement(estoqueERP).getObjectAsBoolean()) {
            prodAtuEstCodiPsv =
            cronapi.database.Operations.getField(estoqueERP,
            Var.valueOf("this[0]"));
            prodAtuProdCodiPsv =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a.codiPsv \nfrom \n	AtualizaProduto a  \nwhere \n	a.codiPsv = :codiPsv AND \n	a.contAtuProd = :contAtuProd"),Var.valueOf("codiPsv",prodAtuEstCodiPsv),Var.valueOf("contAtuProd",idCont));
            if (
            cronapi.logic.Operations.isNullOrEmpty(prodAtuProdCodiPsv)
            .negate().getObjectAsBoolean()) {
                inserirA =
                cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.AtualizaEstoque"),
                cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("codiPsv",
                cronapi.database.Operations.getField(estoqueERP,
                Var.valueOf("this[0]"))),Var.valueOf("descPsv",
                cronapi.database.Operations.getField(estoqueERP,
                Var.valueOf("this[3]"))),Var.valueOf("codiDpt",
                cronapi.database.Operations.getField(estoqueERP,
                Var.valueOf("this[1]"))),Var.valueOf("codiEmp",
                cronapi.database.Operations.getField(estoqueERP,
                Var.valueOf("this[2]"))),Var.valueOf("qteTotal",
                cronapi.database.Operations.getField(estoqueERP,
                Var.valueOf("this[4]"))),Var.valueOf("contEst",idCont)));
            }
            cronapi.database.Operations.next(estoqueERP);
        } // end while
        prodConf =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaEstoque"),Var.valueOf("select \n	a.codiPsv, \n	a.qteTotal \nfrom \n	AtualizaEstoque a  \nwhere \n	a.contEst = :contEst"),Var.valueOf("contEst",idCont));
        while (
        cronapi.database.Operations.hasElement(prodConf).getObjectAsBoolean()) {
            inserirB =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Confronto"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(prodConf,
            Var.valueOf("this[0]"))),Var.valueOf("qteTotal",
            cronapi.database.Operations.getField(prodConf,
            Var.valueOf("this[1]"))),Var.valueOf("contConf",idCont)));
            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
            cronapi.database.Operations.next(prodConf);
        } // end while
        fom1ObjPsv =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.prodForm1.codiProd1, \n	f.quantForm1 \nfrom \n	Formulario1 f  \nwhere \n	f.contForm1 = :contForm1"),Var.valueOf("contForm1",idCont));
        while (
        cronapi.database.Operations.hasElement(fom1ObjPsv).getObjectAsBoolean()) {
            fomr1CodiPsv =
            cronapi.database.Operations.getField(fom1ObjPsv,
            Var.valueOf("this[0]"));
            ConfNull =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("select \n	c.id \nfrom \n	Confronto c  \nwhere \n	c.codiPsv = :codiPsv AND \n	c.contConf = :contConf"),Var.valueOf("codiPsv",fomr1CodiPsv),Var.valueOf("contConf",idCont));
            if (
            cronapi.logic.Operations.isNullOrEmpty(ConfNull).getObjectAsBoolean()) {
                inserirC =
                cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Confronto"),
                cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("codiPsv",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[0]"))),Var.valueOf("contConf",idCont),Var.valueOf("quantConf",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[1]")))));
                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } else {
                cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Confronto"), Var.valueOf("update \n	Confronto  \nset \n	quantConf = :quantConf \nwhere \n	codiPsv = :codiPsv AND \n	contConf = :contConf"),Var.valueOf("quantConf",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[1]"))),Var.valueOf("codiPsv",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[0]"))),Var.valueOf("contConf",idCont));
            }
            cronapi.database.Operations.next(fom1ObjPsv);
        } // end while
        if (
        Var.valueOf(
        cronapi.logic.Operations.isNullOrEmpty(contGpr).getObjectAsBoolean() &&
        cronapi.logic.Operations.isNullOrEmpty(contSbg).getObjectAsBoolean()).getObjectAsBoolean()) {
          {}
        } else {
            if (
            cronapi.logic.Operations.isNullOrEmpty(contSbg).getObjectAsBoolean()) {
                codiPsvObj =
                cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a.codiPsv, \n	a.descPsv, \n	a.codiGpr, \n	a.contAtuProd.gprCont.descGpr, \n	a.codiSbg, \n	a.contAtuProd.sbgCont.descSbg, \n	a.custTab \nfrom \n	AtualizaProduto a  \nwhere \n	a.codiGpr = :codiGpr AND \n	a.contAtuProd = :contAtuProd"),Var.valueOf("codiGpr",contGpr),Var.valueOf("contAtuProd",idCont));
            } else {
                codiPsvObj =
                cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a.codiPsv, \n	a.descPsv, \n	a.codiGpr, \n	a.contAtuProd.gprCont.descGpr, \n	a.codiSbg, \n	a.contAtuProd.sbgCont.descSbg, \n	a.custTab \nfrom \n	AtualizaProduto a  \nwhere \n	a.codiGpr = :codiGpr AND \n	a.codiSbg = :codiSbg AND \n	a.contAtuProd = :contAtuProd"),Var.valueOf("codiGpr",contGpr),Var.valueOf("codiSbg",contSbg),Var.valueOf("contAtuProd",idCont));
            }
        }
        codiPsvObj =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a.codiPsv, \n	a.descPsv, \n	a.codiGpr, \n	a.descGpr, \n	a.codiSbg, \n	a.descSbg, \n	a.custTab \nfrom \n	AtualizaProduto a  \nwhere \n	a.contAtuProd = :contAtuProd"),Var.valueOf("contAtuProd",idCont));
        while (
        cronapi.database.Operations.hasElement(codiPsvObj).getObjectAsBoolean()) {
            cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Confronto"), Var.valueOf("update \n	Confronto  \nset \n	descPsv = :descPsv, \n	codiGpr = :codiGpr, \n	descGpr = :descGpr, \n	codiSbg = :codiSbg, \n	descSgb = :descSgb, \n	custTab = :custTab \nwhere \n	codiPsv = :codiPsv AND \n	contConf = :contConf"),Var.valueOf("descPsv",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[1]"))),Var.valueOf("codiGpr",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[2]"))),Var.valueOf("descGpr",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[3]"))),Var.valueOf("codiSbg",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[4]"))),Var.valueOf("descSgb",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[5]"))),Var.valueOf("custTab",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[6]"))),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(codiPsvObj,
            Var.valueOf("this[0]"))),Var.valueOf("contConf",idCont));
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

