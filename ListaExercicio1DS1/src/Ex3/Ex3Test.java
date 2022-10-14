package Ex3;

import java.util.Scanner;

public class Ex3Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();
        sc.close();
        
        
        
        System.out.println("Valor númeroUm: " + num1 + " Valor númeroDois: " + num2);
        
        Ex3.swap(num1, num2);
        
        
    }

}
