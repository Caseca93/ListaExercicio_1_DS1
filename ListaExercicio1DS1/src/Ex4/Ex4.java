package Ex4;

import java.util.Scanner;

public class Ex4 {
    
    private double valorCompra;
    private double desconto;
    
    public Ex4(double valorCompra, double desconto) {
        this.valorCompra = valorCompra;
        this.desconto = desconto;
    }
    
    public Ex4(Scanner sc) {
       System.out.println("Digite o valo da compra: ");
       valorCompra = sc.nextDouble();
       System.out.println("Digite o valor do desconto: ");
       desconto = sc.nextInt();
    }
    
    
    public double valorFinal() {
        double valorFinal = this.valorCompra - (this.valorCompra * (this.desconto / 100));
        return valorFinal;
    }
    
    public double valorDesconto() {
        double valorDesconto = (this.valorCompra * (this.desconto / 100));
        return valorDesconto;
    }
    

}
