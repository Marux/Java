package Negocio;

import Datos.DatoAsistencia;
import Entidades.AsistenciaSalida;

/**
 *
 * @author victortrimpai
 */
public class SalidaAsistencia {

    public boolean SalidaAsistencia(AsistenciaSalida a) {
        DatoAsistencia da = new DatoAsistencia();
        da.SalidaPersona(a);
        return true;
    }

}
