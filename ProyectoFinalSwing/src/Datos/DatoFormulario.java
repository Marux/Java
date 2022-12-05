package Datos;

import Entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DatoFormulario {

    private Session sesion;

    private void iniciarProceso() { //singleton patrones
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


    public List<Empleado> Empleado(){
        List<Empleado> Empleado = null;
        iniciarProceso();
        Empleado = sesion.createQuery("from Empleado").list();
        terminarProceso();
        return Empleado;
    }
    public List<String> LoginBaseDatos(int idUsuario){
        Query q = null;
        iniciarProceso();
        q = sesion.createQuery("SELECT idEmpleado from Usuario where idEmpleado = " + idUsuario);
        List<Integer>list=q.list();
        List<String>errar = new ArrayList<>();
        if (list.size() > 0){
            errar.add(list.get(0).toString());
        } 
        terminarProceso();
        return errar;
    }
    public List<Empleado> DatoEmpleado(int idEmpleado){
        List<Empleado> datoEmpleado = null;
        iniciarProceso();
        datoEmpleado = sesion.createQuery("from Empleado where idEmpleado = " + idEmpleado).list();
        terminarProceso();
        return datoEmpleado;
    }
    
}
