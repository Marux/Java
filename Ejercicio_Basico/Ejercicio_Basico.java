package ejercicio_basico;

import java.util.Scanner;

public class Ejercicio_Basico {
    // crear metodo de buscar numero de cuenta

    public static int buscarNumeroCuenta(Cuenta cuentas[], int numeroDeCuentaBuscar) {
        int indice = 0;
        int iterador = 0;
        boolean numeroDeCuentaEncontrada = false;

        while ((iterador < cuentas.length) && (numeroDeCuentaEncontrada == false)) {
            if (cuentas[iterador].getNumeroCuenta() == numeroDeCuentaBuscar) {
                numeroDeCuentaEncontrada = true;
                indice = iterador;
            }
            iterador++;
        }
        if (numeroDeCuentaEncontrada == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        Cuenta cuentas[];
        Cliente cliente;
        int numeroCuenta;
        int cantidadCuentas;
        int indiceNumeroCuenta;
        int opcion;
        double saldo;
        double cantidadDinero;

        System.out.print("Digite el nombre del cliente: ");
        nombre = teclado.next();

        System.out.print("\nDigite la cantidad de cuentas que tiene el cliente: ");
        cantidadCuentas = teclado.nextInt();

        System.out.println("");

        cuentas = new Cuenta[cantidadCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Registre la cuenta numero " + (i + 1));
            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = teclado.nextInt();

            System.out.print("Digite el saldo de la cuenta: ");
            saldo = teclado.nextDouble();
            System.out.println("");
            cuentas[i] = new Cuenta(numeroCuenta, saldo);

        }
        cliente = new Cliente(nombre, cuentas);

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Ingrese Dinero: ");
            System.out.println("2. Retiro de Saldo: ");
            System.out.println("3. Consulta de Saldo: ");
            System.out.println("4. Salir.");
            System.out.print("Digite una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite numero de cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nCuenta No encontrada. ");
                        System.out.println("");
                    } else {
                        System.out.print("Digite la cantidad de dinero a depositar: ");
                        cantidadDinero = teclado.nextDouble();
                        cliente.ingresaDinero(indiceNumeroCuenta, cantidadDinero);
                        System.out.println("\nDeposito con exito");
                        System.out.println("Saldo Dsiponible: " + cliente.consultarSaldo(indiceNumeroCuenta));
                    }
                    break;
                case 2:
                    System.out.print("\nDigite numero de cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nCuenta No encontrada.");
                        System.out.println("");

                    } else {
                        System.out.print("\nDigite la cantidad de dinero a retirar: ");
                        cantidadDinero = teclado.nextDouble();

                        if (cliente.consultarSaldo(indiceNumeroCuenta) < cantidadDinero) {
                            System.out.println("Salto insuficiente: ");
                            System.out.println("");
                        } else {
                            cliente.retirarDinero(indiceNumeroCuenta, cantidadDinero);
                            System.out.println("");
                            System.out.println("Retiro con exito !");
                            System.out.println("");
                            System.out.println("Nuevo saldo Disponible en la cuenta es : " + cliente.consultarSaldo(indiceNumeroCuenta));
                            System.out.println("");
                        }

                    }
                    break;
                case 3:
                    System.out.print("\nDigite numero de cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nCuenta No encontrada.");
                        System.out.println("");

                    } else {
                        System.out.println("Saldo Disponible: " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }

                    break;
                case 4:
                    System.out.println("\nChao pescao");
                    opcion = 4;
                    break;
                default:
                    System.out.println("Opcion no Disponible, digite bien...");
                    break;
            }

        } while (opcion != 4);

    }

}
