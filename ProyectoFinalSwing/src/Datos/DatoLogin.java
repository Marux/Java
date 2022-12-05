package Datos;

import Entidades.Usuario;
import Datos.DatoFormulario;
import java.util.List;


public class DatoLogin {
    
    public int validaLogin(String usuario, String pasword) {
        
        DatoFormulario datoFormulario = new DatoFormulario();
        
        if (usuario.equals("admin") && pasword.equals("admin")) {

            return 1;
        } else {
            List<String> X = null;
            X = datoFormulario.LoginBaseDatos(Integer.parseInt(usuario));
            System.out.println(X);
            if (X.size() > 0){
                return 2;
            } 
            return 0;
        } 
        
//        if (user.getIdEmpleado().equals(0) && user.getPass().equals(0)) {
//
//            return 1;
//        } else {
//            String X = null;
//            X = datoFormulario.LoginBaseDatos(user.getIdEmpleado());
//            return 2;
//        } 
        
//        String employeeName = session.createQuery("select empMaster.name from EmployeeMaster empMaster where empMaster.id = :id").setInteger("id",10).uniqueResult();        
//        else if(user.getUser().equals("BASE DE DATOS") && user.getPass().equals("BASE DE DATOS")){
//            return 2;
//        } else {
//            return 3;
//        }
    }
         
}
