let relogio = document.getElementById("relogio");

 

function mostrahora(onde) {

  let horaatual = new Date();

  onde.innerHTML =

    horaatual.getHours() +

    ":" +

    horaatual.getMinutes() +

    ":" +

    horaatual.getSeconds() +

    ":";

}

 

setInterval(function () {

  mostrahora(relogio);

}, 1000);