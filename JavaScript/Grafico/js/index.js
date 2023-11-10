let file = document.getElementById('file');
file.addEventListener('change', function(){

    readFile("file", "info");

});

let execute = document.getElementById("exibir");
execute.addEventListener('click', function(){
    displayGraph("info", "grafico");
})