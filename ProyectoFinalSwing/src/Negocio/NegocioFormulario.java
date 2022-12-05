
package Negocio;

import Entidades.Empleado;
import Datos.DatoFormulario;

public class NegocioFormulario {

    public boolean InsertarDatosFormulario(Empleado e) {
        DatoFormulario df = new DatoFormulario();
        df.InsertPersona(e);
        return true;
    }
    public boolean EliminarDatos(Empleado el){
        DatoFormulario df = new DatoFormulario();
        df.DeletePersona(el);
        return true;
    }

    public boolean ActualizarDatos(Empleado a) {
        DatoFormulario df = new DatoFormulario();
        df.UpdatePersona(a);
        return true;
    }
    
}
