package blockly;

import cronapi.CronapiMetaData;
import cronapi.Utils;
import cronapi.Var;
import cronapi.CronapiMetaData.CategoryType;
import cronapi.CronapiMetaData.ObjectType;	
import cronapi.ParamMetaData;
import cronapi.rest.security.CronappSecurity;


/**
 * @author Willian Ferreira
 * @version 1.0
 * @since 2025-06-01
 *
 */
 
@CronappSecurity
@cronapi.CronapiMetaData(type = "blockly", categoryName = "AI Custom Actions")
public class MinhaClasse {

    /**
     * Adiciona todos os elementos de uma lista B a uma lista A.
     * 
     * @param listaA a lista que receberá os elementos da lista B
     * @param listaB a lista que terá seus elementos adicionados à lista A
     * @return a lista A com os elementos da lista B adicionados
     */
    @cronapi.CronapiMetaData(
        type = "function",
        name = "adicionarElementos",
        nameTags = {"lista", "adicionar", "elementos", "cronapi", "list"},
        description = "Adiciona todos os elementos de uma lista B a uma lista A."
    )
    public static java.util.List<java.lang.Object> adicionarElementos(cronapi.Var listaA, cronapi.Var listaB) throws Exception {
        // Obtem a lista A como uma lista de objetos
        var listaAObj = listaA.getObjectAsList();
        
        // Obtem a lista B como uma lista de objetos
        var listaBObj = listaB.getObjectAsList();
        
        // Adiciona todos os elementos da lista B à lista A
        listaAObj.addAll(listaBObj);
        
        // Retorna a lista A com os elementos da lista B adicionados
        return listaAObj;
    }
}


