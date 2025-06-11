package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
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
 * @since 10/06/2025, 21:23:46
 *
 */
public static Var apagarProdutoDaContagem(@ParamMetaData(description = "contagemObject", id = "33ac3b42") @RequestBody(required = false) Var contagemObject) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Estoque"), Var.valueOf("delete from \n	\n	Estoque  \nwhere \n	contEst = :contEst"),Var.valueOf("contEst",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario1"), Var.valueOf("delete from \n	\n	Formulario1  \nwhere \n	contForm1 = :contForm1"),Var.valueOf("contForm1",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Formulario2"), Var.valueOf("delete from \n	\n	Formulario2  \nwhere \n	contForm2 = :contForm2"),Var.valueOf("contForm2",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto2"), Var.valueOf("delete from \n	\n	Produto2  \nwhere \n	contProd2 = :contProd2"),Var.valueOf("contProd2",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Produto1"), Var.valueOf("delete from \n	\n	Produto1  \nwhere \n	contProd1 = :contProd1"),Var.valueOf("contProd1",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.AtualizaProduto"), Var.valueOf("delete from \n	\n	AtualizaProduto  \nwhere \n	contAtuProd = :contAtuProd"),Var.valueOf("contAtuProd",contagemObject));
    cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Contagem"), Var.valueOf("delete from \n	\n	Contagem  \nwhere \n	id = :id"),Var.valueOf("id",contagemObject));
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
 * @param contObj
 *
 * @author Willian Ferreira
 * @since 10/06/2025, 21:23:46
 *
 */
public static Var obterProdutoParaContagem(@ParamMetaData(description = "contObj", id = "1b7b51d5") @RequestBody(required = false) Var contObj) throws Exception {
 return new Callable<Var>() {

   private Var codiGpr = Var.VAR_NULL;
   private Var codiSbg = Var.VAR_NULL;
   private Var produtosERP = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    codiGpr =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Grupo"),Var.valueOf("select \n	g.codiGpr \nfrom \n	Grupo g  \nwhere \n	g = :g"),Var.valueOf("g",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.gprCont"))));
    codiSbg =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.SubGrupo"),Var.valueOf("select \n	s.codiSbg \nfrom \n	SubGrupo s  \nwhere \n	s = :s"),Var.valueOf("s",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.sbgCont"))));
    produtosERP =
    cronapi.list.Operations.newList();
    if (
    Var.valueOf(
    cronapi.logic.Operations.isNullOrEmpty(codiGpr).getObjectAsBoolean() &&
    cronapi.logic.Operations.isNullOrEmpty(codiSbg).getObjectAsBoolean()).getObjectAsBoolean()) {
        produtosERP =
        cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.coDI_PSV, \n	p.deSC_PSV, \n	p.coDI_BAR, \n	p.cuST_TAB, \n	p.coDI_GPR, \n	p.coDI_SBG \nfrom \n	Produtocontagem p  \nwhere NOT ( \n	p.coDI_GPR = 50 AND \n	p.coDI_GPR = 51 AND \n	p.coDI_GPR = 52 )"));
    } else {
        if (
        cronapi.logic.Operations.isNullOrEmpty(codiSbg).getObjectAsBoolean()) {
            produtosERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.coDI_PSV, \n	p.deSC_PSV, \n	p.coDI_BAR, \n	p.cuST_TAB, \n	p.coDI_GPR, \n	p.coDI_SBG \nfrom \n	Produtocontagem p  \nwhere \n	p.coDI_GPR = :coDI_GPR AND ( NOT ( \n	p.coDI_GPR = 50 AND \n	p.coDI_GPR = 51 AND \n	p.coDI_GPR = 52 ) )"),Var.valueOf("coDI_GPR",codiGpr));
        } else {
            produtosERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.coDI_PSV, \n	p.deSC_PSV, \n	p.coDI_BAR, \n	p.cuST_TAB, \n	p.coDI_GPR, \n	p.coDI_SBG \nfrom \n	Produtocontagem p  \nwhere \n	p.coDI_GPR = :coDI_GPR AND \n	p.coDI_SBG = :coDI_SBG AND ( NOT ( \n	p.coDI_GPR = 50 AND \n	p.coDI_GPR = 51 AND \n	p.coDI_GPR = 52 ) )"),Var.valueOf("coDI_GPR",codiGpr),Var.valueOf("coDI_SBG",codiSbg));
        }
    }
    contador =
    Var.valueOf(0);
    System.out.println(produtosERP.getObjectAsString());
    try {
         while (
        cronapi.database.Operations.hasElement(produtosERP).getObjectAsBoolean()) {
            inserir =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.AtualizaProduto"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[0]"))),Var.valueOf("descPsv",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[1]"))),Var.valueOf("codiBar",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[2]"))),Var.valueOf("codiGpr",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[4]"))),Var.valueOf("codiSbg",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[5]"))),Var.valueOf("custTab",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[3]"))),Var.valueOf("contAtuProd",contObj)));
            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
            cronapi.database.Operations.next(produtosERP);
        } // end while
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

