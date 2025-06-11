package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Conflito1 {

public static final int TIMEOUT = 300;

/**
 *
 * @param idCont1
 *
 * @author Willian Ferreira
 * @since 11/06/2025, 16:18:00
 *
 */
public static Var gravar(@ParamMetaData(description = "idCont1", id = "f61439ba") @RequestBody(required = false) Var idCont1) throws Exception {
 return new Callable<Var>() {

   private Var codiPsv1 = Var.VAR_NULL;
   private Var obterQuantidade1 = Var.VAR_NULL;
   private Var validarProduto1 = Var.VAR_NULL;
   private Var prod2 = Var.VAR_NULL;
   private Var inserir1a = Var.VAR_NULL;
   private Var prod1 = Var.VAR_NULL;
   private Var inserir1b = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         codiPsv1 =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("confrotnoformulario1.active.codiPsv"));
        obterQuantidade1 =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("confrotnoformulario1.active.quantForm1"));
        cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
        validarProduto1 =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.prodForm1 \nfrom \n	Formulario1 f  \nwhere \n	f.prodForm1.codiProd1 = :prodForm1CodiProd1"),Var.valueOf("prodForm1CodiProd1",codiPsv1));
        if (
        cronapi.logic.Operations.isNullOrEmpty(validarProduto1).getObjectAsBoolean()) {
            prod2 =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto2"),Var.valueOf("select \n	p \nfrom \n	Produto2 p  \nwhere \n	p.codiProd2 = :codiProd2 AND \n	p.contProd2 = :contProd2"),Var.valueOf("codiProd2",codiPsv1),Var.valueOf("contProd2",idCont1));
            inserir1a =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto1"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("codiProd1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].codiProd2"))),Var.valueOf("descProd1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].descProd2"))),Var.valueOf("codiBar1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].codiBar2"))),Var.valueOf("custTab1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].custTab2"))),Var.valueOf("gprProd1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].gprProd2"))),Var.valueOf("sbgProd1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].sbgProd2"))),Var.valueOf("contProd1",
            cronapi.database.Operations.getField(prod2, Var.valueOf("this[0].contProd2")))));
            prod1 =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto1"),Var.valueOf("select \n	p.id \nfrom \n	Produto1 p  \nwhere \n	p.contProd1 = :contProd1 AND \n	p.codiProd1 = :codiProd1"),Var.valueOf("contProd1",idCont1),Var.valueOf("codiProd1",codiPsv1));
            inserir1b =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario1"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("quantForm1",obterQuantidade1),Var.valueOf("dataForm1",
            cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("prodForm1",
            cronapi.database.Operations.getField(prod1, Var.valueOf("this[0]"))),Var.valueOf("contForm1",idCont1)));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Inserida"));
        } else {
            cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("update \n	Formulario1  \nset \n	quantForm1 = :quantForm1, \n	dataForm1 = :dataForm1 \nwhere \n	contForm1 = :contForm1 AND \n	prodForm1.codiProd1 = :codiProd1"),Var.valueOf("quantForm1",obterQuantidade1),Var.valueOf("dataForm1",
            cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("contForm1",idCont1),Var.valueOf("codiProd1",codiPsv1));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Atualizada"));
        }
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal79293"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("confrotnoformulario1"),
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

