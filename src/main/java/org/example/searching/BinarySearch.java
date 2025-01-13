package org.example.searching;

public class BinarySearch {
    /**
     * Realiza una busqueda binaria en un arreglo ordenado para encontrar el inidice de un elemento dado.
     *
     * @param array: arreglo de enteros ordenados en el que se buscará
     * @param value: Valor entero que se buscará en el arreglo
     * @return El indice del elemento si se encuentra o -1 si el elemento no esta presente
     */

    public int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; //indice medio del arreglo
            if (array[mid] == value) {
                return mid; //el elemento fue encontrado y retorna su indice
            } else if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
