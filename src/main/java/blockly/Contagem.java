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
 * @since 11/06/2025, 08:34:36
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
 * @since 11/06/2025, 08:34:36
 *
 */
public static Var obterProdutoParaContagem(@ParamMetaData(description = "contObj", id = "1b7b51d5") @RequestBody(required = false) Var contObj) throws Exception {
 return new Callable<Var>() {

   private Var codiGprConsulta = Var.VAR_NULL;
   private Var codiGpr = Var.VAR_NULL;
   private Var codiSbgConsulta = Var.VAR_NULL;
   private Var codiSbg = Var.VAR_NULL;
   private Var produtosERP = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    codiGprConsulta =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Grupo"),Var.valueOf("select \n	g.codiGpr \nfrom \n	Grupo g  \nwhere \n	g = :g"),Var.valueOf("g",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.gprCont"))));
    codiGpr =
    cronapi.list.Operations.get(codiGprConsulta,
    Var.valueOf(1));
    codiSbgConsulta =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.SubGrupo"),Var.valueOf("select \n	s.codiSbg \nfrom \n	SubGrupo s  \nwhere \n	s = :s"),Var.valueOf("s",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.sbgCont"))));
    codiSbg =
    cronapi.list.Operations.get(codiSbgConsulta,
    Var.valueOf(1));
    if (
    Var.valueOf(
    cronapi.logic.Operations.isNullOrEmpty(codiGpr).getObjectAsBoolean() &&
    cronapi.logic.Operations.isNullOrEmpty(codiSbg).getObjectAsBoolean()).getObjectAsBoolean()) {
        produtosERP =
        cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.codiPsv, \n	p.codiBar, \n	p.codiGpr, \n	p.codiSbg, \n	p.custTab, \n	p.descPsv \nfrom \n	Produtocontagem p  \nwhere NOT ( \n	p.codiGpr = 50 OR \n	p.codiGpr = 51 OR \n	p.codiGpr = 52 )"));
    } else {
        if (
        cronapi.logic.Operations.isNullOrEmpty(codiSbg).getObjectAsBoolean()) {
            produtosERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.codiPsv, \n	p.codiBar, \n	p.codiGpr, \n	p.codiSbg, \n	p.custTab, \n	p.descPsv \nfrom \n	Produtocontagem p  \nwhere \n	p.codiGpr = :codiGpr AND ( NOT ( \n	p.codiGpr = 50 OR \n	p.codiGpr = 51 OR \n	p.codiGpr = 52 ) )"),Var.valueOf("codiGpr",codiGpr));
        } else {
            produtosERP =
            cronapi.database.Operations.query(Var.valueOf("app_oracle.entity.Produtocontagem"),Var.valueOf("select \n	p.codiPsv, \n	p.codiBar, \n	p.codiGpr, \n	p.codiSbg, \n	p.custTab, \n	p.descPsv \nfrom \n	Produtocontagem p  \nwhere \n	p.codiGpr = :codiGpr AND \n	p.codiSbg = :codiSbg AND ( NOT ( \n	p.codiGpr = 50 OR \n	p.codiGpr = 51 OR \n	p.codiGpr = 52 ) )"),Var.valueOf("codiGpr",codiGpr),Var.valueOf("codiSbg",codiSbg));
        }
    }
    contador =
    Var.valueOf(0);
    try {
         while (
        cronapi.database.Operations.hasElement(produtosERP).getObjectAsBoolean()) {
            inserir =
            cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.AtualizaProduto"),
            cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.AtualizaProduto"),Var.valueOf("codiPsv",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[0]"))),Var.valueOf("descPsv",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[5]"))),Var.valueOf("codiBar",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[1]"))),Var.valueOf("codiGpr",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[2]"))),Var.valueOf("codiSbg",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[3]"))),Var.valueOf("custTab",
            cronapi.database.Operations.getField(produtosERP,
            Var.valueOf("this[4]"))),Var.valueOf("contAtuProd",contObj)));
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

