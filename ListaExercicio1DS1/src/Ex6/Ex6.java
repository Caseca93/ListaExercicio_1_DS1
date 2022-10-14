package Ex6;

public class Ex6 {
    
    private double c;
    private double f;
    
    public Ex6(double c) {
        this.c = c;
        
    }
    
    public void converterTempFahrenheit(){
        this.f = ((9 * this.c + 160) / 5);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    
    
}
