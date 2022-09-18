public class Caja {
    
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

public void Depositar (int monto)   
{
    this.saldo = this.saldo + monto;
}

    
}
