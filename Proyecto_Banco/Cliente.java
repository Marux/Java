public class Cliente {
    
    private String Nombre;
    private String Rut;
    private int NCuenta;
    private int Saldo;
    
    public Cliente(){}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public int getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    public void Depositar (int monto)
    {
        this.Saldo = this.Saldo + monto;

    }
    
    public void retirar (int monto)
    {
        this.Saldo = this.Saldo - monto;
    }
    
    
}
