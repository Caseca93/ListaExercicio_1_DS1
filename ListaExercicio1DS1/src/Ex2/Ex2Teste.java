package Ex2;

import java.util.Scanner;

public class Ex2Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        double numero2 = sc.nextDouble();
        sc.close();
        
        Ex2.calcularPotencia(numero);
        Ex2.calcularDivisao(numero, numero2);
        Ex2.calcularRaizQuadrada(numero, numero2);
    }

}
