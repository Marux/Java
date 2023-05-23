package pcfactory;

/**
 *
 * @author victortrimpai
 */
public class Tablet implements Factory {
    
    @Override
    public void CrearEquipo() {
        Bodega b = new Bodega();
        b.TPantalla();
        b.Marca();
        System.out.println("Se a creado su Tablet con los siguientes componentes: " + b.Creador);
    }
}
