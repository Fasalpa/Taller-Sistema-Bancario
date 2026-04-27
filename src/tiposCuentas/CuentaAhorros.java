package tiposCuentas;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(int numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public String describir() {
        String data = super.describir();
        String separador = "*************************************************";
        return data+ " - Tasa mensual: " + tasaInteresMensual + "%";
    }

    @Override
    public double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        } else {
            return 12000.0;
        }
    }

    public void realizarRetiro(double monto, boolean esUrgente) {
        if (esUrgente && getSaldo() < getSaldoMinimo()) {
            double comision = getSaldo() - calcularComision() - monto;
        }
    }

    public double calcularInteresDelMes() {
        return getSaldo() * getTasaInteresMensual() / 100;
    }
}
