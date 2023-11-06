package org.app;

import org.app.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveDuplicatesFromSortedArray {

    @Test
    public void TestRemoveDuplicates(){
        int[] inputArray = new int[]{ 2, 5, 5, 6, 6, 6, 6, 78, 988, 988, 1000 };
        assertEquals(6, RemoveDuplicatesFromSortedArray.removeDuplicates(inputArray));
    }
}