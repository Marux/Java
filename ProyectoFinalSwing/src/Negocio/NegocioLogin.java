package Negocio;

import Entidades.Usuario;
import Datos.DatoLogin;

public class NegocioLogin {

    public int validaLoginNeg(Usuario user) {
        DatoLogin dl = new DatoLogin();
        int respuesta = dl.validaLogin(user);
        return respuesta;
    }

}
