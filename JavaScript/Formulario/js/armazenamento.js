//armanezamento local no navegador do email e nome

// recuperar pelo id
let email = document.getElementById("email");
let telefone = document.getElementById("telefone");
let adicionar = document.getElementById("add");
let pesquisar = document.getElementById("pesquisar");
let lista = [];
let agenda;

//evento de click
adicionar.addEventListener("click", function()  {
    let vetor = [nome.value, telefone.value]; 
    lista.push(vetor);
    let vetorConvertido = JSON.stringify(lista);
    localStorage.setItem("dados", vetorConvertido);
    carregarTabela();
});

//função para gravar dados no navegador
function gravar(nomeDaChave, conteudo) {
    if(localStorage){
        let dado = JSON.stringify(conteudo);
        localStorage.setItem(nomeDaChave, dado);
    }else{
        alert("Navegador não suporta local storage");
    }
}

//função para exibir dados no navegador
function carregarTabela(){
    let tabela = document.getElementById("tabela");
    let tbody = document.createElement("tbody");
    tabela.appendChild(tbody);
    for (var linha in agenda){
        let tr = document.createElement("tr");
        let td = document.createElement("td");
        td.innerHTML = agenda[linha];
        tr.appendChild(td);
        tbody.appendChild(tr);
    }
}
