

let relogio = document.getElementById("relógio");

function mostraHora(onde){

    let horaatual = new Date()

    onde.innerHTML = horaatual.getHours() + ":"

                   + horaatual.getMinutes() + ":"

                   + horaatual.getSeconds();

 

}

setInterval(1000,function(){mostraHora(relógio)}, 1000);