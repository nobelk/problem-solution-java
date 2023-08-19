package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPlusOne {

    @Test
    public void TestPlusOne(){
        assertArrayEquals(new int[]{1}, PlusOne.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{2}, PlusOne.plusOne(new int[]{1}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, PlusOne.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 4}, PlusOne.plusOne(new int[]{1, 2, 3}));
    }
}
