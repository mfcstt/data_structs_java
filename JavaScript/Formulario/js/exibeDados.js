function exibirDados() {
    //recupera os valorres 
    let contatos = JSON.parse(localStorage.getItem('meusContatos')) || []
    let tabela = document.getElementById("tabela")
    

    //cria nova linhas cada vez que novos dados sao adicionados
    for (let i = 0; i < contatos.length; i++) {
        let linha = document.createElement("tr")

        let nome = document.createElement("td")
        nome.innerHTML = contatos[i].nome
        linha.appendChild(nome)

        let telefone = document.createElement("td")
        telefone.innerHTML = contatos[i].telefone
        linha.appendChild(telefone)

        tabela.appendChild(linha)
    }
}

//exibe a tabela no navegador
let body = document.getElementById("tabela")
body.innerHTML += window.localStorage.getItem("tabela")

// mantem a exibição a tabela após o carregamento da pagina
window.onload = function() {
    exibirDados();
}