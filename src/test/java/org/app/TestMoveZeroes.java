package org.app;

import org.app.MoveZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMoveZeroes {

    @Test
    public void TestSolution(){
        int[] nums = new int[]{0};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);

        nums = new int[]{0, 1, 2, 3, 55};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 55, 0}, nums);

        nums = new int[]{0, 1, 1, 1, 1, 1};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 0}, nums);
    }
}
