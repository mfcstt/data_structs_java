    //criar tags html a partir do javascript
    //definindo variaveis gloabais

    let local = document.getElementById("localTabela");
    //criar objeto
    let data = [
        {product: "nike", description: "black", qtd: 10},
        {product: "adidas", description: "purple", qtd: 5},
        {product: "mizuno", description: "blue", qtd: 80}, 
    ]

    function createElement(){
        let table = document.createElement("table"); //palavra reservada html
        let line =  document.createElement("tr"); // table row 
        let hd01= document.createElement("th"); // table header (cabeçalho)
        let hd02 = document.createElement("th");
        let hd03 = document.createElement("th")

        hd01.innerHTML = "Product";
        hd02.innerHTML = "Descriptiom";
        hd03.innerHTML = "Quantity";

        line.appendChild(hd01) // inserir um elemento dentro de outro
        line.appendChild(hd02);
        line.appendChild(hd03);
        table.appendChild(line);

        let contador = 1;
            for (let item in data ) {  
          
                
                let newline = document.createElement("tr");
                let col01 = document.createElement("td"); //table data
                let col02 = document.createElement("td");
                let col03 = document.createElement("td");
                
                col01.innerHTML = data[item].product;
                col02.innerHTML = data[item].description;
                col03.innerHTML = data[item].qtd;
                
                contador++;
                
                newline.appendChild(col01);
                newline.appendChild(col02);
                newline.appendChild(col03);
                table.appendChild(newline);
            }
            local.appendChild(table);
            
            let button01 = document.createElement("input");
            button01.type="submit";
            button01.value = "send data"
            
            let button02 = document.createElement("input");
            button02.type="submit";
            button02.value = "show message"
            button02.addEventListener("click", () => {alert("oi")})
            
            local.appendChild(button01);
            local.appendChild(button02);
            
            
        }
            createElement();

    