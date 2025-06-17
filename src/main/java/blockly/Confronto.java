package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Confronto {

public static final int TIMEOUT = 300;

/**
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 17/06/2025, 10:58:09
 *
 */
public static Var encerrarContagem(@ParamMetaData(description = "idCont", id = "81c2b90d") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var contador = Var.VAR_NULL;
   private Var contObj = Var.VAR_NULL;
   private Var contLoja = Var.VAR_NULL;
   private Var contDpt = Var.VAR_NULL;
   private Var contGpr = Var.VAR_NULL;
   private Var contSbg = Var.VAR_NULL;
   private Var fom1ObjPsv = Var.VAR_NULL;
   private Var fomr1CodiPsv = Var.VAR_NULL;
   private Var ConfNull = Var.VAR_NULL;
   private Var inserirC = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    contador =
    Var.valueOf(0);
    try {
         contObj =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Contagem"),Var.valueOf("select \n	c.lojaCont.codiLoja, \n	c.depCont.codiDpt, \n	c.gprCont.codiGpr, \n	c.sbgCont.codiSbg \nfrom \n	Contagem c  \nwhere \n	c.id = :id"),Var.valueOf("id",idCont));
        contLoja =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[0]"));
        contDpt =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[1]"));
        contGpr =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[2]"));
        contSbg =
        cronapi.database.Operations.getField(contObj,
        Var.valueOf("this[3]"));
        fom1ObjPsv =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Formulario1"),Var.valueOf("select \n	f.prodForm1.codiProd1, \n	f.quantForm1 \nfrom \n	Formulario1 f  \nwhere \n	f.contForm1 = :contForm1"),Var.valueOf("contForm1",idCont));
        while (
        cronapi.database.Operations.hasElement(fom1ObjPsv).getObjectAsBoolean()) {
            fomr1CodiPsv =
            cronapi.database.Operations.getField(fom1ObjPsv,
            Var.valueOf("this[0]"));
            ConfNull =
            cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("select \n	c.codiPsv \nfrom \n	Confronto c  \nwhere \n	c.codiPsv = :codiPsv AND \n	c.contConf = :contConf"),Var.valueOf("codiPsv",fomr1CodiPsv),Var.valueOf("contConf",idCont));
            if (
            cronapi.logic.Operations.isNullOrEmpty(ConfNull).getObjectAsBoolean()) {
                inserirC =
                cronapi.database.Operations.insert(Var.valueOf("app_cont.entity.Confronto"),
                cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("codiPsv",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[0]"))),Var.valueOf("contConf",idCont),Var.valueOf("quantConf",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[1]")))));
                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } else {
                cronapi.database.Operations.update(Var.valueOf("app_cont.entity.Confronto"),
                cronapi.object.Operations.newObject(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("codiPsv",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[0]"))),Var.valueOf("contConf",idCont),Var.valueOf("quantConf",
                cronapi.database.Operations.getField(fom1ObjPsv,
                Var.valueOf("this[1]")))));
            }
            cronapi.database.Operations.next(fom1ObjPsv);
        } // end while
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal71744"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf(
        Var.valueOf("Confronto Concluído com Sucesso: ").getObjectAsString() +
        contador.getObjectAsString() +
        Var.valueOf(" Produtos Confrontados").getObjectAsString()));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Erro: Confronto não Realizado!"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal71744"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

