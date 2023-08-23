/*
    Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y 
    muestre el siguiente array [6, 9, 12, 15, 18].
*/
let matriz = [[3], [6], [9], [12], [15]];
alert(`Matriz = ${matriz}`);
let array = matriz.flatMap(function Pasaje(x) {return x[0]+=3});
alert(`Array = ${array}`);