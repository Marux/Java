/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victortrimpai
 */
public class FabricaCuenta implements iFabricaAbstracta{

    @Override
    public ICuenta getCuenta(String tipocuenta) {
        if (tipocuenta == "vista"){
        return new CuentaVista();
        }
        return null;
    }

    @Override
    public IProducto getIProducto(String tipoProducto) {
        if (tipoProducto == "debito") {
            return new TarjetaDebito();
            
        }
        return null;
    }
    
}
