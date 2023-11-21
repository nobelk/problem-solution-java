package org.app;

public class SmallestMissingNumber {

    public static int search(int[] arr){
        int result = arr.length;
        boolean[] found = new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            found[arr[i]] = true;
        }

        for(int i=0; i<arr.length; i++){
            if(!found[i]){
                result = i;
                break;
            }
        }      

        return result;
    }

    public static void main(String[] args){
        System.out.println(SmallestMissingNumber.search(new int[]{0, 1, 2}));
    }
}
