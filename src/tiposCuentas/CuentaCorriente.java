package tiposCuentas;

public class CuentaCorriente extends CuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobregiro;

    public CuentaCorriente(int numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getComisionPorTransaccion() {
        return comisionPorTransaccion;
    }

    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public String describir() {
        String data = super.describir();
        return data + " - Comision por transacción : " + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    public void realizarRetiro(double monto) {

        double total = monto + calcularComision();
        double nuevoSaldo = getSaldo() - total;
        if (nuevoSaldo < limiteSobregiro) {
            System.out.println("El retiro no es posible por sobrepasar el límite de sobregiro.");
        } else {
            setSaldo(nuevoSaldo);
        }
    }
}
