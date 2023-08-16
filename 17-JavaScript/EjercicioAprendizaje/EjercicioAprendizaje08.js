/*
    Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
    programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
    todos ellos. 
*/

var opcion = 0, prom = 0, cont = 0;

opcion = parseInt(prompt("Ingrese un numero: "));
var min = opcion;
var max = opcion;
cont++;
prom = opcion;
while (opcion != 0) {
    opcion = parseInt(prompt("Ingrese un numero: "));
    if (opcion != 0) {
        (opcion<min)? min = opcion: min = min;
        (opcion>max)? max = opcion: max = max;
        cont++;
        prom += opcion;
    }    
}
prom = prom / cont;
var msj = `El numero maximo es ${max}
El numero minimo es ${min}
y el promedio es ${prom}`
alert(msj);