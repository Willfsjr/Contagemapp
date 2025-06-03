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
 * @since 03/06/2025, 17:41:01
 *
 */
window.blockly.js.blockly.Formulario2.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario2.validarProduto = async function() {
 var contObj2, nomeCont2, valido;
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
 * @since 03/06/2025, 17:41:01
 *
 */
window.blockly.js.blockly.Formulario2.gravarArgs = [];
window.blockly.js.blockly.Formulario2.gravar = async function() {
 var contObj2, nomeCont2, valido;
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
 * @since 03/06/2025, 17:41:01
 *
 */
window.blockly.js.blockly.Formulario2.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario2.validarQuantidade = async function() {
 var contObj2, nomeCont2, valido;
  //
  if (this.cronapi.screen.getValueOfField("form2.active.quantidade2") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form2.active.quantidade2"))) {
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
