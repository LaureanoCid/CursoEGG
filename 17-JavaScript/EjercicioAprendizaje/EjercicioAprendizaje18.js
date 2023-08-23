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
let contB = 0, num1 = 0, num2 = 0;
let msj = ""

alert("Bienvenido al array loco :)");

for (let i = 0; i < array1.length; i++) {
    if (typeof array1[i] == "string") {
        palabra = (array1[i].length > palabra.length)?array1[i]:palabra;
    }    
    (typeof array1[i] == "boolean")?contB++:contB;
    ((typeof array1[i] == "number")&&(num1 == 0))?num1=array1[i]:((typeof array1[i] == "number")&&(num2 == 0))?num2=array1[i]:num2;
}
(contB <= 2)?msj="Hay 2 boleanos en el Array":msj+="No hay 2 boleanos en el array";
(contB > 2)?msj+=" por ende hay mas de 2 boleanos.":msj+=" por ende no hay mas de 2 boleanos en el array.";

alert(`
A) ${palabra}
B) ${msj}
C)  Operaciones: 
Suma: ${num1 + num2}
Resta: ${num1 - num2}
Multiplicacion: ${num1 * num2}
Division: ${num1 / num2}
Potencia: ${Math.pow(num1,num2)}
`);