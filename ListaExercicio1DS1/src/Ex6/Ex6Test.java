package Ex6;

import java.util.Scanner;

public class Ex6Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        Ex6 exemplo = new Ex6(celsius);
        exemplo.converterTempFahrenheit();
        System.out.println("Valor em Fahrenheit = " + exemplo.getF() + "ºF");
        

    }

}
