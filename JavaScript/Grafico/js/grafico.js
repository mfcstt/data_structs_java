let localExibition;
let origemData;
let matriz = [];

function displayGraph(origem, destino){
    localExibition = document.getElementById(destino);
    origemData = document.getElementById(origem);
    
    let vetor = origemData.innerHTML.split("\n");
    
    for(let i = 0; i < vetor.length; i++){
        let data = vetor[i].split(",");
        if(i !== 0){
            data[1] = parseFloat(data[1]);
            data[2] = parseFloat(data[2]);
        }
        matriz.push(data);
    }
    
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);
}

function drawChart() {
    let data = google.visualization.arrayToDataTable(matriz);
    
    let options = {
        title: 'Dados Cotação do Dólar',
        curveType: 'function',
        legend: { position: 'bottom' }, // Mover a legenda para a parte inferior pode torná-la mais visível
        colors: ['#09090A', '#996DFF'],
        width: '100%', // Fazer o gráfico responsivo
        height: 500,
        hAxis: { // Personalizar o eixo horizontal
            title: 'Tempo',
            format: 'M/d/yy', // Formato da data
            gridlines: { count: 5 }, // Reduzir o número de linhas de grade pode tornar o gráfico mais limpo
        },
        vAxis: { // Personalizar o eixo vertical
            title: 'Valor',
        },
        chartArea: { // Aumentar a área do gráfico
            width: '80%',
            height: '70%'
        },
        lineWidth: 2, // Aumentar a espessura da linha
      
    };
    let chart = new google.visualization.LineChart(document.getElementById("grafico"));

    chart.draw(data, options);
}