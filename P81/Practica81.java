package mx.unam.fi.poo.g1.p8.p81;

/**
 * Clase principal para ordenar por QuickSort y MergeSort.
 */
public class Practica81 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 1, 6, 8};

        // Prueba de QuickSort
        Ordenamiento quickSort = new QuickSort();
        quickSort.ordenar(arr);
        imprime(arr, "QuickSort");

        // Prueba de MergeSort
        int[] arr2 = {4, 2, 0, 3, 1, 6, 8};  // Reiniciar el arreglo
        Ordenamiento mergeSort = new MergeSort();
        mergeSort.ordenar(arr2);
        imprime(arr2, "MergeSort");
    }

    /**
     * Método para imprimir el arreglo ordenado por QuickSort y MergeSort.
     * 
     * @param arr el arreglo 
     * @param metodo el método para ordenar el arreglo
     */
    public static void imprime(int[] arr, String metodo) {
        System.out.println("Ordenado usando " + metodo + ":");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
