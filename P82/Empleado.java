package mx.unam.fi.poo.g1.p8.p82;

/**
 * Clase base para empleado.
 */
public class Empleado {
    private String nombre;
    private String rol;
    private double salario;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre  -> nombre del empleado.
     * @param rol     -> rol del empleado.
     * @param salario -> salario empleado
     */
    public Empleado(String nombre, String rol, double salario) {
        this.nombre = nombre;
        this.rol = rol;
        this.salario = salario;
    }

    /**
     * Método getNombre
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     * 
     * @param nombre -> nombre empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getRol
     * 
     * @return rol
     * 
     */
    public String getRol() {
        return rol;
    }

    /**
     * Método setRol
     * 
     * @param rol -> rol empleado
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Método getSalario
     * 
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método setSalario
     * 
     * @param salario -> salario empleado
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método para calcular el salario del empleado.
     * 
     * @return El salario del empleado.
     */
    public double calcularSalario() {
        return salario;
    }
}
