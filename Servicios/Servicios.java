package Servicios;

public class Servicios {
    private int idServicio;
    private String nombreServicio;
    private double costo;

    public Servicios(int idServicio, String nombreServicio, double costo) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.costo = costo;
    }

    public int idServicio(){
        return idServicio;
    }
    public String nombreServicio(){
        return nombreServicio;
    }
    public double costoServicio(){
        return costo;
    }
    


}
