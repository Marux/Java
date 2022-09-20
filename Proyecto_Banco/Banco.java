public class Banco {
    
    private int SaldoBanco;
    private Valores Brink;
    
    public Banco (){
    }

    public int getSaldoBanco() {
        return SaldoBanco;
    }

    public void setSaldoBanco(int SaldoBanco) {
        this.SaldoBanco = SaldoBanco;
    }

    public Valores getBrink() {
        return Brink;
    }

    public void setBrink(Valores Brink) {
        this.Brink = Brink;
    }
    
    
    public void DepositoValores(int monto)
    {
        Brink.Retiro(monto);
        
    }
    
    public void Retiro(int monto)
    {
        Brink.Depositar(monto);
        this.SaldoBanco = this.SaldoBanco - monto;
    }
        
    
    
    
    
}
