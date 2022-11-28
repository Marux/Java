package Datos;

import Entidades.Usuario;


public class DatoLogin {

    public int validaLogin(Usuario user) {

        if (user.getUser().equals("admin") && user.getPass().equals("admin")) {

            return 1;
        } else {
            return 2;
        }
    }

}
