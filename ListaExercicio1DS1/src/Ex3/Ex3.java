package Ex3;

public class Ex3 {
    
    private int num1;
    private int num2;
    
    public static void swap(int num1, int num2) {
        int num3;
        
        num3 = num1;
        num1 =  num2;
        num2 = num3;
        System.out.println("Valor númeroUm: " + num1 + " Valor númeroDois: " + num2);
    }

}
