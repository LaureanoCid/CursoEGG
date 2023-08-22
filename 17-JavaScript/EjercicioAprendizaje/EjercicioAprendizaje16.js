/*
    Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
    y los muestre por pantalla. 
*/
let array1 = [];
let array2 = [];

for (let i = 0; i < 5; i++) {    
    array1[i] = Math.random();
    array2[i] = Math.random();    
}

alert(`Array 1 - ${array1}
Array 2 - ${array2}
`)