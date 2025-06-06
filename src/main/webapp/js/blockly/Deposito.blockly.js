window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Deposito = window.blockly.js.blockly.Deposito || {};

/**
 * @function validarNome
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 21:34:50
 *
 */
window.blockly.js.blockly.Deposito.validarNomeArgs = [];
window.blockly.js.blockly.Deposito.validarNome = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("depositoapp.active.descDpt"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Nome');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}

/**
 * @function validarCodigo
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 21:34:50
 *
 */
window.blockly.js.blockly.Deposito.validarCodigoArgs = [];
window.blockly.js.blockly.Deposito.validarCodigo = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("depositoapp.active.codiDpt"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Nome');
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
 * @since 05/06/2025, 21:34:50
 *
 */
window.blockly.js.blockly.Deposito.gravarArgs = [];
window.blockly.js.blockly.Deposito.gravar = async function() {

  //
  if ((await this.cronapi.client('blockly.js.blockly.Deposito.validarNome').run()) && (await this.cronapi.client('blockly.js.blockly.Deposito.validarCodigo').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("depositoapp"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
