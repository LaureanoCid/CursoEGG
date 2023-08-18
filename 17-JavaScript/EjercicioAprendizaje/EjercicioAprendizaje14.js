/*
    Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
    Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
    y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
    numero de páginas.
*/
function Libro(ISBN, titulo, autor,numPaginas){
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

var libro1 = new Libro();

let crear(libro1) => {    
    libro1.ISBN = prompt("Ingrese el numero de identificacion: ");
    libro1.titulo = prompt("Ingrese el titulo del libro: ");
    libro1.autor  = prompt("Ingrese el nombre del autor: ");
    libro1.numPaginas = prompt("Ingrese el numero de paginas: ");
}
crear();
let mostrar (libro1) => {
    for (let propiedad in libro1) {
        alert(propiedad + ": " + libro1[propiedad] + "<br>");
    }
}
mostrar();