package mx.unam.fi.poo.g1.p8.p82;

/**
 * Clase derivadagerente.
 */
public class Gerente extends Empleado {
    private double utilidades;

    /**
     * Constructor de la clase Gerente.
     * 
     * @param nombre     -> nombre del gerente.
     * @param rol        ->rol gerente.
     * @param utilidades ->utilidades del gerente.
     */
    public Gerente(String nombre, String rol, double utilidades) {
        super(nombre, rol, 5000);
        this.utilidades = utilidades;
    }
    /**
     * Método getUtilidades
     * 
     * @return utilidades del gerente
     */
    public double getUtilidades() {
        return utilidades;
    }
    /**
     * Método setUtilidades
     * 
     * @param utilidades del gerente
     */
    public void setUtilidades(double utilidades) {
        this.utilidades = utilidades;
    }
    /**
     * Método sobreescrito de calcular salario
     * 
     */
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (0.9 * utilidades);
    }
}
