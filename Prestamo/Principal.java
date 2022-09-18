/**
 *
 * @author Victor Trimpai
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Cliente c = new Cliente();
        Contador con = new Contador();
        Caja ca = new Caja();
        Cobrador cob = new Cobrador();
        
        ca.setSaldo(20000);
        c.setNombre("Juanito");
        con.setCajita(ca);
        
        
        System.out.println("El saldo de la caja es: " + ca.getSaldo());
        System.out.println("Ingrese monto a solicitar: ");
        int montoprestamo = Integer.parseInt(reader.readLine());
        
        int deudatotalcliente = con.Prestar(montoprestamo);
        
        c.setMontocredito(montoprestamo);
        c.setDeuda(deudatotalcliente);
        
        System.out.println(c.getNombre() + " Usted pidio la suma de: " + c.getMontocredito());
        System.out.println(c.getNombre() + " Y su deuda total es: " + c.getDeuda());
        
        
        System.out.println(c.getNombre() + " Favor ingrese el mondo a devolver: ");
        int montodevuelto = Integer.parseInt(reader.readLine());
        
        cob.Cobrar(montodevuelto);
        
        int recaudadototal = cob.Devolver();
        con.Devolver(recaudadototal);
        
        System.out.println("El saldo de la caja es de: " + ca.getSaldo());
        
        
    }
    
    
    
    
    
}
