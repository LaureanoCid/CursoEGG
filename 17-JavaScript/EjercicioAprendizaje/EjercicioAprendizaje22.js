/*
    Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a 
    elección.
*/
function botonFeo() {
  alert(`Vas a tener que leer la guia este fin de semana :(`);  
}
document.getElementById("Boton1").onclick=botonFeo;

function botonLindo() {
    alert(`Buen fin de semana, estas libre :)`);  
}
document.getElementById("Boton2").onclick=botonLindo;