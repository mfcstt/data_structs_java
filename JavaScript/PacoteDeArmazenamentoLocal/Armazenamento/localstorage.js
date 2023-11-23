

// Função para armazenar um conjunto de dados
function armazenarDados(nomeDaChave, conteudo, tipoDeArmazenamento) {
    let conteudoConvertido = JSON.stringify(conteudo);
    if(tipoDeArmazenamento){
        tipoDeArmazenamento.setItem(nomeDaChave, conteudoConvertido);
    }else{
        alert("Navegador não suporta armazenamento local");
    }
}


// Função para ler dados no navegador 
function ler(nomeDaChave, tipoDeArmazenamento){
    if(tipoDeArmazenamento){
        let conteudo = JSON.parse(tipoDeArmazenamento.getItem(nomeDaChave));
        return conteudo;
    }else{
        alert("Armazenamento não disponível");
    }
}
