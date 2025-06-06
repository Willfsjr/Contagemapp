package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Formulario1 {

public static final int TIMEOUT = 300;

/**
 *
 * @param codiProd1
 *
 * @author Willian Ferreira
 * @since 06/06/2025, 17:23:13
 *
 */
public static Var excluir(@ParamMetaData(description = "codiProd1", id = "b6d76f15") @RequestBody(required = false) Var codiProd1) throws Exception {
 return new Callable<Var>() {

   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Estoque"), Var.valueOf("delete from \n	\n	Estoque  \nwhere \n	codiEst = :codiEst"),Var.valueOf("codiEst",codiProd1));
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("delete from \n	\n	Formulario1  \nwhere \n	prodForm1.codiProd = :codiProd"),Var.valueOf("codiProd",codiProd1));
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto1"), Var.valueOf("delete from \n	\n	Produto1  \nwhere \n	codiProd1 = :codiProd1"),Var.valueOf("codiProd1",codiProd1));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Excluído"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("OrdenarProdutoDo1FormularioPelaData"),
        Var.valueOf("true"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("ProdutoParaO1Formulario"),
        Var.valueOf("true"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("form1"),
        Var.valueOf("true"));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param contIdForm1
 *
 * @author Willian Ferreira
 * @since 06/06/2025, 17:23:13
 *
 */
public static Var gravar(@ParamMetaData(description = "contIdForm1", id = "768650b8") @RequestBody(required = false) Var contIdForm1) throws Exception {
 return new Callable<Var>() {

   private Var quantForm1 = Var.VAR_NULL;
   private Var codiPsv1 = Var.VAR_NULL;
   private Var prodObj1 = Var.VAR_NULL;
   private Var contObj1 = Var.VAR_NULL;
   private Var inserir1 = Var.VAR_NULL;
   private Var prodForm1 = Var.VAR_NULL;

   public Var call() throws Exception {
    quantForm1 =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form1.active.quantForm1"));
    codiPsv1 =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form1.active.prodForm1"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("select \n	p \nfrom \n	Produto1 p  \nwhere \n	p.codiProd1 = :codiProd1 AND \n	p.contProd1 = :contProd1"),Var.valueOf("codiProd1",codiPsv1),Var.valueOf("contProd1",contIdForm1))).getObjectAsBoolean()) {
        prodObj1 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a \nfrom \n	AtualizaProduto a  \nwhere \n	a.codiPsv = :codiPsv"),Var.valueOf("codiPsv",codiPsv1));
        contObj1 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c.id \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",contIdForm1));
        inserir1 =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto1"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("codiProd1",
        cronapi.database.Operations.getField(prodObj1, Var.valueOf("this[0].codiPsv"))),Var.valueOf("descProd1",
        cronapi.database.Operations.getField(prodObj1, Var.valueOf("this[0].descPsv"))),Var.valueOf("codiBar1",
        cronapi.database.Operations.getField(prodObj1, Var.valueOf("this[0].codiBar"))),Var.valueOf("custTab1",
        cronapi.database.Operations.getField(prodObj1, Var.valueOf("this[0].custTab"))),Var.valueOf("gprProd1",
        cronapi.database.Operations.getField(contObj1, Var.valueOf("this[0].gprCont"))),Var.valueOf("sbgProd1",
        cronapi.database.Operations.getField(contObj1, Var.valueOf("this[0].sbgCont"))),Var.valueOf("contProd1",
        cronapi.database.Operations.getField(contObj1, Var.valueOf("this[0].id")))));
    }
    prodForm1 =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.prodForm1 \nfrom \n	Formulario1 f  \nwhere \n	f.prodForm1.codiProd1 = :prodForm1CodiProd1 AND \n	f.prodForm1.contProd1 = :prodForm1ContProd1"),Var.valueOf("prodForm1CodiProd1",codiPsv1),Var.valueOf("prodForm1ContProd1",contIdForm1));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.prodForm1 \nfrom \n	Formulario1 f  \nwhere \n	f.prodForm1 = :prodForm1 AND \n	f.contForm1 = :contForm1"),Var.valueOf("prodForm1",prodForm1),Var.valueOf("contForm1",contIdForm1))).getObjectAsBoolean()) {
        inserir1 =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario1"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("quantForm1",quantForm1),Var.valueOf("dataForm1",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("prodForm1",prodForm1),Var.valueOf("contForm1",contIdForm1)));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Inserido"));
    } else {
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("update \n	Formulario1  \nset \n	quantForm1 = :quantForm1, \n	dataForm1 = :dataForm1 \nwhere \n	prodForm1 = :prodForm1 AND \n	contForm1 = :contForm1"),Var.valueOf("quantForm1",quantForm1),Var.valueOf("dataForm1",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("prodForm1",prodForm1),Var.valueOf("contForm1",contIdForm1));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Atualizado"));
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("form1"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("OrdenarProdutoDo1FormularioPelaData"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ProdutoParaO1Formulario"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.backNormalState"),
    Var.valueOf("form1"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

