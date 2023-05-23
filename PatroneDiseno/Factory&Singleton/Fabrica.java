package solemne1;

import java.util.Scanner;

/**
 *
 * singleton
 * @author victortrimpai
 */

public class Fabrica {

    private static Fabrica instance;

    private Fabrica() {
    }

    public static Fabrica geInstance() {

        if (instance == null) {
            instance = new Fabrica();
            Scanner sc = new Scanner(System.in);
            Interface aje = new Ajedrez();
            Interface dam = new Damas();
            Interface domi = new Domino();
            System.out.println("*********************************************");
            System.out.println(" \n\tBienvenido al Sistema creador de juegos de mesa");
            System.out.println("*********************************************");
            System.out.println("Eliga el juego de mesa que desea obtener:");
            System.out.println("1.- Tablero Ajedrez: ");
            System.out.println("2-. Tablero Damas:");
            System.out.println("3.- Tablero Domino.");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    aje.CrearMesa();
                    break;
                case 2:
                    dam.CrearMesa();
                    break;
                case 3:
                    domi.CrearMesa();
                    break;
                default:
                    System.out.println("No se encontro el dato correspondiente");
            }
        }
        return instance;
    }

}
