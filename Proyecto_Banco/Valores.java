public class Valores {
    private int SaldoValores;
    
    public Valores(){
    }

    public int getSaldoValores() {
        return SaldoValores;
    }

    public void setSaldoValores(int SaldoValores) {
        this.SaldoValores = SaldoValores;
    }
    
    public void Depositar(int monto)
    {
        this.SaldoValores = this.SaldoValores + monto;
    }
    
    public void Retiro(int monto)
    {
        this.SaldoValores = this.SaldoValores - monto;
    }
    
    
    
}
