package Datos;

import Entidades.AsistenciaEntrada;
import Entidades.AsistenciaSalida;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author victortrimpai
 */
public class DatoAsistencia {

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
    public void EntradaPersona(AsistenciaEntrada As) {
        iniciarProceso();
        sesion.save(As);
        terminarProceso();
        JOptionPane.showMessageDialog(null, "Se a registrado su entrada al turno.");
    }

    public void SalidaPersona(AsistenciaSalida As) {
        iniciarProceso();
        sesion.save(As);
        terminarProceso();
        JOptionPane.showMessageDialog(null, "Se a registrado su salida del turno.");
    }

}
