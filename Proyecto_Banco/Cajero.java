public class Cajero {
    
    private int SaldoCaja;
    private Cliente Cliente;
    
    public Cajero(){ 
    }

    public int getSaldoCaja() {
        return SaldoCaja;
    }

    public void setSaldoCaja(int SaldoCaja) {
        this.SaldoCaja = SaldoCaja;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    
    public void PagoCuenta(int monto)
    {
        Cliente.retirar(monto);
        this.SaldoCaja = this.SaldoCaja + monto;
    }
    
    public void Deposito (int monto)
    {
        Cliente.retirar(monto);
        this.SaldoCaja = this.SaldoCaja + monto;
    }
    
    public void Retiro(int monto)
    {
        Cliente.Depositar(monto);
        this.SaldoCaja = this.SaldoCaja - monto;
    }
    
    public void RetiroCaja(int monto)
    {
        this.SaldoCaja = this.SaldoCaja - monto;
    }
    
}
