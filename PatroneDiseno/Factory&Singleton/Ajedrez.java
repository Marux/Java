package solemne1;

/**
 *
 * @author victortrimpai
 */
public class Ajedrez implements Interface {

    @Override
    public void CrearMesa() {
        Materiales m = new Materiales();
        m.Ajedrez();
        System.out.println("\n\tSe a creado su Juego de Ajedrez con las siguientes reglas: ");
        System.out.println(" ");
        System.out.println("1- Cantidad de pieza por cada 12 de un solo color(Blanco o negro)...");
        System.out.println("2- El jugador con las piezas blancas mueve primero. ...");
        System.out.println("3- Cada jugador mueve 1 de sus piezas en su turno. ...");
        System.out.println("4- Gana el jugador que logre hacer Jaque Mate al oponente.");
    }
}
