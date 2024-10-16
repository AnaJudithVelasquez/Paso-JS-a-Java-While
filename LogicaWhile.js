var numeroEntrada = 0;
var resultado = 0;
var control=0;
numeroEntrada = parseInt(prompt("Ingrese el número que desea calcular"));
while (numeroEntrada>=control) {
    resultado = resultado + control;
    control = control + 1;
}

alert("La suma de los primeros " + numeroEntrada + " naturales es igual a " + resultado);