/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.ResourceBundle;

/**
 *
 * @author Estudiante
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ResourceBundle rB,rF;
        System.out.println("Hola Mundo"));
        System.out.println("Hola Mundo"));
        System.out.println("Hola Mundo"));
        System.out.println("Hola Mundo"));
        rB=ResourceBundle.getBundle("holamundo.EN");
        System.out.println(rF.getString("etiqueta1"));
        rF=ResourceBundle.getBundle("holamundo.FR");
        System.out.println(rF.getString("etiqueta1"));
    }
    
}
