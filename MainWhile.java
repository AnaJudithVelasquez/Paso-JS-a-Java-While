import java.util.Scanner;

public class MainWhile {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntrada = 0, resultado = 0, control = 0;
        System.out.println("Ingrese el número que desea calcular");
        numeroEntrada = sc.nextInt();

        While pruebaWhile = new While(numeroEntrada, resultado, control);
        pruebaWhile.calcularSuma();
        sc.close();
    }
}
