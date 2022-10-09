package ejercicio_basico;

public class Cliente {

    private final String nombre;
    Cuenta Cuentas[];

    public Cliente(String nombre, Cuenta[] Cuentas) {
        this.nombre = nombre;
        this.Cuentas = Cuentas;
    }

    public String getNombre() {
        return nombre;
    }
    // retorno del saldo

    public double consultarSaldo(int indice) {
        return Cuentas[indice].getSaldo();
    }
    // creamos el metodo ingreso

    public void ingresaDinero(int indice, double cantidad) {
        Cuentas[indice].ingresarDinero(cantidad);

    }
    // creamos para retiro dinero

    public void retirarDinero(int indice, double cantidad) {
        Cuentas[indice].retirarDinero(cantidad);

    }

}
