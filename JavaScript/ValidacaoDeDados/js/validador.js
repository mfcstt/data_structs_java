
//here i need to validate if the email is valid
function validarEmail(valor) {
    const regex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return regex.test(valor);
  }
  

//validate password with at least 6 characters and 1 number
function validarPassword(valor) {
    let size = valor.length;
    if (size < 6) {
        return false;
    
    }
    
    //here i need to validate if the password has at least 1 number
    let vetor = valor.split("");
    let valido = false;
    for (let i = 0; i < size; i++) {
      valido = valido || (!isNaN(vetor[i]));
        }
        if(!valido){
            return false;
        }

     //here i need to validate if the password has at least 1 uppercase letter
        valido = false;
        for(let i = 0; i < size; i++){
            valido = valido || (A<=vetor[i] && vetor[i]<=Z);
            if(!valido){
             return false;
            }

 //here i need to validate if the password has at least 1 special character
        valido = false;
        for(let i = 0; i < size; i++){
            valido = valido || ("!@#$%&*()_+{}|:<>?".includes(vetor[i]));
            if(!valido){
             return false;
            }
            return true;

    }
}
}
