package org.app;

public class OrderAgnosticBinarySearch {
    public static int findKeyIndex(int[] nums, int key){
        int start = 0, end = nums.length-1;
        boolean ascending = nums[start] < nums[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(key == nums[mid]){
                return mid;
            }

            if(ascending) {
                if(key < nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
            else {
                if(key > nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(OrderAgnosticBinarySearch.findKeyIndex(new int[] { 4, 6, 10 }, 10));
        System.out.println(OrderAgnosticBinarySearch.findKeyIndex(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
        System.out.println(OrderAgnosticBinarySearch.findKeyIndex(new int[] { 10, 6, 4 }, 10));
        System.out.println(OrderAgnosticBinarySearch.findKeyIndex(new int[] { 10, 6, 4 }, 4));
    }
}
