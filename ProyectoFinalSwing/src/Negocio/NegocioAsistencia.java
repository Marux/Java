/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DatoAsistencia;
import Entidades.Asistencia;

/**
 *
 * @author hiden
 */
public class NegocioAsistencia {
    public boolean InsertarAsistencia(Asistencia a) {
        boolean Validacion = true;
        DatoAsistencia da = new DatoAsistencia();
        Validacion = da.RegistroAsistencia(a);
        return Validacion;
    }
    
    public boolean InsertarSalida(Asistencia b) {
        boolean Validacion = true;
        DatoAsistencia da = new DatoAsistencia();
        Validacion = da.RegistroSalida(b);
        return Validacion;
    }

}
