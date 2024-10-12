package mx.unam.fi.poo.g1.p8.p81;

/**
 * Clase que implementa el algoritmo MergeSort.
 */
public class MergeSort implements Ordenamiento {

    @Override
    public void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
        }
        mergeSort(arr, 0, arr.length-1);
    }
    /**
     * Método que combina ambos subarreglos.
     *
     * @param arr ->  El arreglo principal.
     * @param left -> izquierdo del subarreglo.
     * @param mid  -> medio del subarreglo.
     * @param right -> derecho del subarreglo.
     */

    private void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    /**
     * Método recursivo divide el arreglo principal, ordena y une.
     *
     * @param arr ->  El arreglo principal.
     * @param left  ->  izquierda del subarreglo.
     * @param right -> derecha del subarreglo.
     */
    private void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
}
