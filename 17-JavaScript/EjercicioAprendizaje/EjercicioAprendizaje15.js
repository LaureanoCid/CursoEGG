/*
    Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
    con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
    radio del círculo lo proporcionará el usuario.
*/
alert("¡Bienvenido a la calculadora maestra!");
cargarRadio();
geometriaCirculo();

let circulo = {
    radio:0,
}

function cargarRadio(circulo) {
    radio = prompt("Ingrese el radio de su circulo: ");
}

function geometriaCirculo(circulo) {
    let area = (Math.PI)*(Math.pow(radio, 2));
    let perimetro = 2 * Math.PI * radio;

    alert(`El perimetro es: ${perimetro}
    y el area es: ${area}`);
}