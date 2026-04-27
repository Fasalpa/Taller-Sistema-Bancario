package tiposCuentas;

public class CuentaBancaria {
    private int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }



    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return titular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.titular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public String describir(){
        return "Cuenta: " + numeroCuenta+ " - Titular: "+ titular +" - Saldo: $" + saldo;
    }
    public double calcularComision(){
        return 0.0;
    }

    public void realizarRetiro(double monto){
        setSaldo(getSaldo()-monto);
    }
}
