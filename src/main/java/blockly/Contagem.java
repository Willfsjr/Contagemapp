package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Contagem {

public static final int TIMEOUT = 300;

/**
 *
 * @param contagemObject
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 23:29:55
 *
 */
public static Var apagarProdutoDaContagem(@ParamMetaData(description = "contagemObject", id = "33ac3b42") @RequestBody(required = false) Var contagemObject) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto"), Var.valueOf("delete from \n	\n	Produto  \nwhere \n	contagem = :contagem"),Var.valueOf("contagem",contagemObject));
    cronapi.database.Operations.remove(Var.valueOf("app_cont.entity.Contagem"),contagemObject);
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Contagem Apagada!"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("contagem"),
    Var.valueOf("true"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param contagemObject
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 23:29:55
 *
 */
public static Var obterProdutoParaContagem(@ParamMetaData(description = "contagemObject", id = "1b7b51d5") @RequestBody(required = false) Var contagemObject) throws Exception {
 return new Callable<Var>() {

   private Var produtosERP = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var linha = Var.VAR_NULL;
   private Var codiPsv = Var.VAR_NULL;
   private Var descPsv = Var.VAR_NULL;
   private Var codiBar = Var.VAR_NULL;
   private Var custTab = Var.VAR_NULL;
   private Var mapProduto = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    produtosERP =
    cronapi.database.Operations.executeNativeQuery(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("SELECT CODI_PSV, DESC_PSV, CODI_BAR, CUST_TAB FROM PRODUTOCONTAGEM"));
    contador =
    Var.valueOf(0);
    cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
    try {
         for (Iterator it_linha = produtosERP.iterator(); it_linha.hasNext();) {
            linha = Var.valueOf(it_linha.next());
            codiPsv =
            cronapi.map.Operations.getMapField(linha,
            Var.valueOf("CODI_PSV"));
            descPsv =
            cronapi.map.Operations.getMapField(linha,
            Var.valueOf("DESC_PSV"));
            codiBar =
            cronapi.map.Operations.getMapField(linha,
            Var.valueOf("CODI_BAR"));
            custTab =
            cronapi.map.Operations.getMapField(linha,
            Var.valueOf("CUST_TAB"));
            mapProduto =
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("codiPsv",codiPsv) , Var.valueOf("descPsv",descPsv) , Var.valueOf("codiBar",codiBar) , Var.valueOf("custTab",custTab) , Var.valueOf("contagem",contagemObject));
            inserir =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto"),mapProduto);
            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
        } // end for
        cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal71744"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf(
        Var.valueOf("Importação Concluída com Sucesso: ").getObjectAsString() +
        contador.getObjectAsString() +
        Var.valueOf(" Produtos Inseridos ").getObjectAsString()));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("contagem"),
        Var.valueOf("true"));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

