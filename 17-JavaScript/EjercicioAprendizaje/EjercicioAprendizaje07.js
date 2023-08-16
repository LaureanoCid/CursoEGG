/*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
    solicite números al usuario hasta que la suma de los números introducidos supere el 
    límite inicial. 
*/
var limite = parseInt(prompt("Ingrese su limite: "));
var suma = 0;

do {
    suma += parseInt(prompt("Ingrese un numero: "));
    alert("El limite actual esta en: " + suma);
} while (suma<=limite);

alert("Felicitaciones! Ha superado el limite!");