package org.app;

import org.app.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestContainDuplicate {

    @Test
    public void TestContainDuplicate(){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 43}));
    }
}
