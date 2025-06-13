window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Confronto = window.blockly.js.blockly.Confronto || {};

/**
 * @function gravarConfronto
 *
 *
 *
 * @param idCont
 *
 * @author Willian Ferreira
 * @since 13/06/2025, 09:29:19
 *
 */
window.blockly.js.blockly.Confronto.gravarConfrontoArgs = [{ description: 'idCont', id: 'f1db0d6a' }];
window.blockly.js.blockly.Confronto.gravarConfronto = async function(idCont) {

  //
  this.cronapi.screen.showModal("modal71744");
  //
  (await this.cronapi.server('blockly.Confronto.encerrarContagem').names('81c2b90d').toPromise().run(idCont));
}
