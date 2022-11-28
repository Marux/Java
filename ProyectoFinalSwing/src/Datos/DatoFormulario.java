package Datos;

import Entidades.Empleado;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DatoFormulario {

    private Session sesion;

    private void iniciarProceso() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        sesion = sessionFactory.openSession();

        sesion.getTransaction().begin();
    }

    private void terminarProceso() {
        sesion.getTransaction().commit();

        sesion.close();
    }

    //insertar persona
    public void InsertPersona(Empleado Colabolador) {
        iniciarProceso();
        sesion.save(Colabolador);
        terminarProceso();
        JOptionPane.showMessageDialog(null, "Se a registrado usuario con exito");
    }

    //actualizar persona
    public void UpdatePersona(Empleado Colabolador) {
        iniciarProceso();
        sesion.update(Colabolador);
        terminarProceso();
    }
    //eliminar persona
    public void DeletePersona(Empleado Colabolador) {
        iniciarProceso();
        sesion.delete(Colabolador);
        terminarProceso();
    }
    
    //extraer personas
    public List<Empleado> ListarEmpleado() {
        List<Empleado> ListaEmpleado = null;
        iniciarProceso();
        ListaEmpleado = sesion.createQuery("from Empleado").list();
        terminarProceso();
        return ListaEmpleado;
    }

}
