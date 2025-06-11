package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Formulario2 {

public static final int TIMEOUT = 300;

/**
 *
 * @param idProd2
 *
 * @author Willian Ferreira
 * @since 11/06/2025, 11:11:56
 *
 */
public static Var excluir(@ParamMetaData(description = "idProd2", id = "a0607922") @RequestBody(required = false) Var idProd2) throws Exception {
 return new Callable<Var>() {

   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("delete from \n	\n	Formulario2  \nwhere \n	prodForm2 = :prodForm2"),Var.valueOf("prodForm2",idProd2));
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto2"), Var.valueOf("delete from \n	\n	Produto2  \nwhere \n	id = :id"),Var.valueOf("id",idProd2));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Excluído"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("form2"),
        Var.valueOf("true"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("ProdutoParaO2Formulario"),
        Var.valueOf("true"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("OrdenarProdutoDo2FormularioPelaData"),
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
 * @param contIdForm2
 *
 * @author Willian Ferreira
 * @since 11/06/2025, 11:11:56
 *
 */
public static Var gravar(@ParamMetaData(description = "contIdForm2", id = "4b686d63") @RequestBody(required = false) Var contIdForm2) throws Exception {
 return new Callable<Var>() {

   private Var quantForm2 = Var.VAR_NULL;
   private Var codiPsv2 = Var.VAR_NULL;
   private Var prodObj2 = Var.VAR_NULL;
   private Var contObj2 = Var.VAR_NULL;
   private Var inserir2 = Var.VAR_NULL;
   private Var prodForm2 = Var.VAR_NULL;

   public Var call() throws Exception {
    quantForm2 =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form2.active.quantForm2"));
    codiPsv2 =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form2.active.prodForm2"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("select \n	p \nfrom \n	Produto2 p  \nwhere \n	p.codiProd2 = :codiProd2 AND \n	p.contProd2 = :contProd2"),Var.valueOf("codiProd2",codiPsv2),Var.valueOf("contProd2",contIdForm2))).getObjectAsBoolean()) {
        prodObj2 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("select \n	a \nfrom \n	AtualizaProduto a  \nwhere \n	a.codiPsv = :codiPsv AND \n	a.contAtuProd = :contAtuProd"),Var.valueOf("codiPsv",codiPsv2),Var.valueOf("contAtuProd",contIdForm2));
        contObj2 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",contIdForm2));
        inserir2 =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto2"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("codiProd2",
        cronapi.database.Operations.getField(prodObj2, Var.valueOf("this[0].codiPsv"))),Var.valueOf("descProd2",
        cronapi.database.Operations.getField(prodObj2, Var.valueOf("this[0].descPsv"))),Var.valueOf("codiBar2",
        cronapi.database.Operations.getField(prodObj2, Var.valueOf("this[0].codiBar"))),Var.valueOf("custTab2",
        cronapi.database.Operations.getField(prodObj2, Var.valueOf("this[0].custTab"))),Var.valueOf("gprProd2",
        cronapi.database.Operations.getField(contObj2, Var.valueOf("this[0].gprCont"))),Var.valueOf("sbgProd2",
        cronapi.database.Operations.getField(contObj2, Var.valueOf("this[0].sbgCont"))),Var.valueOf("contProd2",
        cronapi.database.Operations.getField(contObj2, Var.valueOf("this[0].id")))));
    }
    prodForm2 =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("select \n	p.id \nfrom \n	Produto2 p  \nwhere \n	p.codiProd2 = :codiProd2 AND \n	p.contProd2 = :contProd2"),Var.valueOf("codiProd2",codiPsv2),Var.valueOf("contProd2",contIdForm2));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("select \n	fo.prodForm2 \nfrom \n	Formulario2 fo  \nwhere \n	fo.prodForm2.codiProd2 = :prodForm2CodiProd2 AND \n	fo.contForm2 = :contForm2"),Var.valueOf("prodForm2CodiProd2",codiPsv2),Var.valueOf("contForm2",contIdForm2))).getObjectAsBoolean()) {
        inserir2 =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario2"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("quantForm2",quantForm2),Var.valueOf("dataForm2",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("prodForm2",
        cronapi.database.Operations.getField(prodForm2, Var.valueOf("this[0]"))),Var.valueOf("contForm2",contIdForm2)));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Inserido"));
    } else {
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("update \n	Formulario2  \nset \n	quantForm2 = :quantForm2, \n	dataForm2 = :dataForm2 \nwhere \n	prodForm2 = :prodForm2 AND \n	contForm2 = :contForm2"),Var.valueOf("quantForm2",quantForm2),Var.valueOf("dataForm2",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("prodForm2",
        cronapi.database.Operations.getField(prodForm2, Var.valueOf("this[0]"))),Var.valueOf("contForm2",contIdForm2));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Atualizado"));
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("form2"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("OrdenarProdutoDo2FormularioPelaData"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ProdutoParaO2Formulario"),
    Var.valueOf("true"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.backNormalState"),
    Var.valueOf("form2"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

