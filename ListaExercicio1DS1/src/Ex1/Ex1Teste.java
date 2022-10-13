package Ex1;

import java.util.Scanner;

public class Ex1Teste {

public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Digite a operação: (+) (-) (*) (/)");
        String operacao = sc.next();
        sc.close();
        
        Ex1 exemplo = new Ex1(num1, num2, Operacao.dividir);
        
        switch (operacao) {
            case "+":
                exemplo.setOperacao(Operacao.somar);
                exemplo.getOperacao().calcular(num1, num2);
                break;
            case "-":
                exemplo.setOperacao(Operacao.subtrair);
                exemplo.getOperacao().calcular(num1, num2);
                break;
            case "*":
                exemplo.setOperacao(Operacao.multiplicar);
                exemplo.getOperacao().calcular(num1, num2);
                break;
            case "/":
                exemplo.setOperacao(Operacao.dividir);
                exemplo.getOperacao().calcular(num1, num2);
                break;
        }
    }

}
