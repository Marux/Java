package Negocio;

import Entidades.Usuario;
import Datos.DatoLogin;

public class NegocioLogin {

//    public int validaLoginNeg(Usuario user) {
//        DatoLogin dl = new DatoLogin();
//        int respuesta = dl.validaLogin(user);
//        return respuesta;
//    }
    
    public int validaLoginNeg(String usuario, String pasword) {
        DatoLogin dl = new DatoLogin();
        int respuesta = dl.validaLogin(usuario, pasword);
        return respuesta;
    }

}
