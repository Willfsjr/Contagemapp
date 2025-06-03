package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Conflito1 {

public static final int TIMEOUT = 300;

/**
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 14:57:18
 *
 */
public static Var gravar() throws Exception {
 return new Callable<Var>() {

   private Var obterId = Var.VAR_NULL;
   private Var obterQuantidade = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         obterId =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("conform1.active.id"));
        obterQuantidade =
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("conform1.active.quantidade1"));
        cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
        cronapi.database.Operations.execute(Var.valueOf("app_cont.query221839"), Var.valueOf("PUT app_cont/query221839(produto=:produto)"),Var.valueOf("quantidade1",obterQuantidade),Var.valueOf("produto",obterId));
        cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Quantidade Atualizada"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal79293"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("conform1"),
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

