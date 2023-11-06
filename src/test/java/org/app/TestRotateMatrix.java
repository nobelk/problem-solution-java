package org.app;

import org.app.RotateMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestRotateMatrix {

    @Test
    public void TestRotation(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateMatrix rmat = new RotateMatrix();
        rmat.rotate(matrix);
        assertArrayEquals(matrix[0], new int[]{7,4, 1});
        assertArrayEquals(matrix[1], new int[]{8,5,2});
        assertArrayEquals(matrix[2], new int[]{9,6,3});
    }
}
