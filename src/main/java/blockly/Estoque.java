package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Estoque {

public static final int TIMEOUT = 300;

/**
 *
 * @param contObjEst
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 01:14:05
 *
 */
public static Var vobterProdutoEstoqueLoja(@ParamMetaData(description = "contObjEst", id = "dfd8366c") @RequestBody(required = false) Var contObjEst) throws Exception {
 return new Callable<Var>() {

   private Var produto = Var.VAR_NULL;
   private Var loja = Var.VAR_NULL;
   private Var codigoLoja = Var.VAR_NULL;
   private Var formId = Var.VAR_NULL;
   private Var estoque = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var codiPsv = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.encerrado")).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Estoque"), Var.valueOf("delete from \n	\n	Estoque  \nwhere \n	formulario1.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        produto =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.codiPsv \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        loja =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.contagem.loja.codigo \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        codigoLoja =
        cronapi.list.Operations.get(loja,
        Var.valueOf(1));
        formId =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.id \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        estoque =
        cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select \n	e.coDI_PSV \nfrom \n	Estoquecontagem e  \nwhere \n	e.coDI_EMP = :coDI_EMP AND \n	e.coDI_PSV = :coDI_PSV"),Var.valueOf("coDI_EMP",codigoLoja),Var.valueOf("coDI_PSV",
        Var.valueOf("032590")));
        contador =
        Var.valueOf(0);
        try {
             while (
            cronapi.database.Operations.hasElement(estoque).getObjectAsBoolean()) {
                codiPsv =
                cronapi.database.Operations.getField(estoque,
                Var.valueOf("this[0].coDI_PSV"));
                System.out.println(codiPsv.getObjectAsString());
                if (
                Var.valueOf(
                cronapi.list.Operations.findFirst(produto, codiPsv).compareTo(
                Var.valueOf(0)) > 0).getObjectAsBoolean()) {
                  {}
                }
            } // end while
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf(
            Var.valueOf("Confronto Realizado: ").getObjectAsString() +
            contador.getObjectAsString() +
            Var.valueOf(" Produtos Confrontados.").getObjectAsString()));
         } catch (Exception excecao_exception) {
              excecao = Var.valueOf(excecao_exception);
             cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("ERRO no Confronto"));
         }
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

