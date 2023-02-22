package ejercicio1;

public class Cuenta {
     public double saldo;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public void debito (double cantidad) {
        saldo -= cantidad;
    }
    
    public void credito (double cantidad) {
        saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
