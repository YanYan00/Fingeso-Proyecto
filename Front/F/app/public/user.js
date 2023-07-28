const textarea = document.querySelector('textarea[name="textarea"]');
const addButton = document.querySelector('.ticket-form button[type="submit"]');
const historyButton = document.querySelector('#history-button');
const ticketsContainer = document.querySelector('#tickets-container');

addButton.addEventListener('click', function(e) {
  e.preventDefault(); // Previene el comportamiento por defecto de recarga de la página

  const descripcion = textarea.value; // Obtiene el valor del textarea

  // Configura la solicitud HTTP
  const requestOptions = {
    method: 'POST', // Método HTTP
    headers: { 'Content-Type': 'application/json' }, // Headers de la solicitud
    body: JSON.stringify({ descripcion }) // Cuerpo de la solicitud
  };

  // Realiza la solicitud HTTP
  fetch('http://localhost:8080/api/usuarios/3/tickets', requestOptions)
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la respuesta del servidor');
      }
      return response.json();
    })
    .then(data => {
      console.log(data);
      // Aquí puedes añadir lo que quieras hacer después de la solicitud (por ejemplo, limpiar el textarea)
      textarea.value = '';
    })
    .catch(error => {
      console.error('Ha ocurrido un error:', error);
      // Aquí puedes añadir lo que quieras hacer en caso de error (por ejemplo, mostrar un mensaje de error)
    });
});

historyButton.addEventListener('click', function() {
  // Realiza la solicitud HTTP GET
  fetch('http://localhost:8080/api/usuarios/3/tickets')
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la respuesta del servidor');
      }
      return response.json();
    })
    .then(data => {
      // Limpia el contenedor de tickets
      ticketsContainer.innerHTML = '';

      // Crea y añade los elementos de ticket al contenedor
      data.forEach(ticket => {
        const ticketElement = document.createElement('div');
        ticketElement.classList.add('ticket');
      
        ticketElement.innerHTML = 
          "<h2>Ticket " + ticket.id + "</h2>" +
          "<p>Estado: " + (ticket.estado ? 'Abierto' : 'Cerrado') + "</p>" +
          "<p>Descripción: " + (ticket.descripcion || 'No proporcionada') + "</p>" +
          "<p>Fecha de apertura: " + new Date(ticket.fechaApertura).toLocaleString() + "</p>" +
          (ticket.fechaCierre ? "<p>Fecha de cierre: " + new Date(ticket.fechaCierre).toLocaleString() + "</p>" : '');
      
        ticketsContainer.appendChild(ticketElement);
      });
    })
    .catch(error => {
      console.error('Ha ocurrido un error:', error);
      // Aquí puedes añadir lo que quieras hacer en caso de error (por ejemplo, mostrar un mensaje de error)
    });
});
