
import java.util.Scanner;

public class CursoJava {

    public static void main(String[] args) {
        int pisos = 0;
        int[] arreglo = new int[1];

        //mostramos un mensaje y capturamos el dato desde la consola.
        System.out.println("Ingrese el numero de pisos:");
        Scanner sc = new Scanner(System.in);
        pisos = sc.nextInt();
        /* Declaramos el primer ciclo for que va a recorrer dependiendo 
        del dato ingresado que esta almacenado en la variable piso*/
        for (int i = 1; i <= pisos; i++) {
            /*Insertamos un arreglo y colocamos la variable i del ciclo for
            que sera el tama;o que tenbdra el arreglo cada vez que el ciclo for se ejecute*/
            int[] pascal = new int[i];

            /* Ciclo for que se decrementa para formar el triangulo*/
            for (int j = pisos; i < j; j--) {
                System.out.print("  ");
            }
            /*Ciclo for que genera la suma de las cifras.*/
            for (int k = 0; k < i; k++) {

                /*Condicio que evalua la variable del ciclo for*/
                if (k == 0 || k == (i - 1)) {
                    pascal[k] = 1;
                } else {
                    /*Sumamos los numeros que estan en cada posicion
                    del arreglo para formar el triangulo*/
                    pascal[k] = arreglo[k] + arreglo[k - 1];
                }
                System.out.print("[" + pascal[k] + "]");
            }
            arreglo = pascal;
            System.out.println("  ");
        }
    }
}
