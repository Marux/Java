package pcfactory;

/**
 *
 * @author victortrimpai
 */
public class Telefonos implements Factory {

    @Override
    public void CrearEquipo() {
        Bodega b = new Bodega();
        b.Modelo();
        b.Marca();
        System.out.println("Se a creado su Telefono con los siguientes componentes: " + b.Creador);
    }
}

