package mx.unam.fi.poo.g1.p8.p81;

/**
 * Implementación del método QuickSort.
 */
public class QuickSort implements Ordenamiento {
    @Override
    public void ordenar(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    /**
     * Método quickSort
     *
     * @param arr  -> El arreglo principal a ordenar.
     * @param low -> indice más bajo del subarreglo.
     * @param high -> el indice mas alto del subarreglo.
     */
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = particionar(arr, low, high);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }
/**
     * Método particionar
     *
     * @param arr  -> El arreglo principal a ordenar.
     * @param low -> indice más bajo del subarreglo.
     * @param high -> el indice mas alto del subarreglo.
     */
    private int particionar(int[] arr, int low, int high) {
        int p = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
