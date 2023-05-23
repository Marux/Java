package solemne1;

/**
 *
 * @author victortrimpai
 */
public class Domino implements Interface {

    @Override
    public void CrearMesa() {
        Materiales m = new Materiales();
        m.Domino();
        System.out.println("\n\tSe a creado su Juego de Domino con las siguientes reglas: ");
        System.out.println(" ");
        System.out.println("1.- Cada jugador recibe 7 fichas al empezar una ronda. Si en la partida hay menos de 4 jugadores, las fichas restantes se guardan en el pozo.");
        System.out.println("2.- Inicia la ronda el jugador que tenga la ficha con el doble más alto (si juegan 4 personas, siempre empezará el 6 doble). \n"
                + "En caso de no tener dobles ninguno de los jugadores, comenzará el jugador que tenga la ficha más alta. A partir de ese momento, \n"
                + "los jugadores realizarán su jugada, por turnos, siguiendo el orden inverso a las manecillas del reloj.");
        System.out.println("3.- El jugador que inicia la ronda lleva la mano. Este es un concepto importante para la estrategia del dominó, \n"
                + "pues el jugador o la pareja que es “mano” normalmente es la que tiene ventaja durante la ronda.");
        System.out.println("4.- El juego termina cuando un jugador o pareja consigue la cantidad de puntos necesarios para ganar.");
    }
}
