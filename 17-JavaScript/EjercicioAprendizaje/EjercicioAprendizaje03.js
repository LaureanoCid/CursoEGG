/*
    Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de 
    edad se debe mostrar un mensaje indicándolo. 
*/
do {
    var edad = prompt("Ingrese su edad: ");
    if(edad>=18){
        alert("Usted es mayor de edad!");
    }
} while (edad < 18);
