package searching;

import org.example.searching.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arrayOrdenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch bs = new BinarySearch();
        int indice = bs.binarySearch(arrayOrdenado, 6);
        assertEquals(5, indice);
    }
}
