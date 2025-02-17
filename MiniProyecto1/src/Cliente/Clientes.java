package Cliente;

public class Clientes {
    private String nombre;
    private long cedula;
    private double dineroAhorrado;
    private double nivelIngresos;
    private String fechaCreacion;

    public Clientes(String nombre, long cedula,  double dineroAhorrado, double nivelIngresos, String fechaCreacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.dineroAhorrado = dineroAhorrado;
        this.nivelIngresos = nivelIngresos;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public double getDineroAhorrado() {
        return dineroAhorrado;
    }

    public void setDineroAhorrado(double dineroAhorrado) {
        this.dineroAhorrado = dineroAhorrado;
    }

    public double getNivelIngresos() {
        return nivelIngresos;
    }

    public void setNivelIngresos(double nivelIngresos) {
        this.nivelIngresos = nivelIngresos;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String toString() {
        return "Cliente:" +
                " Nombre: '" + nombre + '\'' +
                ", Cedula: " + cedula  +
                ", Dinero Ahorrado: " + dineroAhorrado +
                ", Nivel de Ingresos: " + nivelIngresos +
                ", Fecha de Creacion: '" + fechaCreacion + '\'';
    }
}
