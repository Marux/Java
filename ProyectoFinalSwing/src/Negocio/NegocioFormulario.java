
package Negocio;

import Entidades.Empleado;
//import Entidades.Empleados;
//import Entidades.Cargos;
import Datos.DatoFormulario;

public class NegocioFormulario {

    public boolean InsertarDatosFormulario(Empleado e) {
        DatoFormulario df = new DatoFormulario();
        df.InsertPersona(e);
        //   int respuesta = df.InsertPersona(e);
        return true;
    }

    
//public boolean  InsertarDatosFormulario(Cargos c){
//    DatoFormulario df = new DatoFormulario();
//    df.InsertCargo(c);
//    return true;
//    
//}
}
