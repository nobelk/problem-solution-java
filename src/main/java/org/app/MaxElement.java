package org.app;

import java.util.HashMap;

public class MaxElement {
    public int majorityElement(int[] nums){
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(count.containsKey(nums[i])){
                count.put(nums[i], count.get(nums[i])+1);
            }
            else{
                count.put(nums[i], 1);
            }
        }

        int maxElement = -1;
        int maxCount = Integer.MIN_VALUE;
        for(int key: count.keySet()){
            if(count.get(key)>maxCount){
                maxElement = key;
                maxCount = count.get(key);
            }
        }

        return maxElement;
    }
}
