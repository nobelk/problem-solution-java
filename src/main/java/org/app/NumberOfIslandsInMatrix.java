package org.app;

import java.util.*;

public class NumberOfIslandsInMatrix {

    public static int countIslands(int[][]matrix){
        int islandCount = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    islandCount++;
                    visitIsLandBFS(matrix, visited, i, j);
                }
            }
        }

        return islandCount;
    }

    public static void visitIsLandBFS(int[][] matrix, boolean[][]visited, int x, int y){
        Queue<int[]> neighbors = new LinkedList<>();
        neighbors.add(new int[] {x, y});

        while(!neighbors.isEmpty()){
            int row = neighbors.peek()[0];
            int col = neighbors.peek()[1];
            neighbors.remove();

            if(row<0 || col<0 || row>=matrix.length || col>=matrix[0].length){
                continue;
            }

            if(matrix[row][col]==0 || visited[row][col]){
                continue;
            }

            visited[row][col] = true;

            // add all neighbors
            neighbors.add(new int[]{row+1, col});
            neighbors.add(new int[]{row-1, col});
            neighbors.add(new int[]{row, col+1});
            neighbors.add(new int[]{row, col-1});
        }// end while
    }

    public static void main(String[] args){
        System.out.println(NumberOfIslandsInMatrix.countIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));

        System.out.println(NumberOfIslandsInMatrix.countIslands(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }
}
