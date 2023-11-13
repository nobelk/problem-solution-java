package org.app;

public class SearchCeilingOfNumber {
    public static int search(int[] nums, int key){
        if(key>nums[nums.length-1]){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if (key == nums[mid]){
                return mid;
            }

            // assume ascending order
            if(key <  nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        System.out.println(SearchCeilingOfNumber.search(
                new int[] { 4, 6, 10 }, 6));
        System.out.println(SearchCeilingOfNumber.search(
                new int[] { 1, 3, 8, 10, 15 }, 12));
        System.out.println(SearchCeilingOfNumber.search(
                new int[] { 4, 6, 10 }, 17));
        System.out.println(SearchCeilingOfNumber.search(
                new int[] { 4, 6, 10 }, -1));
    }
}
