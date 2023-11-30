package Model;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private String estilovida;
    

    // Constructor
    public Cliente(String nombre,String apellido,int edad,double peso,String estilovida){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.peso=peso;
        this.estilovida=estilovida;
    }

    //getter y setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(String edad){
        this.edad=edad;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public String getEstilovida(){
        return estilovida;
    }

    public void setEstilovida(String estilovida){
        this.estilovida=estilovida;
    }
}
