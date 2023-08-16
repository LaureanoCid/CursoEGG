/*
    Realizar un programa que pida una frase y el programa deberá mostrar la frase con un 
    espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el 
    funcionamiento de la función Substring(). 
*/
var frase = prompt("Ingrese una frase: ");
var fraseNueva = "";
for (let i = 0; i < frase.length; i++) {
    fraseNueva += frase.substring(i,i+1) + " ";
}
alert(fraseNueva);