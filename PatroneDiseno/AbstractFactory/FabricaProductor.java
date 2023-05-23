
public class FabricaProductor {

    public static iFabricaAbstracta getFabrica(String tipoFabrica) {
        if (tipoFabrica == "corriente") {
            return new FabricaProducto();
        } else {
            return new FabricaCuenta();
        }

    }

}
