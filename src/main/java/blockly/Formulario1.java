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
 * @param produto
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 17:36:17
 *
 */
public static Var excluir(@ParamMetaData(description = "produto", id = "b6d76f15") @RequestBody(required = false) Var produto) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("delete from \n	\n	Formulario1  \nwhere \n	produto = :produto"),Var.valueOf("produto",produto));
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
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 17:36:17
 *
 */
public static Var gravar() throws Exception {
 return new Callable<Var>() {

   private Var quantidade = Var.VAR_NULL;
   private Var produto = Var.VAR_NULL;
   private Var contagem = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;

   public Var call() throws Exception {
    quantidade =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form1.active.quantidade1"));
    produto =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form1.active.produto"));
    contagem =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("params.contObj"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto \nfrom \n	Formulario1 f  \nwhere \n	f.produto = :produto AND \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produto",produto),Var.valueOf("produtoContagem",contagem))).getObjectAsBoolean()) {
        inserir =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario1"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("data",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("quantidade1",quantidade),Var.valueOf("produto",produto)));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Inserido"));
    } else {
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("update \n	Formulario1  \nset \n	quantidade1 = :quantidade1, \n	data = :data \nwhere \n	produto = :produto AND \n	produto.contagem = :contagem"),Var.valueOf("quantidade1",quantidade),Var.valueOf("data",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("produto",produto),Var.valueOf("contagem",contagem));
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

