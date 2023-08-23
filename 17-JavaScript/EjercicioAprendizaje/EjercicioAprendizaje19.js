/*
    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado 
    de 20. 
*/
let arreglo1 = [];
let arreglo2 = [];

for (let i = 0; i < 50; i++) {
    arreglo1[i] = Math.floor(Math.random()*(100));    
}
alert(`Arreglo A aleatorio ${arreglo1}`); //Impresion de arreglo aleatorio

arreglo1.sort(compare);
alert(`Primeros 10 elementos dek arreglo A ${arreglo1.slice(0,10)}`); //Impresion de arreglo ordenado pero solo los primeros 10 elementos

for (let i = 0; i < 20; i++) {
    (i<10)?arreglo2[i]=arreglo1[i]:arreglo2[i] = 0.5;        
}
alert(`Arreglo B combinado ${arreglo2}`);

function compare(a, b) {
    if (a > b) return 1; // si el primer valor es mayor que el segundo
    if (a == b) return 0; // si ambos valores son iguales
    if (a < b) return -1; // si el primer valor es menor que el segundo
}