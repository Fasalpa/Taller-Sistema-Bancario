package tiposCuentas;

public class CuentaInversion extends CuentaBancaria {

    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    public CuentaInversion(int numeroCuenta, String titular, double saldo, double tasaAnual, int plazoMeses, double penalizacionRetiroAnticipado) {
        super(numeroCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double getPenalizacionRetiroAnticipado() {
        return penalizacionRetiroAnticipado;
    }

    public void setPenalizacionRetiroAnticipado(double penalizacionRetiroAnticipado) {
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    public String describir() {
        String data = super.describir();
        String separador = "*************************************************";
        return data + " - Plazo: " + plazoMeses + "- Tasa anual " + tasaAnual + "%." ;
    }

    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    public void realizarRetiro(double monto) {
        double total = monto + calcularComision();
        setSaldo(getSaldo() - total);
    }

    public double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazoMeses) {
            return 0.0;
        } else {
            return penalizacionRetiroAnticipado;
        }
    }

}


