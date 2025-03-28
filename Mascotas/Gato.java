package Mascotas;

public class Gato extends Mascotas {

    public Gato(String nombre, int edad, int historialDeServicios) {
        this.nombre = nombre;
        this.edad = edad;
        this.historialDeServicios = historialDeServicios;

    }

    public String getNombre() {
        return nombre;

    }

    public int getEdad() {
        return edad;

    }

    public int gethistorialDeServicios() {
        return historialDeServicios;
    }
}
