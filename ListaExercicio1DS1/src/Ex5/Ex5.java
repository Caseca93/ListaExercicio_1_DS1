package Ex5;

import java.util.Scanner;

public class Ex5 {
    
    private final double VALOR_DOLAR = 1500;
    private double conversaoReal;
    
    public Ex5(Scanner sc) {
        System.out.println("Quanto está a conversão de dolar para real: ");
        this.conversaoReal =  sc.nextDouble();
    }
    
    public double valorConvertido() {
        double x = (VALOR_DOLAR * this.conversaoReal);
        return Math.round(x);
    }

    @Override
    public String toString() {
        return "VALOR_DOLAR = " + VALOR_DOLAR + ", conversaoReal = " + conversaoReal + "\nValor Convertido = " + this.valorConvertido();
    }
    
    
}
