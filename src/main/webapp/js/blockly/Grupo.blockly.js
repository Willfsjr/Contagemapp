window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Grupo = window.blockly.js.blockly.Grupo || {};

/**
 * @function validarNome
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 21:40:42
 *
 */
window.blockly.js.blockly.Grupo.validarNomeArgs = [];
window.blockly.js.blockly.Grupo.validarNome = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("grupoapp.active.descGpr"))) {
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
 * @since 05/06/2025, 21:40:42
 *
 */
window.blockly.js.blockly.Grupo.validarCodigoArgs = [];
window.blockly.js.blockly.Grupo.validarCodigo = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("grupoapp.active.codiGpr"))) {
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
 * @since 05/06/2025, 21:40:42
 *
 */
window.blockly.js.blockly.Grupo.gravarArgs = [];
window.blockly.js.blockly.Grupo.gravar = async function() {

  //
  if ((await this.cronapi.client('blockly.js.blockly.Grupo.validarNome').run()) && (await this.cronapi.client('blockly.js.blockly.Grupo.validarCodigo').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("grupoapp"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
