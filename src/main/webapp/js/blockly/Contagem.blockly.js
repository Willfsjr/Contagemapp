window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Contagem = window.blockly.js.blockly.Contagem || {};

/**
 * @function validarName
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 16:33:23
 *
 */
window.blockly.js.blockly.Contagem.validarNameArgs = [];
window.blockly.js.blockly.Contagem.validarName = async function() {
 var contObj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.name"))) {
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
 * @function validarLoja
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 16:33:23
 *
 */
window.blockly.js.blockly.Contagem.validarLojaArgs = [];
window.blockly.js.blockly.Contagem.validarLoja = async function() {
 var contObj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.loja"))) {
    //
    this.cronapi.screen.notify('warning','Informe uma loja');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}

/**
 * @function definirDataEncerrado
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 16:33:23
 *
 */
window.blockly.js.blockly.Contagem.definirDataEncerradoArgs = [];
window.blockly.js.blockly.Contagem.definirDataEncerrado = async function() {
 var contObj;
  //
  this.cronapi.screen.changeValueOfField("contagem.active.data", this.cronapi.dateTime.getNow());
  //
  this.cronapi.screen.changeValueOfField("contagem.active.encerrado", false);
}

/**
 * @function Gravar
 *
 *
 *
 * @param contObj
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 16:33:23
 *
 */
window.blockly.js.blockly.Contagem.GravarArgs = [{ description: 'contObj', id: 'be511096' }];
window.blockly.js.blockly.Contagem.Gravar = async function(contObj) {

  //
  if ((await this.cronapi.client('blockly.js.blockly.Contagem.validarName').run()) && (await this.cronapi.client('blockly.js.blockly.Contagem.validarLoja').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("contagem"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}

/**
 * @function abrirModal
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 03/06/2025, 16:33:23
 *
 */
window.blockly.js.blockly.Contagem.abrirModalArgs = [];
window.blockly.js.blockly.Contagem.abrirModal = async function() {
 var contObj;
  //
  this.cronapi.screen.showModal("modal71744");
}
