package org.app;

enum Index {
    GOOD,
    BAD,
    UNKNOWN
}


public class JumpGame {

    Index[] memo;


    public static boolean canJumpFromPosition1(int position, int[] arr){
        if(position == arr.length-1)
            return true;

        int farthestPosition = Math.min(position+arr[position],
                arr.length-1);

        for(int nextPosition=position+1; nextPosition<=farthestPosition; nextPosition++){
            if(canJumpFromPosition1(nextPosition, arr)){
                return true;
            }
        }

        return false;
    }

    public boolean canJumpFromPosition2(int position, int[] arr){
        if(this.memo[position] != Index.UNKNOWN){
            return this.memo[position] == Index.GOOD ? true : false;
        }

        int farthestJump = Math.min(position+arr[position], arr.length-1);

        for(int nextPosition = position+1; nextPosition<=farthestJump; nextPosition++){

            if(canJumpFromPosition2(nextPosition, arr)){
                memo[nextPosition] = Index.GOOD;
                return true;
            }

        }

        memo[position] = Index.BAD;
        return false;
    }


    public boolean canJump2(int[] arr){
        this.memo = new Index[arr.length];
        for(int i = 0; i<arr.length; i++){
            this.memo[i] = Index.UNKNOWN;
        }

        this.memo[arr.length-1] = Index.GOOD;
        return canJumpFromPosition2(0, arr);
    }

    public boolean canJump1(int[] arr){
        return JumpGame.canJumpFromPosition1(0, arr);
    }
}
