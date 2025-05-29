window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Contagem = window.blockly.js.blockly.Contagem || {};

/**
 * @function validarNome
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 28/05/2025, 18:00:52
 *
 */
window.blockly.js.blockly.Contagem.validarNomeArgs = [];
window.blockly.js.blockly.Contagem.validarNome = async function() {
 var valido;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.nome"))) {
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
 * @function definirData
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 28/05/2025, 18:00:52
 *
 */
window.blockly.js.blockly.Contagem.definirDataArgs = [];
window.blockly.js.blockly.Contagem.definirData = async function() {
 var valido;
  //
  this.cronapi.screen.changeValueOfField("contagem.active.data", this.cronapi.dateTime.getNow());
}

/**
 * @function validarLoja
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 28/05/2025, 18:00:52
 *
 */
window.blockly.js.blockly.Contagem.validarLojaArgs = [];
window.blockly.js.blockly.Contagem.validarLoja = async function() {
 var valido;
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
 * @function Gravar
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 28/05/2025, 18:00:52
 *
 */
window.blockly.js.blockly.Contagem.GravarArgs = [];
window.blockly.js.blockly.Contagem.Gravar = async function() {
 var valido;
  //
  if ((await this.cronapi.client('blockly.js.blockly.Contagem.validarNome').run()) && (await this.cronapi.client('blockly.js.blockly.Contagem.validarLoja').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("contagem"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
