(function () {
  'use strict';

  this.cronapi = this.cronapi || {};

  /**
   * @categoryName PWA
   */
  this.cronapi.PWA = this.cronapi.PWA || {};

  /**
   * @type function
   * @name {{installPWA}}
   * @description {{descriptionPWA}}
   * @multilayer false
   * @param {ObjectType.STATEMENTSENDER} callbackSuccess {{callbackSuccess}}
   * @param {ObjectType.STATEMENTSENDER} callbackCancel {{callbackCancel}}
   * @returns {ObjectType.VOID}
   */
  this.cronapi.PWA.install = function (callbackSuccess, callbackCancel) {
    if (deferredPrompt) {
      deferredPrompt.prompt();
      deferredPrompt.userChoice.then(function (choiceResult) {
        if (choiceResult.outcome === 'dismissed') {
          console.debug('User cancelled installation');
          if (callbackCancel) {
            callbackCancel(choiceResult);
          }
        } else {
          console.debug('User added application to home screen');
          if (callbackSuccess) {
            callbackSuccess(choiceResult);
          }
        }
      });
    } else {
      throw new Error('Error on install PWA');
    }
  };

}).bind(window)();