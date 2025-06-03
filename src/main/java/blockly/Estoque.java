package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
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
 * @since 03/06/2025, 17:59:22
 *
 */
public static Var obterProdutoEstoqueLoja(@ParamMetaData(description = "contObjEst", id = "dfd8366c") @RequestBody(required = false) Var contObjEst) throws Exception {
 return new Callable<Var>() {

   private Var validarEstEntrada = Var.VAR_NULL;
   private Var produto = Var.VAR_NULL;
   private Var loja = Var.VAR_NULL;
   private Var codigoLoja = Var.VAR_NULL;
   private Var linha1 = Var.VAR_NULL;
   private Var codigoProduto = Var.VAR_NULL;
   private Var estoque = Var.VAR_NULL;
   private Var listaBase = Var.VAR_NULL;
   private Var estoqueERP = Var.VAR_NULL;
   private Var linha2 = Var.VAR_NULL;
   private Var codiPsv = Var.VAR_NULL;
   private Var form1Obj = Var.VAR_NULL;
   private Var codiDpt = Var.VAR_NULL;
   private Var qteTotal = Var.VAR_NULL;
   private Var mapProduto = Var.VAR_NULL;
   private Var inserir = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    validarEstEntrada =
    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Estoque"),Var.valueOf("select \n	e \nfrom \n	Estoque e  \nwhere \n	e.formulario1.produto.contagem = :formulario1ProdutoContagem"),Var.valueOf("formulario1ProdutoContagem",contObjEst));
    if (
    Var.valueOf(
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("contagem.active.encerrado")).equals(
    Var.VAR_TRUE)).getObjectAsBoolean() &&
    cronapi.logic.Operations.isNullOrEmpty(validarEstEntrada).getObjectAsBoolean()).getObjectAsBoolean()) {
        produto =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.codiPsv \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        loja =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.contagem.loja.codigo \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
        codigoLoja =
        cronapi.list.Operations.get(loja,
        Var.valueOf(1));
        for (Iterator it_linha1 = produto.iterator(); it_linha1.hasNext();) {
            linha1 = Var.valueOf(it_linha1.next());
            codigoProduto = linha1;
            estoque =
            cronapi.database.Operations.executeNativeQuery(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select CODI_PSV, CODI_DPT, QTE_TOTAL from ESTOQUECONTAGEM  where CODI_PSV = :CODI_PSV AND CODI_EMP = :CODI_EMP"),Var.valueOf("CODI_PSV",codigoProduto),Var.valueOf("CODI_EMP",codigoLoja));
            System.out.println(codigoLoja.getObjectAsString());
            System.out.println(linha1.getObjectAsString());
            listaBase =
            /*# sourceMappingStart=T5dcE74z~?@A_+epr1cg */
            ( cronapi.logic.Operations.isNull(estoqueERP)
            .negate().getObjectAsBoolean() ? estoqueERP :
            cronapi.list.Operations.newList());
            estoqueERP =
            Var.valueOf(blockly.MinhaClasse.adicionarElementos(listaBase, estoque));
        } // end for
        cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
        try {
             for (Iterator it_linha2 = estoqueERP.iterator(); it_linha2.hasNext();) {
                linha2 = Var.valueOf(it_linha2.next());
                codiPsv =
                cronapi.map.Operations.getMapField(linha2,
                Var.valueOf("CODI_PSV"));
                form1Obj =
                cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.id \nfrom \n	Formulario1 f  \nwhere \n	f.produto.codiPsv = :produtoCodiPsv AND \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoCodiPsv",codiPsv),Var.valueOf("produtoContagem",contObjEst));
                codiDpt =
                cronapi.map.Operations.getMapField(linha2,
                Var.valueOf("CODI_DPT"));
                qteTotal =
                cronapi.map.Operations.getMapField(linha2,
                Var.valueOf("QTE_TOTAL"));
                mapProduto =
                cronapi.map.Operations.createObjectMapWith(Var.valueOf("codiDpt",codiDpt) , Var.valueOf("qteTotal",qteTotal) , Var.valueOf("formulario1",form1Obj));
                inserir =
                cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Estoque"),mapProduto);
                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } // end for
            cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Confronto Realizado"));
         } catch (Exception excecao_exception) {
              excecao = Var.valueOf(excecao_exception);
             cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("ERRO no Confronto"));
         }
    } else {
        if (
        Var.valueOf(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("contagem.active.encerrado")).equals(
        Var.VAR_TRUE)).getObjectAsBoolean()) {
            cronapi.database.Operations.execute(Var.valueOf("app_cont.entity.Estoque"), Var.valueOf("delete from \n	\n	Estoque  \nwhere \n	formulario1.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
            produto =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.codiPsv \nfrom \n	Formulario1 f \nleft join\n	Estoque e \n	on (f.produto = e.formulario1.produto) \n	and f.produto.contagem = e.formulario1.produto.contagem \nwhere \n	f.produto.contagem = :produtoContagem AND \n	e.id IS NULL"),Var.valueOf("produtoContagem",contObjEst));
            loja =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.produto.contagem.loja.codigo \nfrom \n	Formulario1 f  \nwhere \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoContagem",contObjEst));
            for (Iterator it_linha1 = produto.iterator(); it_linha1.hasNext();) {
                linha1 = Var.valueOf(it_linha1.next());
                codigoProduto = linha1;
                estoque =
                cronapi.database.Operations.executeNativeQuery(Var.valueOf("app_oracle.entity.Estoquecontagem"),Var.valueOf("select CODI_PSV, CODI_DPT, QTE_TOTAL from ESTOQUECONTAGEM  where CODI_PSV = :CODI_PSV AND CODI_EMP = :CODI_EMP"),Var.valueOf("CODI_PSV",codigoProduto),Var.valueOf("CODI_EMP",codigoLoja));
                listaBase =
                /*# sourceMappingStart=0nc,8}2pA_gl,E[R6[sO */
                ( cronapi.logic.Operations.isNull(estoqueERP)
                .negate().getObjectAsBoolean() ? estoqueERP :
                cronapi.list.Operations.newList());
                estoqueERP =
                Var.valueOf(blockly.MinhaClasse.adicionarElementos(listaBase, estoque));
            } // end for
            cronapi.database.Operations.beginTransaction(Var.valueOf("app_cont"));
            try {
                 for (Iterator it_linha2 = estoqueERP.iterator(); it_linha2.hasNext();) {
                    linha2 = Var.valueOf(it_linha2.next());
                    codiPsv =
                    cronapi.map.Operations.getMapField(linha2,
                    Var.valueOf("CODI_PSV"));
                    form1Obj =
                    cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.id \nfrom \n	Formulario1 f  \nwhere \n	f.produto.codiPsv = :produtoCodiPsv AND \n	f.produto.contagem = :produtoContagem"),Var.valueOf("produtoCodiPsv",codiPsv),Var.valueOf("produtoContagem",contObjEst));
                    codiDpt =
                    cronapi.map.Operations.getMapField(linha2,
                    Var.valueOf("CODI_DPT"));
                    qteTotal =
                    cronapi.map.Operations.getMapField(linha2,
                    Var.valueOf("QTE_TOTAL"));
                    mapProduto =
                    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codiDpt",codiDpt) , Var.valueOf("qteTotal",qteTotal) , Var.valueOf("formulario1",form1Obj));
                    inserir =
                    cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Estoque"),mapProduto);
                    contador =
                    cronapi.math.Operations.sum(contador,
                    Var.valueOf(1));
                } // end for
                cronapi.database.Operations.commitTransaction(Var.valueOf("app_cont"));
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
                Var.valueOf("Confronto Realizado"));
             } catch (Exception excecao_exception) {
                  excecao = Var.valueOf(excecao_exception);
                 cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
                Var.valueOf("ERRO no Confronto"));
             }
        }
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

