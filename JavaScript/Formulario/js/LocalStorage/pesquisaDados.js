function pesquisar(event) {
    event.preventDefault();
   
    var nomeInput = document.getElementById('nome');
    var telefoneInput = document.getElementById('telefone');
    var tabela = document.getElementById('tabela');
    var linhas = tabela.getElementsByTagName('tr');

    for (var i = 0; i < linhas.length; i++) {
        var colunas = linhas[i].getElementsByTagName('td');
        if (colunas.length > 0) {
            if (nomeInput.value && colunas[0].innerText == nomeInput.value) {
                telefoneInput.value = colunas[1].innerText;
                break;
            } else if (telefoneInput.value && colunas[1].innerText == telefoneInput.value) {
                nomeInput.value = colunas[0].innerText;
                break;
            }
        }
    }
}