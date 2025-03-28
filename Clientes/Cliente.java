package Clientes;

public class Cliente {

    private int documentoDeIdentidad;
    private String nombre;
    private String direccion;

    public Cliente(int documentoDeIdentidad, String nombre, String direccion) {

        this.documentoDeIdentidad = documentoDeIdentidad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIdentificacion() {
        return documentoDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Direccion: " + direccion);
    }

}
