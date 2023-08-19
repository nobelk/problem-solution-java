package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleNumber {

    @Test
    public void TestSingleNumber(){
        int[] nums = {4, 1, 4, 2, 1, 2, 5};
        assertEquals(5, SingleNumber.singleNumber(nums));

        int[] nums1 = {4};
        assertEquals(4, SingleNumber.singleNumber(nums1));

        assertEquals(10000, SingleNumber.singleNumber(new int[]{100, 100, 10000}));
    }
}
