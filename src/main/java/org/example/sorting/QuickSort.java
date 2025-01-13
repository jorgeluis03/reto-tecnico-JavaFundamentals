package org.example.sorting;

public class QuickSort { //implementa el algoritmo de ordenamiento quicksort para un arreglo de números enteros

    /**
     * Metodo que inicia el proceso de ordenamiento
     *
     * @param array: Arreglo de numeros enteros a ordenar
     */
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Metodo recursivo que implementa el algoritmo de quicksort
     * Divide el arreglo y se llama a sí mismo para las dos mitades
     *
     * @param array: Arreglo a ordenar
     * @param low:   Indice inicial del segmento a ordenar
     * @param high:  Indice final del segmento a ordear
     */
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {//si el segmento tiene mas de un elemento
            int pivot = partition(array, low, high); //Particiona el segmento y obtiene el indice del pivote
            quickSort(array, low, pivot - 1);  // Ordena la mitad izquierda.
            quickSort(array, pivot + 1, high);  // Ordena la mitad derecha.
        }
    }

    /**
     * Particiona el arreglo moviendo elementos menores que el pivote a su izquierda
     * y los mayores a su derecha. El pivote al final se coloca en su posicion correcta
     *
     * @param array El arreglo a particionar.
     * @param low   El índice inicial para la partición.
     * @param high  El índice del pivote (inicialmente el último elemento del segmento).
     * @return El índice de la ubicación final del pivote.
     */
    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; //usa el ultimo elemento como pivote
        int i = low - 1; //indice para elementos menores que el pivote

        for (int j = low; j < high; j++) {// Recorre de low a high-1
            if (array[j] < pivot) { //// Si el elemento actual es menor que el pivote,
                i++; // Incrementa el índice de elementos menores.
                // Intercambia el elemento en i con el elemento en j.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Coloca el pivote en su posición correcta intercambiándolo con el elemento en i+1.
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; //Retorna el indice del pivote

    }
}
