window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Formulario2 = window.blockly.js.blockly.Formulario2 || {};

/**
 * @function validarProduto
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 01/06/2025, 05:18:10
 *
 */
window.blockly.js.blockly.Formulario2.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario2.validarProduto = async function() {
 var contObj, nomeCont;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form2.active.produto"))) {
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
 * @function gravar
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 01/06/2025, 05:18:10
 *
 */
window.blockly.js.blockly.Formulario2.gravarArgs = [];
window.blockly.js.blockly.Formulario2.gravar = async function() {
 var contObj, nomeCont;
  //
  if (((await this.cronapi.client('blockly.js.blockly.Formulario2.validarProduto').run()) && (await this.cronapi.client('blockly.js.blockly.Formulario2.validarQuantidade').run())) == true) {
    //
    (await this.cronapi.server('blockly.Formulario2.gravar').toPromise().run());
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}

/**
 * @function validarQuantidade
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 01/06/2025, 05:18:10
 *
 */
window.blockly.js.blockly.Formulario2.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario2.validarQuantidade = async function() {
 var contObj, nomeCont;
  //
  if (this.cronapi.screen.getValueOfField("form2.active.quantidade") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form2.active.quantidade"))) {
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
