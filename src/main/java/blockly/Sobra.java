package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Sobra {

public static final int TIMEOUT = 300;

/**
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 18/06/2025, 09:56:22
 *
 */
public static Var relatorio(@ParamMetaData(description = "idCont", id = "7f5ba89d") @RequestBody(required = false) Var idCont) throws Exception {
 return new Callable<Var>() {

   private Var confronto = Var.VAR_NULL;
   private Var quantErp = Var.VAR_NULL;
   private Var quantCont = Var.VAR_NULL;
   private Var total = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         confronto =
        cronapi.database.Operations.query(Var.valueOf("app_cont.entity.Confronto"),Var.valueOf("select \n	c \nfrom \n	Confronto c  \nwhere \n	c.contConf = :contConf"),Var.valueOf("contConf",idCont));
        while (
        cronapi.database.Operations.hasElement(confronto).getObjectAsBoolean()) {
            quantErp =
            cronapi.database.Operations.getField(confronto,
            Var.valueOf("this[0].qteTotal"));
            quantCont =
            cronapi.database.Operations.getField(confronto,
            Var.valueOf("this[0].quantConf"));
            if (
            Var.valueOf(
            cronapi.logic.Operations.isNullOrEmpty(quantErp).getObjectAsBoolean() ||
            cronapi.logic.Operations.isNullOrEmpty(quantCont).getObjectAsBoolean()).getObjectAsBoolean()) {
                if (
                cronapi.logic.Operations.isNullOrEmpty(quantErp).getObjectAsBoolean()) {
                    quantErp =
                    Var.valueOf(0);
                    total =
                    cronapi.math.Operations.subtract(quantCont,quantErp);
                } else {
                    quantCont =
                    Var.valueOf(0);
                    total =
                    cronapi.math.Operations.subtract(quantCont,quantErp);
                }
            } else {
                total =
                cronapi.math.Operations.subtract(quantCont,quantErp);
            }
            cronapi.database.Operations.next(confronto);
        } // end while
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);
         cronapi.database.Operations.rollbackTransaction(Var.valueOf("app_cont"));
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

