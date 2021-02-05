package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    int[] testArray = {1, 2, 3, 4, 5};

    @Test
    public void newTest () {
        assertEquals(4, BonusBinarySearch.binarySearch(testArray,5));
    }

}
