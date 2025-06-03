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
 * @param produto2
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 17:36:06
 *
 */
public static Var excluir(@ParamMetaData(description = "produto2", id = "a0607922") @RequestBody(required = false) Var produto2) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("delete from \n	\n	Formulario2  \nwhere \n	produto = :produto"),Var.valueOf("produto",produto2));
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
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 17:36:06
 *
 */
public static Var gravar() throws Exception {
 return new Callable<Var>() {

   private Var quantidade = Var.VAR_NULL;
   private Var produto2 = Var.VAR_NULL;
   private Var contagem = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;

   public Var call() throws Exception {
    quantidade =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form2.active.quantidade2"));
    produto2 =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("form2.active.produto"));
    contagem =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("params.contObj2"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("select \n	fo.produto \nfrom \n	Formulario2 fo  \nwhere \n	fo.produto = :produto AND \n	fo.produto.contagem = :produtoContagem"),Var.valueOf("produto",produto2),Var.valueOf("produtoContagem",contagem))).getObjectAsBoolean()) {
        inserir =
        cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Formulario2"),
        cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Formulario2"),Var.valueOf("data",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("quantidade2",quantidade),Var.valueOf("produto",produto2)));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Produto Inserido"));
    } else {
        cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("update \n	Formulario2  \nset \n	quantidade2 = :quantidade2, \n	data = :data \nwhere \n	produto = :produto AND \n	produto.contagem = :contagem"),Var.valueOf("quantidade2",quantidade),Var.valueOf("data",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("produto",produto2),Var.valueOf("contagem",contagem));
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

