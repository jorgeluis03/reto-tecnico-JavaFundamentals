package sorting;

import org.example.sorting.QuickSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] input = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        QuickSort qs = new QuickSort();
        qs.sort(input);
        assertArrayEquals(expected, input);
    }
}
