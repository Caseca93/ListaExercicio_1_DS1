package Ex1;

public class Ex1 {
    
    private double num1;
    private double num2;
    private Operacao operacao;
    
    public Ex1(double num1, double num2, Operacao operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }
    

}
