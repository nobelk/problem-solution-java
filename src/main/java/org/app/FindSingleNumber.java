package org.app;

public class FindSingleNumber {

    public static int search(int[] arr){

        int result = 0;

        for (int num : arr){
            result = result ^ num;
        }

        return result;
    }


    public static void main( String args[]) {
        System.out.println(FindSingleNumber.search(new int[]{1, 4, 2, 1, 3, 2, 3}));
    }
}
