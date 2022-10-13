package Ex2;

public class Ex2 {
    
    
    public static void calcularPotencia(double num) {
        System.out.println(Math.pow(num, 5));
    }
    
    public static void calcularDivisao(double num1, double num2) {
           int resultado = (int) (num1 / num2);
           int resto = (int) (num1%num2);
           System.out.println("Divisao: "+ num1 + " / " + num2 + "= "+ resultado);
           System.out.println("Resto da Divisao: " + num1 + " % " + num2 + "= "+ resto);
    }
    
    public static void calcularRaizQuadrada(double num, double num2) {
        System.out.println("Raiza Quadrada NúmeroUm: " +  (int) Math.sqrt(num));
        System.out.println("Raiz Quadrada NúmeroDois: " + (int) Math.sqrt(num2));
    }
}
