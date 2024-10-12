package mx.unam.fi.poo.g1.p8.p82;
/**
 * Clase derivada Programador
 */
public class Programador extends Empleado {
    private int duracion;

    /**
     * Constructor de la clase PRogramador.
     * 
     * @param nombre   -> nombre del programador.
     * @param rol      ->rol gerente.
     * @param duracion ->años trabajando del programador.
     */
    public Programador(String nombre, String rol, int duracion) {
        super(nombre, rol, 5000);
        this.duracion = duracion;
    }

    /**
     * Método getDuracion
     * 
     * @return duracion trabajando del gerente
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Método setDuracion
     * 
     * @param duracion trabajando del gerente
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Método sobreescrito de calcular salario
     */
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (duracion + 10000);
    }
}
