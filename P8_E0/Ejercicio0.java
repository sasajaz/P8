package mx.unam.fi.poo.g1.p8.e0;

/**
 * Clase principal para ordenar por BubbleSort y SelectionSort.
 */
public class Ejercicio0 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 1, 6, 8};

        // Prueba de BubbleSort
        Ordenamiento bubbleSort = new BubbleSort();
        bubbleSort.ordenar(arr);
        imprime(arr, "BubbleSort");

        // Prueba de SelectionSort
        int[] arr2 = {4, 2, 0, 3, 1, 6, 8};  // Reiniciar el arreglo
        Ordenamiento selectionSort = new SelectionSort();
        selectionSort.ordenar(arr2);
        imprime(arr2, "SelectionSort");
    }

    /**
     * Método para imprimir el arreglo ordenado por bubbleSort y SelectionSort.
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

