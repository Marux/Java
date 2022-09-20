/**
 *
 * @author Victor Trimpai
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       Banco b = new Banco();
       Cajero ca = new Cajero();
       Cliente c = new Cliente();
       Valores v = new Valores();
       
       ca.setSaldoCaja(20000);
       c.setNombre("Victor");
       c.setRut("18365028-9");
       c.setNCuenta(2450003);
       c.setSaldo(30000);
       b.setSaldoBanco(30000);
       v.setSaldoValores(50000);
        
       System.out.println("Bienvenido: " + c.getNombre());
       System.out.println("Rut: " + c.getRut());
       System.out.println("Numero de Cuenta: " + c.getNCuenta());
       /*System.out.println("Saldo disponible: " + c.getSaldo());*/
       System.out.println("___________________________________");
       System.out.println("Ingrese Opcion a elegir: ");
       System.out.println("1- Saldo Disponible:");
       System.out.println("2- Depositar Dinero: ");
       System.out.println("3- Retirar Saldo Total: ");
       System.out.println("4- Pago de cuenta: ");
       System.out.println("___________________________________");
       
       int opcion = Integer.parseInt(reader.readLine());

       
    }


    
    
    
    
}
