
//comando para armazenar dados no navegador
gravar("manga","Manga: Tenjo Tenge")

//comando para recuperar dados armazenados no navegador
let vetor = ["Preço Manga", 20.00 + " reais"];
window.localStorage.setItem(" preço", vetor);
// comando para transformar vetor em string
let vetorConvertido = JSON.stringify(vetor);
window.localStorage.setItem("Preço Manga", vetorConvertido);


//comando para recuperar dados armazenado no navegador e transformar objeto em string
let objetoA01 = {anime: "Hunter x Hunter", episodio: 100};
let objetoA02 = {anime: "Cowboy Bepop", episodio: 26 };
let listaAnime = [objetoA01, objetoA02];
let listaConvertida = JSON.stringify(listaAnime);
window.localStorage.setItem("listaAnime", listaConvertida);

//mostrando dados armazenados no navegar na tela
let body = document.getElementById("exibe");
body.innerHTML += window.localStorage.getItem("manga");
body.innerHTML += "<br>" ;
body.innerHTML += window.localStorage.getItem("Preço Manga");
body.innerHTML += "<br>" ;
body.innerHTML +=window.localStorage.getItem("listaAnime");
body.innerHTML += "<br>" ;


body.innerHTML += "<br>" ;
body.innerHTML += JSON.parse(window.localStorage.getItem("Preço Manga"));
body.innerHTML += "<br>" ;
body.innerHTML += JSON.parse(window.localStorage.getItem("listaAnime"));
body.innerHTML += "<br>" ;



body.innerHTML += "<br>";
let novoVetor = JSON.parse(window.localStorage.getItem("Preço Manga"));
let novaLista = JSON.parse(window.localStorage.getItem("listaAnime"));
body.innerHTML += "<br>";
body.innerHTML += novaLista[0].anime + "<--->";
body.innerHTML += novaLista[1].episodio + "<br>";
body.innerHTML += novaLista[1].anime + "<--->";
body.innerHTML += novaLista[0].episodio + "<br>";




//função para gravar dados no navegador
function gravar(nomeDaChave, conteudo) {
    let dado = JSON.stringify(conteudo);
    if(localStorage){
        localStorage.setItem(nomeDaChave, dado);
    }else{
        alert("Navegador não suporta local storage");
    }
}
//função para ler dados no navegador 
function ler (nomeDaChave){
    if(Storage){
        let conteudo = JSON.parse(localStorage.getItem(nomeDaChave));
        return conteudo;
    }else{
        alert("Storage não disponível");
    }
}