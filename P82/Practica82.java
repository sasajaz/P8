package mx.unam.fi.poo.g1.p8.p82;
/**
 * Clase principal para ejecutar el programa.
 */
public class Practica82 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cesael", "Gerente", 15000.0);
        Programador programador = new Programador("Roberta", "Programador", 10);

        System.out.println("Salario de " + gerente.getNombre() + ": $" + gerente.calcularSalario());
        System.out.println("Salario de " + programador.getNombre() + ": $" + programador.calcularSalario());
    }
}
