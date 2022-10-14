package Ex4;

import java.util.Scanner;

public class Ex4Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex4 exemplo = new Ex4(sc);
        
        System.out.println("Valor final da compra = " + exemplo.valorFinal());
        System.out.println("Valor do desconto = " + exemplo.valorDesconto());
    }

}
