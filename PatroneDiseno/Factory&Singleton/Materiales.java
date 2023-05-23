package solemne1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author victortrimpai
 */
public class Materiales {

    private String[] CantJugadores = {"Para 2 Jugador", "Para 4 Jugadores"};
    private String[] TipoTablero = {"Tablero Ajedrez", "Tablero Dama", "Tablero Domino"};
    private String[] CantPiezas = {"32 piezas", "24 Piezas", "28 Fichas"};

    public void Ajedrez() {
        ArrayList<String> Creador = new ArrayList<>();
        Creador.add(CantJugadores[0]);
        Creador.add(TipoTablero[0]);
        Creador.add(CantPiezas[0]);
        System.out.println("Piezas utilizadas para crear juego de ajedrez: " + Creador);
    }

    public void Damas() {
        ArrayList<String> Creador = new ArrayList<>();
        Creador.add(CantJugadores[0]);
        Creador.add(TipoTablero[1]);
        Creador.add(CantPiezas[1]);
        System.out.println("Piezas utilizadas para crear juego de Damas:  " + Creador);
    }

    public void Domino() {
        ArrayList<String> Creador = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Eliga la cantidad de jugadores");
        System.out.println("1. Dos Jugador");
        System.out.println("2. Cuatro Jugadores");
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                Creador.add(CantJugadores[0]);
                Creador.add(TipoTablero[2]);
                Creador.add(CantPiezas[2]);
                System.out.println("Piezas utilizadas para crear juego de Domino: " + Creador);
                break;
            case 2:
                Creador.add(CantJugadores[1]);
                Creador.add(TipoTablero[2]);
                Creador.add(CantPiezas[2]);
                System.out.println("Piezas utilizadas para crear juego de Domino: " + Creador);
                break;
            default:
                System.out.println("No se encontro el dato correspondiente");
                break;
        }
    }
}
