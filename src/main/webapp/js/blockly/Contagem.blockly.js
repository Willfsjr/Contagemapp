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
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.validarNameArgs = [];
window.blockly.js.blockly.Contagem.validarName = async function() {
 var contObj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.descCont"))) {
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
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.validarLojaArgs = [];
window.blockly.js.blockly.Contagem.validarLoja = async function() {
 var contObj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.lojaCont"))) {
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
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.definirDataEncerradoArgs = [];
window.blockly.js.blockly.Contagem.definirDataEncerrado = async function() {
 var contObj;
  //
  this.cronapi.screen.changeValueOfField("contagem.active.dataCont", this.cronapi.dateTime.getNow());
  //
  this.cronapi.screen.changeValueOfField("contagem.active.fimCont", false);
}

/**
 * @function Gravar
 *
 *
 *
 * @param contObj
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.GravarArgs = [{ description: 'contObj', id: 'be511096' }];
window.blockly.js.blockly.Contagem.Gravar = async function(contObj) {

  //
  if ((await this.cronapi.client('blockly.js.blockly.Contagem.validarName').run()) && (await this.cronapi.client('blockly.js.blockly.Contagem.validarLoja').run()) && (await this.cronapi.client('blockly.js.blockly.Contagem.validarDeposito').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("contagem"));
    //
    this.cronapi.screen.refreshDatasource("contagem", 'true');
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
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.abrirModalArgs = [];
window.blockly.js.blockly.Contagem.abrirModal = async function() {
 var contObj;
  //
  this.cronapi.screen.showModal("modal71744");
}

/**
 * @function validarDeposito
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 17:21:46
 *
 */
window.blockly.js.blockly.Contagem.validarDepositoArgs = [];
window.blockly.js.blockly.Contagem.validarDeposito = async function() {
 var contObj;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("contagem.active.depCont"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Deposito');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}
