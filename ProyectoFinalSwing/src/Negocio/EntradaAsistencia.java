package Negocio;

import Entidades.AsistenciaEntrada;
import Datos.DatoAsistencia;

/**
 *
 * @author victortrimpai
 */
public class EntradaAsistencia {

    public boolean EntradaAsistencia(AsistenciaEntrada a) {
        DatoAsistencia da = new DatoAsistencia();
        da.EntradaPersona(a);
        return true;
    }
}
