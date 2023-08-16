/*
    Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario 
    ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla 
    que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    var mensaje = "ERROR! El valor ingresado es erroneo!"
*/
    do {
        var resp = prompt("Fuiste a votar? S / N").toUpperCase();  
        if (resp == "S") {
            alert("Excelente ciudadano!");
        } else if (resp == "N") {
            alert("Que deshonra! Ve a votar!");
        } else {
            alert(mensaje);
        }
    } while (resp != "S" && resp != "N");
    