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
 * @param idContagem
 *
 * @author Willian Ferreira
 * @since 29/05/2025, 14:26:42
 *
 */
public static Var apagarProdutoDaContagem(@ParamMetaData(description = "idContagem", id = "ffdf7eb6") @RequestBody(required = false) Var idContagem) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto"), Var.valueOf("delete from \n	\n	Produto  \nwhere \n	contagem = :contagem"),Var.valueOf("contagem",idContagem));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Contagem Apagada!"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param idContagem
 *
 * @author Willian Ferreira
 * @since 29/05/2025, 14:26:42
 *
 */
public static Var obterProdutoParaContagem(@ParamMetaData(description = "idContagem", id = "1b7b51d5") @RequestBody(required = false) Var idContagem) throws Exception {
 return new Callable<Var>() {

   private Var produtosERP = Var.VAR_NULL;
   private Var produtosExistentes = Var.VAR_NULL;
   private Var codigoTexto = Var.VAR_NULL;
   private Var primeiro = Var.VAR_NULL;
   private Var p = Var.VAR_NULL;
   private Var codigo = Var.VAR_NULL;
   private Var codigosExistentes = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var linha = Var.VAR_NULL;
   private Var mapLinha = Var.VAR_NULL;
   private Var codigoProduto = Var.VAR_NULL;
   private Var achou = Var.VAR_NULL;
   private Var cod = Var.VAR_NULL;
   private Var salvar = Var.VAR_NULL;

   public Var call() throws Exception {
    produtosERP =
    cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.codiPsv, \n	p.descPsv, \n	p.codiBar, \n	p.custTab \nfrom \n	Produtocontagem p"));
    produtosExistentes =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Produto"),Var.valueOf("select \n	p.codiPsv \nfrom \n	Produto p  \nwhere \n	p.contagem = :contagem"),Var.valueOf("contagem",idContagem));
    codigoTexto =
    Var.valueOf("");
    primeiro =
    Var.VAR_TRUE;
    for (Iterator it_p = produtosExistentes.iterator(); it_p.hasNext();) {
        p = Var.valueOf(it_p.next());
        codigo =
        cronapi.map.Operations.getMapField(p,
        Var.valueOf("codiPsv"));
        if (primeiro.getObjectAsBoolean()) {
            codigoTexto =
            Var.valueOf(
            codigo.getObjectAsString());
            primeiro =
            Var.VAR_FALSE;
        } else {
            codigoTexto =
            Var.valueOf(
            codigoTexto.getObjectAsString() +
            Var.valueOf(",").getObjectAsString() +
            codigo.getObjectAsString());
        }
    } // end for
    codigosExistentes =
    cronapi.list.Operations.getListFromText(codigoTexto,
    Var.valueOf(","));
    contador =
    Var.valueOf(0);
    for (Iterator it_linha = produtosERP.iterator(); it_linha.hasNext();) {
        linha = Var.valueOf(it_linha.next());
        mapLinha = linha;
        codigoProduto =
        cronapi.map.Operations.getMapField(mapLinha,
        Var.valueOf("codiPsv"));
        achou =
        Var.VAR_FALSE;
        for (Iterator it_cod = codigosExistentes.iterator(); it_cod.hasNext();) {
            cod = Var.valueOf(it_cod.next());
            if (
            Var.valueOf(cod.equals(codigoProduto)).getObjectAsBoolean()) {
                achou =
                Var.VAR_TRUE;
                break;
            }
        } // end for
        if (achou
        .negate().getObjectAsBoolean()) {
            salvar =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Produto"),
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("contagem",idContagem) , Var.valueOf("codiPsv",
            cronapi.map.Operations.getMapField(mapLinha,
            Var.valueOf("codiPsv"))) , Var.valueOf("descPsv",
            cronapi.map.Operations.getMapField(mapLinha,
            Var.valueOf("descPsv"))) , Var.valueOf("codiBar",
            cronapi.map.Operations.getMapField(mapLinha,
            Var.valueOf("codiBar"))) , Var.valueOf("custTab",
            cronapi.map.Operations.getMapField(mapLinha,
            Var.valueOf("custTab")))));
            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
        }
    } // end for
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf(
    Var.valueOf("Importação Concluída com Sucesso: \"").getObjectAsString() +
    contador.getObjectAsString() +
    Var.valueOf("\" de Produtos Inseridos ").getObjectAsString()));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("contagem"),
    Var.valueOf("true"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

