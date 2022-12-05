package Datos;

import Entidades.Asistencia;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author victortrimpai
 */
public class DatoAsistencia {

    private Session sesion;
    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm:ss");
    
    private void iniciarProceso() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        sesion = sessionFactory.openSession();

        sesion.getTransaction().begin();
    }

    private void terminarProceso() {
        sesion.getTransaction().commit();

        sesion.close();
    }

    public boolean RegistroAsistencia(Asistencia As) {
        iniciarProceso();
        List<Asistencia> Validacion = null;
        boolean Indicador = false;
        Validacion = ValidacionEntrada(As.getIdEmpleado());
        if (Validacion.size() == 0){
            sesion.save(As);
            Indicador = true;
        }
        terminarProceso();
        JOptionPane.showMessageDialog(null, "Se a registrado su entrada al turno.");
        return Indicador;
    }
    
    public List<Asistencia> ValidacionEntrada(int idEmpleado){
        String VariableValidacion = "SELECT idRegistro from Asistencia where fecha = '" + formato.format(fecha) + "' and idEmpleado =" + idEmpleado;
        List<Asistencia> ListaAsistencia = null;
        ListaAsistencia = sesion.createQuery(VariableValidacion).list();
        System.out.println(VariableValidacion);
        System.out.println(ListaAsistencia);
        return ListaAsistencia;
    }
        
    public boolean RegistroSalida(Asistencia As){
        iniciarProceso();
        System.out.println(As.getHoraSalida());
        List<Asistencia> Validacion = null;
        boolean Indicador = false, Validacion2 = false;
        Validacion = ValidacionEntrada(As.getIdEmpleado());
        Validacion2 = ValidacionSalida(As.getIdEmpleado());
        String queryValidacion = "UPDATE Asistencia set horaSalida = '" + formatohora.format(As.getHoraSalida()) + "' where idRegistro = " + Validacion.get(0);
        if (Validacion.size() >0 && Validacion2) {
            Query q = sesion.createQuery(queryValidacion);
            q.executeUpdate();
            Indicador = true;
        }
        terminarProceso();
        return Indicador;
    }
 
    public boolean ValidacionSalida(int idEmpleado){
        List<Asistencia> Validacion = null;
        Validacion = sesion.createQuery("SELECT idRegistro from Asistencia where fecha = '" + formato.format(fecha) + "' and idEmpleado = " + idEmpleado + " and horaSalida is null " ).list();
        if (Validacion.size() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public List<Asistencia> Asistencia(int idEmpleado){
        List<Asistencia> Asistencia = null;
        iniciarProceso();
        Asistencia = sesion.createQuery("from Asistencia where idEmpleado = " + idEmpleado).list();
//        System.out.println(Asistencia);
        terminarProceso();
        return Asistencia;
    }
    
    public List<Asistencia> Fechas(int idEmpleado){
        List<Asistencia> Fechas = null;
        iniciarProceso();
        Fechas = sesion.createQuery("SELECT fecha from Asistencia where fecha = '" + formato.format(fecha) + "' and idEmpleado = " + idEmpleado).list();
        terminarProceso();
        return Fechas;
    }
    
    public boolean ActAsistencia(Asistencia a) {
        DatoAsistencia DA = new DatoAsistencia();
        DA.UpdateFechas(a);
        return true;
    }
    
    public void UpdateFechas(Asistencia Fecha) {
        iniciarProceso();
        sesion.update(Fecha);
        terminarProceso();
        JOptionPane.showMessageDialog(null, " Actualizado con exito");
    }
    
    public Long CountAsistencia(int idEmpleado){
        iniciarProceso();
        Query CountIt = sesion.createQuery("SELECT COUNT(idRegistro) from Asistencia where idEmpleado = " + idEmpleado + " and horaEntrada is not null and horaSalida is not null");
        Long count = (Long)CountIt.uniqueResult();
        terminarProceso();
        return count;
        
    }
}
