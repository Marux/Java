
import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {

    private String formUser;
    private String formAdmin;
    private int almacenamiento;
    ArrayList<String> nombres = new ArrayList<String>();
    
    public Sistema() {
    }

    public String getFormUser() {
        return formUser;
    }

    public void setFormUser(String formUser) {
        this.formUser = formUser;
    }

    public String getFormAdmin() {
        return formAdmin;
    }

    public void setFormAdmin(String formAdmin) {
        this.formAdmin = formAdmin;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void Formulario() {
        Empleado _e = new Empleado();
        Scanner sc = new Scanner(System.in);
       
       String nombre;
       
        System.out.println("/*-------------------------------------------------*/");
        System.out.println("  ");
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        _e.setNombre(nombre);
        nombres.add(nombre);
        System.out.println("Ingrese RUT sin guion y sin digito verificador: ");
        _e.setRut(sc.nextInt());
        System.out.println("Ingrese edad: ");
        _e.setEdad(sc.nextInt());
        System.out.println("Ingrese direccion: ");
        _e.setDireccion(sc.next());
        System.out.println("Ingrese Comuna: ");
        _e.setComuna(sc.next());
        System.out.println("Ingrese Email: ");
        _e.setEmail(sc.next());
        System.out.println("Ingrese Telefono: ");
        _e.setTelefono(sc.nextInt());
        System.out.println("Ingrese Cargo del colaborador: ");
        _e.setCargo(sc.next());
        System.out.println("/*-------------------------------------------------*/");
        System.out.println("\n\tSe ha registrado colaborador: ");
        System.out.println("/*-------------------------------------------------*/");
        System.out.printf("Nombre: %s \nRut: %s \nEdad: %s \nDireccion: %s \nComuna: %s \nEmail: %s \nTelefono: %s \nCargo: %s",
                _e.getNombre(), _e.getRut(), _e.getEdad(), _e.getDireccion(), _e.getComuna(), _e.getEmail(), _e.getTelefono(), _e.getCargo());
 
    }

}
