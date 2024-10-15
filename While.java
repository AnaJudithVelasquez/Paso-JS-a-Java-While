public class While {
    int numeroEntrada = 0, resultado = 0, control = 0;

    public While(int numeroEntrada, int resultado, int control) {
        this.numeroEntrada = numeroEntrada;
        this.resultado = resultado;
        this.control = control;
    }
    
    public void calcularSuma(){
    while (numeroEntrada >= control) {
        resultado = resultado + control;
        control = control + 1;
    }
    
    System.out.println ("La suma de los primeros " + numeroEntrada + " naturales es igual a " + resultado);
}
}
