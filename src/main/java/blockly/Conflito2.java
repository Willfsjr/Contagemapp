package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Conflito2 {

public static final int TIMEOUT = 300;

/**
 *
 * @param idCont2
 *
 * @author Willian Ferreira
 * @since 12/06/2025, 21:56:35
 *
 */
public static Var gravar(@ParamMetaData(description = "idCont2", id = "e2a9715f") @RequestBody(required = false) Var idCont2) throws Exception {
 return new Callable<Var>() {

   private Var codiPsv2 = Var.VAR_NULL;
   private Var obterQuantidade2 = Var.VAR_NULL;
   private Var validarProduto2 = Var.VAR_NULL;
   private Var prod1 = Var.VAR_NULL;
   private Var inserir2a = Var.VAR_NULL;
   private Var prod2 = Var.VAR_NULL;
   private Var inserir2b = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         codiPsv2 =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("confrontoformulario.active.codiPsv"));
        obterQuantidade2 =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("confrontoformulario.active.quantForm2"));
        cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
        validarProduto2 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("select \n	f \nfrom \n	Formulario2 f  \nwhere \n	f.prodForm2.codiProd2 = :prodForm2CodiProd2"),Var.valueOf("prodForm2CodiProd2",codiPsv2));
        if (
        cronapi.logic.Operations.isNullOrEmpty(validarProduto2).getObjectAsBoolean()) {
            prod1 =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("select \n	p \nfrom \n	Produto1 p  \nwhere \n	p.codiProd1 = :codiProd1 AND \n	p.contProd1 = :contProd1"),Var.valueOf("codiProd1",codiPsv2),Var.valueOf("contProd1",idCont2));
            inserir2a =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto2"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("codiProd2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].codiProd1"))),Var.valueOf("descProd2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].descProd1"))),Var.valueOf("codiBar2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].codiBar1"))),Var.valueOf("custTab2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].custTab1"))),Var.valueOf("gprProd2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].gprProd1"))),Var.valueOf("sbgProd2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].sbgProd1"))),Var.valueOf("contProd2",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0].contProd1")))));
            prod2 =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("select \n	p \nfrom \n	Produto2 p  \nwhere \n	p.codiProd2 = :codiProd2 AND \n	p.contProd2 = :contProd2"),Var.valueOf("codiProd2",codiPsv2),Var.valueOf("contProd2",idCont2));
            inserir2b =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario2"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("quantForm2",obterQuantidade2),Var.valueOf("dataForm2",
            cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("prodForm2",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].id"))),Var.valueOf("contForm2",idCont2)));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Inserida"));
        } else {
            cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("update \n	Formulario2  \nset \n	quantForm2 = :quantForm2, \n	dataForm2 = :dataForm2 \nwhere \n	contForm2 = :contForm2 AND \n	prodForm2.codiProd2 = :codiProd2"),Var.valueOf("quantForm2",obterQuantidade2),Var.valueOf("dataForm2",
            cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("contForm2",idCont2),Var.valueOf("codiProd2",codiPsv2));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Atualizada"));
        }
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal38966"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("confrontoformulario"),
        Var.valueOf("true"));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("ERRO ao Atualizar Quantidade"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

