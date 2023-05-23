package pcfactory;

import java.util.Scanner;

/**
 *
 * @author victortrimpai
 */
public class Vendedor {

    private Vendedor() {
    }

    private static class VendedorHolder {

        private static final Vendedor INSTANCE = new Vendedor();
    }

    public static Vendedor geInstance() {
        Factory tab = new Tablet();
        Factory tel = new Telefonos();
        Factory pc = new Laptop();
        Scanner sc = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println(" \n\tBienvenido al Sistema Ensamblador");
        System.out.println("*********************************************");
        System.out.println("Eliga el equipo que desea obtener:");
        System.out.println("1. Telefono Movil: ");
        System.out.println("2. Tableta.");
        System.out.println("3. Pc-Laptop.");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                tel.CrearEquipo();
                break;
            case 2:
                tab.CrearEquipo();
                break;
            case 3:
                pc.CrearEquipo();
                break;
            default:
                System.out.println("No se encontro el dato correspondiente");
        }
        return VendedorHolder.INSTANCE;
    }

}
