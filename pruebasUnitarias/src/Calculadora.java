public class Calculadora {
    private long operador1;
    private long operador2;

    
    public long getOperador1() {
        return operador1;
    }
    public void setOperador1(long operador1) {
        this.operador1 = operador1;
    }
    public long getOperador2() {
        return operador2;
    }

    public void setOperador2(long operador2) {
        this.operador2 = operador2;
    }
    public Calculadora(long operador1, long operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    public Calculadora(long operador1) {
        this.operador1 = operador1;
    }
    
    public long suma(){
        return operador1 + operador2;
    }
    public long resta(){
        return operador1 - operador2;
    }
    public long multiplicacion(){
        return operador1 * operador2;
    }
    public long division(){
        return operador1 / operador2;
    }
    public long exponente(){
        long resultado = (long) Math.pow(operador1, operador2);
        return resultado;
    }
    public long absoluto(){
        return Math.abs(operador1);
    }
    public boolean esPositivo(){
        if (operador1 > 0) {
            return true;
        } else {
            return false;
        }
    }

}
