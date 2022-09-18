
public class Cobrador {
    
    private int montorecaudado;
    
    public Cobrador()
    {}

    public int getMontorecaudado() {
        return montorecaudado;
    }

    public void setMontorecaudado(int montorecaudado) {
        this.montorecaudado = montorecaudado;
    }
    
    public void Cobrar(int monto)
    {
        this.montorecaudado = this.montorecaudado + monto;
    
    }
    
    public int Devolver()
    {  
        return this.montorecaudado;
    }
    
}
