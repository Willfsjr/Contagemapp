var deferredPrompt;
if ('serviceWorker' in navigator) {
  console.debug('executing serviceworker');

  navigator.serviceWorker.register('sw.js').then(registration => {
    console.debug('Service worker registered!', registration);
  }).catch(error => {
    console.error('Service worker Error!', error);
  });

  navigator.serviceWorker.addEventListener('message', event => {
    console.debug(`The service worker sent me a message: ${event.data}`);
  });

  navigator.serviceWorker.ready.then(registration => {
    registration.active.postMessage(window.cacheableResources || []);
  });
}

window.addEventListener('appinstalled', () => {
  console.debug('PWA was installed');
});

const fireAddToHomeScreenImpression = event => {
  console.debug("Add to homescreen shown");
  deferredPrompt = event;

  event.userChoice.then(choiceResult => {
    console.debug('User clicked ', choiceResult);
  });

  window.removeEventListener(
      "beforeinstallprompt",
      fireAddToHomeScreenImpression
  );
};

window.addEventListener('beforeinstallprompt', fireAddToHomeScreenImpression);

window.addEventListener("load", () => {
  let trackText;
  if (navigator && navigator.standalone) {
    trackText = "Launched: Installed (iOS)";
  } else if (matchMedia("(display-mode: standalone)").matches) {
    trackText = "Launched: Installed";
  } else {
    trackText = "Launched: Browser Tab";
  }
  console.debug(trackText);
});
