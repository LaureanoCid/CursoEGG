/*
    Construir un programa que simule un menú de opciones para realizar las cuatro 
    operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores 
    numéricos enteros. El usuario, además, debe especificar la operación con el primer 
    carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ 
    o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división. 
*/
var num1, num2;
var opcion = prompt(`Ingrese la operacion matematica que desee realizar: 
Suma - (S) - (s)
Resta - (R) - (r)
Multiplicacion - (M) - (m)
Division - (D) - (d)`).toUpperCase();

switch (opcion) {
    case "S":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La suma resultante es: " + (num1 + num2));
        break;
    case "R":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La resta resultante es: " + (num1 - num2));
        break;
    case "M":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La multiplicacion resultante es: " + (num1 * num2));
        break;    
    case "D":
        num1 = parseInt(prompt("Ingrese el dividendo: "));
        num2 = parseInt(prompt("Ingrese el divisor: "));
        while (num2<=0) {
            num2 = parseInt(prompt("Error! No puede ser igual o menor a 0! Ingrese el divisor: "));
        }
        alert("La multiplicacion resultante es: " + (num1 / num2));
        break;
    default:
        alert("Opcion invalida! Ingrese otra opcion!");
        break;
}
