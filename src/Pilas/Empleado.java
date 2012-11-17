package Pilas;

public class Empleado 
{
    private String cedula;
    private String nombres;
    private String apellidos;
    private String salario;
    
    
    
    public Empleado(String cedula, String nombres, String apellidos, String salario) //constructor
    {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
        
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
  
    
    
}
