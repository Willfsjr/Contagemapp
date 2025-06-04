package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Conflito2 {

public static final int TIMEOUT = 300;

/**
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 21:44:18
 *
 */
public static Var gravar() throws Exception {
 return new Callable<Var>() {

   private Var obterId = Var.VAR_NULL;
   private Var obterQuantidade = Var.VAR_NULL;
   private Var validarProduto = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         obterId =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("conform2.active.id"));
        obterQuantidade =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("conform2.active.quantidade2"));
        cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
        validarProduto =
        cronapi.database.Operations.query(Var.valueOf("app_cont.query913388"),Var.valueOf("GET app_cont/query913388?$select=produto&$filter=%28produto%20eq%20%3Aproduto%29"),Var.valueOf("produto",obterId));
        if (
        cronapi.logic.Operations.isNullOrEmpty(validarProduto).getObjectAsBoolean()) {
            inserir =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario2"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("data",
            cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("quantidade2",obterQuantidade),Var.valueOf("produto",obterId)));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Inserida"));
        } else {
            cronapi.database.Operations.execute(Var.valueOf("app_cont.query913388"), Var.valueOf("PUT app_cont/query913388(produto=:produto)"),Var.valueOf("quantidade2",obterQuantidade),Var.valueOf("produto",obterId));
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Quantidade Atualizada"));
        }
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal38966"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("conform2"),
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

