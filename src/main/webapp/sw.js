self.addEventListener('install', event => {
  console.debug('Installing SW');
  event.waitUntil(Promise.resolve());
});

self.addEventListener('fetch', event => {
  // Somente processa requisições GET e http(s)
  if (event.request.method !== 'GET' || !event.request.url.startsWith('http')) {
    return;
  }

  event.respondWith(
    fetch(event.request)
      .then(response => {
        // Clona a resposta para armazenar em cache
        const responseClone = response.clone();
        caches.open('static').then(cache => {
          cache.put(event.request, responseClone).catch(err => {
            console.debug('Erro ao armazenar no cache:', err);
          });
        });
        return response;
      })
      .catch(() => {
        // Se offline, tenta retornar do cache
        return caches.match(event.request).then(cachedResponse => {
          return cachedResponse || new Response('Offline e recurso não está no cache', {
            status: 503,
            statusText: 'Service Unavailable'
          });
        });
      })
  );
});
