window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.SubGrupo = window.blockly.js.blockly.SubGrupo || {};

/**
 * @function validarNome
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 21:46:53
 *
 */
window.blockly.js.blockly.SubGrupo.validarNomeArgs = [];
window.blockly.js.blockly.SubGrupo.validarNome = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("subgrupoapp.active.descSbg"))) {
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
 * @since 05/06/2025, 21:46:53
 *
 */
window.blockly.js.blockly.SubGrupo.validarCodigoArgs = [];
window.blockly.js.blockly.SubGrupo.validarCodigo = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("subgrupoapp.active.codiSbg"))) {
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
 * @since 05/06/2025, 21:46:53
 *
 */
window.blockly.js.blockly.SubGrupo.gravarArgs = [];
window.blockly.js.blockly.SubGrupo.gravar = async function() {

  //
  if ((await this.cronapi.client('blockly.js.blockly.SubGrupo.validarNome').run()) && (await this.cronapi.client('blockly.js.blockly.SubGrupo.validarCodigo').run()) && (await this.cronapi.client('blockly.js.blockly.SubGrupo.validarGrupo').run())) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("subgrupoapp"));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}

/**
 * @function validarGrupo
 *
 *
 *
 *
 * @author Willian Ferreira
 * @since 05/06/2025, 21:46:53
 *
 */
window.blockly.js.blockly.SubGrupo.validarGrupoArgs = [];
window.blockly.js.blockly.SubGrupo.validarGrupo = async function() {

  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("subgrupoapp.active.gprSbg"))) {
    //
    this.cronapi.screen.notify('warning','Informe um Grupo');
    //
    valido = false;
  } else {
    //
    valido = true;
  }
  return valido;
}
