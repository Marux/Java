/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Empleados;
import Entidades.Cargos;
import Datos.DatoFormulario;

public class NegocioFormulario {

    public boolean InsertarDatosFormulario(Empleados e) {
        DatoFormulario df = new DatoFormulario();
        df.InsertPersona(e);
        //   int respuesta = df.InsertPersona(e);
        return true;

    }

public boolean  InsertarDatosFormulario(Cargos c){
    DatoFormulario df = new DatoFormulario();
    df.InsertCargo(c);
    return true;
    
}
}
