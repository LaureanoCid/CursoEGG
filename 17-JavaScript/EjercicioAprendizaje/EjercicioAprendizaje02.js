/*
    Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio 
    de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que 
    para calcular el área y el perímetro se utilizan las siguientes fórmulas: 
        area = PI * radio2 
        perimetro = 2 * PI * radio 
*/
const pi = 3.1416;
var radio = prompt("Ingrese el radio en cm: ")
var perimetro = (2 * pi * radio);
var area = pi * Math.pow(radio,2);
var mensaje = 
`Para un circulo de: ${radio} cm de radio
*Perimetro = ${perimetro} cm
*Area = ${area} cm`

alert(mensaje);