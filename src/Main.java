import tiposCuentas.CuentaAhorros;
import tiposCuentas.CuentaBancaria;
import tiposCuentas.CuentaCorriente;
import tiposCuentas.CuentaInversion;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaAhorros = new CuentaAhorros(001, "Robinson Salamanca", 1500, 1, 200);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(002, "Fabián Palacio", 1700, 2, 100);
        CuentaBancaria cuentaInversion = new CuentaInversion(003, "Julieth Gonzalez", 2000, 10, 15, 5);

        cuentaAhorros.describir();
        cuentaCorriente.describir();
        cuentaInversion.describir();

        System.out.println(cuentaAhorros.describir() + cuentaAhorros.calcularComision());
        System.out.println(cuentaCorriente.describir() + cuentaCorriente.calcularComision());
        System.out.println(cuentaInversion.describir() + cuentaInversion.calcularComision());

        cuentaAhorros.realizarRetiro(500.0);
        cuentaCorriente.realizarRetiro(500.0);
        cuentaInversion.realizarRetiro(500.0);

        System.out.println(cuentaAhorros.getSaldo());
        System.out.println(cuentaCorriente.getSaldo());
        System.out.println(cuentaInversion.getSaldo());

    }
}
// Se usó CuentaBancaria para usar polimorfismo
// porque una misma variable puede referenciar diferentes tipos de cuenta y cada una ejecuta su propio comportamiento.