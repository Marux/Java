package solemne1;

/**
 *
 * @author victortrimpai
 */
public class Damas implements Interface {

    @Override
    public void CrearMesa() {
        Materiales m = new Materiales();
        m.Damas();
        System.out.println("\n\tSe a creado su Juego de Dama con las siguientes reglas: ");
        System.out.println(" ");
        System.out.println("1- Las damas es un juego para dos personas en un tablero de 64 casillas de 8×8 celdas.");
        System.out.println("2- Cada jugador dispone de 12 piezas de un mismo color (unas blancas y las otras negras)");
        System.out.println("3- Se juega por turnos alternos. Empieza a jugar quien tiene las fichas claras (blancas).");
        System.out.println("4- Una partida de damas finaliza cuando se llega a una de estas dos situaciones:\n"
                + "Pierde quien se queda sin piezas sobre el tablero.\n"
                + "Si el jugador se equivoca 3 veces, pierde.");
    }
}
