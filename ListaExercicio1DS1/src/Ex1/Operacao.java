package Ex1;

public enum Operacao {
    somar {
        @Override
        public void calcular(double num1, double num2) {
            System.out.println("Soma: " + (num1 + num2));
            
        }
    }, subtrair {
        @Override
        public void calcular(double num1, double num2) {
            System.out.println("Subtração: " + ( num1 - num2));
            
        }
    }, multiplicar {
        @Override
        public void calcular(double num1, double num2) {
            System.out.println("Multiplicação: " + (num1 * num2));
            
        }
    }, dividir {
        @Override
        public void calcular(double num1, double num2) {
            System.out.println("Divisão: " + (num1 / num2));           
        }
    };    
    
    public abstract void calcular(double num1, double num2);  
}
