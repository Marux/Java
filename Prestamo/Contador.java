public class Contador {
    
    private int monto;
    private Caja cajita;
    
    public Contador(){
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Caja getCajita() {
        return cajita;
    }

    public void setCajita(Caja cajita) {
        this.cajita = cajita;
    }
    
    public int Prestar(int monto){
        if (monto < cajita.getSaldo()){
            int resta = cajita.getSaldo() - monto;
            cajita.setSaldo(resta);
        }
        int prestamo = (int)(monto + (monto * 0.03));
        return prestamo;
    }           
    public void Devolver (int devolucion){
        this.cajita.Depositar(devolucion);     
    }
    
}
