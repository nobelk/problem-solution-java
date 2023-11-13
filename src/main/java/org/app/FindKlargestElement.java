package org.app;

import java.util.*;

public class FindKlargestElement {

    public static List<Integer> find(int[] nums, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a,b)->a-b);


        for (int index =0; index<k; index++){
            minHeap.add(nums[index]);
        }

        for(int index = k-1; index < nums.length; index++){
            if(nums[index]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(nums[index]);
            }
        }

        return new ArrayList<>(minHeap);
    }
    public static void main(String[] args) {
        List<Integer> result =
                FindKlargestElement.find(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = FindKlargestElement.find(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Here are the top K numbers: " + result);
    }
}
