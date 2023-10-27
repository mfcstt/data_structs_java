//code for the index page

//variables created to get the elements of the page
let button = document.getElementById("validar");
let form = document.getElementsByTagName("form");


button.addEventListener("click", validation);

//
function validation(){
    ok = true;
    if(validarEmail(document.getElementById("email").value)){
        document.getElementById("erroremail").innerHTML="email is valid";
    }
    else{
       document.getElementById("erroremail").innerHTML="email is not valid";
        ok = false;
    }
    if(validarPassword(document.getElementById("password").value)){
        document.getElementById("errorpass").innerHTML="password is valid";
    }
    else{
        document.getElementById("errorpass").innerHTML="password is not valid";
        ok = false;

    }if(ok == true){
        form.submit();
    }
}

