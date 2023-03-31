/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.geovanni;

import ejemplo.geovanni.Clases.Papa;
import ejemplo.geovanni.Clases.Personas;
//import ejemplo.geovanni.Clases.Mama;
//import ejemplo.geovanni.Clases.Hijo;

/**
 *
 * @author morei
 */
public class EjemploGeovanni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Papa papaOBJ = new Papa("ingeniero", 333, 31 ,"Geovanni","GarciaMarquez","5433","2000-02-02",19);
        System.out.println(papaOBJ.getNombre());
        System.out.println(papaOBJ.getApellido());
        System.out.println(papaOBJ.getCedula());
        System.out.println(papaOBJ.getFechaNacimiento());
        System.out.println(papaOBJ.getEdad());
        System.out.println(papaOBJ.getTrabajo());
        System.out.println(papaOBJ.getSueldo());
        System.out.println(papaOBJ.SueldoxMes());
        
    }
    
}
