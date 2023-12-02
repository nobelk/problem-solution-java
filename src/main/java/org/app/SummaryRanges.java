package org.app;
import java.util.List;
import java.util.ArrayList;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums){
        if(nums.length == 0)
            return new ArrayList<String>(List.of(new String[]{""}));
        int ptr1 = 0;
        int ptr2 = 0;

        List<String> r = new ArrayList<>();

        for(int i=0; i<nums.length; i++){

            int start = nums[i];

            while(i+1 < nums.length && nums[i]+1 == nums[i+1]){
                i++;
            }

            if(start != nums[i]){
                r.add(start+"->"+nums[i]);
            }
            else {
                r.add(String.valueOf(start));
            }
        }

        return r;
    }
}
