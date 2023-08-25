/*
    Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo 
    amarillo, por ejemplo)
*/

document.getElementsByTagName("p")[0].innerHTML = document
.getElementsByTagName("p")[0]
.innerText.split(" ")
.map((palabra) =>
palabra.length > 8 ? `<span class = "yb">${palabra}</span>` : palabra
)
.join(" ");