/*
    A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
        a) Determinar cual de los dos elementos de texto es mayor
        b) Utilizando exclusivamente los dos valores booleanos del array, determinar los 
            operadores necesarios para obtener un resultado true y otro resultado false
        c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los 
            dos elementos numéricos
*/
let array1 = [true, 5, false, "hola", "adios", 2];
let palabra = "";

alert("Bienvenido al array loco :)");

for (let i = 0; i < array1.length; i++) {
    alert(typeof(array1[i]));
    if (typeof(array1[i]) == String) {
        palabra = (array1[i].length > palabra.length)?array1[i]:palabra;
    }    
}

alert(`
A) ${palabra}
B)
C)
`);