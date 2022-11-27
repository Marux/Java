package Datos;

//import Entidades.Formulario;
//import javax.swing.JOptionPane;
//import Entidades.Empleados;
import Entidades.Empleado;
import javax.swing.JOptionPane;
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
    public void InsertPersona(Empleado Colabolador)
    {
        iniciarProceso();
        sesion.save(Colabolador);
        terminarProceso();
        JOptionPane.showMessageDialog(null, "Se a registrado usuario con exito");
    }
   
    
    
    //actualizar persona
    
    public void UpdatePersona(Empleado Colabolador)
    {
        iniciarProceso();
        sesion.update(Colabolador);
        terminarProceso();
    }
    //eliminar persona
        
    public void DeletePersona(Empleado Colabolador)
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
