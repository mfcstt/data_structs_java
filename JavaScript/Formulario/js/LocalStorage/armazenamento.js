// armazena conteudo no navegador
function armazenarDados(chave, valor, tipoArmazenamento) {
    let valorConvertidor = JSON.stringify(valor)
    if(tipoArmazenamento){
        tipoArmazenamento.setItem(chave, valorConvertidor)
    }else{
        alert("Navegador não suporta armazenamento local")
    }

}
// armazena valores do input
function armazenarValores() {
    let nome = document.getElementById('nome').value
    let telefone = document.getElementById('telefone').value

    let novoContato = {
        nome: nome,
        telefone: telefone
    }

    let contatos = JSON.parse(localStorage.getItem('meusContatos'))
    if (!contatos || !Array.isArray(contatos)) {
        contatos = []
    }

    contatos.push(novoContato)
    localStorage.setItem('meusContatos', JSON.stringify(contatos))
    exibirDados()
}



function ler(chave, tipoArmazenamento) {
    let valor = tipoArmazenamento.getItem(chave)
    if (valor) {
        return JSON.parse(valor)
    } else {
        return null
    }
}