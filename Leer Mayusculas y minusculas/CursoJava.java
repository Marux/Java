/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursejava;

import javax.swing.JOptionPane;


public class CourseJava {
    private final String cadena;
    private String verMayusculas = "";
    private String verMinusculas = "";
    private final int n;
    private final String[] Mayusculas;
    private final String[] Minusculas;
    private final String[] tempMy;
    private final String[] tempMn;
    
    public CourseJava(String cadena){
        this.cadena = cadena;
        n = cadena.length();
        Mayusculas = new String[n];
        Minusculas = new String[n];
        tempMy = new String[n];
        tempMn = new String[n];
    }
    private String maysculas(){
        /*En la Tabla de Códigos ASCII las Mayusculas empiezan desde 
          el caracter 65 asta el caracter 90*/
        for (int i = 0; i < n; i++){
            if (Integer.valueOf(cadena.charAt(i)) > 64 && 
                    Integer.valueOf(cadena.charAt(i)) < 91){
                tempMy[i] = String.valueOf(cadena.charAt(i));
            }
        }
        for (int i = 0; i < tempMy.length; i++){
            if (tempMy[i] != null){
                 Mayusculas[i] = tempMy[i];
                 verMayusculas = verMayusculas + "," + Mayusculas[i];
            }
        }
        return verMayusculas;
    }
    public String minusculas() {
        for (int i = 0; i < n; i++) {
            /*En la Tabla de Códigos ASCII las Minusculas empiezan desde 
              el caracter 96 asta el caracter 123*/
            if (Integer.valueOf(cadena.charAt(i)) > 96 && 
                    Integer.valueOf(cadena.charAt(i)) < 123){
                tempMn[i] = String.valueOf(cadena.charAt(i));
            }
        }
        for (int i = 0; i < tempMn.length; i++) {
           if (tempMn[i] != null){
               Minusculas[i] = tempMn[i];
                verMinusculas = verMinusculas + "," + Minusculas[i];
           } 
        }
         return verMinusculas;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese la cadena");
        var course = new CourseJava(cadena);
       JOptionPane.showMessageDialog(null, "Las letras Mayusculas son : "
                + course.maysculas()+ "\n\n" + "Las letras Minusculas son : "
                + course.minusculas() );
    }
}
