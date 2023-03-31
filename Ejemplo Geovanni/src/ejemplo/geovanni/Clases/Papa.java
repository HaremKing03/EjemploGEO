/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.geovanni.Clases;

/**
 *
 * @author morei
 */
public class Papa extends Personas {

    private String Trabajo;
    private int Sueldo;
    private int CantidadDias;

    public Papa(String Trabajo, int Sueldo, int CantidadDias, String Nombre, String Apellido, String Cedula, String FechaNacimiento, int Edad) 
    {
        super(Nombre, Apellido, Cedula, FechaNacimiento, Edad);//Referencia con la clase padre Personas y su constructor
        this.Trabajo = Trabajo;
        this.Sueldo = Sueldo;
        this.CantidadDias = CantidadDias;
        
    }

    public Papa() {

        super();//Referencia con la clase padre Personas y su constructor

    }

    public String getTrabajo() 
    {
        return (this.Trabajo);
    }

    public int getSueldo() 
    {
        return (this.Sueldo);
    }

    public int getCantDias() 
    {
        return (this.CantidadDias);
    }

    public void setTrabajo(String Trabajo) 
    {
        this.Trabajo = Trabajo;
    }

    public void setSueldo(Short Sueldo) 
    {
        this.Sueldo = Sueldo;

    }

    public void setCantidadDias(int CantidadDias) 
    {
        this.CantidadDias = CantidadDias;
    }

    
    //Metodos
    
    public int SueldoxMes()
    {
    int total = 0;
    total = (this.Sueldo * this.CantidadDias);
    return total;
    }
}
