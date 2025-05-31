window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Formulario1 = window.blockly.js.blockly.Formulario1 || {};

/**
 * @function validarProduto
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 14:41:36
 *
 */
window.blockly.js.blockly.Formulario1.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario1.validarProduto = async function() {
 var idContagem, contagemObject;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("formulario1.active.produto"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Produto');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}

/**
 * @function validarQuantidade
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 14:41:36
 *
 */
window.blockly.js.blockly.Formulario1.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario1.validarQuantidade = async function() {
 var idContagem, contagemObject;
  //
  if (this.cronapi.screen.getValueOfField("formulario1.active.quantidade") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("formulario1.active.quantidade"))) {
    //
    this.cronapi.screen.notify('warning','Informe uma Quantidade Valida');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}

/**
 * @function definirDataIdContagem
 *
 *
 *
 * @param contagemObject
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 14:41:36
 *
 */
window.blockly.js.blockly.Formulario1.definirDataIdContagemArgs = [{ description: 'contagemObject', id: '317e9263' }];
window.blockly.js.blockly.Formulario1.definirDataIdContagem = async function(contagemObject) {
 var idContagem;
  //
  this.cronapi.screen.changeValueOfField("formulario1.active.data", this.cronapi.dateTime.getNow());
  //
  this.cronapi.screen.changeValueOfField("formulario1.active.contagem", contagemObject);
}

/**
 * @function gravar
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 31/05/2025, 14:41:36
 *
 */
window.blockly.js.blockly.Formulario1.gravarArgs = [];
window.blockly.js.blockly.Formulario1.gravar = async function() {
 var idContagem, contagemObject;
  //
  if ((await this.cronapi.client('blockly.js.blockly.Formulario1.validarProduto').run()) && (await this.cronapi.client('blockly.js.blockly.Formulario1.validarQuantidade').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("formulario1"));
    //
    this.cronapi.screen.refreshDatasource("formulario1", 'true');
    //
    this.cronapi.screen.refreshDatasource("OrdenarProdutoDo1FormularioPelaData", 'true');
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
