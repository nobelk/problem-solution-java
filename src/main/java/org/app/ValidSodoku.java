package org.app;
import java.util.Arrays;

public class ValidSodoku {

    public static boolean isValidSodoku(Character[][] board){
        int N = 9;
        for(int row=0; row<N; row++){
            int[] filledValue = new int[N];
            Arrays.fill(filledValue, 0);

            for(int col=0; col<N; col++){
                if(board[row][col] != '.'){
                    filledValue[Character.getNumericValue(board[row][col])-1]= filledValue[Character.getNumericValue(board[row][col])-1]+1;
                }
            }

            if(Arrays.stream(filledValue).anyMatch(i->i > 1))
                return false;
        }

        for(int col=0; col<N; col++){
            int[] filledValue = new int[N];
            Arrays.fill(filledValue, 0);

            for(int row=0; row<N; row++){
                if(board[row][col] != '.'){
                            filledValue[Character.getNumericValue(board[row][col])-1]=filledValue[Character.getNumericValue(board[row][col])-1]+1;
                }
            }

            if(Arrays.stream(filledValue).anyMatch(i->i > 1))
                return false;
        }

        int rowStart = 0;
        int colStart = 0;

        while(rowStart+3<N && colStart+3<N){
            int[] filledValue = new int[N];
            Arrays.fill(filledValue, 0);

            for(int row=rowStart; row<3; row++){
                for(int col=colStart; col<3; col++){
                    if(board[row][col]!='.') {
                        filledValue[Character.getNumericValue(board[row][col]) - 1] = filledValue[Character.getNumericValue(board[row][col]) - 1] + 1;
                    }
                }
            }

            if(Arrays.stream(filledValue).anyMatch(i->i > 1))
                return false;

            rowStart+=3;
            colStart += 3;
        }

        return true;
    }

    public static void main(String[] args){
        Character[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(ValidSodoku.isValidSodoku(board));
    }

}
