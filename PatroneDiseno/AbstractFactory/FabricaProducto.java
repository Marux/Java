
public class FabricaProducto implements iFabricaAbstracta {

    @Override
    public ICuenta getCuenta(String tipocuenta) {
        if (tipocuenta == "corriente") {
            return new CuentaVista();
        }
        return null;
    }

    @Override
    public IProducto getIProducto(String tipoProducto) {
        if (tipoProducto == "credito") {
            return new TarjetaDebito();

        }
        return null;
    }

}
