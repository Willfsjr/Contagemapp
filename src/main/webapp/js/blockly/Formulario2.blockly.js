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
 * @since 06/06/2025, 17:28:10
 *
 */
window.blockly.js.blockly.Formulario2.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario2.validarProduto = async function() {
 var idCont2, nomeCont2, idContForm2;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form2.active.prodForm2"))) {
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
 * @param idContForm2
 *
 * @author Willian Ferreira
 * @since 06/06/2025, 17:28:10
 *
 */
window.blockly.js.blockly.Formulario2.gravarArgs = [{ description: 'idContForm2', id: '42004d50' }];
window.blockly.js.blockly.Formulario2.gravar = async function(idContForm2) {
 var idCont2, nomeCont2;
  //
  if (((await this.cronapi.client('blockly.js.blockly.Formulario2.validarProduto').run()) && (await this.cronapi.client('blockly.js.blockly.Formulario2.validarQuantidade').run())) == true) {
    //
    (await this.cronapi.server('blockly.Formulario2.gravar').names('4b686d63').toPromise().run(idContForm2));
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
 * @since 06/06/2025, 17:28:10
 *
 */
window.blockly.js.blockly.Formulario2.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario2.validarQuantidade = async function() {
 var idCont2, nomeCont2, idContForm2;
  //
  if (this.cronapi.screen.getValueOfField("form2.active.quantForm2") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form2.active.quantForm2"))) {
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
