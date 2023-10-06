let speed = 10;
let ball = document.getElementById("bolinha")
let area = document.getElementById("area")
let coord_ball = ball.getBoundingClientRect();
let coord_area = area.getBoundingClientRect();
let mt = 0;
let mb = 0;
let mr = 0;
let ml = 0;
let documento = document;
documento.addEventListener("keydown",(event) => (teclado(event)));
documento.addEventListener("keydown", mover);

function teclado(tecla){
    switch (tecla.code){

        case "ArrowUp":
            mt = -speed
            break;

       case "ArrowDown":
            mb = speed
           break;

       case "ArrowLeft":
           ml = -speed
           break;

       case "ArrowRigth":
           mr = speed;
           break;

       case"NumpadAdd":
           speed++;
           break;

       case"NumpadSubstract":
           speed--;
           break;

           default:
           mt = 0;
           mb = 0;
           mr = 0;
           ml = 0;
           break;
   }
}

function mover(){

    ball.style.top = Math.trunc(coord_ball.top - coord_area.top) + (mt+mb) + "px";
    ball.style.left = Math.trunc(coord_ball.left - coord_area.left) + (mr + ml) + "px";
    coord_ball = ball.getBoundingClientRect();

    mt = 0;
    mb = 0;
    mr = 0;
    ml = 0;
}