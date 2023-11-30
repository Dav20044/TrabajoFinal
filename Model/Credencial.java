package Model;

public class Credencial extends Cliente{
    private int fechaMembresia;
    private String tipoMembresia;
    private int duracionMembresia;
    private nuevaMembresia [] membresia=new membresia[5];

    public Credencial(String nombre, String apellido, int edad, int fechaMembresia, String tipoMembresia, int duracionMembresia){
        super(nombre,apellido,edad);
        this.fechaMembresia = fechaMembresia;
        this.tipoMembresia = tipoMembresia;
        this.duracionMembresia = duracionMembresia;
    }
}