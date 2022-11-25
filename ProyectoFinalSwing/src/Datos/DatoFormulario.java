package Datos;

//import Entidades.Formulario;
//import javax.swing.JOptionPane;
import Entidades.Empleados;
import Entidades.Cargos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DatoFormulario {
    
      private Session sesion;
      
      
    private void iniciarProceso()
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        
        sesion = sessionFactory.openSession();
        
        sesion.getTransaction().begin();
    }
    
    private void terminarProceso()
    {
        sesion.getTransaction().commit();
        
        sesion.close();
    }
    
    //insertar persona
    public void InsertPersona(Empleados Colabolador)
    {
        iniciarProceso();
        sesion.save(Colabolador);
        terminarProceso();
    }
    
        public void InsertCargo(Cargos Cargo)
    {
        iniciarProceso();
        sesion.save(Cargo);
        terminarProceso();
    }
    
    
    //actualizar persona
    
    public void UpdatePersona(Empleados Colabolador)
    {
        iniciarProceso();
        sesion.update(Colabolador);
        terminarProceso();
    }
    //eliminar persona
        
    public void DeletePersona(Empleados Colabolador)
    {
        iniciarProceso();
        sesion.delete(Colabolador);
        terminarProceso();
    }
    //extraer personas
    
    
/*
    public int InsertarDatosFormulario(Formulario f) {
        JOptionPane.showMessageDialog(null, "Se a registrado datos correctamente.");
        JOptionPane.showMessageDialog(null, "Nombre :" + f.getNombre());
        JOptionPane.showMessageDialog(null, "Identificador :" + f.getIdentificador());
        JOptionPane.showMessageDialog(null, "Edad :" + f.getEdad());
        JOptionPane.showMessageDialog(null, "Direccion :" + f.getDireccion());
        JOptionPane.showMessageDialog(null, "Comuna :" + f.getComuna());
        JOptionPane.showMessageDialog(null, "Email :" + f.getEmail());
        JOptionPane.showMessageDialog(null, "Telefono :" + f.getTelefono());
        JOptionPane.showMessageDialog(null, "Cargo :" + f.getCargo());
        return 1;
    }*/

}
