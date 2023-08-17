/*
    Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer, 
    'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
*/
function Persona(nombre, edad, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}  

var bartolo = new Persona("Bartolo", 18, "H", 73.2, 1.87);

console.log(bartolo);

//Lamba + ForEach
Object.keys(bartolo).forEach(function(prop) {
    document.write(prop + ": " + bartolo[prop] + "<br>"); 
});

//For In
for(let propiedad in bartolo) {
    document.write(propiedad + ": " + bartolo[propiedad] + "<br>");
}