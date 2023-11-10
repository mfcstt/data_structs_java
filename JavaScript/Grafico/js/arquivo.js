
function readFile(nameFile, localExibition) {


    let file = document.getElementById(nameFile);
    let exibithion = document.getElementById(localExibition);

    if (window.File && window.FileReader && window.Blob){
        let downloadFile = file.files[0];
        let fileReader = new FileReader();

        // após o carregamento do arquivo, exibe o conteúdo
        fileReader.onload = function(){
            exibithion.innerHTML = fileReader.result;
        }
        // lê o arquivo como texto
        fileReader.readAsText(downloadFile);
    } else {
        alert('O navegador não suporta a leitura de arquivos');
    }

}