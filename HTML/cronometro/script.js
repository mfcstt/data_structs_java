//uma variável para cada botao numeros

let start = document.getElementById("start");

let mark = document.getElementById("mark");

let stop = document.getElementById("stop");

let reset = document.getElementById("reset");

 

//atribuiu o valor dos numeros e do contador

let horas = 0;

let minutos = 0;

let segundos = 0;

let milisegundos = 0;

let cont;

 

start.addEventListener("click",startf);

mark.addEventListener("click", markf);

stops.addEventListener("click", stopf);

reset.addEventListener("click", resetf);

 

// if de quando os numeros vão mudar de categoria, e automaticamente aumentar a seguinte, e quando chegar no final zerar todas

function timer(){

    if((milisegundos+=10)==1000){

        milisegundos=0;

        segundos++;

    }

 

    if(segundos==60){

        segundos=0;

        minutos++;    

    }

 

    if(minutos==60){

        minutos=0;

        horas++;

    }

 

    if(horas==24){

        horas=0;

        minutos=0;

        segundos=0;

        milisegundos=0;

    }

    //usar o innerHTML para substituir os numeros e a segunda parte é para mudar os dois dígitos

    document.getElementById("horas").innerHTML = horas.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});

    document.getElementById("minutos").innerHTML = minutos.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});

    document.getElementById("segundos").innerHTML = segundos.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});

    document.getElementById("milisegundos").innerHTML = milisegundos.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});

}

 

//atribui ao contador a função de iniciar

function startf(){

    cont = setInterval(function(){timer()},10);

}

 

//clearInterval interrompe o programa até reiniciar

function stopf(){

    clearInterval(cont);

}

 

//linka ao tempo e divide os numeros para mostrar no timer

function markf(){

    document.getElementById("tempo").innerHTML += horas.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false}) + ":" + minutos.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false}) + ":" + segundos.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false}) + ":" + milisegundos.toLocaleString('pt-BR', {minimumIntegerDigits: 3, useGrouping:false}) +"<br>";

}

 

//zera tudo e fica pronto para iniciar novamente

function resetf(){

    stopf();

    horas=0;

    minutos=0;

    segundos=0;

    milisegundos=0;

    document.getElementById("horas").innerHTML = 0o0.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});;

    document.getElementById("minutos").innerHTML = 0o0.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});;

    document.getElementById("segundos").innerHTML = 0o0.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});;

    document.getElementById("milisegundos").innerHTML = 0o0.toLocaleString('pt-BR', {minimumIntegerDigits: 2, useGrouping:false});;

    document.getElementById("tempo").innerHTML = "";

}