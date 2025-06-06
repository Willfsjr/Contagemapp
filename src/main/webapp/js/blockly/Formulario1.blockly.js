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
 * @since 06/06/2025, 14:56:32
 *
 */
window.blockly.js.blockly.Formulario1.validarProdutoArgs = [];
window.blockly.js.blockly.Formulario1.validarProduto = async function() {
 var idCont, nomeCont, idContForm1;
  //
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form1.active.prodForm1"))) {
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
 * @since 06/06/2025, 14:56:32
 *
 */
window.blockly.js.blockly.Formulario1.validarQuantidadeArgs = [];
window.blockly.js.blockly.Formulario1.validarQuantidade = async function() {
 var idCont, nomeCont, idContForm1;
  //
  if (this.cronapi.screen.getValueOfField("form1.active.quantForm1") < 0 || this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("form1.active.quantForm1"))) {
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
 * @param idContForm1
 *
 * @author Willian Ferreira
 * @since 06/06/2025, 14:56:32
 *
 */
window.blockly.js.blockly.Formulario1.gravarArgs = [{ description: 'idContForm1', id: '03ab29a4' }];
window.blockly.js.blockly.Formulario1.gravar = async function(idContForm1) {
 var idCont, nomeCont;
  //
  if (((await this.cronapi.client('blockly.js.blockly.Formulario1.validarProduto').run()) && (await this.cronapi.client('blockly.js.blockly.Formulario1.validarQuantidade').run())) == true) {
    //
    (await this.cronapi.server('blockly.Formulario1.gravar').names('768650b8').toPromise().run(idContForm1));
  } else {
    //
    this.cronapi.screen.notify('error','Erro: Verifique os campos ');
  }
}
