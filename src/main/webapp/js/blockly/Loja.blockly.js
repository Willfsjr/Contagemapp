window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Loja = window.blockly.js.blockly.Loja || {};

/**
 * @function validarNome
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 29/05/2025, 14:19:43
 *
 */
window.blockly.js.blockly.Loja.validarNomeArgs = [];
window.blockly.js.blockly.Loja.validarNome = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("loja.active.name"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Nome');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
}

/**
 * @function validarCodigo
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 29/05/2025, 14:19:43
 *
 */
window.blockly.js.blockly.Loja.validarCodigoArgs = [];
window.blockly.js.blockly.Loja.validarCodigo = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("loja.active.codigo"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Nome');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
}

/**
 * @function Gravar
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 29/05/2025, 14:19:43
 *
 */
window.blockly.js.blockly.Loja.GravarArgs = [];
window.blockly.js.blockly.Loja.Gravar = async function() {

  //
  if ((await this.cronapi.client('blockly.js.blockly.Loja.validarNome').run()) && (await this.cronapi.client('blockly.js.blockly.Loja.validarCodigo').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("loja"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
