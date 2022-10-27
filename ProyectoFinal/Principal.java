
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("/*-------------------------------------------------*/");
        System.out.println(" \n\tBienvenido al Sistema ");
        System.out.println("/*-------------------------------------------------*/");

        Scanner sc = new Scanner(System.in);
        Empleado _e = new Empleado();
        Sueldo _s = new Sueldo();
        Administrador _a = new Administrador();
        Empresa e_ = new Empresa();
        Sistema _sis = new Sistema();

        int rut;
        int opcion;

        System.out.println("Ingrese RUT sin digito verificador: ");
        rut = sc.nextInt();
        boolean login = true;
        while (login) {

            if (rut == 123) {
                System.out.println("/*-------------------------------------------------*/");
                System.out.println("\n\tBienvenido Administrador: ");
                System.out.println("/*-------------------------------------------------*/");
                System.out.println("\n\tMENU");
                System.out.println("1. Registro de entrada.");
                System.out.println("2. Registro de salida.");
                System.out.println("3. Registrar Asistencia del Trabajador.");
                System.out.println("4. Edicion de Datos.");
                System.out.println("5. Generar informe.");
                System.out.println("6. Pre Liquidacion.");
                System.out.println("7. Salir.");
                System.out.print("Digite una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("/*-------------------------------------------------*/");
                        System.out.println("  ");

                        break;
                    case 2:
                    case 3:
                    case 4:
                        int caso4 = 0;
                        while (caso4 == 0) {
                            _sis.Formulario();
                            System.out.println("\nDesea ingresar otro usuario 0 si; 1 no");
                            caso4 = sc.nextInt();
                        }
                        System.out.println(_sis.nombres);
                        continue ;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        System.out.println("\nA salido del programa.");
                        opcion = 7;
                        break;
                    default:
                        System.out.println("Opcion no Disponible, digite bien...");
                        break;
                }

                break;
            }

            System.out.println("/*-------------------------------------------------*/");
            System.out.println("\n\tBienvenido Trabajador: ");
            System.out.println("*-------------------------------------------------*/");
            System.out.println("\n\tMENU");
            System.out.println("1. Registro de entrada.");
            System.out.println("2. Registro de salida.");
            System.out.println("3. Pre Liquidacion.");
            System.out.println("4. Salir.");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("\nA salido del programa.");
                    opcion = 4;
                    break;
                default:
                    System.out.println("Opcion no Disponible, digite bien...");
                    break;
            }

            break;
        }

    }

}
