/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.geovanni.Clases;

/**
 *
 * @author morei
 */
public class Personas {

    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected String FechaNacimiento;
    protected int Edad;

    public Personas(String Nombre, String Apellido, String Cedula, String FechaNacimiento, int Edad) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.FechaNacimiento = FechaNacimiento;
        this.Edad = Edad;

    }

    public Personas() {

    }

    //*Metodos get y set
    //Permiten acceder a las propiedades protected o private ya que estan encapsuladas 
    //METODOS GET (Permiten obtener los valores de las propiedades del objeto instanciado)
    public String getNombre() 
    {
        return (this.Nombre);
    }

    public String getApellido() 
    {
        return (this.Apellido);
    }

    public String getCedula() 
    {
        return (this.Cedula);
    }

    public String getFechaNacimiento() 
    {
        return (this.FechaNacimiento);
    }

    public int getEdad() 
    {
        return (this.Edad);
    }

    //Metodos SET te permiten asignar un nuevo valor a una propirdad o modificarlo
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }

    public void setCedula(String Cedula) 
    {
        this.Cedula = Cedula;
    }

    public void setFechaNacimiento(String FechaNacimiento)
    {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setEdad(int Edad) 
    {
        this.Edad = Edad;
    }

}
