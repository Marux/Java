package pcfactory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author victortrimpai
 */
public class Bodega {

    private String[] TPantalla = {"Pantalla: 10in.", "Pantalla: 13in."};
    private String[] Marca = {"Marca: Samsung", "Marca: Apple"};
    private String[] Modelo = {"Modelo: Basico", "Modelo: Pro"};

    ArrayList<String> Creador = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void TPantalla() {
        System.out.println("Eliga Tipo de Pantalla");
        System.out.println("1. 10 pulgadas.");
        System.out.println("2. 13 pulgadas.");
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                Creador.add(TPantalla[0]);
                break;
            case 2:
                Creador.add(TPantalla[1]);
                break;
            default:
                System.out.println("No se encontro el dato correspondiente");
                break;
        }
    }

    public void Marca() {
        System.out.println("Eliga la marca");
        System.out.println("1. Samsung.");
        System.out.println("2. Apple.");
   
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                Creador.add(Marca[0]);
                break;
            case 2:
                Creador.add(Marca[1]);
                break;
            default:
                System.out.println("No se encontro el dato correspondiente");
                break;
        }
    }

    public void Modelo() {
        System.out.println("Eliga su modelo");
        System.out.println("1. Basico.");
        System.out.println("2. Pro.");
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                Creador.add(Modelo[0]);
                break;
            case 2:
                Creador.add(Modelo[1]);
                break;
            default:
                System.out.println("No se encontro el dato correspondiente");
                break;
        }
    }

}
