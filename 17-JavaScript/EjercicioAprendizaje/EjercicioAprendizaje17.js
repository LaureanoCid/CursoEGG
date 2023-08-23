/*
    Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el 
    resultado
*/
alert("Bienvenido al creador de arrays");
let longitud = prompt("Ingrese la cantidad de palabras que desea ingresar: ");
let array1 = [];

for (let index = 0; index < longitud; index++) {
    array1[index] = prompt("Ingrese una palabra: ");
}
alert(`Contunto inicial: ${array1}`);
//Borrado con DELETE
// delete array1[array1.length-1];
// delete array1[array1.length-2];

array1.splice(array1.length-2,2);

alert(`Conjunto final: ${array1}`);