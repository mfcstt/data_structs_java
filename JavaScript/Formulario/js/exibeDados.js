function exibirDados() {
    let contatos = JSON.parse(localStorage.getItem('meusContatos')) || [];
    let corpoTabela = document.getElementById("corpoTabela");
    corpoTabela.innerHTML = ''; // Limpa a tabela antes de adicionar novos dados

    for (let i = 0; i < contatos.length; i++) {
        let linha = document.createElement("tr");

        let celulaNome = document.createElement("td");
        celulaNome.innerHTML = contatos[i].nome;
        linha.appendChild(celulaNome);

        let celulaTelefone = document.createElement("td");
        celulaTelefone.innerHTML = contatos[i].telefone;
        linha.appendChild(celulaTelefone);

        corpoTabela.appendChild(linha);
    }
}