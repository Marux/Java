package pcfactory;

/**
 *
 * @author victortrimpai
 */
public class Laptop implements Factory {

    @Override
    public void CrearEquipo() {
        Bodega b = new Bodega();
        b.Modelo();
        b.TPantalla();
        b.Marca();
        System.out.println("Se a creado su Laptop con los siguientes componentes: " + b.Creador);
    }
}
