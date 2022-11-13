package Datos;

import Entidades.Usuario;

public class DatoLogin {
    
    public int validaLogin(Usuario user) {
        
        if (user.getUser().equals("123") && user.getPass().equals("123")) {
            return 1;
        } else {
            return 2;
        }
        
    }
    
}
