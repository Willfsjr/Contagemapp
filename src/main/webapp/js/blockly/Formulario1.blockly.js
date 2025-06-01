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
 * @since 01/06/2025, 05:07:10
 *
 */
window.blockly.js.blockly.Formulario1.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario1.validarProduto = async function() {
 var contObj, nomeCont, form1Obj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form1.active.produto"))) {
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
 * @since 01/06/2025, 05:07:10
 *
 */
window.blockly.js.blockly.Formulario1.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario1.validarQuantidade = async function() {
 var contObj, nomeCont, form1Obj;
  //
  if (this.cronapi.screen.getValueOfField("form1.active.quantidade") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form1.active.quantidade"))) {
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
 * @function gravar
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 01/06/2025, 05:07:10
 *
 */
window.blockly.js.blockly.Formulario1.gravarArgs = [];
window.blockly.js.blockly.Formulario1.gravar = async function() {
 var contObj, nomeCont, form1Obj;
  //
  if (((await this.cronapi.client('blockly.js.blockly.Formulario1.validarProduto').run()) && (await this.cronapi.client('blockly.js.blockly.Formulario1.validarQuantidade').run())) == true) {
    //
    (await this.cronapi.server('blockly.Formulario1.gravar').toPromise().run());
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
